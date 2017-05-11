# my-archetype-webapp 

> Maven Web App Archetype: Maven WebApp 快速启动骨架

### 使用
1. `mvn archetype:create-from-project`
2. `rm -rf *.iml .idea`: delete ide file
3. `cd target/generated-sources/archetype/`
4. `vi pom.xml`: change artifactId to you wanted name
5. `mvn clean install`
6. `mvn archetype:generate -DarchetypeGroupId=com.cainiao.archetypes -DarchetypeArtifactId=my-archetype-webapp -DarchetypeVersion=0.0.3-SNAPSHOT -DarchetypeCatalog=internal`