# simple-home-alarm-server-scala

## Overview

Experiments with the Play framework using Scala 


## Notes

### Project Setup

#### Installing Prerequisites

Follow the instructions for [common setup](./docs/setup_on_all.md) then one of 

* [setup on macoS](./docs/setup_on_macos.md)
* [setup_on_linux](./docs/setup_on_linux.md)


#### Creating Initial Play Project

Following the [Scala getting started instructions](https://docs.scala-lang.org/getting-started/sbt-track/getting-started-with-scala-and-sbt-on-the-command-line.html)
also using the templates and steps in the [play framework getting started docs](https://www.playframework.com/getting-started)

After much reading/hacking around found that I could create the skeleton code with this command

```
sbt new playframework/play-scala-seed.g8 --out . \
  --name=simple-home-alarm-server \
  --organization=com.hiklas.simple \
  --play_version=2.8.19 \
  --scala_version=2.13.10
```

#### Running the initial setup

Run the following command

``` 
sbt run
```

Then try and hit the endpoint

```
curl http://localhost:9000/
```


## References

### Scala

* [JDK compatibility](https://docs.scala-lang.org/overviews/jdk-compatibility/overview.html)
* [Dependency injection in Scala](https://di-in-scala.github.io)

### Sbt

* [Getting started with Scala and sbt](https://docs.scala-lang.org/getting-started/sbt-track/getting-started-with-scala-and-sbt-on-the-command-line.html)
* [sbt template usage](https://www.scala-sbt.org/1.x/docs/sbt-new-and-Templates.html)
* [sbt running](https://www.scala-sbt.org/1.x/docs/Running.html)
* [giter8 usage](https://www.foundweekends.org/giter8/usage.html)
* [giter8 option parsing](https://github.com/foundweekends/giter8/blob/df63ff633c4025df72bc873d454a876fb1d4b395/app/src/main/scala/giter8.scala#L66-L84)


### Play 

* [Getting started](https://www.playframework.com/documentation/2.8.x/HelloWorldTutorial)
* [Dependency injection in PLay](https://www.playframework.com/documentation/2.8.x/ScalaDependencyInjection)
* [Compile time dependency injection in play](https://www.playframework.com/documentation/2.8.x/ScalaCompileTimeDependencyInjection)

### Java

* [brew openjdk](https://formulae.brew.sh/formula/openjdk)
* [jenv](https://www.jenv.be)
