package excercios01;

public class Animais {
	
	private String nome;
	private String EmitirSom;
	private int idade;
	
	public Animais (String nome,String EmitirSom, int idade) {
		
		this.nome = nome;
		this.EmitirSom = EmitirSom;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmitirSom() {
		return EmitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		EmitirSom = emitirSom;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	

}
