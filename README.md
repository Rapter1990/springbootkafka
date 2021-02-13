# Spring Boot and Apache Kafka via Docker

### 📖 Information

### 🔨 Run the App

<b>1 )</b> Install <b>Docker Desktop</b>. Here is the installation <b>link</b> : https://docs.docker.com/docker-for-windows/install/

<b>2 )</b> Install <b>Apache Kafka on Docker</b>. Here is the installation <b>link</b> : https://hub.docker.com/r/ches/kafka/
```
    docker pull ches/kafka
```

<b>4 )</b> Add zookeeper on Docker Container
```
    docker run --rm --name zookeeper -p 2181:2181 jplock/zookeeper 
```
<b>5 )</b> Add kafka on Docker Container
```
    docker run --rm -p 9092:9092 -e KAFKA_ADVERTISED_HOST_NAME=127.0.0.1 --link zookeeper:zookeeper ches/kafka
```
<b>6 )</b> Show all containers which run on Docker
```
    docker ps 
```

### Screenshoots

<details>
<summary>Click here to show the screenshots of project</summary>
<table style="border: 0px;">
  <tr>
     <td align="center"> Figure 1 </td>
     <td align="center"> Figure 2 </td>
     <td align="center"> Figure 3 </td>
  </tr>
  <tr>
    <td><img width="800" height="600" src =""></td>
    <td><img width="800" height="600" src =""></td>
    <td><img width="800" height="600" src =""></td>
  </tr>
  <tr>
     <td align="center"> Figure 4 </td>
     <td align="center"> Figure 5 </td>
     <td align="center"> Figure 6 </td>
  </tr>
  <tr>
    <td><img width="800" height="600" src =""></td>
    <td><img width="800" height="600" src =""></td>
    <td><img width="800" height="600" src ="/"></td>
  </tr>
  <tr>
     <td align="center"> Figure 7 </td>
     <td align="center"> Figure 8 </td>
     <td align="center"> Figure 9 </td>
  </tr>
  <tr>
    <td><img width="800" height="600" src =""></td>
    <td><img width="800" height="600" src =""></td>
    <td><img width="800" height="600" src =""></td>
  </tr>
</table>
</details>