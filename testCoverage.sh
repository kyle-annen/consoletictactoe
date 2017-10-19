#!/usr/bin/env bash
sbt clean
sbt jacoco
open target/jacoco/report/html/index.html


