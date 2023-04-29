# Crypto recommendation service

## Data source
Currently, the information about available currencies and their prices is provided in the form of **.csv** files and loaded into in-memory database. In the future iterations in-memory database could be replaced by external data source (additional configuration would be required).
This should allow for easy extension by another currencies.

## Endpoints documentation
Available endpoints have been documented using Swagger, and it can be accessed at: **http://localhost:8080/swagger-ui/index.html**

![](/crypto-recommendation-service/src/main/resources/static/swagger.png)