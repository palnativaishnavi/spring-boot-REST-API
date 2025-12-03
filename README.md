# 🚀 Spring Boot – My First REST API

This project contains my **first REST API built using Spring Boot** as part of my learning journey.  
It includes basic endpoints that return plain text and JSON responses, helping beginners understand how REST APIs work with Spring Boot.

---

## 📌 Features

- Simple Spring Boot setup using Spring Initializr  
- REST API built with `@RestController`  
- Two API endpoints:
  - `/hello` – returns a text response  
  - `/info` – returns a JSON response  
- Structured and beginner-friendly code  
- Ready to extend into full CRUD operations

---

## 🛠️ Technologies Used

- **Java 17+**  
- **Spring Boot** (Web Starter)  
- **Maven**

---

Open your browser or Postman and test:

👉 http://localhost:8080/hello

👉 http://localhost:8080/info

📡 API Endpoints
GET /hello

Returns simple text:
Hello from Spring Boot REST API!

GET /info

Returns JSON:
{
  "name": "Vaishnavi",
  "topic": "Learning Spring Boot",
  "message": "First REST API Created Successfully!"
}
