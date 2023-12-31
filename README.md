# Projeto Spring Boot usando Java

Este documento explana sobre o projeto desenvolvido com Spring Boot utilizando a linguagem Java.

## Descrição do Projeto

Este projeto consiste em uma aplicação criada com o framework Spring Boot, incorporando Thymeleaf para templates, Spring Web para criação de endpoints, H2 Database para armazenamento e JPA para o mapeamento objeto-relacional. A aplicação demonstra conceitos como:

- Criação de um projeto usando o framework Spring Boot.
- Implementação de um modelo de domínio.
- Mapeamento objeto-relacional com JPA.
- Configuração de banco de dados H2.
- Criação de endpoints da API REST.

## Tecnologias Utilizadas

- Spring Boot: Framework Java para desenvolvimento de aplicativos.
- Thymeleaf: Motor de template para renderização de páginas web.
- Spring Web: Módulo para criação de endpoints web.
- H2 Database: Banco de dados em memória.
- JPA (Java Persistence API): Padrão de mapeamento objeto-relacional para Java.
- Java: Linguagem de programação principal do projeto.

## Entidades

### User

A entidade `User` representa os usuários do sistema.

| Atributo       | Descrição                        |
|----------------|----------------------------------|
| Nome           | Nome do usuário.                 |
| Email          | Endereço de email do usuário.    |
| Primary key    | Chave primária única do usuário. |
| Foreign key    | Referência ao Departamento.      |

### Departamento

A entidade `Departamento` representa os departamentos da organização.

| Atributo       | Descrição              |
|----------------|------------------------|
| Nome           | Nome do departamento.  |
| Chave primária | Chave primária única.  |

## Executando o Projeto

1. Certifique-se de ter o Java e o Maven instalados.
2. Clone este repositório: 
```git clone git@github.com:LadyJessie19/SpringBootUserDept.git```
3. Navegue até o diretório do projeto: 
```cd SpringBootUserDept```
4. Execute a aplicação: 
```mvn spring-boot:run```

A aplicação estará acessível em [http://localhost:8080](http://localhost:8080).

## Conclusão

Este documento fornece uma visão geral do projeto Spring Boot desenvolvido em Java, destacando o uso de Thymeleaf, Spring Web, H2 Database e JPA. À medida que o projeto evolui, é importante adicionar mais detalhes e informações relevantes para enriquecer a compreensão do mesmo.
