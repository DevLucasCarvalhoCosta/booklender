
# BookLender - Sistema de Empréstimo de Livros

**BookLender** é um sistema de gestão de empréstimos de livros desenvolvido com Spring Boot e PostgreSQL. O objetivo do sistema é fornecer funcionalidades de cadastro de livros, usuários e gerenciamento de empréstimos, incluindo devoluções e controle de status dos livros.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

- **Cadastro de Livros**: Permite registrar novos livros com informações como título, autor e status.
- **Cadastro de Usuários**: Registra usuários que podem pegar emprestado os livros.
- **Empréstimo de Livros**: Permite que um usuário pegue um livro emprestado.
- **Devolução de Livros**: Permite que um usuário devolva um livro emprestado.
- **Consulta de Livros e Empréstimos**: Visualização de todos os livros cadastrados e os status dos empréstimos.

## Tecnologias Utilizadas

- **Backend**: Spring Boot
- **Banco de Dados**: PostgreSQL
- **Testes**: JUnit 5, Mockito
- **Documentação**: Diagramas de arquitetura e fluxo
- **Controle de Versão**: Git e GitHub

## Instalação

Para rodar o projeto localmente, siga os passos abaixo:

### 1. Clonar o Repositório

Clone o repositório para o seu computador:

```bash
git clone https://github.com/DevLucasCarvalhoCosta/booklender.git
```

### 2. Configurar o Banco de Dados PostgreSQL

- Instale o PostgreSQL no seu computador.
- Crie um banco de dados chamado `booklender` no PostgreSQL.

No arquivo `src/main/resources/application.properties`, configure as credenciais do seu banco de dados:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/booklender
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 3. Rodar o Projeto

- Se você estiver usando **Maven**, execute o comando abaixo:

```bash
mvn spring-boot:run
```

### 4. Rodar os Testes

Para rodar os testes, use os seguintes comandos:

- Para **Maven**:

```bash
mvn test
```

### 5. Acessando a Aplicação

Após rodar o projeto, você pode acessar a aplicação em `http://localhost:8080/`. As APIs podem ser acessadas por ferramentas como Postman ou diretamente via navegador.

---

## Diagramas

Para melhor compreensão do sistema, foram criados os seguintes diagramas:

### 1. **Diagrama de Classes**

Este diagrama mostra as principais classes do sistema e seus relacionamentos, incluindo as classes `Livro`, `Usuario`, `Emprestimo`, entre outras.

![Diagrama de Classes](https://github.com/DevLucasCarvalhoCosta/booklender/blob/main/booklender/src/main/java/com/booklender/booklender/Diagramas/1.%20Diagrama%20de%20Classes.png)

### 2. **Diagrama de Entidade-Relacionamento (ER)**

Este diagrama mostra o relacionamento entre as entidades no banco de dados, como as tabelas `livros`, `usuarios`, e `emprestimos`.

![Diagrama de Entidade-Relacionamento (ER)](https://github.com/DevLucasCarvalhoCosta/booklender/blob/main/booklender/src/main/java/com/booklender/booklender/Diagramas/2.%20Diagrama%20de%20Entidade-Relacionamento%20(ER).png)

### 3. **Diagrama de Sequência - Fluxo de Empréstimo**

Este diagrama descreve o fluxo de operações quando um usuário realiza o empréstimo de um livro, incluindo as interações entre o usuário, o sistema e o banco de dados.

![Diagrama de Sequência - Fluxo de Empréstimo](https://github.com/DevLucasCarvalhoCosta/booklender/blob/main/booklender/src/main/java/com/booklender/booklender/Diagramas/3.%20Diagrama%20de%20Sequência%20-%20Fluxo%20de%20Empréstimo.png)

### 4. **Diagrama de Implantação**

Este diagrama mostra como o sistema será implantado em diferentes camadas, com destaque para o servidor de aplicação e o banco de dados.

![Diagrama de Implantação](https://github.com/DevLucasCarvalhoCosta/booklender/blob/main/booklender/src/main/java/com/booklender/booklender/Diagramas/4.%20Diagrama%20de%20Implantação.png)

---

## Testes

O sistema foi testado utilizando **JUnit 5** e **Mockito**. Abaixo está a captura de tela dos testes executados:

![Testes Executados](https://github.com/DevLucasCarvalhoCosta/booklender/blob/main/booklender/src/main/java/com/booklender/booklender/Diagramas/testes.png)

---
