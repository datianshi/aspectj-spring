package org.shaozhen.sample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @author Shaozhen
 */
@Aspect
public class AspectL {

    @Pointcut("execution(* org.springframework.beans.factory.support.DefaultListableBeanFactory.registerBeanDefinition(..))")
    public void defineEntryPoint() {
    	
    }
        

    @Before("defineEntryPoint()")
    public void aaa(JoinPoint joinPoint) {
    	BeanDefinition beanDefinition = (BeanDefinition) joinPoint.getArgs()[1];
        System.out.println("Register BeanName" + joinPoint.getArgs()[0] + " with: " + beanDefinition.getBeanClassName());
    }

    @After("defineEntryPoint()")
    public void bbb(JoinPoint joinPoint) {
    }
}
