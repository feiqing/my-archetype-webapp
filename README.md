# my-archetype-webapp 

> Maven Web App Archetype: Maven WebApp 快速启动骨架

- 使用
1. `mvn archetype:create-from-project`
2. `cd target/generated-sources/archetype/`
3. `vi pom.xml`: change artifactId to you wanted name
4. `rm *.iml .idea`: delete ide file
4. `maven clean install`
5. `mvn archetype:generate -DarchetypeGroupId=com.fq.archetypes -DarchetypeArtifactId=my-archetype-webapp -DarchetypeVersion=0.0.1-SNAPSHOT -DarchetypeCatalog=internal`