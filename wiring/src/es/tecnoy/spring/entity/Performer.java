package es.tecnoy.spring.entity;

import es.tecnoy.spring.exceptions.PerformanceException;

public interface Performer {
	
	void perform() throws PerformanceException; 

}
