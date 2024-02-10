<h1 align="center">
  Desafio Tunts.Rocks 2024
</h1>

<h3 align="center">
  Technical challenge from Tunts.Rocks
</h3>

<p align="center">
  <a href="https://github.com/alexbraga/parking-control/commits/master"><img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/alexbraga/desafio-tunts-rocks-2024"></a>
</p>

<h4 align="center">
	 Status: Finished
</h4>

<p align="center">
 <a href="#about">About</a> •
 <a href="#features">Features</a> •
 <a href="#how-it-works">How it works</a> •
 <a href="#tech-stack">Tech Stack</a> •
 <a href="#author">Author</a> <!--•
 <a href="#license">License</a> -->
</p>

## About

<p align="justify">The application is capable of reading a Google Sheets spreadsheet, searching for the necessary information, calculating and writing the result in the spreadsheet.</p>

---

## Features

- Integration with Google Sheets API

---

## How it works

1. <a href="#clone-this-repository">Clone this repository</a>
2. <a href="#running-the-application">Run the application</a>

#### Pre-requisites

Before getting started, you will need to have the following tools installed on your machine:

- [Git](https://git-scm.com)
- [Java OpenJDK 11](https://www.oracle.com/java/technologies/downloads/)
- [Gradle](https://gradle.org/)

In addition, you might also want an IDE to work with the code, like
[IntelliJ IDEA](https://www.jetbrains.com/idea/).

#### Clone this repository

```
git clone https://github.com/alexbraga/desafio-tunts-rocks-2024.git
```

#### Running the application

```bash
# Go to the application root folder
$ cd desafio-tunts-rocks-2024/

# Install the dependencies (replace ./gradlew with gradlew.bat on Windows)
$ ./gradlew build

# Run the application
$ ./gradlew run
```

- Alternatively, open `desafio-tunts-rocks-2024/` with your preferred IDE and run `SheetsQuickstart.java`

- Click the provided link on the terminal and proceed to Google OAuth screen on your default browser (if the "Google hasn’t verified this app" warning appears, just click Advanced > Go to Desafio Tunts.Rocks)

---

## Tech Stack

The following tools were used in the construction of the project:

#### **Language**

- **[Java OpenJDK 11](https://www.oracle.com/java/technologies/downloads/)**

#### **Dependencies**

- Google API Client Library
- Google OAuth Client Library
- Google Sheets API client library

> See the file
> [build.gradle](https://github.com/alexbraga/desafio-tunts-rocks-2024/blob/master/build.gradle)

#### **Utilities**

- Dependency Manager: **[Gradle](https://gradle.org/)**
- IDE: **[IntelliJ IDEA](https://www.jetbrains.com/idea/)**

---

## Author

<p>Alexandre Braga</p>

[![Linkedin Badge](https://img.shields.io/badge/-Alexandre%20Braga-blue?style=flat-square&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/alexgbraga/)
[![Gmail Badge](https://img.shields.io/badge/-contato@alexbraga.com.br-c14438?style=flat-square&logo=Gmail&logoColor=white)](mailto:contato@alexbraga.com.br)

---

<!-- ## License

This project is under the [MIT License](./LICENSE). -->

