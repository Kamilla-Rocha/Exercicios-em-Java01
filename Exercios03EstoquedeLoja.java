package Exercios03TrabalhandoComEstoqueDeLoja;

import java.util.ArrayList;
import java.util.Collection;

public class Exercios03EstoquedeLoja {

	public static void main(String[] args) {
		

		Collection<String> estoque = new ArrayList();
		
		estoque.add("calça:");
		estoque.add("camiseta:");
		estoque.add("saia:");
		estoque.add("jaqueta:");
		estoque.add("vestido");
		
		System.out.println("estoque:"  +estoque);
		
		estoque.remove("jaqueta");
		estoque.remove("vestido");
		System.out.println("\nestoque: ");
		
	
	for(String itens: estoque) {
		
	
			System.out.println(itens);
			
	}

			estoque.clear();
		}
	
	}
	