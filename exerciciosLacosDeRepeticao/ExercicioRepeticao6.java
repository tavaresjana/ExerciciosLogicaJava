package AtividadesJava;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
Para sair digitar 0(zero).(DO...WHILE)
*/
public class ExercicioRepeticao6 {
	public static void main(String[] args) {
		int n1 = 0, cont3 = 0, soma = 0, media = 0;

		do {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um n�mero: ");
			n1 = ler.nextInt();

			if (n1 % 3 == 0 && n1!=0) {
				cont3++;
				soma = soma + n1;
				media = soma / cont3;
			}
		} while (n1 != 0);

		System.out.println("A quantidade de n�meros digitados multiplos de 3 �: " + cont3);
		System.out.println("\nA m�dia dos n�meros multiplos de 3 �: " + soma/cont3);
	}
}