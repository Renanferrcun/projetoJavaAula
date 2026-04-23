package lacoRepeticao;
 
import java.util.Scanner;
 
public class ExemploFor {
 
	public static void main(String[] args) {
		
		 String nome;
		 int i;
	        Scanner leia = new Scanner(System.in);
	        
	        for (i = 1; i < 4; i++) {
	        System.out.println("Digite o " + i + "º nome: ");
	        nome = leia.nextLine();
	        System.out.println("O " + i + "º nome é: " + nome + "\n");
	        
	        }
 
	}
 
}