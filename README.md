# Student Management System (REST API)

A Spring Boot application that provides CRUD operations for managing student records.

## Tech Stack
- Java 21
- Spring Boot
- Spring Data JPA
- MySQL Database
- Lombok

## Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /students/save | Add student |
| PUT | /students/update | Update student |
| GET | /students/get/{id} | Get student by ID |
| GET | /students/all | Get all students |
| DELETE | /students/delete/{id} | Delete student by ID |

## How to Run
1. Import project into Eclipse/STS.
2. Create MySQL database:
3. Update `application.properties` with your DB username/password.
4. Run:    mvn spring-boot:run

