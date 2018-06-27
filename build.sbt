import Dependencies._
import sbt._
import Keys._
import UimaSbt.Prepare

enablePlugins(Antlr4Plugin)

organization := "fr.univ-nantes.julestar"
version:= "2.2.2"

// Add the prepare configuration

antlr4Version in Antlr4 := antlrVersion
antlr4PackageName in Antlr4 := Some("fr.univnantes.lina.uima.tkregex.antlr.generated")
sourceDirectory in Antlr4 := (sourceDirectory in Compile).value / "antlr"
javaSource  in Antlr4 := (javaSource in Compile).value
(Compile / compile) := ((Compile / compile) dependsOn (Antlr4 / antlr4Generate)).value

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
