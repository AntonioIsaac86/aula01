package br.com.composicoes;

public class Telefones {
	
	private String ddd;
	private String numTelefone;
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}
	@Override
	public String toString() {
		return "Telefones [DDD=" + ddd + ", numero do Telefone=" + numTelefone + "]";
	}
	

}
