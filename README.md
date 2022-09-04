# trilium-java

### Used to parse Trilium's Markdown file and display it on the web page.


### Dockerfile
```bash
FROM java:imanticsiot/java8
VOLUME /tmp
ADD  trilium-java-1.0.jar  trilium-java-1.0.jar
EXPOSE 83
CMD  java -jar trilium-java-1.0.jar
```

### docker run

```bash
docker build -f ./Dockerfile  -t trilium-java:latest .

docker run -d -p 83:83  --restart=always --name triliumJar    trilium-java:latest
```
