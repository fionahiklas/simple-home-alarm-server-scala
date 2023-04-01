# Setup on MacOS

## Overview

See the [common setup](./docs/setup_on_all.md) for shared setup steps

There is also a project with zsh scripts to pick up relevant directories
and add things to the path, see [my-zsh-setup](https://github.com/fionahiklas/my-zsh-setup) project.

Using [homebrew](https://brew.sh) for package manmagement but jenv and
coursier for Java/Scala 


## Setup steps

### Install and add JDK versions

Install using homebrew

```
brew install openjdk@11
brew install openjdk@19
```

Add versions

```
jenv add ~/tools/homebrew/opt/openjdk@11/libexec/openjdk.jdk/Contents/Home
jenv add ~/tools/homebrew/opt/openjdk@19/libexec/openjdk.jdk/Contents/Home
```

Checking the versions

``` 
jenv versions
* system (set by /Users/fiona/.jenv/version)
  11.0
  11.0.18
  19.0
  19.0.2
  openjdk64-11.0.18
  openjdk64-19.0.2
```

Set the global version

```
jenv global 19.0
```

Under the folder for this repo, set the version and then check this

``` 
jenv local 11.0

jenv versions

  system
* 11.0 (set by /Users/fiona/wd//simple-home-alarm-server-scala/.java-version)
  11.0.18
  19.0
  19.0.2
  openjdk64-11.0.18
  openjdk64-19.0.2
```


