package AtividadesJava;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =99. (WHILE) */

public class ExercicioRepeticao3 {
	public static void main(String[] args) {

		int idade = 0, menos21 = 0, mais50 = 0;

		while (idade != 99) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();

			if (idade < 21) {
				menos21++;
			} else if (idade > 50) {
				mais50++;
			}
		}
		System.out.println("Pessoas com menos de 21 anos: " + menos21 + " e pessoas com mais de 50 anos " + mais50);
	}
}