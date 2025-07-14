# Jolt tester

A simple project to test your jolt transformation online


## Author

- [@thiagotrss](https://www.github.com/thiagotrss)


## Using docker to run

The project already has a Dockerfile.
You just need to execute the 3 commands below in order to have it up and running

Cloning the project

```bash
  git clone https://github.com/thiagotrss/jolt-test.git
```

Access project folder

```bash
  cd jolt-test
```

Build the project - creates a jar

```bash
  ./gradlew clean build
```

Build docker container

```bash
  docker build -t jolt-transformer .
```

Execute container on docker

```bash
  docker run -p 8080:8080 jolt-transformer
```

