package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Instanciamento | Instanciar um objeto
		Carro c1 = new Carro("Kombi", 4, 4, "Modelo XYZ");
		Carro c2 = new Carro("Honda Civic", 2, 4, "ModeloABC");
		
		//c1.modelo = "Kombi";
		//c1.portas = 4;
		
		/*
		c1.setModelo("Kombi");
		c1.setPortas(4);
		c1.locomover();
		*/
		
		c1.locomover();
		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Qtd. Portas: " + c1.getPortas());
		System.out.println("Qtd. Rodas: " + c1.getRodas());
		System.out.println("Motor: " + c1.getModelo_motor());
		System.out.println((c1.parar()));
		System.out.println();
		
		c2.locomover();
		System.out.println("Modelo: " + c2.getModelo());
		System.out.println("Qtd. Portas: " + c2.getPortas());
		System.out.println("Qtd. Rodas: " + c2.getRodas());
		System.out.println("Motor: " + c2.getModelo_motor());
		System.out.println((c2.parar()));
		System.out.println();
	}

}
