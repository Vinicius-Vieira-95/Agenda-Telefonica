package Contato;

public class ContatoInfancia extends contatos {

	private String nome;
	private int num;
	private int idade;
	public ContatoInfancia(String nome, int num, int idade) {
		super(nome, num, idade);
		this.nome = nome;
		this.num = num;
		this.idade = idade;
		
	}
	
	@Override
	public boolean mostrarContatos() {
		
			System.out.println("Nome: "+ this.nome+ " \nNumero: " +this.num + " \nIdade: "+ this.idade);
			return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNum() {
		return num;
		
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return nome;
	}
	

}
