package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {

		int vetorNumeros[] = new int [3];
		Scanner leia = new Scanner(System.in);
		
		for(int indice = 0; indice < 3; indice++) {
			
			System.out.println("Digite um número: ");
			vetorNumeros[indice] = leia.nextInt();
		}
		
		for(int indice = 0; indice < 3; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorNumeros[indice]);
		}
		
		System.out.println("Tamamho do Vetor: " + vetorNumeros.length);

	}

}
