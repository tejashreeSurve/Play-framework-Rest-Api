name := """userMangement-play"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.3"
libraryDependencies += javaForms
libraryDependencies += guice

libraryDependencies ++= Seq(
  javaJdbc,javaJpa
)

libraryDependencies += jdbc

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
EclipseKeys.withSource := true
EclipseKeys.withJavadoc := true