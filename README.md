Markdown
# Concesionario Backend API (Spring Boot)

API RESTful desarrollada para la gestion de un concesionario de vehiculos. El proyecto implementa arquitectura por capas, persistencia de datos relacional y manipulacion de datos mediante DTOs y consultas SQL nativas.

---

## Tecnologias y Herramientas

* Lenguaje: Java 17
* Framework: Spring Boot 3+
* Persistencia: Spring Data JPA / Hibernate
* Base de Datos: MySQL / PostgreSQL
* Gestor de Dependencias: Maven
* Control de Versiones: Git & GitHub

---

## Arquitectura del Proyecto

El codigo esta estructurado bajo patron de capas para garantizar la separacion de responsabilidades:

com.Cesde.concesionario
 ├── Controlador    # Endpoints RESTful para recepcion de peticiones HTTP
 ├── Servicio       # Capa de logica de negocio
 ├── Repositorio    # Interfaces JPA y consultas SQL nativas (@Query)
 ├── Dto            # Objetos de Transferencia de Datos (FacturasClienteDTO, etc.)
 └── Modelo         # Entidades del dominio mapeadas a tablas (MCliente, MFactura, MVehiculo)

---

## Caracteristicas Principales

- Gestion de Entidades: Operaciones CRUD para clientes, vehiculos y facturacion.
- DTO Mappings: Transferencia de datos optimizada para evitar exposicion innecesaria de modelos de base de datos.
- Consultas Personalizadas: Uso de @Query nativos con Joins entre tablas relacionales (cliente, factura, vehiculo).
- Estructura Escalable: Arquitectura desacoplada para integracion con clientes web o moviles.

---

## Instalacion y Ejecucion Local

1. Clonar el repositorio:
   git clone https://github.com/Estepi06/concesionario-backend-springboot.git

2. Configurar la base de datos:
   Actualizar credenciales en src/main/resources/application.properties:
   spring.datasource.url=jdbc:mysql://localhost:3306/concesionario_db
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contrasena
   spring.jpa.hibernate.ddl-auto=update

3. Ejecutar la aplicacion:
   mvn spring-boot:run
