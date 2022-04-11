package AtividadesJava;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.

public class Exercício1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		int a, b, c, maior=0;
		
		//Solicitando os números
		System.out.println("Digite o primeiro número: ");
		a = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		b = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		c = ler.nextInt();
		
		//Verificando se 'a' é maior que b e c
		if (a > b)
		{
			if (a > c)
				maior = a;
		}
		
		//Verificando se 'b' é maior que c
		else 
		{
			if(b>c)
				maior = b;
		//se o maior não for 'a' e 'b', logo 'c' será 	
			else 
			{
				maior = c;
			}
		}
		//imprimindo a resposta
			System.out.println("O maior número é: "+ maior);
	}

}
