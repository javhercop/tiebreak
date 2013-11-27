package es.tecnoy.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.tecnoy.spring.exceptions.PerformanceException;

@Component("fran")
public class Instrumentalist implements Performer {

	private String song;
	
	@Autowired
	@Qualifier("s")
	private Instrument instrument;
	
	public Instrumentalist(){
		
	}
	
	public Instrumentalist(String song){
		this.song = song;
	}
	
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}

	public void perform() throws PerformanceException {
		System.out.println("This is my song: "+song+"\nand it sounds: ");
		instrument.play();
		
	}

}
