# spring-rest-demo
A Spring Boot demo project with REST, JPA and embedded h2 database.

To run the project:
1) **git clone https://github.com/swsms/spring-rest-demo.git**
2) in the cloned project directory execute **mvn clean install**
3) and then **java -jar target/*.jar**

It starts on 8080 port. 
After next run the database will be always empty (of course, it's not a bug, it's a feature!).

URLs
- http://localhost:8080/remember/{value} - remember new entry (request date, value, user agent)
- http://localhost:8080/history - show all remembered entry

History example:
```json
[
	{
		"id": 2,
		"requested": 1492876252305,
		"agent": "insomnia/5.0.10",
		"data": "hello-rest"
	},
	{
		"id": 1,
		"requested": 1492876231893,
		"agent": "curl/7.35.0",
		"data": "secret-message"
	}
]
```
