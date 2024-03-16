package br.com.contas;

import java.util.Random;

public class Contas {

	private int numero;
	private double saldo;
	
	//Criando construtores
	public Contas() {
		System.out.println("A conta vazia foi criada");
	}
	public Contas(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Contas(int numero) {
		this.numero = numero;
		this.saldo = 1;
		System.out.println("Seu saldo inicial é: " + this.saldo + " " + "O número de sua conta é: " + this.numero);
	}
	public Contas(double valDeposito) {
		depositar(valDeposito);
		Random random = new Random();
		this.numero = random.nextInt();
		
	}
	
	public boolean sacar(double val) {
		if (this.saldo >= val) {
			this.saldo = this.saldo - val;
			return true;
		}
		else {
			
			return false;
		}
	}
	public boolean depositar(double val) {
		if (val < 0) {
			return false;
		}
		else {
			this.saldo = this.saldo + val;
			return true;
		

		}
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	

}
