# Dependency conflict sandbox

This project demonstrates using [Gradle's module replacement](http://www.gradle.org/docs/2.2/userguide/dependency_management.html#sec:module_replacement) to [swap out one dependency for another](http://stackoverflow.com/questions/27241107/when-are-two-artifacts-considered-equal/27241367).

The real project is in the **client** directory. The two module projects are in in the **com-group** and **org-group** directories. There is intentionally no top level *build.gradle* file because I wanted to isolate the client project.

### Building

Execute the install task

    $ gradle install

in each of the module project directories. Then execute

    $ gradle run

in the **client** module to launch the application.
