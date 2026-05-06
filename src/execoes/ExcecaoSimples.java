package execoes;

public class ExcecaoSimples extends Exception {
	
	// Atributo
	private static final long serialVersionUID = 1L;
	
	public ExcecaoSimples () {}
	
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}
	
	
}
