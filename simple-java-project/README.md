# Simple Java Project

## Testen

Zum Ausführen der Tests hast Du folgende Optionen:

```bash
# alle Tests
mvn clean test
# nur Tests mit @Tag("gelbe-katze")
mvn clean test -Dgroups=gelbe-katze
```