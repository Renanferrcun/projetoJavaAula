package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		
		//Variáveis
		float celsius, fahrenheit;
		Scanner leia = new Scanner(System.in);
		
		//Entrada de Dados
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextFloat(); // utilizar "," para número flutuante
		
		//Processamento de Dados
		fahrenheit = celsius * 1.8f + 32;
		
		//Saída de Dados
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		
		
		
		
	}

}
