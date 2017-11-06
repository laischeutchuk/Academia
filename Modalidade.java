package model;

public class Modalidade {
	private int id;
	private String nome;
	
	public Modalidade(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Modalidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}
	
}
