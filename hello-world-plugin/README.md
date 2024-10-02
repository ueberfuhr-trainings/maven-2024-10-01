# Simple HelloWorld Plugin

## Usage

You can run the plugin goal directly from command line:

```bash
# get some help
mvn hello-world:help
# count all dependencies
mvn hello-world:dependency-counter
# count only runtime dependencies
mvn hello-world:dependency-counter -Dhelloworld.scope=runtime
```

Or you can bind it to the lifecycle:

```xml
<project>
    <build>
        <plugins>
            <plugin>
                <groupId>de.samples.schulung</groupId>
                <artifactId>hello-world-plugin</artifactId>
                <version>1.0.0-SNAPSHOT</version>
                <executions>
                    <execution>
                        <id>find-test-dependencies</id>
                        <goals>
                            <goal>dependency-counter</goal>
                        </goals>
                        <configuration>
                            <scope>test</scope>
                        </configuration>
                    </execution>
                    <execution>
                        <id>find-compile-dependencies</id>
                        <goals>
                            <goal>dependency-counter</goal>
                        </goals>
                        <configuration>
                            <scope>compile</scope>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>
```