# WASP Software Engineering Course

In this project we will develop a piglatin translator. So far the code has only been tested on the OSX platform, thus all further information is written for OSX implementation. Similar commands or packages should work for Linux/Windows.

# Requirements
* Java Development Kit ( http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Macports/Homebrew (not required but will easily install Ant)
* Ant (install with Macports `sudo port install apache-ant` or Homebrew `brew install ant`)

# Installation
Having the packages above installed simply clone the git repo and inside `/wasp_sw_course` run the following command

`ant` for building and compiling everything

`ant junit` to run the JUnit tests as well

If you are in the correct spot in the directory everything will compile, build and run. It will also show if the JUnit passes the written tests for the translator.

# Run
Move into the jar directory (`cd /build/jar`) and run the code by simply writing

`java -jar PigLatin.jar <yourWordHere>`

The output will then be your translated piglatin word.
