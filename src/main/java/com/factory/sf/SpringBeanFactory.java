package com.factory.sf;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author kparanav
 * <P>this class provides factory method getService(Class<T> classType) to get spring container bean.
 *
 */
@Component
public class SpringBeanFactory {

	private static SpringBeanFactory instance;

	@Autowired
	private ApplicationContext appContext;

	@PostConstruct
	public void init() {
		instance = this;
	}

	/**
	 * Return the bean instance that uniquely matches the given object type, if any.
	 * 
	 * @param requiredType type the bean must match; can be an interface or
	 *                     superclass
	 * @return an instance of the single bean matching the required type
	 * @throws NoSuchBeanDefinitionException   if no bean of the given type was
	 *                                         found
	 * @throws NoUniqueBeanDefinitionException if more than one bean of the given
	 *                                         type was found
	 * @throws BeansException                  if the bean could not be created
	 * 
	 */
	public static <T extends Object> T getService(Class<T> classType) {
		return instance.appContext.getBean(classType);
	}

	/**
	 * Return the bean instance that uniquely matches the given object type, if any.
	 * 
	 * @param requiredType type the beans must match; can be an interface or
	 *                     superclass
	 * @return Map of Class type and instance of the single bean matching the
	 *         required types
	 * @throws NoSuchBeanDefinitionException   if no bean of the given type was
	 *                                         found
	 * @throws NoUniqueBeanDefinitionException if more than one bean of the given
	 *                                         type was found
	 * @throws BeansException                  if the bean could not be created
	 * 
	 */
	public static Map<Class<?>, Object> getServices(List<Class<?>> classTypes) {
		Map<Class<?>, Object> beansMap = null;
		beansMap = classTypes.stream().collect(Collectors.toMap(ct -> ct, ct -> instance.appContext.getBean(ct)));
		return beansMap;
	}

}
