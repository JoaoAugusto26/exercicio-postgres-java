# Exercício 2: Integração Eclipse e PostgreSQL

Este repositório contém a solução para a atividade prática individual da disciplina. O objetivo do projeto foi criar uma aplicação em Java para manipular dados em um Sistema de Gerenciamento de Banco de Dados Relacional (SGBDR) PostgreSQL.

## 🎯 Objetivo
Desenvolver um programa Java no ambiente Eclipse implementando as operações completas de **CRUD** (Create, Read, Update, Delete) através do padrão de projeto **DAO** (Data Access Object), conectado a uma tabela no PostgreSQL.

## ⚙️ Funcionalidades
A aplicação possui uma classe `Principal` com um menu interativo no console que permite:
- **Listar** os usuários cadastrados no banco.
- **Inserir** um novo usuário (Nome e Idade).
- **Atualizar** os dados de um usuário existente informando o seu ID.
- **Excluir** um usuário do banco de dados informando o seu ID.
- **Sair** da aplicação.

## 🛠️ Tecnologias e Ferramentas Utilizadas
- **Linguagem:** Java (JDK)
- **IDE:** Eclipse
- **Banco de Dados:** PostgreSQL & pgAdmin 4
- **Conectividade:** Driver JDBC do PostgreSQL (`postgresql-42.x.x.jar`)
- **Versionamento:** Git / GitHub

## 🚀 Como executar o projeto

### 1. Preparando o Banco de Dados
Abra o pgAdmin, crie um banco de dados chamado `banco_exercicio` e execute o seguinte script SQL na Query Tool para criar a tabela:

```sql
CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    idade INT
);
2. Configurando o Projeto no Eclipse
Clone este repositório no seu computador.

Importe o projeto no Eclipse.

Baixe o Driver JDBC do PostgreSQL.

No Eclipse, clique com o botão direito no projeto > Build Path > Configure Build Path... > Libraries > Classpath > Add External JARs... e adicione o arquivo .jar do driver baixado.

Abra o arquivo DAO.java e altere a variável senhaDoBanco (na linha 13) para a senha do seu usuário postgres local.

3. Rodando a Aplicação
Abra o arquivo Principal.java e execute o programa. O menu interativo aparecerá na aba Console do Eclipse. 
