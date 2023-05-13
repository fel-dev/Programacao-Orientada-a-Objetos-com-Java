# JDBC

## O que é JDBC?

- Java Database Connectivity (JDBC) é uma API que permite a execução de operações em bancos de dados relacionais a partir da linguagem Java.

## O que é um driver JDBC?

- Um driver JDBC é um software que permite a comunicação entre a aplicação Java e o banco de dados.

## Como utilizar o JDBC?

Precisa ser baixar o driver do banco de dados que você vai utilizar.no site do banco de dados. Por exemplo, se for o MySQL, baixe o driver JDBC do MySQL.


## Como configurar o JDBC?


- Adicione o driver JDBC no classpath da aplicação. Por exemplo, se for o MySQL, adicione o arquivo `mysql-connector-java-5.1.45-bin.jar` no classpath da aplicação.

  - https://www.mysql.com/downloads/connector/j/

- Carregue o driver JDBC na aplicação. Por exemplo, se for o MySQL, carregue o driver JDBC com o seguinte código:
cadastro_cliente
```java

Class.forName("com.mysql.jdbc.Driver");

```

## Criando uma tabla simples no MySQL Workbench ou outro Gerenciador de Banco de Dados.

```sql
// Abrir um WINMP ou outro gerenciador de banco de dados
- Instalar qlqr um.. WAMP, XAMP, LAMP Ou MySQL Workbench...
- Em um navegador acessar http://localhost/phpmyadmin (opcional)

// Criar schema por lá ou por aqui no VS Code com o comando abaixo (extensão SQLTools e MariaDB)
create database cadastro_cliente;

// Usar o banco de dados
use cadastro_cliente;

// Criar tabela
create table cliente(
	codigo int not null auto_increment primary key,
	name varchar(100)
)
```
# Consultar e cadastrar todos os clientes através do JDBC
## Com o padrão:

```
(pkg) com.algaworks.cap7.jdbc
DAOFactoy
+ getClientDAO() : ClienteDAO
|
JdbcDAOFactory
| (cria)
JdbcClienteDAO
|
<<interface>>
ClienteDAO
```

