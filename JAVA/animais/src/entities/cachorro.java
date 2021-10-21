package entities;

import app.animal;

public class cachorro {
	public class Cachorro extends animal {

		public Cachorro(String nome, int idade) {
			super(nome, idade);
			
		}
		
		public void abanandoRabo() {
			System.out.println("Abadnado o rabo....");
		}
}
