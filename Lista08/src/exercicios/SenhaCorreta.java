package exercicios;

import java.util.Scanner;

public class SenhaCorreta {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    String senhaCorreta = "senha123"; 
		    while (true) {
		      System.out.print("Digite a senha: ");
		      String senha = sc.next();
		      if (senha.equals(senhaCorreta)) {
		        System.out.println("Senha correta! Acesso concedido.");
		        break;
		      } else {
		        System.out.println("Senha incorreta. Tente novamente.");
		      }
		    }
		    sc.close();

	}

}
