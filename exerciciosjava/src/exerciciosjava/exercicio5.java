package exerciciosjava;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
        float salarioBruto;
        float valorPrestacao;
        float valorMaximo;

        System.out.println("Informe o salário ");
        salarioBruto = leitor.nextFloat();
        System.out.println("informe o valor da prestacao");
        valorPrestacao = leitor.nextFloat();

        valorMaximo = salarioBruto * 0.3f;

        if(valorPrestacao>valorMaximo){
            System.out.println("Emprestimo negado");
        } else{
            System.out.println("Emprestimo liberado");
		
		
		
		
		

	}

	}
}
