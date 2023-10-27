# java21starter

This is my simple starter template for a new Java application.

## Features
- `JDK 21` Maven build including `jar-with-dependencies`
- `JUnit5` test suite set up
- `Lombok` included
- most recent dependencies & plugin versions (as of 10/2023)

## Prerequisites 
This project requires **Java JDK 21** to run. I namely use [GraalVM for JDK 21](https://medium.com/graalvm/graalvm-for-jdk-21-is-here-ee01177dd12d) for development and testing.

## Usage
Checkout the project and start tailoring it for your needs.

**Note:** Build is pre-configured to include all declared dependencies into standalone `.jar`. Therefore, it may be quite big. If you don't need such behaviour, you'll have to change the configuration of `maven-assembly-plugin` in `pom.xml`.

Recommended steps:
+ update `groupId` and `artifactId` in `pom.xml`
+ change default package name from `cz.aloisseckar.starter`
+ update `mainClass` in `maven-jar-plugin` configuration in `pom.xml` accordingly
+ replace `README.md` with your own content
+ consider changing `LICENSE.txt` from `UNLICENSE` to something else
+ start coding your new application

## Author
* alois.seckar@gmail.com
* http://alois-seckar.cz

Use [issues](https://github.com/java21starter/ELRHistory/issues) to notify me if something is wrong with this template. Or contact me directly via the links above.
