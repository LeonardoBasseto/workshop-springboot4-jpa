# Workshop Spring Boot - Sistema de Pedidos
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/LeonardoBasseto/workshop-springboot4-jpa/blob/main/LICENSE)
[![Java](https://img.shields.io/badge/Java-25-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.3-brightgreen)](https://spring.io/projects/spring-boot)

## 📋 Sobre o projeto

https://github.com/LeonardoBasseto/workshop-springboot4-jpa

Este é o meu **primeiro projeto** de desenvolvimento Back End em Java, realizado com inspiração no curso **"Java COMPLETO Programação Orientada a Objetos + Projetos"** do professor **Nélio Alves**.

O projeto consiste em uma **API REST** de um sistema de pedidos (e-commerce), onde é possível gerenciar usuários, produtos, categorias, pedidos e pagamentos. Ele foi desenvolvido como um **teste prático** no qual aplico os conhecimentos adquiridos ao longo do curso sobre Programação Orientada a Objetos, JPA/Hibernate, Spring Boot e banco de dados relacional.

### 📝 Anotações do projeto

Juntamente a este projeto, elaborei **anotações detalhadas** onde explico de forma didática o funcionamento do programa, as principais anotações do JPA para mapeamento do banco de dados, e utilizo exemplos em código deste repositório para ilustrar os conceitos.

🔗 **[Acessar anotações do projeto](https://docs.google.com/document/d/1Uk-0X0jMe5xk9MjsqklTJhc8H41YOsBwHTsUfqIsN2A/edit?usp=sharing)**

---

## 🎯 Funcionalidades

- [x] CRUD de Usuários
- [x] Cadastro de Produtos e Categorias
- [x] Registro de Pedidos com itens
- [x] Controle de status do pedido (Aguardando pagamento, Pago, Enviado, Entregue, Cancelado)
- [x] Registro de Pagamento
- [x] Tratamento de exceções personalizado

---

## 🗂️ Modelo Conceitual

<img width="1115" height="457" alt="Image" src="https://github.com/user-attachments/assets/b3b40b6a-51bb-4048-9268-1640584c66d2" />

---

O projeto segue o modelo de domínio acima, com as seguintes entidades:

| Entidade | Descrição |
|----------|-----------|
| **User** | Representa o cliente com nome, email, telefone e senha |
| **Order** | Pedido realizado pelo cliente, com data e status |
| **OrderItem** | Item do pedido com quantidade e preço |
| **Product** | Produto com nome, descrição, preço e imagem |
| **Category** | Categoria dos produtos |
| **Payment** | Pagamento vinculado ao pedido |
| **OrderStatus** | Enum com os status: WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED |

---

## 🛠️ Tecnologias utilizadas

### Back end
- Java 25
- Spring Boot 4.0.3
- JPA / Hibernate
- Maven
- Banco de dados H2 (perfil de teste)
- Postman (testes de API)

---

## 📐 Arquitetura do projeto

```
src/
├── entities/        # Entidades JPA (User, Order, Product, etc.)
├── repositories/    # Interfaces de acesso a dados (Spring Data JPA)
├── services/        # Camada de serviço (regras de negócio)
├── resources/       # Controllers REST (endpoints da API)
├── config/          # Configurações (seed do banco de teste)
└── exceptions/      # Tratamento de exceções personalizado
```

### Camadas lógicas

```
  Controller  →  Service  →  Repository  →  Database
  (Resource)     (Business)   (Data Access)   (H2/Postgres)
```

---

## ⚙️ Como executar o projeto

### Pré-requisitos
- Java 25
- Maven
- Git

```bash
# Clonar o repositório
git clone https://github.com/LeonardoBasseto/workshop-springboot4-jpa

# Entrar na pasta do projeto
cd workshop-springboot4-jpa

# Executar o projeto
./mvnw spring-boot:run
```

O servidor será iniciado em `http://localhost:8080`

### 📬 Endpoints principais

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | /users | Listar todos os usuários |
| GET | /users/{id} | Buscar usuário por ID |
| POST | /users | Criar novo usuário |
| PUT | /users/{id} | Atualizar usuário |
| DELETE | /users/{id} | Deletar usuário |
| GET | /products | Listar todos os produtos |
| GET | /categories | Listar todas as categorias |
| GET | /orders | Listar todos os pedidos |
| GET | /orders/{id} | Buscar pedido por ID |

---

## 📚 O que aprendi com este projeto

- Mapeamento objeto-relacional com **JPA/Hibernate**
- Uso das principais anotações: `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@ManyToOne`, `@OneToMany`, `@ManyToMany`, `@JoinTable`
- Criação de **API REST** com Spring Boot
- Padrão de camadas (Resource → Service → Repository)
- **Tratamento de exceções** customizado
- Seed de dados para testes com perfil H2
- Relacionamentos entre entidades (1:N, N:N, 1:1)

---

## 👤 Autor

**Leonardo Basseto Rodrigues**

[![LinkedIn](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/leonardo-basseto-rodrigues-a267b9284/)
[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/LeonardoBasseto)
