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

### Screenshoots

<details>
<summary>Click here to show the screenshots of project</summary>
<table style="border: 0px;">
  <tr>
     <td align="center"> Figure 1 </td>
  </tr>
  <tr>
    <td><img width="800" height="400" src ="docker_images\0.PNG"></td>
  </tr>
  <tr>
       <td align="center"> Figure 2 </td>
  </tr>
  <tr>
      <td><img width="1300" height="400" src ="docker_images\1.PNG"></td>
  </tr>
  <tr>
       <td align="center"> Figure 3 </td>
  </tr>
  <tr>
      <td><img width="1300" height="300" src ="docker_images\2.PNG"></td>
  </tr>
  <tr>
     <td align="center"> Figure 4 </td>
  </tr>
  <tr>
    <td><img width="1300" height="300" src ="docker_images\3.PNG"></td>
  </tr>
  <tr>
       <td align="center"> Figure 5 </td>
  </tr>
  <tr>
      <td><img width="1300" height="300" src ="docker_images\4.PNG"></td>
  </tr>
  <tr>
         <td align="center"> Figure 6 </td>
  </tr>
  <tr>
        <td><img width="1300" height="300" src ="docker_images\5.PNG"></td>
  </tr>
  <tr>
        <td align="center"> Figure 7 </td>
  </tr>
  <tr>
        <td><img width="1000" height="300" src ="docker_images\6.PNG"></td>
  </tr>
  <tr>
        <td align="center"> Figure 8 </td>
  </tr>
  <tr>
        <td><img width="1300" height="300" src ="docker_images\7.PNG"></td>
  </tr>
  <tr>
        <td align="center"> Figure 9 </td>
  </tr>
  <tr>
        <td><img width="1300" height="300" src ="docker_images\8.PNG"></td>
  </tr>
  <tr>
        <td align="center"> Figure 10 </td>
  </tr>
  <tr>
        <td><img width="1300" height="300" src ="docker_images\9.PNG"></td>
  </tr>
</table>
</details>