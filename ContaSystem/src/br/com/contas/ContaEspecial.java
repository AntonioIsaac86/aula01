package br.com.contas;

public class ContaEspecial extends Contas {
	
	double limite;
	
	public ContaEspecial() {
		
	}
	
	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero,saldo);
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

}
