import Dependencies._
import sbt._
import UimaSbt.Prepare

organization := "fr.univ-nantes.julestar"
version:= "2.2.2"

// Add the prepare configuration
inConfig(Prepare)(Defaults.configSettings)

val antlrGen = taskKey[Unit]("Generate lexer and parse listener from g4 grammar")


// runtime
libraryDependencies ++= guava
libraryDependencies ++= uimaCore
libraryDependencies ++= uimaFit
libraryDependencies ++= jackson
libraryDependencies ++= jacksonYaml
libraryDependencies ++= antlrRuntime

// testing
libraryDependencies ++= javaTesting
libraryDependencies ++= uimaTest

// antlr (prepare and runtime)
//libraryDependencies ++= antlr
