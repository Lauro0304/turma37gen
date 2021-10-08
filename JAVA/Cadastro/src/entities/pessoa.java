package entities;

public class pessoa {

	public String nome;
	public int anoNascimento;
	public boolean viva;
	public String eMail;
	public char pronome;

	public int calcularIdade() {
		return 2021 - anoNascimento;
	}

}
