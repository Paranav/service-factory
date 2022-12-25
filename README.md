# service-factory
Provides a factory method [<T extends Object> T getService(Class<T> classType)] to get spring bean.<br />

Use case:<br />######
1. Gives the access to spring bean in any non bean class.<br />

Tips for "How to use it"<br />######
1. add this depndency to the existing project.<br />
<dependancy><br />
	<groupId>com.factory</groupId><br />
	<artifactId>service-factory</artifactId><br />
	<version>0.0.1-SNAPSHOT</version><br /><br />
</dependancy><br />
2. create java configuration class with annotation @Configuration and @ComponentScan("com.factory.sf")<br />

@Configuration<br />
@ComponentScan("com.factory.sf")<br />
class serviceFactoryConfiguration {<br />

}
