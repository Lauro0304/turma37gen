package entities;

public class funcionario {

	private String nome;
	private String matricula;
	private int horaTrabalho;
	private double valorHora;
	private double salario;

	public funcionario(String nome, String matricula, int horaTrabalho, double valorHora, double salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horaTrabalho = horaTrabalho;
		this.valorHora = valorHora;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getHoraTrabalho() {
		return horaTrabalho;
	}
	public void setHoraTrabalho(int horaTrabalho) {
		this.horaTrabalho = horaTrabalho;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getSalario() {
		return salario= valorHora*horaTrabalho;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
