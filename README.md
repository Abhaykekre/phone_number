# 📱 Phone Number CRUD API

A simple **Spring Boot + MongoDB REST API** for performing CRUD (Create, Read, Update, Delete) operations on users identified by their phone numbers.

---

## 🚀 Features
- ✅ Built with **Spring Boot 3**  
- ✅ Uses **MongoDB** for data storage  
- ✅ Provides full **CRUD APIs** for `User` management  
- ✅ Layered architecture → Controller → Service → Repository  
- ✅ Lightweight, clean, and production-ready

---

## 🧩 Tech Stack
| Layer | Technology |
|--------|-------------|
| Backend | Java 17+, Spring Boot 3.x |
| Database | MongoDB |
| Build Tool | Maven |
| Framework | Spring Data MongoDB |

---

## 📁 Project Structure
```text
src/
 └── main/
     ├── java/
     │   └── com/example/phonenumber/
     │       ├── PhonenumberApplication.java      # Main entry point
     │       ├── controller/Controller.java       # REST endpoints
     │       ├── service/UserService.java         # Business logic layer
     │       ├── repository/UserRepository.java   # MongoDB data access
     │       └── model/User.java                  # @Document class
     └── resources/
         └── application.properties               # MongoDB config



