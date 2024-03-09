package br.com.contas;

public class Contas {

	int numero;
	double saldo;
	
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
	
	boolean sacar(double val) {
		if (this.saldo >= val) {
			this.saldo = this.saldo - val;
			return true;
		}
		else {
			
			return false;
		}
	}
	boolean depositar(double val) {
		if (val < 0) {
			return false;
		}
		else {
			this.saldo = this.saldo + val;
			return true;
		

		}
	}
	double getSaldo () {
		return this.saldo;
		
	}

}
