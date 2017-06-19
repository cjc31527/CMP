name := """CMP"""
organization := "HCZ.org"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies += javaJdbc
libraryDependencies += javaJpa
libraryDependencies += evolutions

lazy val cmp = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)
