package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite a base do retângulo: ");
        int base = scanner.nextInt();
        
        System.out.print("Digite a altura do retângulo: ");
        int altura = scanner.nextInt();
        
        int area = base * altura;
        
        System.out.println("A área do retângulo é: " + area);
        
        scanner.close();
	}
}

// a=b.h