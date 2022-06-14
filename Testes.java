package excercios01;

public class Testes {

	public static void main(String[] args) {
		
		Cachorro cahorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		preguica preguica = new preguica();
		
		Cachorro.setEmitirSom("Au au");
		Cachorro.setnome("Lebron");
		Cachorro.setidade(2);
		Cavalo.setEmitirSom("riiii");
		Cavalo.setnome ("jubileu");
		Cavalo.setidade(9);
		preguica.setEmitirSom("aaaaa");
		preguica.setnome("jurema");
		preguica.setidade("6");
		
		System.out.println("O nome do cachorro é:"+cachorro.getnome()+"\n idade do cachorro é: "+cachorro.getidade()+
				"\n comportamento do cachorro é: "+cachorro.getEmitirSom());
		
		System.out.println("O nome do cavalo é:"+cavalo.getnome()+"\n idade do cavalo é: "+cavalo.getidade()+
				"\n comportamento do cavalo é: "+cavalo.getComportamento());
		
		System.out.println("O nome dopreguicaé:"+preguica.getnome()+"\n idade do cachorro é: "+cachorro.getidade()+
				"\n comportamento do cachorro é: "+cachorro.getEmitirSom());
		
		
				
		
		
		
	 
		
	
	}
}
