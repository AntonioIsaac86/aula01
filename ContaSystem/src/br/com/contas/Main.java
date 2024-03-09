package br.com.contas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//cria a conta
		Contas conta1 = new Contas();
		//atribui valor a conta
		conta1.numero = 1;
		conta1.saldo = 1000;
		//sacar e imprimir o saldo
		System.out.println("Informe o valor para sacar:");
		if(conta1.sacar(leitor.nextDouble()))
		{
			System.out.println(conta1.getSaldo());
		} else {
			System.out.println("Não tem Saldo!");
		}
		

	}

}
