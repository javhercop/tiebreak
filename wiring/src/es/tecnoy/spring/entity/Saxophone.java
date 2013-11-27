package es.tecnoy.spring.entity;

import org.springframework.stereotype.Component;

@Component("s")
public class Saxophone implements Instrument {

	
	public void play() {
		System.out.println("TOOC TOOC TOOC...");
		
	}

}
