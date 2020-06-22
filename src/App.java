import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Cadastrar Cartao!!!");
		System.out.print("Numero Cartao:");
		String numCart = input.nextLine();
		System.out.print("Nome:");
		String nome = input.nextLine();
		System.out.print("Ano Validade:");
		int anoV = input.nextInt();
		System.out.print("Mes Validade:");
		int mesV = input.nextInt();
		System.out.print("Limite de Credito:");
		double valor = input.nextDouble();
		System.out.println("");
		
		CartaoPrePago cpp = new CartaoPrePago(numCart,nome,anoV,mesV,valor);
		CartaoPrePago ccb = new CartaoCashBack("12345555", "Rodrigo Santiago", 2022, 10, 200,CartaoCashBack.GOLD);
		
		ccb.comprar(100);
		System.out.println("Cartao Cadastrado com Sucesso!");
		System.out.println(cpp.toString());
		
		System.out.println("Digite o valor da compra:");
		cpp.comprar(input.nextDouble());
		System.out.println(cpp.toString());


		/*
		System.out.println(ccb.toString());
		ccb.comprar (100);
		System.out.println(ccb.toString());
		*/
				
	}

}
