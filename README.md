# SpringBootMVCHibernate

To enable H2 console add spring.h2.console.enabled=true in application properties file

Reference: https://medium.com/@harittweets/how-to-connect-to-h2-database-during-development-testing-using-spring-boot-44bbb287570

http://localhost:8080/h2-console/login.jsp

Driver Class:org.h2.Driver

JDBC URL:jdbc:h2:mem:testdb

User Name:sa

Password:<EMPTY>
  
To insert data on application start up,

```java
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
private EmployeeRepository employeeRepository;

    public DevBootstrap(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //create employee
        employeeRepository.save(employee);
    }
}
```
Thymeleaf : template will be in resource/templates folder with html extension. ex:- employees.html
