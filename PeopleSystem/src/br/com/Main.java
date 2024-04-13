package br.com;

import java.time.LocalDate;

import br.com.composicoes.*;
import br.com.estruturadedados.ListaDeTelefonesNaoOrdenados;
import br.com.people.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		Telefones tel1 = new Telefones();
		tel1.setDdd("083");
		tel1.setNumTelefone("999118019");
		
		Telefones tel2 = new Telefones();
		tel2.setDdd("083");
		tel2.setNumTelefone("999999999");
		
		
		ListaDeTelefonesNaoOrdenados listaTel1 = new ListaDeTelefonesNaoOrdenados();
		
		listaTel1.addTelefone(tel1);
		listaTel1.addTelefone(tel2);
		
		c1.setTelsContato(listaTel1);
		
		c1.getTelsContato().exibirTelefones();
		
		
		/*
		 * Endereco end1 = new Endereco("rua 1","numero","cep", "cidade","estado",
		 * "pais");
		 * 
		 * c1.setCodigo("1"); c1.setNome("Meu nome");
		 * c1.setDataNascimento(LocalDate.of(1986, 07, 16)); c1.setEndereco(end1);
		 * 
		 * System.out.println("Nome do cliente: " + c1.getNome());
		 * 
		 * end1.setRua("Nova Rua");
		 * 
		 * //c1.getEndereco().setRua("Nova rua 2);
		 * 
		 * System.out.println("Endereco do Cliente: " + c1.getEndereco().getRua());
		 * 
		 * c2.setEndereco(end1);
		 */
		

	}

}
