//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
package AtividadesJava;

import java.util.Scanner;

public class ExercicioRepeticao2 {
	public static void main(String[] args) {
		int num, num1, numPar = 0, numImpar = 0;

		for (num = 0; num <= 9; num++) {
			{ // esse num � o que delimita a qtd de vezes q vai rodar e o num1 � a minha
				// entrada
				Scanner ler = new Scanner(System.in);
				System.out.println("Digite um n�mero: ");
				num1 = ler.nextInt();
			}
			if (num1 % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		}
		System.out.println("O total de n�meros pares s�o: " + numPar + " e de n�meros �mpares s�o: " + numImpar + "\n");
	}
}