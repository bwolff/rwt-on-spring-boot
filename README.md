# Eclipse RWT on Spring Boot
This small example demonstrates how to integrate [Eclipse RWT](https://www.eclipse.org/rap/) (the UI technology of Eclipse RAP) in [standalone mode](https://www.eclipse.org/rap/developers-guide/devguide.php?topic=rwt-standalone.html&version=3.20) in a Spring Boot web application using Gradle as the buildtool.

This example shows:
* how to declare the RWT and JFace dependencies in a Gradle build;
* how to integrate the moving parts of RWT with a Spring Boot web application (Spring MVC);
* how to leverage Spring managed beans, dependency injection and a pure programmatic way of configuring and wiring together an RWT application (no need for a web.xml);
* how to run UI unit tests with the RWT test fixture;

The example is not very sophisticated and there is a lot more to explore, but you should get the idea ;).

Have fun playing around!

# Getting Started

## Requirements

Java 11 (or later)

## Running locally

You can use the Gradle wrapper that comes with the project to run the commands.
If you are on Windows, use `gradlew.bat` instead.

```bash
gradlew bootRun
```

This Gradle command will build and run the application in an embedded Tomcat container.
After the app has fully started, open a browser and visit http://localhost:8080/ or http://localhost:8080/hello

Alternatively, you can use `bootJar` to create a runnable standalone jar file with an embedded Tomcat container and run it like this:

```bash
gradlew bootJar

java -jar build/libs/rwt-on-spring-boot-0.0.1-SNAPSHOT.jar
```

## Deploying as a WAR file

To build a WAR file that you can deploy to a Tomcat container installation or run in a Docker image, simply use `war`:

```bash
gradlew war
```

The resulting WAR file will be located in `build/libs`.

## Additional Links
These additional references should also help you:

* [Eclipse RAP Developer's Guide](https://www.eclipse.org/rap/developers-guide/)
* [RWT Standalone](https://www.eclipse.org/rap/developers-guide/devguide.php?topic=rwt-standalone.html&version=3.20)
* [RWT Application Configuration](https://www.eclipse.org/rap/developers-guide/devguide.php?topic=application-configuration.html&version=3.20)
* [Honorary Mention: related article on Java Code Geeks](https://www.javacodegeeks.com/2018/11/eclipse-rap-spring-boot.html)