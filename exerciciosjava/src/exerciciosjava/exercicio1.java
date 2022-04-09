package exerciciosjava;
import java.util.Scanner;
import java.util.Locale;
public class exercicio1 {
	

	    public static void main(String[] args) {
	       
	        Locale.setDefault(Locale.US);
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("SEJA BEM-VINDO(A)");
	        System.out.print("Insira os seus créditos galácticos: ");
	        double creditos = scan.nextDouble();

	        System.out.print("Insira o percentual de aumento: ");
	        double aumento = scan.nextDouble();

	        double aumentoCalc = (aumento / 100) + 1;
	        double creditosCalc = creditos * aumentoCalc;
	        
	        System.out.println("\n* NOVO VALOR *");
	        System.out.printf("Aumento percentual: %.1f\n", aumento);
	        System.out.printf("Valor acrescido: %.1f\n", (creditosCalc - creditos));
	        System.out.printf("Créditos com aumento: %.1f\n", creditosCalc);
	        
	        scan.close();
	    }
	}

