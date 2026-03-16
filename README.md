# Dhinesh Portfolio Backend

This project is the **Spring Boot backend** for my personal portfolio website.
It handles the **contact form API**, stores user messages in the database, and can send email notifications.

---

## 🚀 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Maven
* MySQL
* REST API

---

## 📂 Project Structure

```
src/main/java/com/dhinesh/portfolio
│
├── controller      # REST API endpoints
├── service         # Business logic
├── repository      # Database operations
├── model           # Entity classes
└── PortfolioApplication.java
```

---

## ⚙️ Features

* Contact form API
* Save user messages to database
* RESTful API architecture
* Easy integration with frontend

---

## 📡 API Endpoint

### Submit Contact Form

POST /contact

Example Request Body

```
{
  "username": "Dhinesh",
  "email": "dhinesh@gmail.com",
  "mobile": "9876543210",
  "message": "Hello, I liked your portfolio."
}
```

---

## 🛠️ How to Run the Project

Clone the repository

```
git clone https://github.com/dhinesh016/dhinesh-portfolio-backend.git
```

Navigate to project

```
cd dhinesh-portfolio-backend
```

Run the project

```
./mvnw spring-boot:run
```

The backend will start at

```
http://localhost:9095
```

---

## 🔗 Frontend Repository

Frontend project:

https://github.com/dhinesh016/dhinesh-portfolio-frontend

---

## 👨‍💻 Author

**Dhinesh S**

Java Full Stack Developer
Interested in Backend Development, Spring Boot, and Web Applications.
