package AtividadesJava;

import java.util.Scanner;

//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
public class ExercicioVetor2 {
	public static void main(String[] args) {
		int vetor [] = new int [10];
		int d, num, media, cont=0, maior=0, menor=0, soma=0;
		
		for (d=0; d<10; d++)
		{//buscando valores
			Scanner ler = new Scanner(System.in);
			System.out.println("Insira o valor de seus lan�amentos: ");
			num = ler.nextInt();
		/*	
			vetor[d]=num;
		//verificando se � maior	
			if (maior < vetor[d])
			{
				maior = vetor[d];
			} else {
				menor = vetor[d];
			} 
			System.out.println("Os n�meros informados foram: ");
			
			for (d=0; d<3; d++)
			{
				if (vetor[d]==maior) {
					cont++;
				}
				System.out.println(vetor[d]);
			}
		
			media=soma/10;
					System.out.println("\nA m�dia dos valores de lan�amento � "+media);
					System.out.println("\nA pontua��o se repetiu "+cont+" vezes.");
		*/
		} 	
	}
		
}