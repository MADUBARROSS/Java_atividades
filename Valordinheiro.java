package exercicio0603;

import java.util.Scanner;

public class Valordinheiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dollar, real;
		//Instaciar classe Scanner
				Scanner ler = new Scanner(System.in);
				
				//Entrada de dados
				System.out.println("quantos reais você tem: ");
				real = ler.nextDouble();
				
				//Processamento
				dollar = real/4.94;
				
				//Saída
				System.out.println("o valor do dollar é " +dollar);
				ler.close();

	}

}
