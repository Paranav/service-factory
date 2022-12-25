# service-factory
Provides a factory method [<T extends Object> T getService(Class<T> classType)] to get spring bean.

Use case:
1. Gives the access to spring bean in any non bean class.

Tips for "How to use it"
1. add this depndency to the existing project.\n
<dependancy>\n
	<groupId>com.factory</groupId>\n
	<artifactId>service-factory</artifactId>\n
	<version>0.0.1-SNAPSHOT</version>\n
</dependancy>
2. create java configuration class with annotation @Configuration and @ComponentScan("com.factory.sf")\n

@Configuration
@ComponentScan("com.factory.sf")
class serviceFactoryConfiguration {

}
