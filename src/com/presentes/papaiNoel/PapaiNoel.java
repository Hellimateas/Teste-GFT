package com.presentes.papaiNoel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.presentes.criancas.Criancas;

public class PapaiNoel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean verificador = true;
		List<Criancas> criancas = new ArrayList<>();
		int entregue = 0;
		int naoEntregue = 0;
		
		while (verificador == true) {
			Criancas crianca = new Criancas();
			System.out.println("HO-HO-HO Qual � o seu nome minha crian�a?");
			crianca.setNome(input.nextLine());
			
			
			System.out.println("Voc� foi uma crian�a ");
			System.out.println("1 - BOA");
			System.out.println("2 - M�");
			int numero = input.nextInt();
			clearBuffer(input);
			
			switch (numero) {
			case 1:
				crianca.setPersonalidade("BOA");
				break;
			case 2:
				crianca.setPersonalidade("M�");
			default:
				break;
			}

			criancas.add(crianca);
			
			System.out.println("Tem mais algum pequenino? se sim, digite 1. caso n�o, digite 2 ");
			if(input.nextInt() == 2) {
				verificador = false;
			}
			clearBuffer(input);
			
			if (crianca.getPersonalidade().equals("BOA")){
	             entregue+=1;
	         } else if (crianca.getPersonalidade().equals("M�")) {
	             naoEntregue+=1;
	         }

		}
		 
		
		System.out.printf("foram entregues %d presentes \nE %d crian�as n�o receberam por serem levadas!",entregue, naoEntregue );

		input.close();
	}
	 private static void clearBuffer(Scanner scanner) {
	        if (scanner.hasNextLine()) {
	            scanner.nextLine();
	        }
	    }

}
