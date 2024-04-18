package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor1 = scanner.nextInt();
		
		System.out.println("Digite outro número: ");
		int valor2 = scanner.nextInt();
		
		int subtração = valor1 - valor2;
		
		System.out.println("A subtração dos valores é " + subtração);
	
		scanner.close();
	}
}
