package br.com.contas;

public class ContaInvestimento extends Contas {
	private double taxa;
	private int prazo;
	
	
	public ContaInvestimento() {
		System.out.println("Conta de investimento criada");
	}
	
	public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
		super(numero, saldo);
		this.taxa = taxa;
		this.prazo = prazo;
	}
	
	public boolean sacar(double val) {
		if (getSaldo() >= val) {
			setSaldo(getSaldo() - (val*1.01));
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
			setSaldo(getSaldo() + (val*1.01));
			return true;
		

		}
	}
	public void aplicarRendimento(double taxa) {
		setSaldo(getSaldo()*(1 + (taxa/100)));
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	
}
