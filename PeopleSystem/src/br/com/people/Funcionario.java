package br.com.people;

public class Funcionario extends Pessoas {
	
	private int matricula;
	private String cargo;
	private double salario;
	private String dataAdmissao;
	
	public Funcionario() {
		
	}

	public void Cadastrar(String nome, String dataNascimento, String endereco, String telsContato, int matricula,
			String cargo, double salario, String dataAdmissao) {
		setNome(nome);
		super(nome, dataNascimento, endereco, telsContato);
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	


}
