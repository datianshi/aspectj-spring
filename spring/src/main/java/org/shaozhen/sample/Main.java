package org.shaozhen.sample;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static PropertyBean bean;
	
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		TestBean bean = ctx.getBean(TestBean.class);
	}
	
	public static PropertyBean getPropertyBean(){
		return bean;
	}
	
	public static void setPropertyBean(PropertyBean otherBean){
		bean = otherBean;
	}
}
