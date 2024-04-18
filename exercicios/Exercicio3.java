package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor1 = scanner.nextInt();
		
		System.out.println("Digite outro número: ");
		int valor2 = scanner.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("A soma dos valores é " + soma);
	
		scanner.close();
	}
}
