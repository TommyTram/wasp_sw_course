# WASP Software Engineering Course

The project is currently being developed only for OSX.
* Java Development Kit ( http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Macports/Homebrew (not required but will easily install Ant)
* Ant (install with Macports `sudo port install apache-ant` or Homebrew `homebrew install ant`)

# Installation
Having the packages above installed simply clone the git repo and inside `/wasp_sw_course` run the following command

`ant`

If you are in the correct spot in the directory everything will compile, build and run. It will also show if the JUnit passes the written tests for the translator.

# Run
Move into the jar directory (`cd /build/jar`) and run the code by simply writing

`java -jar PigLatin.jar <yourWordHere>`

The output will then be your translated piglatin word.
