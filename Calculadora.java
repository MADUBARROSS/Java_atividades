package exercicio0603;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
				double a,b,soma,divisao,multi,sub;
				//Instaciar classe Scanner
				Scanner ler = new Scanner(System.in);
				
				//Entrada de dados
				System.out.println("Qual o primeiro valor: ");
				a = ler.nextDouble();
				
				System.out.println("qual o segundo valor: ");
				b = ler.nextDouble();
				
				//Processamento
				soma = a+b;
				divisao = a-b;
				multi = a*b;
				sub = a/b;
				
				//Saída
				System.out.println("os valores são: " + soma +divisao +multi +sub);
				ler.close();
	}

}
