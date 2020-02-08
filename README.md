# Banking authentication microservice
This project is a Spring boot based authentication microservice which produces a JWT token on sucvcessful authentication.



### Dependencies

* Java 8 should be installed and available in the system. JAVA_HOME environment variable should be set and pointing to the location of Java 8.
* Maven should be installed in the system and set in PATH.
* A database like MySQL should be installed and accessible in the system.
* Also a table named **BankingUser** should be created in the database.Below is a DDL and DML to create and populate the table:
DDL: 
CREATE TABLE BankingUser (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username varchar(100),
    password varchar(100)
);
DML:
Insert into BankingUser(username, password) values('sanjoy', '$2a$10$v7ygjYVojN/QCyCqrbAa6.aCVDWrzo1ItCwU6futK51A/BOmxI0Iy');
* Note that the password entered in the above DML is a Bcrypt encrypted hash. Please use this link to encrypt your own password: https://bcrypt-generator.com/

### Compiling and packaging

 `mvn clean package -DskipTests `

### Running program

The below command runs the program            

`mvn spring-boot:run" `
