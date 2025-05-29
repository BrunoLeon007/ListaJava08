package exercicios;

import java.util.Scanner;

public class ContagemRegressiva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um numero para que a contagem regressiva se inicie:");
		
		int numero = sc.nextInt();
		
		
		for(int regressiva = numero; numero >= regressiva; numero --);
		
		System.out.println(numero);
		
		System.out.println("Contagem finalizada");
		
		
sc.close();

	}

}
