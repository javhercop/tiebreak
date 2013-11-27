package es.tecnoy.spring.entity;

import org.springframework.stereotype.Component;

@Component("p")
public class Piano implements Instrument {

	
	public void play() {
		System.out.println("TIN TIN TIN...");
		
	}

}
