# Product Catalogue

## Goal

The agenda is to create a Java web application based on the standard servlet spec.
The application should provide a REST-ful API that provides getProducts, getBrand, getColor, getProductCategory APIs.

# Implementation

## Product Catalogue Application

- This Application basically constructed as the spring boot application and runs on the embedded
  tomcat server on the default port 8080.
- This application provides below three GET end points in the controller class as below,
    - a) To get the list of transactions
       - **http://localhost:8080/api/brands**
    - b) To get the list of transactions based on transaction type
       - **http://localhost:8080/api/colors**
    - c) To get total transaction amount based on transaction type
       - **http://localhost:8080//api/productcategories**
    - c) To get total transaction amount based on transaction type
           - **http://localhost:8080/filter/{filter}/{value}**
    - c) To get total transaction amount based on transaction type
           - **http://localhost:8080/api/products**
- Exception handling is also implemented in case of any failure in the application and also
  logging is covered as in when it is required using **Sl4j libraries**.

- **Note** In order to enable swagger UI and documentation, make sure application is running on default port : 8080.
- Swagger UI is enabled on the below URL,
    - **http://localhost:8080/swagger-ui.html**
- Swagger documentation can be found on the below link,
    - **http://localhost:8080/v2/api-docs**

# Execution

In order to run the application, follow the below steps,
- Open a terminal window
- Change directory to Product Catalogue maven project.
  You should be in a directory that contains pom.xml file.
- Run the following command:
    - **mvn spring-boot:run**
- Now the application is up and running on the default port : 8080.
- Open another terminal in the same directory.
- Use the below curl command to get the list of brands, color, category and product,
    - **Example:**
        - **curl -X GET "http://localhost:8080/api/brands"**
- Use the below command to build and to run the test cases,
   - a) **mvn clean install**
   - b) **mvn test**