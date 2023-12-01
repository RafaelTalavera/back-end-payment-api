# Payment Platform Backend

This project implements the backend for a payment platform, providing services for user and transaction management.

## Features

- User management: Creation and retrieval of users.
- Transactions: Creation of transactions between users.

## Project Structure

- **Controllers:** `UserController` and `TransactionController`.
- **Domain:** Classes `User` and `Transaction`.
- **DTOs:** `UserDTO` and `TransactionDTO`.
- **Enumeration:** `UserType`.
- **Services:** `UserService`, `TransactionService`, `AuthorizationService`, and `NotificationService`.
- **Repositories:** `UserRepository` and `TransactionRepository`.
- **Configuration:** `AppConfig` and `ControllerExceptionHandler`.
- **Tests:** `UserRepositoryTest` and `TransactionServiceTest`.

## External Configuration

- H2 database.
- Authorization API URL: [Authorization API Link](https://run.mocky.io/v3/9b89b419-a2f7-4885-aa86-5ddcea24d520).

## Execution Instructions

1. Clone the repository: `git clone https://your-repository.git`.
2. Navigate to the project directory: `cd payment-platform-backend`.
3. Run the application: `./mvnw spring-boot:run`.

The application will be available at http://localhost:8080.

