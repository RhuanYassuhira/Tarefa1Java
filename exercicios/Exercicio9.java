package exercicios;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite o comprimento do lado do quadrado: ");
        double lado = scanner.nextDouble();
        
        double area = lado * lado;
        
        System.out.println("A área do quadrado é: " + area);
        
        scanner.close();
		
	}
}
