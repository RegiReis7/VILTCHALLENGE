
# Collaborators' REST API (Spring Boot App)

A Java / Maven / Spring Boot REST API that handles all the information of collaborators in VILT offices.
## About The API

 It uses an in-memory database (H2) to persist the data. You can also do with a relational database like MySQL or PostgreSQL. If your database connection properties work, you can call some REST endpoints defined in com.VILTGROUP.VILTCHALLENGE.controller.CollaboratorController on port 8081  
## Tech Stack

**Server:** Java, Spring Boot

  
## How To Build And Run

This application is packaged as a jar which has Tomcat embedded. No Tomcat or JBoss installation is necessary. You run it using the java -jar command.

- Clone this repository
- You can build the project and run the tests by running mvn clean package
- Once successfully built, you can run the app by this method:
```bash
  java -jar target/VILTCHALLENGE-0.0.1-SNAPSHOT.jar
```
    
## API Reference

#### Get all collaborators

```http
  GET /api/collaborators
```

#### Insert collaborator

```http
  POST /api/collaborators
```

#### Set postponed status

```http
    PUT /api/collaborators/{id}
```

#### Take postponed status

```http
    PUT /api/collaborators/postpone/{id}
```

  
## Usage/Examples
### Insert a collaborator
```javascript
POST /api/collaborator
Content-Type : application/json

{
    "firstName" : " ",
    "lastName" : " ",
    "budget" : " "
}

Location header: http://localhost:8081/api/collaborator
```

### Get all collaborators

```javascript
http://localhost:8081/api/collaborator

Content: list of collaborators
```

  
## Authors

- [@RegiReis7](https://github.com/RegiReis7)

  
