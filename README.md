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

### 🔹 1️⃣ Crear producto

**POST** `/api/products`

Ejemplo JSON:

```json
{
  "name": "Laptop",
  "description": "Laptop gamer",
  "price": 2500.0,
  "stock": 10
}
