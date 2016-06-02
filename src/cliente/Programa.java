package cliente;

import java.util.List;
import java.util.Scanner;

public class Programa {

	private static Scanner leia;

	public static void main(String[] args) {
	
		Cep cep = new CepService().getCepPort();
		System.out.println("Digite o CEP que deseja consultar :");
		leia = new Scanner(System.in);
		
		List<String> resposta = cep.consultaCep(leia.nextLine());
		
		System.out.println(" ");
		System.out.println(resposta.toString());

	}

}
