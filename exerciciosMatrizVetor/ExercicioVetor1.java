package AtividadesJava;

import java.util.Scanner;

//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
//e o escreva em seguida. Encontre após a maior pontuação e a apresente. 

public class ExercicioVetor1 {
	public static void main(String[] args) {
		int p, num = 0, maior = 0, menor = 0;
		int vetor[] = new int[5];

		for (p = 0; p < 5; p++) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite sua pontuação: ");
			num = ler.nextInt();
			vetor[p] = num;

			if (maior < vetor[p]) {
				maior = vetor[p];
			} else {
				menor = vetor[p];
			}
		}
		System.out.println("Maior valor é " + maior);

	}

}
