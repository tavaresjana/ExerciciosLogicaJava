package AtividadesJava;

import java.util.Scanner;

//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
// 10 - 14 infantil, 15 - 17 juvenil, 18-25 adulto

public class Exerc�cio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("Sua categoria � a Infantil");
		}
		
		else if (idade>=15 && idade<=17)
		{
			System.out.println("Sua categoria � a Juvenil");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("Sua categoria � Adulto");
		}
	}
}