package AtividadesJava;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class Exerc�cio1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		int a, b, c, maior=0;
		
		//Solicitando os n�meros
		System.out.println("Digite o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		c = ler.nextInt();
		
		//Verificando se 'a' � maior que b e c
		if (a > b)
		{
			if (a > c)
				maior = a;
		}
		
		//Verificando se 'b' � maior que c
		else 
		{
			if(b>c)
				maior = b;
		//se o maior n�o for 'a' e 'b', logo 'c' ser� 	
			else 
			{
				maior = c;
			}
		}
		//imprimindo a resposta
			System.out.println("O maior n�mero �: "+ maior);
	}

}
