package AtividadesJava;

/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
import java.util.Scanner;

public class ExercicioRepeticao5 {
	public static void main(String[] args) {
		int n1, cont = 0, soma = 0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Digite um n�mero: ");
			n1 = ler.nextInt();
			cont++;
			soma = soma + n1;
		} while (n1 != 0);
		System.out.println("A soma dos n�meros digitados �: " + soma);
		System.out.println("\nFim do programa");
	}
}