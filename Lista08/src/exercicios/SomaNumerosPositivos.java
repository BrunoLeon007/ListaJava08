package exercicios;

import java.util.Scanner;

public class SomaNumerosPositivos {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		    int soma = 0;
		    while (true) {
		      System.out.print("Digite um número: ");
		      int numero = sc.nextInt();
		      if (numero < 0) {
		        break;
		      }
		      soma += numero;
		    }
		    System.out.println("A soma é " + soma);
		    sc.close();

	}

}
