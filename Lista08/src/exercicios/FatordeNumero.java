package exercicios;

import java.util.Scanner;

public class FatordeNumero {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Digite um número: ");
		    int numero = sc.nextInt();
		    int fator = 1;
		    while (numero > 1) {
		      fator *= numero;
		      numero--;
		    }
		    System.out.println("O fatorial é " + fator);
		    sc.close();

	}

}
