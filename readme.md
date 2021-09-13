# Settings.xml

## Setting up a mirror in `settings.xml`
`nexus-group` is a group of repositories, including maven centrl
```xml 
    <mirrors>
        <mirror>
            <id>central</id>
            <name>central</name>
            <url>http://localhost:8081/repository/nexus-group/</url>
            <!-- i.e. all repos -->
            <mirrorOf>*</mirrorOf>
        </mirror>
    </mirrors>


```

Results in something like
``` 
Downloading from central: http://localhost:8081/repository/nexus-group/com/h2database/h2/1.4.197/h2-1.4.197.pom
Downloaded from central: http://localhost:8081/repository/nexus-group/com/h2database/h2/1.4.197/h2-1.4.197.pom (960 B at 821 B/s)
Downloading from central: http://localhost:8081/repository/nexus-group/com/h2database/h2/1.4.197/h2-1.4.197.jar
Downloaded from central: http://localhost:8081/repository/nexus-group/com/h2database/h2/1.4.197/h2-1.4.197.jar (1.9 MB at 1.1 MB/s)

```