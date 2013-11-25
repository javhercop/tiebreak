package es.tecnoy.spring.entity;

import es.tecnoy.spring.exceptions.PerformanceException;

public class PoeticJuggler extends Juggler {

	private Poem poem;

	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanbags, Poem poem) {
		super(beanbags);
		this.poem = poem;
	}

	public void perform() throws PerformanceException{
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}

}
