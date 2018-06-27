import Dependencies._
import sbt._
import Keys._
//import fr.dcram.SbtJcasgen

//enablePlugins(SbtJcasgen)

organization := "fr.univ-nantes.julestar"
version:= "2.2.2"


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
testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")

// antlr generate grammar
enablePlugins(Antlr4Plugin)
antlr4Version in Antlr4 := antlrVersion
antlr4PackageName in Antlr4 := Some("fr.univnantes.lina.uima.tkregex.antlr.generated")
sourceDirectory in Antlr4 := (sourceDirectory in Compile).value / "antlr"
javaSource in Antlr4 := (javaSource in Compile).value
(Compile / compile) := ((Compile / compile) dependsOn (Antlr4 / antlr4Generate)).value

// JCas Annotation classes generation
enablePlugins(SbtJcasgen)
typeSystemDirectory in Uima :=  (sourceDirectory in Uima).value / "test" / "resources" / "uima"
targetDir in Uima := (sourceDirectory in Uima).value / "test" / "java"
(Test / compile) := ((Test / compile) dependsOn (Uima / jcasGen)).value
