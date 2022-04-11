package AtividadesJava;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. 
Para sair digitar 0(zero).(DO...WHILE)
*/
public class ExercicioRepeticao6 {
	public static void main(String[] args) {
		int n1 = 0, cont3 = 0, soma = 0, media = 0;

		do {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um número: ");
			n1 = ler.nextInt();

			if (n1 % 3 == 0 && n1!=0) {
				cont3++;
				soma = soma + n1;
				media = soma / cont3;
			}
		} while (n1 != 0);

		System.out.println("A quantidade de números digitados multiplos de 3 é: " + cont3);
		System.out.println("\nA média dos números multiplos de 3 é: " + soma/cont3);
	}
}