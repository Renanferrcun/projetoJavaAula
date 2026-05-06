package execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo12  {


	public static void main(String[] args) {
		
		int dividendo;
		int divisor;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite o Dividendo: ");
			dividendo = ler.nextInt();
			
			System.out.println("Digite o Divisor: ");
			divisor = ler.nextInt();
			
			divide(dividendo, divisor);	
			
		} catch(InputMismatchException e) {
			System.err.println("\nExceção: " + e);
			System.out.println("\nDigite valores númericos!");
			
		} catch(ArithmeticException e) {
			System.err.println("\nExceção: " + e);
			System.out.println("\nDigite numeros inteiros positivos!!");
		} finally {
			System.out.println("\nSempre serei executado!");
		}

	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
