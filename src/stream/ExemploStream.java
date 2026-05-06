package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {


		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		// Stream
		List<String> estadosEmMaiusculo = estados.stream()
			.map(x -> x.toUpperCase()) // Operação Intermediária (Processamento)
			.collect(Collectors.toList()); // Operação Terminal (Finalização)
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeDeEstados = estados.stream()
				.count();
		long quantidadeDeEstadosUnicos = estadosUnicos.stream()
				.count();
				

		System.out.println("Estados em Maiúculo: " + estadosEmMaiusculo);
		System.out.println("Estados Únicos: " + estadosUnicos);
		System.out.println("Quantidade de Estados : " + quantidadeDeEstados);
		System.out.println("Quantidade de Estados : " + quantidadeDeEstadosUnicos);
		System.out.println("Coleção/Dados Inicial: " + estados);
		
				
		
		
		
	}

}
