# PostApi-Deployment
### Requirements
* IntelliJIDEA
* ServerPort: 8081 (use: localhost:8081)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)
* terminus
* EC2 
### Steps to run the Project
* Click on the Swagger URL which is pasted below and perform the operations

http://18.116.36.49:8081/swagger-ui/index.html#/post-controller

# Dependencies
## Validation
* Bean Validation with Hibernate validator.
## Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
## Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
## Spring Data JPA
* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
## Lombok
* Java annotation library which helps to reduce boilerplate code.
## MySQL
* MySQL JDBC driver.
## Swagger
* It provide the UserInterface for all our API's. 
# Project Structure(MVC Structure)
## Model
*PostModel
## Controller
* PostController
## DAO
* PostRepository
## Service
* PostService
# EndPoints
## Post
* createPost
* getPost
# Working
* In this project we mainly focus on the deployment of project in the EC2 which is provided by the AWS(Amazon web services).
* In this project we deployed the project with the help of the terminus.
