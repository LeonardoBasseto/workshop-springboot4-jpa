# E-commerce API - Sistema de Pedidos

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/LeonardoBasseto/ecommerce-api/blob/main/LICENSE)
[![Java](https://img.shields.io/badge/Java-25-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.3-brightgreen)](https://spring.io/projects/spring-boot)

## Sobre o projeto

Uma **API REST** de um sistema de e-commerce desenvolvida em Java com Spring Boot, permitindo o gerenciamento completo de usuários, produtos, categorias, pedidos e pagamentos.

O projeto foi construído aplicando na prática os conceitos de Programação Orientada a Objetos, JPA/Hibernate e arquitetura em camadas, com foco em organização de código e boas práticas de desenvolvimento backend.

### Anotações de estudo

Durante o desenvolvimento, mantive **anotações detalhadas** explicando o funcionamento do projeto, as principais anotações JPA para mapeamento do banco de dados e os conceitos aplicados em cada etapa.

🔗 **[Acessar anotações](https://docs.google.com/document/d/1Uk-0X0jMe5xk9MjsqklTJhc8H41YOsBwHTsUfqIsN2A/edit?usp=sharing)**

---

## Funcionalidades

- [x] CRUD de Usuários
- [x] Cadastro de Produtos e Categorias
- [x] Registro de Pedidos com itens
- [x] Controle de status do pedido (Aguardando pagamento, Pago, Enviado, Entregue, Cancelado)
- [x] Registro de Pagamento
- [x] Tratamento de exceções personalizado

---

## Modelo Conceitual

**[Clique aqui para ver o Modelo Conceitual](https://github.com/user-attachments/assets/b3b40b6a-51bb-4048-9268-1640584c66d2)**

O domínio da aplicação é composto pelas seguintes entidades:

| Entidade | Descrição |
|----------|-----------|
| **User** | Cliente com nome, email, telefone e senha |
| **Order** | Pedido vinculado ao cliente, com data e status |
| **OrderItem** | Item do pedido com quantidade e preço unitário |
| **Product** | Produto com nome, descrição, preço e imagem |
| **Category** | Categoria dos produtos |
| **Payment** | Pagamento associado ao pedido |
| **OrderStatus** | Enum com os status: WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED |

---

## Tecnologias utilizadas

- Java 25
- Spring Boot 4.0.3
- JPA / Hibernate
- Maven
- H2 Database (perfil de testes)
- Postman

---

## Arquitetura

```
src/
├── entities/        # Entidades JPA (User, Order, Product, etc.)
├── repositories/    # Interfaces Spring Data JPA
├── services/        # Regras de negócio
├── resources/       # Controllers REST
├── config/          # Configuração e seed de dados
└── exceptions/      # Exceções customizadas
```

```
Controller  →  Service  →  Repository  →  Database
```

---

## Como executar

### Pré-requisitos

- Java 25
- Maven
- Git

```bash
# Clonar o repositório
git clone https://github.com/LeonardoBasseto/ecommerce-api

# Entrar na pasta do projeto
cd ecommerce-api

# Executar
./mvnw spring-boot:run
```

Acesse em: `http://localhost:8080`

### Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | /users | Listar usuários |
| GET | /users/{id} | Buscar usuário por ID |
| POST | /users | Criar usuário |
| PUT | /users/{id} | Atualizar usuário |
| DELETE | /users/{id} | Deletar usuário |
| GET | /products | Listar produtos |
| GET | /categories | Listar categorias |
| GET | /orders | Listar pedidos |
| GET | /orders/{id} | Buscar pedido por ID |

---

## Conceitos aplicados

- Mapeamento objeto-relacional com **JPA/Hibernate**
- Anotações: `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@ManyToOne`, `@OneToMany`, `@ManyToMany`, `@JoinTable`
- Arquitetura em camadas (Resource → Service → Repository)
- Tratamento de exceções customizado
- Relacionamentos entre entidades (1:N, N:N, 1:1)
- Seed de dados com perfil H2 para testes

---

## Autor

**Leonardo Basseto Rodrigues**

[![LinkedIn](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/leonardo-basseto-rodrigues-a267b9284/)
[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/LeonardoBasseto)
