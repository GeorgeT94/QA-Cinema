# QA-Cinema

## mysql database

install mysql
https://dev.mysql.com/doc/refman/8.0/en/windows-installation.html

run SQL commands
  ```
  create database cinema;

  create user 'user'@'localhost' identified by 'password';

  grant all on cinema.* to 'user'@'localhost';
  ```
## spring boot application

inside the springboot-backend directory run:
```
  mvn spring-boot:run
  ```
