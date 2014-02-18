package org.shaozhen.sample;

import org.springframework.beans.factory.FactoryBean;

public class PropertyFactoryBean implements FactoryBean<PropertyBean>{
	
	public PropertyFactoryBean(){
		System.out.println("Property Factory Constructor is initialized");
	}

	@Override
	public PropertyBean getObject() throws Exception {
		System.out.println("PropertyBeanFactory is initialized");
		PropertyBean bean = new PropertyBean();
		Main.setPropertyBean(bean);
		return bean;
	}

	@Override
	public Class<?> getObjectType() {
		
		return PropertyBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
