package exerciciosjava;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		
		int refrigerante = 6;
		double gasolina;
		double conta;
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos litros você usou para encher ?");
		gasolina = sc.nextDouble();
		conta = 2.50 * gasolina;
		resultado = conta + refrigerante;
		System.out.println("O total de sua compra foi: " + resultado);
		
		
		
		
		
		refrigerante = sc.nextInt();
		
		
		
		
		
		
	}

}
