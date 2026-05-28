# 🎬 Movies REST API

A RESTful backend API for managing a movies database, built with **Spring Boot 3** and **Java 21**. Supports full CRUD operations with MySQL as the persistent store.

---

## Tech Stack

| Layer | Technology |
|---|---|
| Framework | Spring Boot 3.5 |
| Language | Java 21 |
| Database | MySQL |
| ORM | Spring Data JPA / Hibernate |
| Build Tool | Maven |
| Dev Tooling | Spring Boot DevTools |

---

## Getting Started

### Prerequisites

- Java 21+
- Maven 3.6+
- MySQL 8+

### 1. Clone the repository

```bash
git clone https://github.com/Janhavi1214/movies_spring_boot.git
cd movies_spring_boot
```

### 2. Configure the database

Create a MySQL database and update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/movies_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Build and run

```bash
./mvnw spring-boot:run
```

The server starts at `http://localhost:8080`.

---

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/movies` | Get all movies |
| `GET` | `/movies/{id}` | Get movie by ID |
| `POST` | `/movies` | Add a new movie |
| `PUT` | `/movies/{id}` | Update a movie |
| `DELETE` | `/movies/{id}` | Delete a movie |

### Sample Request — Add Movie

```json
POST /movies
Content-Type: application/json

{
  "title": "Inception",
  "genre": "Sci-Fi",
  "releaseYear": 2010,
  "director": "Christopher Nolan",
  "rating": 8.8
}
```

---

## Project Structure

```
src/
└── main/
    ├── java/com/day6/movies/
    │   ├── MoviesApplication.java      # Entry point
    │   ├── controller/                 # REST controllers
    │   ├── service/                    # Business logic
    │   ├── repository/                 # JPA repositories
    │   └── model/                      # Entity classes
    └── resources/
        └── application.properties     # Config
```

---

## Author

**Janhavi** — [github.com/Janhavi1214](https://github.com/Janhavi1214)
