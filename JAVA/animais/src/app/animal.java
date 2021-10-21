package app;

public class animal {

	private String nome;
	private int idade;
	
	
	public animal(String nome, int idade) { //
		super();
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void eminirSom() {
		System.out.println("Emitindo som...");
	}
	
	public void correr() {
		System.out.println("Correndo...");
	}
}
