package exerciciosjava;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		
		int diaria = 40;
		double taxa = 0;
		int dias = 0;
		int x = 0;
		double conta = 0;
		String nome;
		double total = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(x<3) {
		
			System.out.println("Digite seu nome: ");
			nome = sc.next();
			System.out.println("Quantos dias você ficou hospedado(a) ?");
			dias = sc.nextInt();
			System.out.println(nome);
			
		if(dias<10) {
			taxa = 15;
			conta = (diaria + taxa) * dias;
			System.out.println("O total de sua conta foi: " + conta);
		}
		
		if(dias>=10) {
			taxa = 8;
			conta = (diaria+taxa)*dias;
			System.out.println("O total de sua conta foi: " + conta);
		}
		x++;
		total = total +conta;
		
		}
		
		System.out.println("O total arrecadado foi: " + total);
		sc.close();
	}
		
}
