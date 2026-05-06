package execoes;

import java.util.Scanner;

public class Exemplo22 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		try {
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			validarIdade(idade);
		} catch (IllegalArgumentException e) {
			System.err.println("\nExceção: " + e);
			System.out.println(e.getMessage());
		}
		
	}

	public static void validarIdade(int idade){
		
		if (idade < 18)
			throw new IllegalArgumentException("A pessoa não pode dirigir!!");
		else
			System.out.println("A pessoa pode dirigir!!");
}
}