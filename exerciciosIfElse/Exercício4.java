package AtividadesJava;

import java.util.Scanner;
import java.math.*;

//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
//Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

public class Exerc�cio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		byte num;
		
		System.out.println("Informe um n�mero: ");
		num = ler.nextByte();
		
		if (num%2==0) //significa que � par
		{
			System.out.println("Esse n�mero � par e sua raiz quadrada �  = "+Math.sqrt(num));
		}
		
		else 
		{
			System.out.println("Esse n�mero � �mpar e sua pot�ncia elevado ao quadrado �  = "+Math.pow(num, 2));
		}
	}
}