package br.com.zup.estrelas.POJO;

public class CarroPOJO {

	private String placa;
	private String cor;
	private String modelo;
	private String marca;
	private String combust�vel;
	private int anoFabricacao;
	
	public CarroPOJO() {
	}

	public CarroPOJO(String placa, String cor, String modelo, String marca, String combustivel, int anoFabricacao) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
		this.combust�vel = combust�vel;
		this.anoFabricacao = anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCombust�vel() {
		return combust�vel;
	}

	public void setCombust�vel(String combust�vel) {
		this.combust�vel = combust�vel;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public String toString() {
		return "CarroPOJO [placa=" + placa + ", cor=" + cor + ", modelo=" + modelo + ", marca=" + marca
				+ ", combust�vel=" + combust�vel + ", anoFabricacao=" + anoFabricacao + "]";
	}

}
