
public class App {

	public static void main(String[] args) {
		
		CartaoPrePago cartao = new CartaoPrePago("1234567890", "Rodrigo Santiago", 2022, 05, 200);
		CartaoPrePago cartao2 = new CartaoCashBack("12345555", "Rodrigo Santiago", 2022, 10, 200,2);
		
		
		/*
		cartao.adicionarCredito(1000);
		cartao.comprar(15000);
		System.out.println(cartao.getSaldo());
		*/
		
		//cartao2.adicionarCredito(1000);
		cartao2.comprar(300);
		cartao.comprar (300);
		
		System.out.println(cartao2.getNomTitular());
		
	}

}
