# Proyecto Agencia de Turismo

## Arquitectura

### Domain

Entidades puras (User, Booking, Resource) y reglas de negocio. No dependen de Spring.

### Core

Logica de negocio pura (Entidades, etc.).

### Application

- Servicios y casos de uso (ej. RealizarReservaService). - Aquí inyectaremos los Virtual Threads.

### Infrastructure

Adaptadores. Aquí van los Repositorios de JPA, los Controladores REST y la configuración de seguridad.