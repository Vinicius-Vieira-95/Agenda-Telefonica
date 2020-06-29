package Contato;


public class ContatoTrabalho extends contatos{

	private String nome;
	private int num;
	private String setor;
	
	
	public ContatoTrabalho(String nome, int num, String setor) {
		super(nome, num, setor);
		this.nome = nome;
		this.num = num;
		this.setor = setor;
		
	}
	
	@Override
	public boolean mostrarContatos() {	
			System.out.println("Nome: "+ nome+ "\nNumero: " + num +"\nSetor: "+ setor);
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
	
	

}
