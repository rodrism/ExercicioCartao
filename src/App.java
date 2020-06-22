import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CartaoPrePago cpp = new CartaoPrePago("1234567890", "Rodrigo Santiago", 2022, 05, 200);
		CartaoPrePago ccb = new CartaoCashBack("12345555", "Rodrigo Santiago", 2022, 10, 200,2);
		
		
		
		/*
		cartao.adicionarCredito(1000);
		cartao.comprar(15000);
		System.out.println(cartao.getSaldo());
		*/
		
		//cartao2.adicionarCredito(1000);
		
		System.out.println(ccb.toString());
		ccb.comprar (100);
		System.out.println(ccb.toString());
		
				
	}

}
