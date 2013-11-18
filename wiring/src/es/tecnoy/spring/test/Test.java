package es.tecnoy.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.tecnoy.spring.entity.Performer;
import es.tecnoy.spring.exceptions.PerformanceException;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"es/tecnoy/spring/cfg/beans.xml");

		Performer performer = (Performer) ctx.getBean("alex");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
