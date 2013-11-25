package es.tecnoy.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.tecnoy.spring.entity.Performer;
import es.tecnoy.spring.entity.Stage;
import es.tecnoy.spring.exceptions.PerformanceException;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"es/tecnoy/spring/cfg/beans.xml");

		Performer performer = (Performer) ctx.getBean("duke");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Stage st1 = (Stage) ctx.getBean("stage");
		System.out.println("Status of lights: "+st1.getStatus());
		st1.switchLights();
		System.out.println("Switching lights: "+st1.getStatus());

		Stage st2 = (Stage) ctx.getBean("stage");
		System.out.println("Status of lights: "+st2.getStatus());
		
		Performer p1 = (Performer) ctx.getBean("alex");
		Performer p2 = (Performer) ctx.getBean("alex");
		Performer p3 = (Performer) ctx.getBean("alex");
		Performer p4 = (Performer) ctx.getBean("alex");
		
		try {
			System.out.println(p1.hashCode());
			System.out.println(p2.hashCode());
			System.out.println(p3.hashCode());
			System.out.println(p4.hashCode());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
