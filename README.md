These files made it possible for a completely JavaConfig based Spring Web Application

Note it only works on Servlet 3.0 supported contrainers like Tomcat7

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

- keep the web.xml just so it won't report any errors


  ```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app
    version="3.0"
    xmlns="http://java.sun.com/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">
  <display-name>sia_p134_5_spring_web_basic_setup</display-name>
</web-app>
  ```

