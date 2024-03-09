package br.com.contas;

public class Contas {

	int numero;
	double saldo;
	
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
