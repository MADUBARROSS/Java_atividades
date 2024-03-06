package exercicio0603;

import java.util.Scanner;

public class CalculadoraDeTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
				double fahrenheit,celsius;
				//Instaciar classe Scanner
				Scanner ler = new Scanner(System.in);
				
				//Entrada de dados
				System.out.println("qual a temperatura?: ");
				fahrenheit = ler.nextDouble();
				
				//Processamento
			
				celsius = ((fahrenheit-32)*5)/9;
				//Saída
				System.out.println("A temperatura em celsius é: " +celsius );
				ler.close();
	}

}
