
public class CartaoCashBack extends CartaoPrePago {
	int tipo;
	
	public CartaoCashBack(String numCartao, String nomTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numCartao, nomTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if (valor <= this.saldo) {
			if (this.tipo == 1) {
				this.saldo = this.saldo - valor;
				this.saldo = this.saldo + (valor * 2/100);
				System.out.println("Compra efetuada com sucesso!");
				System.out.println("Cartão Bronze! Você recebeu 2% de cash back!");
				System.out.println("Saldo Atual R$" + this.saldo);
				return true;
			} else if (this.tipo == 2){
				this.saldo = this.saldo - valor;
				this.saldo = this.saldo + (valor * 5/100);
				System.out.println("Compra efetuada com sucesso!");
				System.out.println("Cartao Silver! Você recebeu 5% de cash back!");
				System.out.println("Saldo Atual R$" + this.saldo);
				return true;
			} else if (this.tipo == 3) {
				this.saldo = this.saldo - valor;
				this.saldo = this.saldo + (valor * 8/100);
				System.out.println("Compra efetuada com sucesso!");
				System.out.println("Cartao Gold! Você recebeu 8% de cash back!");
				System.out.println("Saldo Atual R$" + this.saldo);
				return true;
			}
		}
		System.out.println ("Saldo insuficiente!");
		return false;
	}

	@Override
	public String toString() {
		return "CartaoCashBack [tipo=" + tipo + ", numCartao=" + numCartao + ", nomTitular=" + nomTitular
				+ ", anoValidade=" + anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + "]";
	}

}
