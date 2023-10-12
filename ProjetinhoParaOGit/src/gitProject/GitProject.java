package gitProject;

import java.util.Scanner;

public class GitProject {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	        String criador = "samir";
	        String site = "github";

	        System.out.println("Qual o criador desse programinha?");
	        String respostaCriador = sc.nextLine();

	        if (respostaCriador.equals(criador)) {
	            System.out.println("Acertou");
	        } else {
	            System.out.println("Já que não acertou essa, tente adivinhar qual o nome do site em que você pegou este arquivo!?");
	            String respostaSite = sc.nextLine();

	            if (respostaSite.equals(site)) {
	                System.out.println("Acertou!");
	            } else {
	                System.out.println("Tente novamente!");
	            }
	        }

	        sc.close();
	        System.out.println("Obrigado por testar.");
	}

}


