package com.abcd.resumeanalyzer.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ResumeAnalyzerService {

		private final ChatClient chatClient;

		public ResumeAnalyzerService(ChatClient.Builder builder) {

			this.chatClient = builder.build();
		}

		public String analyzeResume(String resumeText) {

			String prompt = """
				Analyze this resume and provide:

				1. Candidate Skills
				2. Experience Level
				3. Strengths
				4. Final Summary

				Resume:
				""" + resumeText;

			return chatClient.prompt(prompt).call().content();

		}

	}


