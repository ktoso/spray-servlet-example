```
sbt package
java -javaagent:../lightbend-reactive-monitoring-tc-server-template/lib/cinnamon-agent-2.0.0.jar -jar jetty-runner-9.4.0.RC0.jar target/scala-2.11/exampleapi_2.11-1.0.war

```

to see it blow up
