package exercicios;

import java.util.Scanner;

public class Exercicios {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor1 = scanner.nextInt();
		
		int sucessor = valor1 + 1;
		
		System.out.println("O sucessor de " + valor1 + " é " + sucessor);
	
		scanner.close();
	}
}
