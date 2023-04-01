# Common Setup

## Overview

Installing common utilities

## Setup

### Layout

Installing under `$HOME/tools`, referred to as `TOOL_BASE`


### jenv

Following the [jenv](https://www.jenv.be) install instructions 

```
cd $TOOL_BASE
git clone https://github.com/jenv/jenv.git jenv
```


### coursier

Following the [JAR-based launcher](https://get-coursier.io/docs/cli-installation#jar-based-launcher) instructions and running these commands

```
mkdir -p $TOOL_BASE/coursier/bin
cd $TOOL_BASE/coursier/bin
curl -fLo coursier https://github.com/coursier/launchers/raw/master/coursier && chmod +x coursier
```

Run the the intial setup

```
coursier setup
```

