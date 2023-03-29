# Kaiburr - Task-1
 
 ### Requirements

- Java
- Maven
- Spring Boot (Framework)
- MongoDB

#### Dependencies

- spring-boot-starter-web
- spring-boot-starter-data-mongodb
 
## Accessing APIs

### Using Postman

[Checkout the postman Collection documentation](https://documenter.getpostman.com/view/17852876/2s93RRxtwq)

## Building steps
*As I have only whitelisted my IP Address in MongoDB, this will not work for you.*
1. Open the folder `/Task_1` in your IDE ( I used IntelliJ).

2. Open the file `Task_1/src/main/java/com/vishal/kaiburr/KaiburrApplication.java`.

3. CLick on the `RUN` button or `SHift + F10`. This will start the server.



## Rest  API Endpoints:

- GET  servers by Id	`http://localhost:8080/server?id={id}`
Response contains a JSON of server object with provided id.

- GET  servers by Name	`http://localhost:8080/server?name={name}`
Response contains a JSON of all server objects with provided name.

- GET  all servers when no parameter is provided	`http://localhost:8080/server`
Response contains a JSON of all server objects.

- PUT a server	`http://localhost:8080/server`
Accept server object in body in json format. This updates the object if it already exist or else add as a new object in the database.

- DELETE server	`http://localhost:8080/server?id=3`
Deletes a  server object with provided ID.

### Screenshots:

![delete server by Id](/screenshots/deleteServer.png)

![Get all servers](/screenshots/getAllServers.png)

![Get server by Id](/screenshots/getServerById.png)

![Get server by Name](/screenshots/getServerByName.png)

![Put server](/screenshots/putServer.png)

**Connect with me on [twitter](https://twitter.com/vishalr206) or [linkedIn](https://www.linkedin.com/in/vishal-r-5a7184195/) in case if you need any clarification**
