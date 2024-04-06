package br.com.people;

import java.time.LocalDate;

import br.com.composicoes.Endereco;
import br.com.composicoes.Profissao;
import br.com.composicoes.Telefones;

public class Cliente extends Pessoas {
	
	private String codigo;
	private Profissao profissao;
	
	
	public Cliente() {
		System.out.println("Lista de clientes criada");
	}


	public Cliente(String nome, LocalDate dataNascimento, Endereco endereco, Telefones telsContato) {
		super(nome, dataNascimento, endereco, telsContato);
		// TODO Auto-generated constructor stub
		this.codigo = codigo;
		this.profissao = profissao;
	}
	
	
	
	
	

}
