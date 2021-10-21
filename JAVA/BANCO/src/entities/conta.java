package entities;

public abstract class conta {
	
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	public conta(int numero, String cpf, double saldo, boolean ativo) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativo = ativo;
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
	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public void credito(double valor) {
		if(valor<=0) {
			System.out.println("Valor inválido... ");
		}
		else if (saldo>=valor) {
			this.saldo = this.saldo + valor;
			System.out.println("Trazação concluida...");
		}
		
		this.saldo = this.saldo + valor;
	}
	public void debito(double valor) {
		if(valor<=0) {
			System.out.println("Valor inválido... ");
		}
		else if (valor>saldo) {
			System.out.println("Saldo indisponivel...");
		}
		else if (saldo>=valor) {
			this.saldo=this.saldo-valor;
			System.out.println("Trazação concluida...");
		}
	}
	
	

}
