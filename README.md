# Spring Boot Demo 
# Demonstrates Employee CRUD Operations through REST Controller with JSON Request/Responses.


**Pre Steps**

* Configure server.port = 8083 in application.properties


**Invoking the Rest Controller**

Employee Management

* GET   		/employees 			Gets all the employees   http://localhost:8083/employees
* GET    		/employees/id		Get the employee		 http://localhost:8083/employees/1
* POST   		/employees			Create new employee		 http://localhost:8083/employees
* DELETE		/employees/id		Deletes the employee	 http://localhost:8083/employees/2



Permission Management


* POST  http://localhost:8083/employees/id


{  "type" :"E",
   "privilegedNo": "225",
   "validDate": "2022-06-31",
   "name":"676876868"
}


adds persmissions for an employee



*DELETE    http://localhost:8083/employees/id/privilegedNo      deletes the permission with a permision number privilegedNo for a employee with id


* GET    http://localhost:8083/employees/type/T        find all employess who have all privileges of type T





