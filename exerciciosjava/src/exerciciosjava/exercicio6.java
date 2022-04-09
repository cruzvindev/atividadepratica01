package exerciciosjava;
import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		
		int reprovados = 0;
        int exame = 0;
        int aprovados = 0;
        Scanner sc = new Scanner(System.in);
        for (int x=0;x<6;x++){

            System.out.println("Insira sua nota 1:");
            double nota1 = sc.nextDouble();
            System.out.println("Insira sua nota2: ");
            double nota2 = sc.nextDouble();
            double media = (nota1+nota2)/2;
            System.out.println("Sua média é: " + media);

            if (media < 3.0){
                System.out.println("Reprovado");
                reprovados++;

            }
            if (media>= 3 && media <7){
                System.out.println("Exame");
                exame++;
            }

            if (media>= 7){
                System.out.println("Aprovado");
                aprovados++;
            }


        }
		
		
		
		
	}

}
