package meuPacote;
import java.util.Random;
import java.util.Scanner;
public class questao1 {

	public static void main(String[] args){
		 Scanner entrada = new Scanner(System.in);
		    Random random = new Random();
		    int i = 0;
		    int j = 0;
		    int azul=0, vermelho=0, verde=0;

		    do 
		    {
		    System.out.println("Por favor, apresente a cor de sua chave:");
		    System.out.println("1-Chave azul.");
			System.out.println("2-Chave vermelha.");
			System.out.println("3-Chave verde.");		
		    i=entrada.nextInt();
		    switch(i)
		      		{
		      case 1:
		        System.out.println("Parabéns, a sua chave é azul. Por favor, vá para a porta azul.");
		        azul++;
		        j++;
		        break;
		      case 2:
		        System.out.println("Parabéns, a sua chave é vermelha. Por favor, vá para a porta vermelho.");
		        vermelho++;
		        j++;
		        break;
		      case 3:
		        System.out.println("Parabéns, a sua chave é verde. Por favor, vá para a porta verde.");
		        verde++;
		        j++;
		        break;		        
		      default:
		        System.out.println("Desculpe, chave invalida. Por favor, apresente outro tipo de chave.");
		        }
		    } while(j <= 9);
		    
		    System.out.println("Por fim, o total de pessoas que possuiam a chave azul, foram:"+azul);
		    System.out.println("Por fim, o total de pessoas que possuiam a chave vermelha, foram:"+vermelho);
		    System.out.println("Por fim, o total de pessoas que possuiam a chave verde, foram:"+verde);
		   }
	}
