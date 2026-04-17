package entradaSaida;

import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {
		
		//Declaração de Variáveis
		Scanner leia = new Scanner(System.in);
		String nome;
		
		// Entrad de Dados
		System.out.println("Digite seu nome: ");
		
		//Processamento
		nome = leia.nextLine();
		
		//Saída dde Dados
		System.out.println("Bom dia, " + nome);
		
		
	}

}
