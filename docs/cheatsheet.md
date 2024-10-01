# Maven - CheatSheet

## Projekt anlegen

Mit Auswahl des Archetypes:

```bash
mvn archetype:generate \ 
      -DinteractiveMode=true
```

Verwendung des aktuellen [QuickStart Archetypes]():

```bash
mvn archetype:generate \
      -DarchetypeGroupId=org.apache.maven.archetypes \
      -DarchetypeArtifactId=maven-archetype-quickstart \
      -DarchetypeVersion=1.5
```