package exercicio0603;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base, altura, area;
		//Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("qual a base do triangulo: ");
		base = ler.nextDouble();
		
		System.out.println("qual a altur do triangulo: ");
		altura = ler.nextDouble();
		
		//Processamento
		area = (base*altura)/2;
		
		//Saída
		System.out.println("a area do triangulo é: " +area);
		ler.close();
	}

}
