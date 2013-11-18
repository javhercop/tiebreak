package es.tecnoy.spring.entity;

import es.tecnoy.spring.exceptions.PerformanceException;

public class Juggler implements Performer {

	private int beanBags = 3;
	
	public Juggler(){
		
	}
	
	public Juggler(int beanbags){
		this.beanBags = beanbags;
	}
	
	public void perform() throws PerformanceException {
		
		System.out.println("JUGGLING "+beanBags+" BEANBAGS");
		
	}
	
	

}
