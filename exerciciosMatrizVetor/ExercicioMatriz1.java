package AtividadesJava;

import java.util.Scanner;

//4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
//e em seguida,exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
public class ExercicioMatriz1 {
	public static void main(String[] args) {

		int matriz[][] = null;
		int linha, coluna;
		
		for (linha=0; linha<3; linha++)
		{
			for (coluna=0; coluna<3; coluna++)
				System.out.print(matriz[linha][coluna]+"\t");
			
		}
	
	}
}
