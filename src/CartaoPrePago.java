
public class CartaoPrePago {
	String numCartao;
	String nomTitular;
	int anoValidade;
	int mesValidade;
	double saldo;
	
	
	public CartaoPrePago(String numCartao, String nomTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numCartao = numCartao;
		this.nomTitular = nomTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	
	public void adicionarCredito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean comprar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Compra efetuada com sucesso!");
			System.out.println("Saldo Atual R$" + this.saldo);
			return true;
		} 
		System.out.println ("Saldo insuficiente!");
		return false;
		
	}
	
	@Override
	public String toString() {
		return "CartaoPrePago [numCartao=" + numCartao + ", nomTitular=" + nomTitular + ", anoValidade=" + anoValidade
				+ ", mesValidade=" + mesValidade + ", saldo=" + saldo + "]";
	}

	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public String getNomTitular() {
		return nomTitular;
	}
	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}	
}
