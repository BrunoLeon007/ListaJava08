package exercicios;

import java.util.Scanner;

public class MediadeNotas {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    double soma = 0;
		    int count = 0;
		    while (true) {
		      System.out.print("Digite uma nota (0 entre 10): ");
		      double nota = sc.nextDouble();
		      if (nota < 0 || nota > 10) {
		        break;
		      }
		      soma += nota;
		      count++;
		    }
		    double media = soma / count;
		    System.out.println("A média é " + media);
		    sc.close();

	}

}
