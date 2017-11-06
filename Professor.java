package model;

public class Professor extends Usuario{
	private int id;
	private String nome;
	private String sexo;
	private String dataNasc;
	private String cpf;
	private String rg;
	
	public Professor(int id, String nome,
			String sexo, String dataNasc, String cpf, String rg, String login, String senha) {
		super(login, senha);
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.rg = rg;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(String login, String senha) {
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

	public int getId() {
		return id;
	}
	
}
