package Contato;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		AgendaTelefonica n1 = new AgendaTelefonica("Nokia");
		boolean flag = true;
		int i;
		String  frase = null;
		do {
			
			System.out.println("////////////////////Agenda/////////////////");
			System.out.println(" 1 - Adicionar Contatos");
			System.out.println(" 2 - Mostar Contatos");
			System.out.println(" 4 - Sair");
			 i = scanner.nextInt();
			
			if( i == 1) {
				
					System.out.println("Em que grupo deseja adicionar?: ");
					System.out.println(" Digite : infancia ");
					System.out.println(" Digite : trabalho ");
					frase = scanner.next();
					
					if(frase.equalsIgnoreCase("infancia")) {
						flag = true;
						while(flag) {
							n1.adicionarContatoInfancia();
							System.out.println("Deseja adicionar mais contato?: ");
							System.out.println("S - sim / N - não");
							if(!scanner.next().equalsIgnoreCase("S")) flag = false;
						}
						
						
					}
					else if(frase.equalsIgnoreCase("trabalho")) {
						flag = true;
						while(flag){
							n1.adicionarContatoTrabalho();
							System.out.println("Deseja adicionar mais contato?: ");
							System.out.println("S - sim / N - não");
							if(!scanner.next().equalsIgnoreCase("S")) flag = false;
						}
					}
					
				
			}
			else if(i == 2) {
				
				System.out.println("Qual Agenda deseja ver?: ");
				System.out.println(" 1 - Infancia/Trabalho");
				System.out.println(" 2 - Infancia");
				System.out.println(" 3 - Trabalho");
				
				i = scanner.nextInt();
				n1.mostrar_Contatos(i);
				
			}
			
		
		}while( i != 4);
	}
	
}
