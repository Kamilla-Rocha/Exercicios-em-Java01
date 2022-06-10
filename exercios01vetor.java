package exercios01deVetor;

import java.util.Scanner;

public class exercios01vetor {

	public static void main(String[] args) {
		
		int [] pontuação = new int [5];
		int maior;
	
			
		
		pontuação = new int [5];
		maior = 0;
		
		for(int i = maior; i <  4; i ++) {
		
			System.out.println("Informe um numero:" + " ");
			pontuação[i] = new Scanner (System.in).nextInt();
			
			if( pontuação [i] > maior) {
				maior=pontuação [i];
			}
			
			System.out.println("o maior valor é: " + maior);
			System.out.println(" ");
					
			
		}
	
		

	}

}
