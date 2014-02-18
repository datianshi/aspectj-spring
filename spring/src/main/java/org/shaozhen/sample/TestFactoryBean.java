package org.shaozhen.sample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class TestFactoryBean implements FactoryBean<TestBean>, BeanFactoryAware{
	
//	PropertyBean propertyBean;
//	
//	
//
//	public void setPropertyBean(PropertyBean propertyBean) {
//		this.propertyBean = propertyBean;
//	}
	private BeanFactory beanFactory;
	
	public TestFactoryBean(){
		System.out.println("Test Factory Constructor is initialized");
	}

	@Override
	public TestBean getObject() throws Exception {
//		beanFactory.getBean(PropertyBean.class);
		if(Main.getPropertyBean() == null){
			throw new IllegalArgumentException("No bean");
		}
		System.out.println("Get Testfactory Bean");
		return new TestBean();
	}

	@Override
	public Class<?> getObjectType() {
		return TestBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}


//	@Override
//	public void postProcessBeanFactory(
//			ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		this.beanFactory = beanFactory;
//		
//	}
//
//	@Override
//	public void postProcessBeanDefinitionRegistry(
//			BeanDefinitionRegistry registry) throws BeansException {
//		// TODO Auto-generated method stub
//		
//	}

}
