# Minimal Java / Maven start project

Minimal template for a starting POM file. Generates a fat JAR file containing all dependencies. JAR are created with:

> mvn package

## Dependencies

Delivers some basic dependencies:

* Guava
* GSON
* SLF4J

Guava is a java helper library which deliver some interesting functions like LoadingCaches and helper methods. GSON 
helps to serialise JSON into classes and vice verse. SLF4J is a facade for logging.

# Plugins

Define Java 8 as project version. Assembly plugin for creating fat JAR file.

# Extensions

Support to deploy artifact to custom repostory via WebDAV. 