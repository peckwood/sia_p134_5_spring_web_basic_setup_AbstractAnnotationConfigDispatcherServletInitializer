These files made it possible for a completely JavaConfig based Spring Web Application

- spittr.config.RootConfig

- spittr.config.WebConfig

- spittr.config.SpittrWebAppInitializer (which extends AbstractAnnotationConfigDispatcherServletInitializer, which implements ServletContainerInitializer, which is looked up in a Servlet 3.0 environment)

- pom.xml
  ```xml
  <properties>
  	<failOnMissingWebXml>false</failOnMissingWebXml>
  </properties>
  ```

- and adding Maven dependencies to Deployment Assembly

  - Project properties > Deployment Assemply (left panel) > Add > Java Build Path Entries > Maven Depencies

- dynamic web module's version(3.0) in project facet matches serverlet-api version
```xml
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>javax.servlet-api</artifactId>
	<version>3.0.1</version>
	<scope>provided</scope>
</dependency>
```

- ​

