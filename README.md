# Basic-Movie-Management
A basic Movie Management REST API built with Java Spring Boot and  Postman for API testing.

#  Movie Management REST API

A basic Movie Management REST API built using **Java and Spring Boot**.  
The project demonstrates how to create REST endpoints, organize an application using Controller-Service-Repository architecture, and test APIs using **Postman**.

The application currently stores movie data in an **in-memory HashMap**, so no external database is required.

---

## Features

- Get all movies
- Get a movie by ID
- Search a movie by name
- Add a new movie
- Preloaded dummy movie data
- REST API development using Spring Boot
- API testing using Postman
- Layered architecture using Controller, Service, and Repository

---

##  Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- Postman
- Git & GitHub
- Java Collections & Streams

---

##  Project Architecture

The project follows a simple layered architecture:

```text
                 Postman
                    │
                    ▼
             MovieController
                    │
                    ▼
              MovieService
                    │
                    ▼
             MovieRepository
                    │
                    ▼
              HashMap<Long, Movie>
