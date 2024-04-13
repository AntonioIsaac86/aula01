package br.com.people;

import java.time.LocalDate;

import br.com.composicoes.Cargo;
import br.com.composicoes.Endereco;
import br.com.composicoes.Profissao;
import br.com.composicoes.Telefones;
import br.com.estruturadedados.ListaDeTelefonesNaoOrdenados;

public class Funcionario extends Pessoas {
	
	private int matricula;
	private double salario;
	private LocalDate dataAdmissao;
	private Cargo cargo;
	
	public Funcionario() {
		
	}

	
		public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, ListaDeTelefonesNaoOrdenados telsContato, int matricula,
			double salario, LocalDate dataAdmissao, Cargo cargo) {
		super(nome, dataNascimento, endereco, telsContato);
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.cargo = cargo;
	}
	
	public void reajustarSalario(double percentual) {
		this.salario += this.salario*percentual/100;
	}
	
	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}


	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}


	public Cargo getCargo() {
		return cargo;
	}



}
