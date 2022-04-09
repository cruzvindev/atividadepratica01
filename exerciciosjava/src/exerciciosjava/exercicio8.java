package exerciciosjava;
import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int contPacientes = 0;
		int somaHomens = 0;
		int contHomens = 0;
		int contMulheres = 0;
		int quantNovos = 0;
		String velho = "";
		String baixa = "";
		double maisVelho = 0;
		double maisBaixa = 0;
		
		String nome = "";
		while((nome.equals("FIM")) == false) {
			System.out.println("INSIRA OS DADOS DO PACIENTE");
			
			System.out.print("Insira o nome: ");
			nome = scan.next().toUpperCase();
			
			if((nome.equals("FIM")) == false) {
				contPacientes++;
				
				System.out.print("Insia o sexo [M/F]: ");
				char sexo = scan.next().toUpperCase().charAt(0);
				
				System.out.print("Insira o peso: ");
				double peso = scan.nextDouble();
				
				System.out.print("Insira a idade: ");
				int idade = scan.nextInt();
				
				System.out.print("Insira a altura: ");
				double altura = scan.nextDouble();
				
				if(sexo == 'M') {
					somaHomens += idade;
					contHomens++;
					if(idade > maisVelho) {
						maisVelho = idade;
						velho = nome;
					}
				}
				if((sexo == 'F') && ((altura >= 1.60) && (altura <= 1.70)) && (peso > 70)) {
					contMulheres++;
				}
				if((idade >= 18) && (idade <= 25)) {
					quantNovos++;
				}
				if((sexo == 'F') && (maisBaixa == 0)) {
					maisBaixa = altura;
					baixa = nome;
				}else {
					if(altura < maisBaixa) {
						maisBaixa = altura;
						baixa = nome;
					}
				}
			}
			System.out.println("---------------------------------------");
		}
		System.out.println("Quantidade de pacientes: " + contPacientes);
		double mediaHomens = (somaHomens/contHomens);
		System.out.println("Média de idade dos homens: " + mediaHomens);
		System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " +contMulheres);
		System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantNovos);
		System.out.println("Nome do paciente mais velho: " + velho);
		System.out.println("Nome da mulher mais baixa: " + baixa);
		
		scan.close();
	}
}
