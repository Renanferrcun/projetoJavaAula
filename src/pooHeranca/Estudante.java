package pooHeranca;

public class Estudante extends Pessoa{	// Classse Filha ou Derivada de Pessoa

	private String matricula;
	private String curso;

	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email);	// super => Método Construtor da Classe Mãe
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
