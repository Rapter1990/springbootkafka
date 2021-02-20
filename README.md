# Spring Boot and Apache Kafka via Docker

<img src="docker_images\10.PNG" alt="Main Information" width="800" height="600">

### 📖 Information

<ul style="list-style-type:disc">
  <li>It is a distributed message system which is based on <b>Publisher</b> and <b>Consumer</b></li>
  <li>All messages are combined under one category.<b>Consumers</b> can fetch data from different kinds of category. <b>Publisher</b> is called as an app of sending message while <b>consumer</b> is called as an app of gettting message.</li>
  <li>The app contains <b>Kafka</b> to collect data and then direct it to the system quickly and flawlessly instead of keeping it as a huge data. That's why it prevents data loss.</li>
  <li>The app contains <b>zookeper</b> to inform <b>Producer</b> and <b>Consumer</b> about each node of Kafka or <b>Broker</b> when it doesn't work</li>
  <li>The app uses <b>Docker</b> to run it in different kinds of platform
      <ul>
        <li>Define <b>Kafka</b> and <b>zookeper</b> in its <b>container</b> instead of setting up each one seperately as a virtualization </li>
      </ul>
  </li>
</ul>

### 🔨 Run the App

<b>1 )</b> Install <b>Docker Desktop</b>. Here is the installation <b>link</b> : https://docs.docker.com/docker-for-windows/install/

<b>2 )</b> Install <b>Apache Kafka on Docker</b>. Here is the installation <b>link</b> : https://hub.docker.com/r/ches/kafka/
```
    docker pull ches/kafka
```

<b>3 )</b> Add <b>zookeeper</b> on Docker Container
```
    docker run --rm --name zookeeper -p 2181:2181 jplock/zookeeper 
```
<b>4 )</b> Add <b>kafka</b> on Docker Container
```
    docker run --rm -p 9092:9092 -e KAFKA_ADVERTISED_HOST_NAME=127.0.0.1 --link zookeeper:zookeeper ches/kafka
```
<b>5 )</b> Show all <b>containers</b> which run on Docker
```
    docker ps 
```

<b>6 )</b> Get a <b>POST</b> request in Postman ( ```localhost:8080/kafkamessage```)
```
    {
        "message" : "Write any message"
    }
```

<b>7 )</b> Use the <b>command</b> to start any <b>container</b> of <b>Docker</b> after a closing process is over 
```
    docker start container_id
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