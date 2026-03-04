# 🛒 Store API - Gestión de Productos

API REST desarrollada en Spring Boot para administrar productos de una tienda.

## 📌 Tecnologías utilizadas

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

---

## 🗂 Modelo de Datos

Entidad: **Product**

| Campo       | Tipo      |
|------------|----------|
| id         | Long     |
| name       | String   |
| description| String   |
| price      | Double   |
| stock      | Integer  |
| createdAt  | LocalDateTime |

---

## 🚀 Endpoints disponibles

- POST /api/products
- GET /api/products
- GET /api/products/{id}
- PUT /api/products/{id}
- DELETE /api/products/{id}
