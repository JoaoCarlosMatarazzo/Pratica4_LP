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
		System.out.println("Ol�, seja bem-vindo(a).Por favor apresente um texto para ser analisado:");
		texto = ler.next();
		String contar = texto;
		System.out.println("Muito bem, agora por favor escolha qual op��o deseja:");
		System.out.println("1-N�mero de senten�as(ponto final, exclama��o e interroga��o).");
		System.out.println("2-N�mero de palavras.");
		System.out.println("3-N�mero de vogais.");
		System.out.println("4-N�mero de Consoantes.");
		System.out.println("5-Sair");
		switch(j){
		case 1:
		//(1) N�mero de senten�as
        for (int i = 0; i < contar.length(); i++) {

            temp = contar.charAt(i);
            if (temp == '.' || temp == '?'|| temp == '!')
                totalCharacters++;
        }

        System.out.println("N�mero total de senten�as: " + totalCharacters);
		break;
		//(2) N�mero de Palavras
		case 2:
				int stringLengthWithoutSpaces = contar.replace(" ", "").length();
		        System.out.println("O n�mero total de palavras s�o: " + stringLengthWithoutSpaces);
		break;		
		//(3) N�mero de Vogais
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
	        System.out.println("O total de vogais s�o: " + countandovog);	
		break;
		//(4) N�mero de Consoantes
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
	        System.out.println("O total de consoantes s�o: " + countandocons);
			break;
		//(5) Sair
		case 5:
			System.out.println("Obrigado por ter usado os nossos servi�os. At� a pr�xima!");
		break;
			}
		}
	}	 
}


