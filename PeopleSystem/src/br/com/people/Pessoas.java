package br.com.people;

import java.time.LocalDate;
import java.time.Period;

import br.com.composicoes.Endereco;
import br.com.composicoes.Telefones;
import br.com.estruturadedados.ListaDeTelefonesNaoOrdenados;

public class Pessoas {
	
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private ListaDeTelefonesNaoOrdenados telsContato;
	
	public Pessoas() {
		System.out.println("Criando uma pessoa sem atributos");
	}
	
	public Pessoas(String nome, LocalDate dataNascimento, Endereco endereco, ListaDeTelefonesNaoOrdenados telsContato) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
	}

	public void cadastar() {
		
	}
	
	public int obterIdade() {
		int idade = 0;
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(this.dataNascimento, dataAtual);
		idade = periodo.getYears();
		return idade;
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ListaDeTelefonesNaoOrdenados getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(ListaDeTelefonesNaoOrdenados telsContato) {
		this.telsContato = telsContato;
	}
	
	
		
	

}
