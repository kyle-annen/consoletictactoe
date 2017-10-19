#!/bin/bash
sbt makePom
cp target/consoletictactoe*.pom pom.xml
mvn deploy

