# Scala Console TicTacToe
[![Build Status](https://travis-ci.org/kyle-annen/consoletictactoe.svg?branch=master)](https://travis-ci.org/kyle-annen/consoletictactoe)
[![Coverage Status](https://coveralls.io/repos/github/kyle-annen/consoletictactoe/badge.svg?branch=master)](https://coveralls.io/github/kyle-annen/consoletictactoe?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/068dd8bb9d70458685228ec9fab3c164)](https://www.codacy.com/app/kyle-annen/consoletictactoe?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=kyle-annen/scala-tictactoe&amp;utm_campaign=Badge_Grade)


A console implementation of TicTacToe, playable on 3x3, 4x4, and 5x5 boards (any size really if source code is edited). After 10x10 the board loses som visual fidelity.

# Requirements

- Java 8
- Scala 2.12
- install sbt

To run, clone repository and run the following command from the root directory of the cloned repository.


``` bash
sbt run
```

# Test Coverage

To run test coverage:

```bash
sh testCoverage.sh
```

# Clojars deploy

To deploy, run:

```bash
sh deploy.sh
```
