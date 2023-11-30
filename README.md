# Backend de Plataforma de Pagos

Este proyecto implementa el backend de una plataforma de pagos, proporcionando servicios para la gestión de usuarios y transacciones.

## Características

- Gestión de usuarios: Creación y obtención de usuarios.
- Transacciones: Creación de transacciones entre usuarios.

## Estructura del Proyecto

- **Controladores:** `UserController` y `TransactionController`.
- **Dominio:** Clases `User` y `Transaction`.
- **DTOs:** `UserDTO` y `TransactionDTO`.
- **Enumeración:** `UserType`.
- **Servicios:** `UserService`, `TransactionService`, `AuthorizationService`, y `NotificationService`.
- **Repositorios:** `UserRepository` y `TransactionRepository`.
- **Configuración:** `AppConfig` y `ControllerExceptionHandler`.
- **Pruebas:** `UserRepositoryTest` y `TransactionServiceTest`.

## Configuración Externa

- Base de datos H2.
- URL de la API de autorización: [Enlace API de Autorización](https://run.mocky.io/v3/9b89b419-a2f7-4885-aa86-5ddcea24d520).

## Instrucciones de Ejecución

1. Clonar el repositorio: `git clone https://tu-repositorio.git`.
2. Navegar al directorio del proyecto: `cd backend-plataforma-pagos`.
3. Ejecutar la aplicación: `./mvnw spring-boot:run`.

La aplicación estará disponible en http://localhost:8080.
