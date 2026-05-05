package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista {

	int competicoes;

	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}

	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}

	public void competicoesConcluidas() {
		System.out.println("Competições Concluídas: " + this.competicoes);
	}

	// Polimorfismo de Sobrecarga (Sobrecarga de Métodos)
	public void competicoesConcluidas(int numero) {
		System.out.println("Competicoes concluidas: " + numero);
	}

	// Polimorfismo de Sobrescrita (Sobrescrita de Método)
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições: " + this.competicoes);
	}

	// Merodos Implementados das Interfaces
	public void pedalar() {

		System.out.println("Estou pdalando...");
	}
	
	@Override // Anotação - Etiqueta de Dados/Info
	public void aquecer () {
		System.out.println("Estou aquecendo...");
	}

}