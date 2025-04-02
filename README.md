# Model-Service

## Overview

Project for creating JSON-based entity models and storing corresponding JSON response documents.


## Getting Started

### **Prerequisites**

Make sure you have the following installed:

- **Java 21**
- **Maven 3.9** 
- **PostgreSQL**


### **Build the Project (jar)**

```sh
mvn clean package
```


### **Build the Project (jar)**

```sh
mvn clean package
```


## Configuration

You can configure the application using an `.env` file or a `application.properties` file:

```properties
server.port=8080
registry.datasource.url=jdbc:postgresql://localhost:5432/mydb
registry.datasource.username=root
registry.datasource.password=secret
```


## Running the JAR File

You can run the application using the following command:
```sh
java -jar target/model-service-0.0.1-SNAPSHOT.jar --spring.config.additional-location=file:/path/to/properties/file
```


## License

This project is licensed under the **Apache License 2.0**. See the [LICENSE](LICENSE) file for details.
