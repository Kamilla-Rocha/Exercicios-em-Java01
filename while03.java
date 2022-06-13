package laçosderepetição;

import java.util.Scanner;

public class while03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
	int idade;
	int menor21=0;
	int maior50=0;		
	System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		
		while(idade !=-99) {
			
			if(idade<21 && idade>=0) {
			  menor21++;
				
			}
			
			else if (idade > 50) {
				maior50++;
			}	
				
			
			System.out.println("Total de pessooas menores de 21 é:"+menor21+"E total acima de 50 é: "+maior50 + " ,");
				
			}
		}
		
		
		
	}


