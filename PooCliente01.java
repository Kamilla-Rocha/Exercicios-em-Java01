package ExerciosDePoo;

public class PooCliente01 {
	
	private String nome;
	private String escolaridade;
	private String profissão;
	
	public PooCliente01 (String nome,String escolaridade,String profissão)
	{
		this.nome = nome;
		this.escolaridade = escolaridade;
		this.profissão = profissão;
		
		
	}
	
	public String getnome() {
		
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getescolaridade() {
		return escolaridade;
	}
	
	public void setescolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
		
	}
	
			public String getprofissão() {
				return profissão;		
	}
			public void setprofissão(String profissão) {
				this.profissão = profissão;
			}
			
			public void imprimir  () {
				System.out.println("Nome:"+nome+"\nQual a sua escolaridade"+escolaridade+"\n Qual é a sua profissão:"+profissão);
			
			
			
			
			}
			
	
	
	

}
