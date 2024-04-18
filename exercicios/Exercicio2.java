package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor1 = scanner.nextInt();
		
		int antecessor = valor1 - 1;
		
		System.out.println("O antecessor de " + valor1 + " é " + antecessor);
	
		scanner.close();
	}
	
}
