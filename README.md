# Rock, paper, scissors 
This is a spring boot REST API that allows to discover and play games. Currently the game implemented is the classic version of rock, paper, scissors. 
Information about the endpoints is available by default in the debug environment in http://localhost:8080/swagger-ui.html.

## File structure
Inside the src/main/java/com/test/rock_scissors_paper package there is:
* The main of the application. 
* Config: contains CorsConfiguration (by default set as very permissive).
* Controllers: contains the REST Controllers definition. 
* Domain: contains the business logic of the application. Contains the entities used for the application and the game implementation of rock, paper, scissors. For the sake of simplicity the entities are also used as the communication entites outside of the application instead of using DTOs.
* Repository: contains the data access of the application. In this case there is a hardcode reference of the objects but could be substitude for a persistence system like a database. 
* Services: contains the classes that work as a bridge between the business logic and the endpoints exposed by the controllers. 