
# User Authentication System

A robust and secure User Authentication System built with Spring Boot, enabling user registration, login, and JSON Web Token (JWT)-based authentication. The system provides stateless authentication and is designed for scalability.

---

## Features

- User Registration with encrypted passwords.
- User Login with JWT token issuance.
- Stateless authentication using JWT.
- Database persistence with H2 (in-memory database).
- Modular and extensible architecture.

---

## Technologies Used

- **Java 21**
- **Spring Boot 3.4.1**
  - Spring Security
  - Spring Data JPA
- **H2 Database**
- **JSON Web Tokens (JWT)**
- **Maven**

---

## Prerequisites

Ensure you have the following installed:
- Java 21
- Maven
- An IDE like IntelliJ IDEA Ultimate (recommended)

---

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/ArielaFitia/authsystem.git
   cd authsystem
   ```

2. **Build the Project**:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the H2 Database Console**:
    - URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
    - Username: `sa`
    - Password: Leave blank
    - JDBC URL: `jdbc:h2:mem:testdb`

5. **Access the Endpoints**:
    - Registration: `POST http://localhost:8080/api/auth/register`
    - Login: `POST http://localhost:8080/api/auth/login`

---

## Endpoints

| Endpoint                  | Method | Description              | Auth Required |
|---------------------------|--------|--------------------------|---------------|
| `/api/auth/register`      | POST   | Register a new user      | No            |
| `/api/auth/login`         | POST   | Log in and get a JWT     | No            |
| `/api/secure/hello`       | GET    | Test secure endpoint     | Yes           |

---

## How It Works

1. **User Registration**:
    - Users register with an email and password.
    - Passwords are encrypted using `BCryptPasswordEncoder` before being saved.

2. **User Login**:
    - Users log in with valid credentials.
    - A JWT token is returned upon successful login.

3. **JWT Authentication**:
    - JWT tokens are used to secure endpoints.
    - Stateless authentication eliminates the need for session management.

---

## Future Enhancements

- Role-based access control (e.g., `ADMIN`, `USER`).
- Token refresh flow for session extensions.
- Swagger API documentation.
- Deployment to a cloud platform (e.g., Heroku, AWS).

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Contributors

- **ditto** - Developer
- Contributions are welcome! Feel free to fork the repository and submit a pull request.
