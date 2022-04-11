package AtividadesJava;

/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
No final, mostre a soma dos números digitados.(DO...WHILE)*/
import java.util.Scanner;

public class ExercicioRepeticao5 {
	public static void main(String[] args) {
		int n1, cont = 0, soma = 0;
		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			n1 = ler.nextInt();
			cont++;
			soma = soma + n1;
		} while (n1 != 0);
		System.out.println("A soma dos números digitados é: " + soma);
		System.out.println("\nFim do programa");
	}
}