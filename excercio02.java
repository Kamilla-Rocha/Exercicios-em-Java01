package excerciosJava;

import java.util.Scanner;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class excercio02 {
	
	  public static void main(String[] args) {
		  
		  
		  
		  Scanner input = new Scanner(System.in);
		  
		  int numero1,numero2,numero3;
		  
		  System.out.println("Digite o primeiro numero: \n");
		    numero1 = input.nextInt();
		    
		      System.out.println("Digite o segundo numero: \n");
		      numero2 = input.nextInt();
		      
		      System.out.println("Digite o terceiro numero: \n");
		      numero3 = input.nextInt();
		      
		      if(numero1 < numero2) { 
		    	  if(numero2 < numero3) {
		    		  System.out.println(numero1+ "-" + numero2 + "-" + numero3);
		    	  }
		    	  
		      }
		  
	  }

}
