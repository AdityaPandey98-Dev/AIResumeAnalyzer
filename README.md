# 🚀 AI Resume Analyzer

An AI-powered Resume Analyzer built using **Spring Boot**, **Spring AI**, and **Google Gemini AI**. The application analyzes resume content and provides intelligent feedback, including ATS score estimation, strengths, weaknesses, missing skills, and improvement suggestions.

---

## 📌 Features

- 📄 Analyze resume text using Google Gemini AI
- 📊 Estimate ATS (Applicant Tracking System) score
- 💪 Identify candidate strengths
- ⚠️ Highlight weaknesses
- 🛠️ Suggest missing technical skills
- ✅ Recommend improvements to increase interview chances
- 🌐 REST API based application
- 🔒 Secure API key configuration using Environment Variables

---

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring AI
- Spring Web

### AI Model
- Google Gemini AI

### Build Tool
- Maven

### IDE
- IntelliJ IDEA

### API Testing
- Postman

---

## 📂 Project Structure

```
src
 ├── main
 │   ├── java
 │   │    └── com.abcd.resumeanalyzer
 │   │          ├── controller
 │   │          ├── dto
 │   │          ├── service
 │   │          └── ResumeAnalyzerApplication
 │   │
 │   └── resources
 │        └── application.properties
 │
 └── test
```

---

## 🚀 API Endpoint

### Analyze Resume

**POST**

```
http://localhost:8888/resume/analyze
```

### Request Body

```json
{
  "resumeText": "Java Full Stack Developer with 3.4 years of experience in Spring Boot, React, MySQL, Docker and AWS."
}
```

### Sample Response

```text
ATS Score: 86/100

Strengths
- Strong Java Fundamentals
- Spring Boot
- Microservices

Weaknesses
- Missing Testing Frameworks
- Missing CI/CD

Suggestions
- Add JUnit & Mockito
- Mention measurable achievements
- Include cloud deployment experience
```

---

## ⚙️ Configuration

The project uses **Environment Variables** to securely store the Gemini API Key.

Update your `application.properties`:

```properties
spring.application.name=ResumeAnalyzer
server.port=8888

spring.ai.google.genai.api-key=${GEMINI_API_KEY}
```

### Windows

```cmd
setx GEMINI_API_KEY "YOUR_GEMINI_API_KEY"
```

Restart IntelliJ after setting the environment variable.

---

## ▶️ Running the Project

Clone the repository

```bash
git clone https://github.com/AdityaPandey98-Dev/ResumeAnalyzer.git
```

Navigate to the project

```bash
cd ResumeAnalyzer
```

Run the application

```bash
mvn spring-boot:run
```

Application URL

```
http://localhost:8888
```

---

## 📸 API Testing

Use **Postman** to test the endpoint.

Method:

```
POST
```

URL

```
http://localhost:8888/resume/analyze
```

Headers

```
Content-Type: application/json
```

---

## 🔒 Security

- API keys are **not hardcoded**.
- Gemini API Key is loaded from **Environment Variables**.
- Sensitive credentials are excluded from GitHub.

---

## 📖 Future Enhancements

- Upload Resume PDF
- Upload Resume DOCX
- Extract text automatically
- Resume vs Job Description Matching
- ATS Percentage Dashboard
- Skill Gap Analysis
- Resume Improvement Report
- Download AI Analysis as PDF
- Authentication with Spring Security
- Store Analysis History

---



## 👨‍💻 Author

**Aditya Kumar Pandey**

Java Full Stack Developer
