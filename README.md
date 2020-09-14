# SpringCloud-Stream-Messaging

Its a Spring Cloud Streaming example where one can use any Message Queuing technologies like : KAFKA, RABBITMQ,..
HERE , i Used KAfka ,for submitting a message on to a Topic(name: prodcon) and
consume it from another Consumer Application who is listening to the Stream 
with a relication factor of 1.
#
JAVA version : 11.0.6 
kafka 2.13-2.5.0
#
if you want to use #RabbitMQ change the dependency from kafka to RabbitMq , in pom.xml( spring-cloud-stream-binder-kafka).
#
 
 

# kafka commands
  Commands used for developing.
  
# Start zookeeper server
  zookeeper-server-start.bat ../../config/zookeeper.properties

# Start kafka server
  kafka-server-start.bat ../../config/server.properties
  
# Create Topic
  kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic prodcon
  
# view All Available Topics :->
  kafka-topics.bat --list --zookeeper localhost:2181
