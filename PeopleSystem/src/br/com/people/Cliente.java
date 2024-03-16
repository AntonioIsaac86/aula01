package br.com.people;

public class Cliente extends Pessoas {
	
	private int codigo;
	
	public Cliente() {
		System.out.println("Lista de clientes criada");
	}

	public Cliente(String nome, String dataNascimento, String endereco, String telsContato, int codigo) {
		super(nome, dataNascimento, endereco, telsContato);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

}
