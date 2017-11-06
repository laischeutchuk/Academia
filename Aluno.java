package model;

public class Aluno extends Usuario{
	private int id;
	private String nome;
	private String sexo;
	private String dataNasc;
	private String cpf;
	private String rg;
	private double peso;
	private double altura;
	
	public Aluno(int id, String nome, String sexo,
			String dataNasc, String cpf, String rg, double peso, double altura, String login, String senha) {
		super(login, senha);
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.rg = rg;
		this.peso = peso;
		this.altura = altura;
	}

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(String login, String senha) {
		super(login, senha);
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getId() {
		return id;
	}
	
}