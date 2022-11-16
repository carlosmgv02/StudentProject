# StudentProject
Java project created using `SpringBoot` & `MariaDB`.<br>
It consists of a basic program used to add and manage students in the database, no *frontend* has still been implemented.
## Project Structure
* Student: it contains the student's atributes, getters & setters.
* StudentConfig: class used to sent the students to the command line in order to be added to our DB.
* StudentController: class used to indicate the url we should follow in order to be able to view the info on a web browser.
* StudentRepository: interface that extends from the JPA repo, which gives us the propper methods to add students to the database.
* StudentService: gives the StudentController the ability of getting students by calling the method *getStudents()*.

### Dependencies used:
* Spring Web
* Spring Data JPA
* Mariadb java client

## Running instructions
1. Start MariaDB, I personaly use XAMPP.<br>
![xampp](https://user-images.githubusercontent.com/76976573/202275116-3ee7149d-d86a-4fc7-ac21-5f91cc1331a9.png)

2. Open a command prompt and type the following command:
```console
mysql -h localhost -u root
```
3. Create database using the following command:
```mysql
create database students;
```
4. Run our SpringBoot app.

If we want to view the databases's elements, we can do it several ways:
* Browsing: http://localhost:8080/api/v1/student <sup>1</sup>.
* Via intellij by using the database add.
* Running the following command on our open CMD:
```sql
select * from student;
```
![dataBase](https://user-images.githubusercontent.com/76976573/202274960-1e51fa00-07a1-4afa-8962-a59e9bea963a.png)

<sup>1</sup>Take into account that you can change the application's running port by modifying the following line from the [`/src/main/resources/application.properties`](https://github.com/carlosmgv02/StudentProject/blob/a3902eed6e915535a64b9d2b5e7b61138adb3ab9/src/main/resources/application.properties) file:
```java
spring.datasource.url=jdbc:mariadb://localhost:3306/student
```

