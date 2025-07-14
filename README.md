# Jolt tester

A simple project to test your jolt transformation online


## Author

- [@thiagotrss](https://www.github.com/thiagotrss)


## Using docker image from dockerhun

The project has two images available on docker hub to be used: for architecture arm64 (built on macos M1) and amd64 (built on linux).
You can use one of them to execute the image running the command below:

```bash
docker run -p 7080:8080 --name jolt-transformation --restart unless-stopped thiagotrss/jolt-transformer:v1-amd64
```

## Using docker to run

If you want to change something on project and build your own image without use docker hub, follow the steps below:

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

