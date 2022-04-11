package AtividadesJava;

import java.util.Scanner;

//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
//A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
public class ExercicioVetor2 {
	public static void main(String[] args) {
		int vetor [] = new int [10];
		int d, num, media, cont=0, maior=0, menor=0, soma=0;
		
		for (d=0; d<10; d++)
		{//buscando valores
			Scanner ler = new Scanner(System.in);
			System.out.println("Insira o valor de seus lançamentos: ");
			num = ler.nextInt();
		/*	
			vetor[d]=num;
		//verificando se é maior	
			if (maior < vetor[d])
			{
				maior = vetor[d];
			} else {
				menor = vetor[d];
			} 
			System.out.println("Os números informados foram: ");
			
			for (d=0; d<3; d++)
			{
				if (vetor[d]==maior) {
					cont++;
				}
				System.out.println(vetor[d]);
			}
		
			media=soma/10;
					System.out.println("\nA média dos valores de lançamento é "+media);
					System.out.println("\nA pontuação se repetiu "+cont+" vezes.");
		*/
		} 	
	}
		
}