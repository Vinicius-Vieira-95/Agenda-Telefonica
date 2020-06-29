package Contato;

import java.util.ArrayList;
import java.util.Scanner;


public class AgendaTelefonica {
	
	private String nome, a;
	private int num;
	private String telefone;
	private ArrayList<ContatoInfancia>agenda01;
	private ArrayList<ContatoTrabalho>agenda02;
	private Scanner scan = new Scanner(System.in);
	
	
	public AgendaTelefonica(String telefone) {
		
		this.telefone = telefone;
		agenda01 = new ArrayList<ContatoInfancia>();
		agenda02 = new ArrayList<ContatoTrabalho>();
	
	}
	public boolean adicionarContatoTrabalho(){
			
			System.out.print("Adiocione o nome: ");
			String nome = scan.next();
			System.out.print("Adicione o numero: ");
			int num = scan.nextInt();
			System.out.print("Adicione o setor: ");
			String setor = scan.next();
			
			agenda02.add(new ContatoTrabalho(nome, num, setor));
			
			return true;
	}
	public boolean adicionarContatoInfancia(){
		
			System.out.print("Adiocione o nome: ");
			String nome = scan.next();
			System.out.print("Adicione o numero: ");
			int num = scan.nextInt();
			System.out.print("Adicione a idade: ");
			int idade = scan.nextInt();
			
			agenda01.add(new ContatoInfancia(nome, num, idade));
			
			return true;
	}
	public boolean nome_Setor(String nomeDoSetor) {
			
			System.out.println("Setor : " + nomeDoSetor );
			for(contatos ct: this.agenda02) {
				
				if(ct.setor.equalsIgnoreCase(nomeDoSetor)) {
					System.out.println(ct.nome + " : " + ct.num);
				}
				
			}
			
			return true;
	}
	public void mostrar_Contatos(int num) {
		
		if(num == 1){
			for(ContatoInfancia ci : this.agenda01) {
				ci.mostrarContatos();
			}
			for(ContatoTrabalho ct: this.agenda02) {
				ct.mostrarContatos();
			}
		}
		else if(num == 2) {
			
			for(ContatoInfancia ci : this.agenda01) {
				ci.mostrarContatos();
			}
		}
		else if(num == 3) {
			
			System.out.println("Deseja ver todos os contato ou especificar o setor? ");
			System.out.println("Digite 'todos' ou 'setor'. ");
			a = scan.next();
			if(a.equalsIgnoreCase("todos")) {
				for(ContatoTrabalho ct : this.agenda02) {
					ct.mostrarContatos();	
				}
			}
			if(a.equalsIgnoreCase("setor")) {
				System.out.print("Coloque o nome do setor: ");
				String a = scan.next();
				nome_Setor(a);
			}
		}
		else if( num > 4) {
			System.out.println("Numero não correspondido");
			
		}
		
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public ArrayList<ContatoInfancia> getAgenda01() {
		return agenda01;
	}
	public void setAgenda01(ArrayList<ContatoInfancia> agenda01) {
		this.agenda01 = agenda01;
	}
	public ArrayList<ContatoTrabalho> getAgenda02() {
		return agenda02;
	}
	public void setAgenda02(ArrayList<ContatoTrabalho> agenda02) {
		this.agenda02 = agenda02;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	
	

}
