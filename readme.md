
This exercise required changes to the settings.xml file in `.m2/settings.xml`

The content of the `settings.xml` file:
```xml

<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">


    <profiles>
        <profile>
            <id>jboss</id>
            <repositories>
                <repository>
                    <id>jboss</id>
                    <name>Jboss repo</name>
                    <url>https://maven.repository.redhat.com/ga/</url>
                    <layout>default</layout>
                    <snapshots>
                        <enabled>false</enabled>
                    </snapshots>
                </repository>
            </repositories>
        </profile>
    </profiles>
    <activeProfiles>
        <activeProfile>jboss</activeProfile>
    </activeProfiles>
</settings>
```