# spring-rest-demo
A Spring Boot demo project with REST, JPA and embedded h2 database.

To run the project:
1) git clone https://github.com/swsms/spring-rest-demo.git
2) mvn clean install (in the cloned project directory)
3) java -jar target/*.jar

URLs
http://localhost:8080/remember/{value} - remember value and user agent from the request
http://localhost:8080/history - show all remembered entry
