package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite o tamanho da diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();
        
        System.out.print("Digite o tamanho da diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();
        
        double area = diagonalMaior * diagonalMenor / 2; 
        
        System.out.println("A área do losango é: " + area);
        
        scanner.close();
	}
}
