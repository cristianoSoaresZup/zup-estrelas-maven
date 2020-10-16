package br.com.zup.estrelas.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carro {
	
	@Id
	private String placa;
	
	@Column(nullable = false)
	private String cor;
	private String modelo;
	private String marca;
	private String combustivel;
	private int anoFabricacao;
	
	@Column(name = "vel_max")
	private float velMax;
	private float peso;
	
	public Carro() {
	}

	public Carro(String placa, String cor, String modelo, String marca, String combustivel, int anoFabricacao,
			float velMax, float peso) {
		super();
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
		this.combustivel = combustivel;
		this.anoFabricacao = anoFabricacao;
		this.velMax = velMax;
		this.peso = peso;
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

	public String getCombustível() {
		return combustivel;
	}

	public void setCombustível(String combustível) {
		this.combustivel = combustível;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public float getVelMax() {
		return velMax;
	}

	public void setVelMax(float velMax) {
		this.velMax = velMax;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	

}
