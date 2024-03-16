package br.com.contas;

public class ContaEspecial extends Contas {
	
	private double limite;
	
	public ContaEspecial() {
		System.out.println("Conta Especial Criada");
		
	}
	public ContaEspecial(double limite) {
		 this.limite = limite;
		
	}
	
	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero,saldo);
		this.limite = limite;
	}
	
	
	
	public boolean sacarContaEspecial(double val) {
		if (getSaldo() >= val) {
			double novoSaldo = getSaldo() - val;
			setSaldo(novoSaldo);
			return true;
		}
		else {
			
			return false;
		}
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	

}
