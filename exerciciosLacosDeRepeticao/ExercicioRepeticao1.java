package AtividadesJava;

//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

public class ExercicioRepeticao1 {
	public static void main(String[] args) {
		System.out.println("Números divididos por 11 e com resto 5\n");

		for (int num = 1000; num <= 1999; num++) {
			if (num % 11 == 5) {
				System.out.println(num);
			}
		}
	}
}