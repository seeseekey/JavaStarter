# Java Starter Project

A starter project for Java based on Maven. It generates a fat JAR file containing all dependencies. The JAR files can be created with the following command:

> mvn package

## Dependencies

The project includes some basic dependencies:

* Guava 
* GSON
* SLF4J
* JUnit

**Guava** is a Java utility library that provides helpful functions and methods. **GSON** facilitates the serialization and deserialization of JSON into Java objects and vice versa. **SLF4J** serves as a facade for various logging frameworks.

**JUnit** is used for unit testing.

## Plugins

The project is configured to use Java 21 (LTS). It employs the Assembly plugin to create the fat JAR file and the Surefire plugin to execute tests.

## Usage

1. Open the project in your IDE.
2. Rename the package name and project name.
3. Remove unused dependencies from the `pom.xml`.
4. Happy coding!