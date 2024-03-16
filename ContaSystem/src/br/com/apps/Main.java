package br.com.apps;

import java.util.Scanner;

import br.com.contas.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//cria a conta
		//Contas conta1 = new Contas();
		//Contas conta2 = new Contas(2,2);
		//Contas conta3 = new Contas(2);
		
		ContaEspecial conExp1 = new ContaEspecial();
		ContaEspecial conExp2 = new ContaEspecial(02,12000,100000);
		
		ContaInvestimento conInv1 = new ContaInvestimento();
		ContaInvestimento conInv2 = new ContaInvestimento(1, 500, 2, 12);
		
		//System.out.println("Saldo da conta 1:" + conta1.saldo);
		System.out.println("Saldo da conta especial: " + conExp2.getSaldo());
		System.out.println("Limite da conta especial: "+ conExp2.getLimite());
		
		System.out.println("Saldo atual da conta especial é: " + conExp2.getSaldo());
		System.out.println("Vamos depositar 1000 conto");
		conExp2.depositar(1000);
		System.out.println("Saldo após depósito da conta especial é "+ conExp2.getSaldo());
		
		System.out.println("Saldo atual da conta invest é: " + conInv2.getSaldo());
		System.out.println("Vamos depositar 1000 conto");
		conInv2.depositar(1000);
		System.out.println("Saldo após depósito da conta invet é "+ conInv2.getSaldo());
		
		//ConExp1.sacar(0);
		//ConExp1.sacarInvest(0);
		//ConExp1.getSaldo();
		//atribui valor a conta
//	//	conta1.numero = 1;
//		// Depositar e imprimir saldo
//	//	System.out.println("Informe o valor para o deposito inicial:");
//		if (conta1.depositar(leitor.nextDouble()))
//		{
//			System.out.println("Seu saldo inicia é: ");
//			System.out.println(conta1.getSaldo());
//		} else {
//			System.out.println("O valor precisa ser maior que zero");
//		}
//		
//		
//		//sacar e imprimir o saldo
//		System.out.println("Informe o valor para sacar:");
//		if(conta1.sacar(leitor.nextDouble()))
//		{
//			System.out.println("Seu saldo atual é: ");
//			System.out.println(conta1.getSaldo());
//		} else {
//			System.out.println("Não tem Saldo!");
//		}
//		

	}

}
