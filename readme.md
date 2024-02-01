Spring Boot Microservices Documentation
=======================================

Introduction
------------

This is a Spring Boot microservices application that utilizes Spring Cloud components for service discovery, routing and load balancing. The application is composed of two microservices, a Sneaker Store service and an Order service, both of which share a common MySQL database for data storage. A gateway is used to receive API calls and direct them to the appropriate microservices. The application incorporates Eureka for service discovery, Zuul for gateway routing and load balancing, and Zipkin for distributed tracing.

Architecture
------------

The application is designed using the Service-Oriented Application (SOA) pattern, which emphasizes the creation of autonomous and modular services that can be easily scaled, updated, and replaced.

The application is composed of three main components:

-   Gateway: A Spring Cloud Zuul gateway that receives API calls and routes them to the appropriate microservices.
-   Microservices: Two microservices, Sneaker Store service and Order service, that perform specific business logic and communicate with the common MySQL database.
-   Database: A MySQL database that is shared by both microservices.

Each microservice is registered with Eureka for service discovery, which enables the gateway to automatically discover and route requests to the appropriate service.

Getting Started
---------------

After running the application, verify that the services are running correctly by accessing the following URLs:

-   Eureka Server: <http://localhost:8761/>
-   Zipkin Server: <http://localhost:9411/>
-   Sneaker Store Service: <http://localhost:3333/>
-   Order Service: <http://localhost:2222/>
-   Gateway: <http://localhost:8765/>

API Endpoints
-------------

The following API endpoints are available:

### Restaurant Service

-   GET /store - Retrieves a list of all Sneaker Stores.
-   GET /store/{id} - Retrieves a specific Sneaker Store by ID.
-   GET /store/{id}/inventory - Retrieves the list of Sneakers sold by a Sneaker Store by the store ID.

### Order Service

-   GET /order - Retrieves a list of all Orders.
-   POST /order - Creates a new Order.

