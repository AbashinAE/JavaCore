FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./src/main/java ./src/main/java
RUN javac -sourcepath ./src/main/java -d ./target/classes ./src/main/java/main/Main.java
RUN java -classpath ./target/classes main.Main
RUN javadoc -d ./doc -sourcepath ./src/main/java -cp ./target -subpackages calc main

