- Foi criado  uma aplicação Spring Boot conectando ao PostgreSQL através do JPA

- Para essa aplicação utilizou-se o Maven, Java, Spring Boot.

- O Banco de Dados quutilizado foi o Postgres, que foi inicializado utilizando Docker e Docker-Compose. 

- A aplicação é um CRUD básico que recebe dados através de API utilizando o POSTMAN.

## Gerar imagem no Docker

- mvn clean package // build do projeto e assim gerar arquivo .jar 
- Editar o arquivo DockerFile
- docker build -t app.jar .
- docker run -p 8080:8080 app.jar 