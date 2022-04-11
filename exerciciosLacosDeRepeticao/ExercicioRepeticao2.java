//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
package AtividadesJava;

import java.util.Scanner;

public class ExercicioRepeticao2 {
	public static void main(String[] args) {
		int num, num1, numPar = 0, numImpar = 0;

		for (num = 0; num <= 9; num++) {
			{ // esse num é o que delimita a qtd de vezes q vai rodar e o num1 é a minha
				// entrada
				Scanner ler = new Scanner(System.in);
				System.out.println("Digite um número: ");
				num1 = ler.nextInt();
			}
			if (num1 % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		}
		System.out.println("O total de números pares são: " + numPar + " e de números ímpares são: " + numImpar + "\n");
	}
}