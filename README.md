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

---

### 🔹 1️⃣ POST /api/products  
**Crear producto**

<p align="center">
  <img src="https://github.com/user-attachments/assets/149ac1c2-cfb1-41f4-96a2-75fd65352641" width="500"/>
</p>

---

### 🔹 2️⃣ GET /api/products  
**Listar todos los productos**

<p align="center">
  <img src="https://github.com/user-attachments/assets/e8d394bb-873b-4eb0-94ac-fa4510db6227" width="500"/>
</p>

---

### 🔹 3️⃣ GET /api/products/{id}  
**Consultar producto por ID**

<p align="center">
  <img src="https://github.com/user-attachments/assets/370a6558-5703-4344-9b6d-8306da0a58ff" width="500"/>
</p>

---

### 🔹 4️⃣ PUT /api/products/{id}  
**Actualizar producto**

<p align="center">
  <img src="https://github.com/user-attachments/assets/fef396e3-6beb-4255-98c2-d6f08808c764" width="500"/>
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/76257c26-ffd1-4eb9-b24c-9ea2e91c1a98" width="500"/>
</p>

---

### 🔹 5️⃣ DELETE /api/products/{id}  
**Eliminar producto**

<p align="center">
  <img src="https://github.com/user-attachments/assets/04a6943d-6ff7-4e33-b268-b416a3a52e82" width="500"/>
</p>

<p align="center">
  <img src="https://github.com/user-attachments/assets/d3ea78b2-e082-4788-8a7b-21e82cebe410" width="500"/>
</p>

---

## 🧪 Pruebas

Los endpoints fueron probados utilizando Postman.

---

## 👨‍💻 Autor

Santiago Urbano  
Proyecto académico – API REST con Spring Boot y PostgreSQL.



