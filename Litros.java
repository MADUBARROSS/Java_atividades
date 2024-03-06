package exercicio0603;

import java.util.Scanner;

public class Litros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		double litro,distancia,consumo, total, combust;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("qual o valor do litro de gasolina: ");
		litro = ler.nextDouble();
		System.out.println("qual a distancia percorrida em km: ");
		distancia = ler.nextDouble();
		System.out.println("qual foi seu consumo medio em km: ");
		consumo = ler.nextDouble();
		//Processamento
	
		total = distancia/consumo;
		combust = total*litro;
		//Saída
		System.out.println("A quantidade de litros gastos no trajeto é: " +total+ "e o custo total com combustivel é: " +combust );
		ler.close();
	}

}
