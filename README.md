# MongoDB CRUD Spring Boot Demo

This is a demo Spring Boot application that implements CRUD (Create, Read, Update, Delete) operations using MongoDB. It manages `Product` entities and exposes a RESTful API.

## Technologies Used

- **Java**: 21
- **Framework**: Spring Boot
- **Database**: MongoDB
- **Build Tool**: Maven

## Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK) 21 or later
- Maven
- MongoDB (running locally or accessible via connection string)

## Installation & Running

1.  **Clone the repository:**
    ```bash
    git clone <repository-url>
    cd <project-directory>
    ```

2.  **Configure MongoDB:**
    Ensure your MongoDB instance is running. By default, Spring Boot tries to connect to `mongodb://localhost:27017/test`.
    You can configure the connection in `src/main/resources/application.properties` (or `application.yml`) if needed.

3.  **Build the application:**
    ```bash
    ./mvnw clean install
    ```

4.  **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```

    The application will start on `http://localhost:8080`.

## API Documentation

The application provides the following REST endpoints for managing products:

### Base URL: `/api/products`

| Method | Endpoint | Description | Request Body (JSON) |
| :--- | :--- | :--- | :--- |
| **GET** | `/api/products` | Retrieve all products | N/A |
| **GET** | `/api/products/{id}` | Retrieve a product by ID | N/A |
| **POST** | `/api/products` | Create a new product | `{"name": "...", "description": "...", "price": 10.0}` |
| **PUT** | `/api/products/{id}` | Update an existing product | `{"name": "...", "description": "...", "price": 15.0}` |
| **DELETE** | `/api/products/{id}` | Delete a product | N/A |

### Example Product JSON

```json
{
  "name": "Sample Product",
  "description": "This is a sample product description.",
  "price": 99.99
}
```

## Project Structure

```
src/main/java/com/mongodb/example/demo
├── controller
│   └── ProductController.java  # REST Controller
├── model
│   └── Product.java            # MongoDB Document / Entity
├── repository
│   └── ProductRepository.java  # Repository Interface
├── service
│   └── ProductService.java     # Business Logic
└── DemoApplication.java        # Main Application Class
```
