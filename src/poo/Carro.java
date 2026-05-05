package poo;

public class Carro {
	
	// Atributos	
	private String modelo;
	private int rodas;
	private int portas;
	private String modelo_motor;
	
	// Método Construtor
	/*public Carro(String modelo, int rodas, int portas, String modelo_motor) {
		this.modelo = modelo;	// This => Classe
		this.rodas = rodas;		// Carro.rodas = Parametro rodas
		this.portas = portas;
		this.modelo_motor = modelo_motor;
	}*/
	public Carro(String modelo, int rodas, int portas, String modelo_motor) {
		super();
		this.modelo = modelo;
		this.rodas = rodas;
		this.portas = portas;
		this.modelo_motor = modelo_motor;
	}
	
	
	//Métodos de Acesso/Especiais - (Get - Pega / Set - Coloca)
	public String getModelo() {
		return modelo;
	}
	public void setModelo( String marca) {
		this.modelo = marca; // (This) Essa Classe
		// Carro.marca = parametro marca
	}
	
	
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}

	
	public String getModelo_motor() {
		return modelo_motor;
	}
	public void setModelo_motor(String modelo_motor) {
		this.modelo_motor = modelo_motor;
	}

	
	// Métodos
	public void locomover() {
		System.out.println("Estou locomovendo");
	}
	
	public String parar() {
		return "Estou parado";
	}

}