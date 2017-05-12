# playground

This is my Playground project. I'm experimenting here - I solve small tasks, experiment with different patterns etc. The project is organized as gradle multiproject. Below are short descriptions of the various subprojects. All subprojects may be imported in Eclipse as existing Java projects.

Usage:

```
git clone https://github.com/luchob/playground.git
cd playground
gradlew eclipse
```

Import the existing subprojects in Eclipse and explore.

## euler

[Project Euler](https://projecteuler.net/) is a game in which you have to solve programatically different problems. 
Ususally some background in maths is required. The problems are not bound to any specific programming language. 
They largely vary in difficulty. I just store my solutions here. I'm not a keen member and I practise sporadically. 

## guice

[Guice](https://github.com/google/guice/wiki) is a cool lightweight dependency injection framework. I'm storing some patterns described in the Guice wiki for quick reference.

## VMWare Java Beer event

The kind hosts of the regular [Java Beer Event](http://java.beer/event/view/10) gave this friendly task to anyone willing at the entrance. The question is what will be printed in the output. Answer is 0 and 42.


```
git clone https://github.com/luchob/playground.git
cd playground
gradlew :vmwarejavabeer:bootRun
```

Output:

```
gradlew :vmwarejavabeer:bootRun
:vmwarejavabeer:compileJava UP-TO-DATE
:vmwarejavabeer:processResources UP-TO-DATE
:vmwarejavabeer:classes UP-TO-DATE
:vmwarejavabeer:findMainClass
:vmwarejavabeer:bootRun

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.5.3.RELEASE)

....
2017-05-12 07:51:20.467  INFO 10892 --- [           main] com.vmware.javabeer.task.Application     : In constructor - the value is 0.
2017-05-12 07:51:20.478  INFO 10892 --- [           main] com.vmware.javabeer.task.Application     : In post construct - the value is 42.
```
