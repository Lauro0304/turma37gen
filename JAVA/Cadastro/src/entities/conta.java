package entities;

public class conta {

	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;

	public conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}

	public conta(int numero, String cpf, double saldo, boolean ativa) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativa = ativa;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

}
