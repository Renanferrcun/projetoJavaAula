package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {

		// Pessoa p = new Pessoa("Maria", 18); // Classes abstratas não podem ser instânciadas
		TriAtleta t = new TriAtleta("Eliane", 26, 400);
		
		TriAtleta t2 = new TriAtleta("Joâo", 998, 0);
		t2.competicoesConcluidas();		
		t2.competicoesConcluidas(2);
		
		
		System.out.println(t.getNome());
		
		// p.visualizar();
		t.visualizar();

	}

}