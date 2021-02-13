# Spring Boot and Apache Kafka via Docker

### 📖 Information

### 🔨 Run the App

<b>1 )</b> Install <b>Docker Desktop</b>. Here is the installation <b>link</b> : https://docs.docker.com/docker-for-windows/install/

<b>2 )</b> Install <b>Apache Kafka on Docker</b>. Here is the installation <b>link</b> : https://hub.docker.com/r/ches/kafka/
```
    docker pull ches/kafka
```

<b>4 )</b> Add <b>zookeeper</b> on Docker Container
```
    docker run --rm --name zookeeper -p 2181:2181 jplock/zookeeper 
```
<b>5 )</b> Add <b>kafka</b> on Docker Container
```
    docker run --rm -p 9092:9092 -e KAFKA_ADVERTISED_HOST_NAME=127.0.0.1 --link zookeeper:zookeeper ches/kafka
```
<b>6 )</b> Show all <b>containers</b> which run on Docker
```
    docker ps 
```

### Screenshots

<details>
<summary>Click here to show the screenshots of project</summary>
    <p> Figure 1 </p>
    <img src ="docker_images\0.PNG">
    <p> Figure 2 </p>
    <img src ="docker_images\1.PNG">
    <p> Figure 3 </p>
    <img src ="docker_images\2.PNG">
    <p> Figure 4 </p>
    <img src ="docker_images\3.PNG">
    <p> Figure 5 </p>
    <img src ="docker_images\4.PNG">
    <p> Figure 6 </p>
    <img src ="docker_images\5.PNG">
    <p> Figure 7 </p>
    <img src ="docker_images\6.PNG">
    <p> Figure 8 </p>
    <img src ="docker_images\7.PNG">
    <p> Figure 9 </p>
    <img src ="docker_images\8.PNG">
    <p> Figure 10 </p>
    <img src ="docker_images\9.PNG">
</details>