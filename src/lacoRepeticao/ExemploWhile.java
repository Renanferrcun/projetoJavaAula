package lacoRepeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
        String continua = "s";
        int numero1, numero2, resultado;
        Scanner leia = new Scanner(System.in);
        
        while(!continua.equalsIgnoreCase("n")) {
        
        System.out.println("Digite primeiro valor: ");
        numero1 = leia.nextInt();

        System.out.println("Digite segundo valor: ");
        numero2 = leia.nextInt();

        resultado = numero1 + numero2;

        System.out.println("O resultado da soma é: " + resultado + "\n");
        
        System.out.println("Deseja continuar? (s/n)");
        continua = leia.next();      
        }
	}

}
