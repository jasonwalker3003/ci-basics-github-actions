# ci-basics-github-actions

![CI](https://github.com/jasonwalker3003/ci-basics-github-actions/actions/workflows/ci.yml/badge.svg)

A GitHub Actions pipeline for a small Spring Boot app: build, test, keep the jar, and block merges into main until the tests pass. Lab work from week 4 of my Azure and DevOps training.

## The pipeline (.github/workflows/ci.yml)
- Runs on every pull request and every push to main, or by hand with Run workflow.
- Sets up Java 21 and Gradle with caching, then ./gradlew build compiles and tests the app.
- Keeps the jar as an artifact for 7 days, and the test report when a test fails.
- Its token can only read the repo (permissions: contents: read).

## The rule
A ruleset on main requires a pull request and a passing build check, so a red pipeline can't be merged.

## What I learned
- 
- 
- 
