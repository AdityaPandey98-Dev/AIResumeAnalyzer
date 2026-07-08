package com.abcd.resumeanalyzer.controller;

import com.abcd.resumeanalyzer.dto.ResumeRequest;
import com.abcd.resumeanalyzer.service.ResumeAnalyzerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resume")
public class ResumeAnalyzerController {

    private final ResumeAnalyzerService resumeAnalyzerService;

    public ResumeAnalyzerController(ResumeAnalyzerService resumeAnalyzerService) {
        this.resumeAnalyzerService = resumeAnalyzerService;
    }

    @PostMapping("/analyze")
    public String analyze(@RequestBody ResumeRequest resumeRequest) {
        return resumeAnalyzerService.analyzeResume(resumeRequest.getResumeText());
    }
}