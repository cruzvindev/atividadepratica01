package exerciciosjava;
import java.util.Scanner;


public class exercicio3 {

	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String nome = "";

        while(nome.equals("FIM")== false){

            System.out.println("Insira seu nome: ");
            nome = sc.next().toUpperCase();

            if(nome.equals("FIM") == false) {
                System.out.print("Insira seu Salario: ");
                double salario = sc.nextDouble();
                if(salario < 500) {
                    double novoSalario = salario * 1.2;
                    System.out.println("Parab�ns, voc� tem direito ao aumento !");
                    System.out.printf("Novo salario: %.2f\n", novoSalario);
                }else {
                    System.out.println("Desculpe, voc� n�o possui direito ao aumento.");
                }
            }

        }

        sc.close();


        }




    }





