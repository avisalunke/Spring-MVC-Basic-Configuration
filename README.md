# Spring-MVC-Basic-Configuration
Spring MVC Basic Configuration using XML files 


1: you have to create mavan project for this 
2: while creating this project you need to select web app archetype
3:then project is created
4: update pom.xml :
                    1: add two dependancies 
                                            1 : spring web mvc :
                                                              <dependency>
                                                          			<groupId>org.springframework</groupId>
                                                          			<artifactId>spring-webmvc</artifactId>
                                                          			<version>6.0.9</version>
                                                          		</dependency>
                                            2 : servlet api :
                                                              <dependency>
                                                                  <groupId>jakarta.servlet</groupId>
                                                                  <artifactId>jakarta.servlet-api</artifactId>
                                                                  <version>6.0.0</version>
                                                                  <scope>provided</scope>
                                                              </dependency>
                    2: add plugin in boild :
                                            <build>
                                          		<plugins>
                                          			<plugin>
                                          				<groupId>org.apache.maven.plugins</groupId>
                                          				<artifactId>maven-war-plugin</artifactId>
                                          				<version>3.3.2</version>
                                          			</plugin>
                                          		</plugins>
                                          	</build>
5: update web.xml  :
                    1:  add  dispatcherservlet:
                                              <servlet>
                                                  <servlet-name>example</servlet-name>
                                                  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
                                                  <load-on-startup>1</load-on-startup>
                                              </servlet>
                                      
                                              <servlet-mapping>
                                                  <servlet-name>example</servlet-name>
                                                  <url-pattern>/</url-pattern>
                                              </servlet-mapping>
                                              
6: create example-servlet for dispatcher_servlet:
                                                  in this we write 1: component scan 
                                                                   2: bean with prefix and sufix
                                                  <?xml version="1.0" encoding="UTF-8"?>
                                                  <beans xmlns="http://www.springframework.org/schema/beans"
                                                      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                                                      xmlns:p="http://www.springframework.org/schema/p"
                                                      xmlns:context="http://www.springframework.org/schema/context"
                                                      xsi:schemaLocation="
                                                          http://www.springframework.org/schema/beans
                                                          http://www.springframework.org/schema/beans/spring-beans.xsd
                                                          http://www.springframework.org/schema/context
                                                          http://www.springframework.org/schema/context/spring-context.xsd">
                                                          
                                                    <context:component-scan base-package="com.mvc.module.controller"></context:component-scan>
      
                                                          <bean class = "org.springframework.web.servlet.view.InternalResourceViewResolver">
                                                               <property name = "prefix" value = "/WEB-INF/jsp/"/>
                                                               <property name = "suffix" value = ".jsp"/>
                                                          </bean>
                                                  </beans> 



    
