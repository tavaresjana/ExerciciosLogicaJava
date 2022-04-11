package AtividadesJava;

import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
 Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
 e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; //ok
o número de mulheres nervosas; ok
o número de homens agressivos; 
o número de outros calmos; //ok
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos. //ok

 */
public class ExercicioRepeticao4 {
	public static void main(String[] args) {
		int contador = 0, idade = 0, sexo = 0, humor = 0;
		int pCalmas = 0, mNervosa = 0, hAgressivos = 0, oCalmos = 0, pNervosaMais40 = 0, pCalmasMenos18 = 0; // variaveis de saida

		Scanner ler = new Scanner(System.in);

		while (contador <= 150) {
			System.out.println("Informe sua idade : ");
			idade = ler.nextInt();
			System.out.println("Informe seu sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = ler.nextInt();
			System.out.println(
					"Informe seu humor (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva): ");
			humor = ler.nextInt();
			contador++;

			if (humor == 1) {
				pCalmas++;
				if (sexo == 3) {
					oCalmos++;
				}
				if (idade < 18) {
					pCalmasMenos18++;
				}
			}

			if (humor == 2) {
				if (sexo == 1) {
					mNervosa++;
				}
				if (idade > 40) {
					pNervosaMais40++;
				}
			}

			if (sexo == 2 && humor == 3) {
				hAgressivos++;
			}
		}
		System.out.println("o número de pessoas calmas é: " + pCalmas);
		System.out.println("o número de mulheres nervosas é: " + mNervosa);
		System.out.println("o número de homens agressivos é: " + hAgressivos);
		System.out.println("o número de outros calmos é: " + oCalmos);
		System.out.println("o número de pessoas nervosas com mais de 40 anos é: " + pNervosaMais40);
		System.out.println("o número de pessoas calmas com menos de 18 anos é: " + pCalmasMenos18);
	}
}