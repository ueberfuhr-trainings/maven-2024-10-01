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

## Dependencies

Dependencies anzeigen:

```bash
mvn dependency:tree
```

Dependencies auf aktuelle Versionen setzen:

```bash
mvn versions:use-latest-releases
# update versions stored in properties
mvn versions:update-properties
```

Ungenutzte Dependencies anzeigen:

```bash
mvn dependency:analyze
```

Konflikte anzeigen:

```bash
mvn dependency:tree -Dverbose
```

## Effective POM

Effective POM anzeigen:

```bash
mvn help:effective-pom
```