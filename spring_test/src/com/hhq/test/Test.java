package com.hhq.test;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class Test implements MethodBeforeAdvice{

	private static final Logger log = Logger.getLogger(Test.class.getName());
	
	public void LoggerTest() {
		
	}
	
	public static void main(String[] args) {

		
	}

	@Override
	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		log.info("");
	}

}
