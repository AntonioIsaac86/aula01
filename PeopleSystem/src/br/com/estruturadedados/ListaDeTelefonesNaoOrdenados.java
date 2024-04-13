package br.com.estruturadedados;

import java.util.Iterator;

import br.com.composicoes.Telefones;

public class ListaDeTelefonesNaoOrdenados {
	
	//vetor telefones
	private Telefones[] telefones;
	
	//controle do tamanho = QUANTIDADE DE ELEMENTOS
	private int tamanho;
	//capacidade "inicial"
	private static final int CAPACIDADE_PADRAO = 7;
	
	
	public ListaDeTelefonesNaoOrdenados() {
		this.telefones = new Telefones[CAPACIDADE_PADRAO];
		this.tamanho = 0;
		
		
	}
	//adicionar telefone com restrição de capacidade-
	public void addTelefone(Telefones telefone) {
		if (tamanho == CAPACIDADE_PADRAO) {
			System.out.println("Não ha mais espaço");
			//mudar a capacidade
		} else {
			telefones[tamanho] = telefone;
			this.tamanho = tamanho + 1;
		}
		
		
	}
	
	private int buscarTelefoneIndex(Telefones telefone) {
		// TODO Auto-generated method stub
		for (int i = 0;i < tamanho; i++) {
			//validar se os telefones são iguais
			if (telefones[i].equals(telefone)) {
				return i;
			}
		}
		System.out.println("Telefone não encontrado");	
		return -1;
	}
	
	public void removerTelefone(Telefones telefone) {
		int index = buscarTelefoneIndex(telefone);
		if (index != -1) {
			for(int i = index; i < tamanho - 1; i++) {
				telefones[i] = telefones[i+1];
			}
		}
		//colocar null no ultimo elemento
		//decremento o tamanho atualizado objeto
		this.tamanho = tamanho - 1;
		telefones[tamanho] = null;
	}
	public void exibirTelefones() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Telefones da lista: " + telefones[i]);
		}
		
	}
	

	public boolean isEmpty() {
		return this.tamanho == 0;
	}
	
}

