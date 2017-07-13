# ExampleBuy-
A simple Buy Example for Spring_boot+jdk1.8+maven
question1:I used Spring Boot in my project because it makes that easy to create stand-alone, production-grade Spring based Applications , I can "just run". We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.You need not to load dependent lib because maven will do it.

question2:
To implement persistet layer you should 
(1)add dependency to pom.xml such as:
       <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
       <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
(2)config you datasource in application.properties such as:
   spring.datasource.url = jdbc:mysql://localhost:3306/webtest  
   spring.datasource.username = root  
   spring.datasource.password = 220316  
   spring.datasource.driverClassName = com.mysql.jdbc.Driver  
   # Specify the DBMS  
  spring.jpa.database = MYSQL  
  # Show or not log for each sql query  
  spring.jpa.show-sql = true  
  # Hibernate ddl auto (create, create-drop, update)  
  spring.jpa.hibernate.ddl-auto = update  
  # Naming strategy  
  spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy  
  # stripped before adding them to the entity manager)  
  spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect 
  (3)create dataBean.java,dao.java
  (4)then you can deal with datas in your controller.java
        
        
        
