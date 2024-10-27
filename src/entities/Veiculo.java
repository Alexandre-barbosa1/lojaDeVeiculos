package entities;

public abstract class Veiculo {
	private String marca;
	private String modelo;
	private String anoFabricacao;
	private Double preco;

	public Veiculo() {

	}

	public Veiculo(String marca, String modelo, String anoFabricacao, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String exibirInformações() {
		return marca + " " + modelo + " " + anoFabricacao + " " + preco;
	}

}
