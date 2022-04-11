package AtividadesJava;

import java.util.Scanner;
import java.math.*;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

public class Exercício4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		byte num;
		
		System.out.println("Informe um número: ");
		num = ler.nextByte();
		
		if (num%2==0) //significa que é par
		{
			System.out.println("Esse número é par e sua raiz quadrada é  = "+Math.sqrt(num));
		}
		
		else 
		{
			System.out.println("Esse número é ímpar e sua potência elevado ao quadrado é  = "+Math.pow(num, 2));
		}
	}
}