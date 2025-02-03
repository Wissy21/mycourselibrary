# Library Management System

## Overview

The Library Management System is a web-based application built with Java and Spring Boot. It allows users to manage a collection of books, authors, category, and publisher efficiently.

## Features

1. User-friendly interface with Thymeleaf for dynamic views.

2. CRUD operations for books, authors, and borrowers.

3. Spring Boot JPA integration for database management.

4. H2 Database for in-memory data storage (can be replaced with MySQL or PostgreSQL).

5. Lombok for reducing boilerplate code.

6. Integrated unit testing using Spring Boot Starter Test.

## 🌟 Technologies Used

- Java 17

- Spring Boot 3.4.2

- Spring Data JPA

- Spring Boot Starter Web

- Thymeleaf

- H2 Database

- Lombok

- Maven for project dependency management

## Installation & Setup

### Prerequisites

Ensure you have the following installed:

- Java 17+

- Maven

- An IDE (IntelliJ IDEA, Eclipse, or VS Code with Java support)

### Steps to Run the Application

1. Clone the Repository:
```
$ git clone https://github.com/your-repo/library-management-system.git
$cd library-management-system
```

2. Build the Project:
```
mvn clean install
```

3. Run the Application:
```
mvn spring-boot:run
```

4. Access the Application: Open a browser and go to http://localhost:8080

## Project Structure
```
mycourselibrary/
├── src/main/java/com/application/
│   ├── controller/      # Handles HTTP requests
│   ├── entity/           # Entity classes
│   ├── repository/     # JPA Repositories
│   ├── service/         # Business logic
│   ├── Application.java  # Main entry point
├── src/main/resources/
│   ├── templates/        # Thymeleaf HTML templates
│   ├── static/           # CSS, JS, images
│   ├── application.properties  # Configuration file
├── pom.xml               # Maven dependencies
└── README.md             # Project documentation
```
## Contact Information
For questions or suggestions, feel free to reach out at 

- **Email:** [manuelasagesse@gmail.com](mailto:manuelasagesse@gmail.com)

