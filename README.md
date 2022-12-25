# service-factory
Provides a factory method ***``` <T extends Object> T getService(Class<T> classType) ```*** to get spring bean.<br />

## Use case:<br />
1. Gives the access to spring bean in any non bean class.<br />

## Tips for "How to use it"<br />
1. add this depndency to the existing project.<br />
```xml
<dependancy>
	<groupId>com.factory</groupId>
	<artifactId>service-factory</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependancy>
```
2. create java configuration class with annotation @Configuration and @ComponentScan("com.factory.sf")<br />
```java
@Configuration
@ComponentScan("com.factory.sf")
class serviceFactoryConfiguration {

}
```
