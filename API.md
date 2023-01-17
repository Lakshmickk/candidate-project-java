# ZOOM+Care Candidate Code Challenge - Java Web Service


## Host
**HOST**  - http://localhost:8080

## DB Connection
**URL** - {{HOST}}/h2-console

**Credentials** - sa/sa
**jdbc url** - jdbc:h2:mem:testdb

-------------------------------

## API Reference


**GET {{HOST}}/employees** - get all employees

**GET {{HOST}}/employees/{employeeId}** - get specific employee

**GET {{HOST}}/properties** - get all properties


-------------------------------

## Examples

-------------------------------

**1. Get all employees**

**_GET /employees_**

``` 
curl --location --request 
GET 'http://localhost:8080/employees'
```

-------------------------------

**2. Get employee**

**_GET /employees/{employeeId}_**

```
curl --location --request 
GET 'http://localhost:8080/employees/1'
```

-------------------------------

**3. Get all properties**

**_GET /properties_**

```
curl --location --request 
GET 'http://localhost:8080/properties'
```

-------------------------------



## Table Reference
**EMPLOYEE**
An primary id for an employee and a reference to the employees supervisor.

| Column        | Type          |
| ------------- | ------------- |
| ID            | BIGINT(19)    |
| SUPERVISOR_ID | BIGINT(19)    |

**PROPERTIES**
A map of key/value pairs of properties assigned to an employee.

| Column        | Type          |
| ------------- | ------------- |
| EMPLOYEE_ID   | BIGINT(19)    |
| KEY           | VARCHAR(256)  |
| VALUE         | VARCHAR(256)  |
