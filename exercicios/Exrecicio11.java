package exercicios;

import java.util.Scanner;

public class Exrecicio11 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite o tamanho da base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();
        
        System.out.print("Digite o tamanho da base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();
        
        System.out.print("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();
        
        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio é: " + area);
        
        scanner.close();
	}
}
