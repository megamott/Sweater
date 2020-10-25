# Sweater <br/>
This application is blog with with the ability of registration users with specific roles. The code is written according to the [following guide](https://www.youtube.com/playlist?list=PLU2ftbIeotGoGSEUf54LQH-DgiQPF2XRO)   <br/>
## Usage
1. Create *.properties* file in **resources/** folder with following fields (database and mail delivery validation):
```
spring.datasource.url=jdbc:postgresql://localhost:5432/
spring.datasource.username=
spring.datasource.password=
```
```
spring.mail.host=smtp.gmail.com
spring.mail.username= 
spring.mail.password=
spring.mail.port=
spring.mail.protocol=smtp
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```
2. Run ```mvn clean package -P db-migration``` to build a deployable WAR file and apply database migrations.
3. Then, run application.
## Technologies 
- Java 1.8
- Spring 2.2.2.RELEASE
- Maven 3.1+
- Postgersql 42.2.8 - database <br/><br/>
Use them to avoid build errors.


