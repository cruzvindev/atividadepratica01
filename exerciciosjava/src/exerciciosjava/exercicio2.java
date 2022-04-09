package exerciciosjava;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		
		 int contador = 0;
	        int numero;

	        Scanner sc = new Scanner(System.in);

	        while(contador<10){
	            System.out.println("Digite um numero: ");
	            numero = sc.nextInt();
	            if(numero%2==1){
	                System.out.println("Esse numero é impar");
	            } else {
	                System.out.println("Esse numero é par");
	            }
	                contador = contador + 1;
	    }
		
		
		
		
		

	}

}
