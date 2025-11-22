# Student Management REST API

This is a simple Spring Boot REST API project for managing student records.  
It follows a clean layered architecture and demonstrates how to build CRUD-based backend services using Spring Boot and Spring Data JPA.

## Features

- Add a new student
- Get all students
- Get student by ID
- Update student details
- Delete a student
- Uses DTOs for request and response
- Follows Controller → Service → Repository architecture

## Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL / H2
- Maven
- Lombok

## Project Structure

src/
└── main/
└── java/com/codingshuttle/youtube/LearningRESTAPIs
├── controller
│ └── StudentController.java
├── dto
│ ├── AddStudentRequestDto.java
│ └── StudentDto.java
├── entity
│ └── Student.java
├── repository
│ └── StudentRepository.java
├── service
│ ├── StudentService.java
│ └── impl/StudentServiceImpl.java
└── LearningRestApisApplication.java


## API Endpoints

### Create Student (POST)
POST /students

### Get All Students (GET)
GET /students

### Get Student by ID (GET)
GET /students/{id}

### Update Student (PUT)
PUT /students/{id}

### Delete Student (DELETE)
DELETE /students/{id}

## How to Run

### 1. Clone the Repository
git clone https://github.com/adarshsrivastava2004/student-management-rest-api.git

### 2. Configure Database in `application.properties`
Example (MySQL):
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


3. Run the Application

mvn spring-boot:run
Application will run on:

http://localhost:8080


Future Enhancements
Add global exception handling

Add pagination

Add search filters

Add Swagger/OpenAPI documentation

Add Spring Security authentication

Author
Adarsh Srivastava
Java Backend Developer

