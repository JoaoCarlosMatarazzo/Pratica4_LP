package meuPacote;
import java.util.Arrays;
import java.util.Scanner;
public class questao3 {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in); {
		int j=0;
		int totalCharacters = 0;
        char temp;
		String texto = null;
		System.out.println("Olá, seja bem-vindo(a).Por favor apresente um texto para ser analisado:");
		texto = ler.next();
		String contar = texto;
		System.out.println("Muito bem, agora por favor escolha qual opção deseja:");
		System.out.println("1-Número de sentenças(ponto final, exclamação e interrogação).");
		System.out.println("2-Número de palavras.");
		System.out.println("3-Número de vogais.");
		System.out.println("4-Número de Consoantes.");
		System.out.println("5-Sair");
		switch(j){
		case 1:
		//(1) Número de sentenças
        for (int i = 0; i < contar.length(); i++) {

            temp = contar.charAt(i);
            if (temp == '.' || temp == '?'|| temp == '!')
                totalCharacters++;
        }

        System.out.println("Número total de sentenças: " + totalCharacters);
		break;
		//(2) Número de Palavras
		case 2:
				int stringLengthWithoutSpaces = contar.replace(" ", "").length();
		        System.out.println("O número total de palavras são: " + stringLengthWithoutSpaces);
		break;		
		//(3) Número de Vogais
		case 3:
			contar = contar.toLowerCase();
	        char[] chars = contar.toCharArray();
	  
	        int countandovog = 0;
	  
	        for (int i = 0; i < contar.length(); i++)
	        {
	            if (contar.charAt(i) == 'a' || contar.charAt(i) == 'e' || contar.charAt(i) == 'i' || contar.charAt(i) == 'o' || contar.charAt(i) == 'u')
	            {
	                countandovog++;
	            }
	        }
	        System.out.println("O total de vogais são: " + countandovog);	
		break;
		//(4) Número de Consoantes
		case 4:
			contar = contar.toLowerCase();
	        char[] chars1 = contar.toCharArray();
	  
	        int countandocons = 0;
	  
	        for (int i = 0; i < contar.length(); i++)
	        {
	            if (contar.charAt(i) != 'a' || contar.charAt(i) != 'e' || contar.charAt(i) != 'i' || contar.charAt(i) != 'o' || contar.charAt(i) != 'u')
	            {
	                countandocons++;
	            }
	        }
	        System.out.println("O total de consoantes são: " + countandocons);
			break;
		//(5) Sair
		case 5:
			System.out.println("Obrigado por ter usado os nossos serviços. Até a próxima!");
		break;
			}
		}
	}	 
}


