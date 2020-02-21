package model;

public class Estado {
	private String nome;
	private char uf;
	
	public Estado() {
		
	}

	public Estado(String nome, char uf) {
		super();
		this.nome = nome;
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getUf() {
		return uf;
	}

	public void setUf(char uf) {
		this.uf = uf;
	}
	
	
}
