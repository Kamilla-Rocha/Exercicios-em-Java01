package excerciosJava;

import java.util.Scanner;

public class lista02 {

	public static void main (String[]args) {
		
		//Criar o Scanner para obter dados atraves da janela de comando
		
		Scanner input = new Scanner(System.in);
		
		int numero1,numero2,numero3,local;
		
		System.out.println("Digite o primeiro numero: \n");
			numero1 = input.nextInt();
			
			System.out.println("Digite o primeiro: \n");
			numero1= input.nextInt();
			
			System.out.println("Digite o segundo: \n");
			numero2= input.nextInt();
			
			System.out.println("Digite o terceiro numero: \n");
			numero3 = input.nextInt();
			
			if (numero1 > numero2 && numero1 > numero3) {
				local = numero1;
			}
			else {
				local = numero2;
			}
			if(local > numero3) {
			System.out.printf("O numero maior é: %d", numero3);
			
		
			}
			else {
				System.out.printf("O maior é: %d,",numero3);
			
			
			
			
			}
				
			
		
	}

	
	
	
	
	
	 
}
