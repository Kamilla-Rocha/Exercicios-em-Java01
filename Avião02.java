package ExerciosDePoo;

public class Avião02 {

	
	private String partida;
	private String destino;
	private String modelo;
	
	public Avião02(String partida, String destino, String modelo)
	{
		this.partida = partida;
		this.destino = destino;
		this.modelo =  modelo;
		
	}
	
	public String getPartida() {
		return partida;
		
		
	}
	
	public void setPartida (String partida) {
		this.partida = partida;
	}
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getModelo () {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void imprimir ()
	{
		
		System.out.println("A partida do voo será de: "+partida+"\n"+"seu destino é:"+destino+"\n Modelo do avião"+"modelo");
		
	}
	
	
	
}
