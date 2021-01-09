# CitiesBrazil API

[![Author](https://img.shields.io/badge/author-GuilhermeRodrigues-11BC83?style=flat-square)](https://github.com/iamgrodrigues)
[![Languages](https://img.shields.io/github/languages/count/iamgrodrigues/citiesbrazil-api?color=11BC83&style=flat-square)](#)
[![Stars](https://img.shields.io/github/stars/iamgrodrigues/citiesbrazil-api?color=11BC83&style=flat-square)](https://github.com/iamgrodrigues/citiesbrazil-api/stargazers)
[![Forks](https://img.shields.io/github/forks/iamgrodrigues/citiesbrazil-api?color=11BC83&style=flat-square)](https://github.com/iamgrodrigues/citiesbrazil-api/network/members)
[![Contributors](https://img.shields.io/github/contributors/iamgrodrigues/citiesbrazil-api?color=11BC83&style=flat-square)](https://github.com/iamgrodrigues/citiesbrazil-api/graphs/contributors)

> A Rest API that helps you to get all the cities in Brazil :rocket:

<p align="center">
  <img align="center" src="https://i.ibb.co/5Y4xYqK/Cities-Brazil-I.png" alt="CitiesBrazil-API" border="0">
</p>


# :pushpin: Table of Contents

* [Features](#rocket-features)
* [Requirements](#requirements)
* [Installation](#construction_worker-installation)
* [Getting Started](#runner-getting-started)
* [FAQ](#postbox-faq)
* [Found a bug? Missing a specific feature?](#bug-issues)
* [Contributing](#tada-contributing)
* [License](#closed_book-license)

# :rocket: Features

- GET List of Brazilian Cities and States, and Countries. 
- GET each Brazilian City and State, and Country by Id. 
- GET a straight line distance between two Brazilian Cities.

Nearby cities query will be added soon.

[![Run in Insomnia}](https://insomnia.rest/images/run.svg)](https://insomnia.rest/run/?label=CitiesBrazilAPI%20API&uri=https%3A%2F%2Fgithub.com%2Fiamgrodrigues%2Fcitiesbrazil-api%2Fblob%2Fmaster%2F.github%2Fdocs/citiesbrazil-api)

# Requirements

For building and running the application you need:

- [JDK 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [Gradle](https://gradle.org/)
- [Docker to run PostgreSQL image](https://docs.docker.com/get-docker/) or [PostgreSQL installed locally](https://www.postgresql.org/download/)

# :construction_worker: Installation

To install this application, run the following commands:

```bash
git clone https://github.com/iamgrodrigues/citiesbrazil-api.git
```

If you have a SSH key registered in your Github account, clone the project using this command:

```bash
git clone git@github.com:iamgrodrigues/citiesbrazil-api.git
```

# :runner: Getting Started

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.iamgrodrigues.citiesbrazilapi.CitiesBrazilApiApplication` class from your IDE.

Alternatively you can use the [Spring Boot Gradle plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins.html#build-tool-plugins-gradle-plugin) like so:

```shell
gradle bootRun
```
Afeter the above command, you can navigate to the following address to see the project up and runnig:

```shell
http://localhost:8080/cities
```

## Running docker container
> Note: Skip this part if you have PostgreSQL installed

Once you've installed Docker run the following command: that will start up the PostgreSQL container on 5432:5432 port, set up enviroment variables for user and password, and create a database called cities.

```shell
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

## Populate the database
> Note: If you already have PostgreSQL installed on you machine, skip the docker related commands. 

Gitclone the following repository, please show the man some love by starring his repository, he has done an amazing work populating all of those datas into this database.

```bash
https://github.com/chinnonsantos/sql-paises-estados-cidades.git
```

Once you done clonning it, navigate to the /PostgreSQL folder and run these commands:

```bash
docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

```

In order to do the distance calculation you will need to create the [Earthdistance](https://www.postgresql.org/docs/current/earthdistance.html) extension in the database, you can achieve that by running these commands:
```PostgreSQL

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```

## Status Codes

CitiesBrazil returns the following status codes in its API:

| Status Code | Description |
| :--- | :--- |
| 200 | `OK` |
| 400 | `BAD REQUEST` |
| 500 | `INTERNAL SERVER ERROR` |

Error handling will be added soon.

# :postbox: Faq

**Question:** What are the tecnologies used in this project?

**Answer:** The tecnologies used in this project are [Java](https://www.java.com) + [Spring Boot](https://spring.io) and [PostgreSQL](https://www.postgresql.org/).

# :bug: Issues

Feel free to **file a new issue** with a respective title and description on the the [CitiesBrazil API](https://github.com/iamgrodrigues/citiesbrazil-api/issues) repository. If you already found a solution to your problem, **I would love to review your pull request**! Have a look at our [contribution guidelines](https://github.com/iamgrodrigues/citiesbrazil-api/blob/master/CONTRIBUTING.md) to find out about the coding standards.

# :tada: Contributing

Check out the [contributing](https://github.com/iamgrodrigues/citiesbrazil-api/blob/master/CONTRIBUTING.md) page to see the best places to file issues, start discussions and begin contributing.

# :closed_book: License

Released in 2021.
This project is under the [MIT license](https://github.com/iamgrodrigues/citiesbrazil-api/blob/master/LICENSE).

Made with love by [Guilherme Rodrigues](https://github.com/iamgrodrigues) 💚🚀
