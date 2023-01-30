# Swagger-Spring-MVC
Implementing Swagger2 with Spring MVC Application with Java Based Configuration
The following project is based on a spring MVC application given at:https://www.boraji.com/spring-4-mvc-hello-world-example
I have implemented Swagger2 in the project and tested it! It works like Spring Boot Application running Swagger2!  

### To do:  
1>git clone https://github.com/Riddhisattwa/Swagger-Spring-MVC.git  
2>Import the Maven project by going to import->Maven->Existing Maven Projects->Select the folder where the pom.xml is there(Eclipse)  
3> Add server->Apache Tomcat 8,8.5,9  
4>Run as->Maven clean  
5>Run as->Maven install  
6->Run as Server  

### To run Swagger with the project follow the following method:  

1> Type the Url in browser: http://localhost:8080/spring-mvc-helloworld-example/swagger-ui.html  
2>You can see the controllers in the sections  

#### If you find nay error to run the Tomcat server and giving error *Deploying Maven project throws java.util.zip.ZipException: invalid LOC header (bad signature)* then do the following  

**The jar file may be corrupt. Try removing the content of your  
 *C:\Users\[username]\.m2\repository folder.*  
Then right click your project, select Maven, Update Project, check on Force Update of Snapshots/Releases.


