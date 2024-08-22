/******************************************************************************
VERSÃO 1 OPERANTE
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    String calc[] = new String[3];
	    int num = 0;
	    int num2 = 0;
	    int resul = 0;
	    
		System.out.println("CALCULADORA");
		System.out.println("-----------------------------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("DIGITE A OPERAÇÃO: ");
		for(int i = 0; i < 3; i++){
		    
		    calc[i] = scanner.nextLine();
		    
		}
		
		if (calc[1] = "+"){
		    resul = calc[0]+calc[2];
		}
		
	

		System.out.println("-----------------------------");
		System.out.println("RESULTADO: "+resul);
		
	}
}