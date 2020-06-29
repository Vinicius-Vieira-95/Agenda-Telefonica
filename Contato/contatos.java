package Contato;

public abstract class  contatos {

	protected String nome;
	protected int num;
	protected String setor;
	protected int idade;
	
	public contatos(String nome, int num, int idade) {
		this.nome = nome;
		this.num = num;
		this.idade = idade;
		
	}
	
	public contatos(String nome, int num, String setor) {
		this.nome = nome;
		this.num = num;
		this.setor = setor;
	}
	
	public contatos(String nome, int num) {
		this.nome = nome;
		this.num = num;
	}
	
	public boolean contatoTrabalho() {
		
		return false;
	}
	public boolean  contatoInfancia() {
		return false;
	}
	
	public abstract boolean mostrarContatos();
	
	public String toString() {
		
		return "Nome: "+ nome+ "Numero: " +num;
	}

}
