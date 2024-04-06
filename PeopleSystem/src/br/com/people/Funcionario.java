package br.com.people;

import java.time.LocalDate;

import br.com.composicoes.Profissao;

public class Funcionario extends Pessoas {
	
	private int matricula;
	private double salario;
	private LocalDate dataAdmissao;
	private Profissao profissao;
	
	public Funcionario() {
		
	}

	
	public void promover(Profissao novoCargo) {
		this.profissao = novoCargo;
	}

	public void reajustarSalario(double percentual) {
		this.salario =+ this.salario*percentual/100;
	}

	
	


}
