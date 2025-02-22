# Spring_Core_Topics

Spring :
--------
** It is a frame work to implement J2EE application development was easier.
** J2EE - JSP, Sevlets, EJB etcc

Drawbacks in J2EE :

1. Tightly coupling - It means if we want to implement anything, we should extends some servelts, ejb classes
2. Heavy Weight - It will take huge time to start the application
3. Boilerplate code - Common code will repeat multiple times ex: jdbc
4. Cross cutting concerns - Doesn't have inbuilt security and transactions, we should implement manually

Bcz of all these drawbacks "Rod Johnson" and team had introduced Spring Framework.

Spring Advantages:

1. Make application development was easier
2. Light weight
3. Modularity : Core, MVC, Security, Transaction, Spring AOP, Spring JPA, Spring Boot, Spring Batch etc...
4. Pojo development - It won't force us to implement any classes, it means if we want to move some other technologies we can easily move
5. Loosely coupled and Unit test code

Why Spring is good in market ?

Bcz it is providing module projects -- if we want to implement Redis cache -- Spring Redie, Mongo DB, Kafka etc..

Heart of Spring frame work is "Spring Core" -- Base of Spring framework 

Class --> Every class is a state (variables) and behavior (methods/functions)

**** In real time, if we want to implement any application we should follow "Solid Principles".
*** Class should follow "Single Responsibility"

** Don't create class with "User and Account details"  -- Just create one with User and another with Account

** Every Application would have multiple classes
** Class should follow SRP
** Developer create an object for those classes
** Whenever application is running these objects can interact with other objects


Ex: class A {
	B b;
	m1(){}
}

class B {
	a(){}
}

*** A is Dependent/Source class
*** B is Dependency/Target class

Dependent -- It is an object, which is depending on another object to get some information
Dependency - It is an object required by another object to carry out the functionality

*** Spring core is main goal is to manage the objects dependency
*** In the project development there would be multiple classes, if we want to communicate one object with another object then we should communicate via interfaces
*** Using this module spring will create the required objects and supply to the application, it means developer no need to create any object in application development

****** Spring is a DI framework to make java application loosely coupled.

What is Framework ?

Spring IOC --> Inversion of Controller --> It is a container
--> To create, maintain and manage the life cycle of beans (Objects)

How IOC knows about the Dependencies ?
--> Using XML   Java Configuration       Annotation



Dependency Injection: With out creating an object manually, if we want to get object from some other source (from Spring container). It is also part on IOC.


*** To get these maintained beans from container will takes help from "ApplicationContext"
ApplicationContext--> This is extends from BeanFactory
	--> ClasspathXMLApplicationContext  -- For XML configuration in application class path
	--> AnnotationConfigApplicationContext -- For java/annotation configuration
	--> FileSystemXMLApplicationContext -- From file system with huge xml file

BeanFactory --> ApplicationContext

------------------------------------------------------

*** We have two types of injections
	Setter Injection
	Constructor Injection


---> We have to create Maven project
---> Have to add dependencies
---> Have to create POJO class 
---> Have to create configuration xml file - to feed data to POJO class
---> Main method to call config to get data using ApplicationContext

Basic structure along with context and p schema

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">    
 </beans>


Collections: List, Set, Map and Properties

Ex: <list>
    				<value>"HYD"</value>
    				<value>"Chennai"</value>
    				<value>"Bangl"</value>
				<value>"Bangl"</value>

    			</list>
<set>
    				<value>"1234"</value>
    				<value>"12345"</value>
    				<value>"12346"</value>
    			</set>
<map>
    				<entry key="1" value="Java"></entry>
    				<entry key="2" value="Spring"></entry>
    			</map>
<props>
    				<prop key="Learning">"Java"</prop>
    				<prop key="Have_to_Learn">"Spring"</prop>
    			</props>

Ref :
Ex: <property name="b">
    			<ref bean="bref"/>
    		</property>
--------------------------------------------------------------------------
Life cycle methods in Spring:
----------------------------
public void init()
public void destroy()

--> We can change name of the methods but signature must be same
--> init() --> Initialize code, loading config, connection DB, web services etc
--> destroy() --> clean up code

Life cycle internally work like below :
--> It will create object/bean in container
--> Initialize the value 
--> init() call happens
--> Then we read and use the beans
--> destroy()

We can implement life cycle methods in 3 ways 
--> Using XML, Using Java Config and Annotations

--> XML 
	using init-method and destory-method attributes in config file
--> Java
	Using InitializingBean and DisposableBean interfaces
--> Annotaions
	Using @PostConstruct and @PreDestroy
	If we want to work with annotations, have to use <context:annotation-config/> tag
----------------------------------------------------------------
Autowiring:-
--> By using this spring container inject the dependencies automatically
--> It will works only for reference type

manually -- <ref bean="beanName">

This will done by using XML and Annotaions

--> XML --> Totally work based on modes by default bean doesn't provide any mode, means no
           no, byName, byType, constructor, autodetect (deprecated in spring 3 so no need to focus on this)
	--> Default is byName
	--> byName and byType will work on setter methods
	--> constructor will work on constructor
	--> Whenever more than one dependency found in config file, if we want to use one of them we should use primary 	    attribute

-->Annotation --> @Autowired

Advantages : Automatic and Less code

Disadvantages : Programmer doesn't have control  and It won't support primitive and String types
-----------------------------------------------------------------

Standalone Colletions:

we should add util schema to work on standalone collections

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xmlns:util="http://www.springframework.org/schema/util"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd
    http://www.springframework.org/schema/util
    http://www.springframework.org/schema/util/spring-util.xsd"> 


<util:list list-class="java.util.LinkedList" id="empnames">
    		<value>Ashok</value>
    		<value>Balu</value>
    		<value>Chari</value>
    	</util:list>

<!-- stand alone Map -->
    	<util:map map-class="java.util.TreeMap" id="mapdata">
    		<entry key="1" value="Java"/>
    		<entry key="2" value="Spring"/>
    		
    	</util:map>

----------------------------------------------------

Stereotype annotations:

With the help of annotations we can create beans

@Component
	--> @Controller
	--> @Service
	--> @Repository

@Value

@Configuration
@Bean

@Scope  --> Singleton, Prototype, Request, Session and globalSession

in core part, we are going to see Singleton and Prototype
In MVC part, we will see request and Session

-------------------------------------------------------------

Spring Expression Language:

syntax: @Value("#{expression}")

Ex: @Value("#{addr}")  --> addr is id for list object

@Value("#{20+30}")
@Value("#{8>3}") --> Boolean

@Value("#{ T(java.lang.Math).sqrt(225) }") --> static method
@Value("#{ T(java.land=g.Math.E) }") --> static variable
@Value("#{ new java.lang.String("Hello")}") --> object

---------------------------------------------------------------
