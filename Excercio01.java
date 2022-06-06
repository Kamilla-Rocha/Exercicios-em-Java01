package excerciosJava;

   import java.util.Scanner;
public class Excercio01 {
	  
	int anos, meses,dias;
	int idadeEmDias;
	Scanner leitor = new Scanner (System.in)

	
	System.out.println("Digite a idade em anos:");
	anos = leitor. nextInt();
	
	System.out.println("Digite a idade em meses:");
	meses = leitor.nextInt();
	System.out.println("Digite a idade em dias:");
	dias = leitor.nextInt();
	
	
	
	idadeEmdias = anos * 365 +meses * 30 + dias;
	System.out.println("Idade em dias:" + idadeEmDias);
     
		}

}
