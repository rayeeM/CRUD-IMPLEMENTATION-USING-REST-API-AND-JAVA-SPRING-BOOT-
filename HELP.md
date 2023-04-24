# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/#build-image)
* [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.0.6/reference/html/native-image.html#native-image)
* [Spring HATEOAS](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#web.spring-hateoas)
* [Jersey](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#web.servlet.jersey)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#data.sql.jdbc)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Session](https://docs.spring.io/spring-session/reference/)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#io.webservices)
* [JDBC API](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#data.sql)
* [Vaadin](https://vaadin.com/docs)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#web)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#web.reactive)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#using.devtools)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/docs/3.0.6/reference/html/web.html#web.graphql)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a Hypermedia-Driven RESTful Web Service](https://spring.io/guides/gs/rest-hateoas/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Creating CRUD UI with Vaadin](https://spring.io/guides/gs/crud-with-vaadin/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)

### Additional Links
These additional references should also help you:

* [Configure AOT settings in Build Plugin](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/htmlsingle/#aot)

## GraalVM Native Support

This project has been configured to let you generate either a lightweight container or a native executable.
It is also possible to run your tests in a native image.

### Lightweight Container with Cloud Native Buildpacks
If you're already familiar with Spring Boot container images support, this is the easiest way to get started.
Docker should be installed and configured on your machine prior to creating the image.

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image -Pnative
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 child:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools
Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM `native-image` compiler should be installed and configured on your machine.

NOTE: GraalVM 22.3+ is required.

To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

Then, you can run the app as follows:
```
$ target/child
```

You can also run your existing tests suite in a native image.
This is an efficient way to validate the compatibility of your application.

To run your existing tests in a native image, run the following goal:

```
$ ./mvnw test -PnativeTest
```

