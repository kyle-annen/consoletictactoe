#!/bin/bash
sbt clean
sbt makePom
cp target/consoletictactoe*.pom pom.xml
mvn deploy

