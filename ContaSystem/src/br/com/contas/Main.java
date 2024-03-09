package br.com.contas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//cria a conta
		Contas conta1 = new Contas();
		Contas conta2 = new Contas(2,2);
		Contas conta3 = new Contas(2);
		ContaEspecial ConExp = new ContaEspecial();
		ContaEspecial ConExp2 = new ContaEspecial(20,20,20);
		
		ContaInvestimento ConInv = new ContaInvestimento()
		
		
		//atribui valor a conta
		conta1.numero = 1;
		// Depositar e imprimir saldo
		System.out.println("Informe o valor para o deposito inicial:");
		if (conta1.depositar(leitor.nextDouble()))
		{
			System.out.println("Seu saldo inicia é: ");
			System.out.println(conta1.getSaldo());
		} else {
			System.out.println("O valor precisa ser maior que zero");
		}
		
		
		//sacar e imprimir o saldo
		System.out.println("Informe o valor para sacar:");
		if(conta1.sacar(leitor.nextDouble()))
		{
			System.out.println("Seu saldo atual é: ");
			System.out.println(conta1.getSaldo());
		} else {
			System.out.println("Não tem Saldo!");
		}
		

	}

}
