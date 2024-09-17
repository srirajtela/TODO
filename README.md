# ToDo List Application

## Project Overview

The **ToDo List Application** is designed to help users organize and manage tasks efficiently. It provides the following functionality:

- **Create**, **update**, **delete**, **edit**, and **mark tasks as completed**.
- Tasks are stored in a **MySQL database**, ensuring persistence between sessions.

This application is built using the **Spring Boot** framework, leveraging:
- **Spring MVC** for handling HTTP requests and responses.
- **Spring Data JPA** for interaction with the database.
- **MySQL** for persistent task storage.

The project also includes features such as task filtering, sorting, and search functionality to enhance the user experience.


## Features

### User Interface
- **View a list of tasks.**
- **Add, edit, or delete tasks.**
- **Mark tasks as complete or incomplete.**
- **Search tasks by title or description.**

### Task Management
- **Add new tasks** with a title, description, and due date.
- **Edit existing tasks.**
- **Delete tasks** from the list.
- **View task details.**

### Task Status
- **Mark tasks as complete or pending.**
- **Filter tasks** based on status (completed or pending).

### Search & Sorting
- **Search tasks** by title or description.
- **Sort tasks** by due date or priority.

### Persistence
- **MySQL database** for persistent task storage.
- **Auto-loads tasks** on application start and saves changes during runtime.


  ## Technologies Used

- **Spring Boot**: Java framework for building the backend.
- **MySQL**: Database for task persistence.
- **JPA/Hibernate**: ORM tool for database interaction.
- **Thymeleaf**: Template engine for building the front-end (if applicable).
- **Maven**: Build automation tool.


## Database Setup

To set up the MySQL database for the ToDo List Application, follow these steps:

1. **Create the Database**

   Open your MySQL client or command line interface and execute the following SQL command to create the `todoapp` database:

   ```sql
   CREATE DATABASE todoapp;

2. **Update Application Configuration**

   - **MySQL Database configuration**
   
      spring.datasource.url=jdbc:jdbc:mysql://localhost:3306/todoapp?createDatabaseIfNotExist=true
   
      spring.datasource.username=root
   
      spring.datasource.password=your_password
   
      spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

  - **Hibernate JPA properties**
    
     spring.jpa.show-sql=true
  
     spring.jpa.hibernate.ddl-auto=update
  
     spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect


    ## Thymeleaf Configuration

If you are using **Thymeleaf** as the template engine for your Spring Boot application, ensure that the Thymeleaf settings are properly configured in your `application.properties` file. This configuration will enable Thymeleaf and set the location for your template files.

1. **Update Application Configuration**

   Open the `application.properties` file located in `src/main/resources` and add or update the following Thymeleaf configuration:

   ```properties
   # Enable Thymeleaf
   spring.thymeleaf.enabled=true

   # Thymeleaf template location
   spring.thymeleaf.prefix=classpath:/templates/

   # Thymeleaf template file extension
   spring.thymeleaf.suffix=.html


## Accessing the Application

Once the application is up and running, you can access it through your web browser by navigating to:


This URL points to the local server where your Spring Boot application is hosted. 

- **http**: The protocol used for communication.
- **localhost**: Refers to the local machine where the application is running.
- **8080**: The default port number where Spring Boot applications run. 

Make sure that the application is running on your local machine and that the port is not being used by another service. If you have configured a different port in your `application.properties` file, use that port number instead.



## API Endpoints

Below are the API endpoints available in the ToDo List Application:

| Method | Endpoint               | Description                        |
|--------|------------------------|------------------------------------|
| GET    | `/tasks`               | Retrieve a list of tasks            |
| GET    | `/tasks/{id}`          | Retrieve a specific task            |
| POST   | `/tasks`               | Create a new task                  |
| PUT    | `/tasks/{id}`          | Update an existing task            |
| DELETE | `/tasks/{id}`          | Delete a task                      |

- **GET `/tasks`**: Retrieves a list of all tasks.
- **GET `/tasks/{id}`**: Retrieves the details of a specific task by its ID.
- **POST `/tasks`**: Creates a new task. Requires a request body with task details.
- **PUT `/tasks/{id}`**: Updates an existing task identified by its ID. Requires a request body with updated task details.
- **DELETE `/tasks/{id}`**: Deletes the task identified by its ID.


Replace `{id}` with the actual ID of the task you want to retrieve, update, or delete. Ensure to send the appropriate request body when creating or updating tasks, and specify the new status when updating a task's status.


## Why Spring Boot?

### 1. Simplified Configuration
Spring Boot is known for reducing boilerplate code and simplifying project setup by providing default configurations and embedded servers (e.g., Tomcat). This makes it easier to get started with a fully functioning application quickly, without the need for complex XML configurations.

### 2. Spring MVC
Spring Boot integrates well with **Spring MVC**, which allows you to build RESTful APIs and web applications easily. In this To-Do List project, Spring MVC is used to handle HTTP requests and serve the frontend (if applicable). It streamlines routing and handling different views and formats.

### 3. Spring Data JPA
For database operations, **Spring Data JPA** is used in conjunction with Hibernate, an ORM (Object-Relational Mapping) tool. This enables smooth interaction with the MySQL database without writing SQL queries, as entities are automatically mapped to database tables. This project leverages Spring Data JPA for efficient CRUD operations on task data.

With Spring Boot, the overall development process is faster, and features like automatic configuration, dependency injection, and seamless integration with various components make it an excellent choice for this project.



## Summary

This project uses **Spring Boot** with the following Spring components:

- **Spring Boot**: Provides simplified setup and configuration, reducing boilerplate code and including embedded server support.
- **Spring MVC**: Handles web requests and CRUD operations, facilitating easy management of HTTP interactions and routing.
- **Spring Data JPA**: Interacts with the MySQL database, simplifying data access and manipulation through Object-Relational Mapping (ORM) with Hibernate.

These components work together to create a streamlined development experience and a robust To-Do List application.



