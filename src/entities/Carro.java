package entities;

public class Carro extends Veiculo {
	private Integer numPorta;
	private String compustivel;

	public Carro() {
		super();
	}

	public Carro(String marca, String modelo, String anoFabricacao, Double preco, Integer numPorta,
			String compustivel) {
		super(marca, modelo, anoFabricacao, preco);
		this.numPorta = numPorta;
		this.compustivel = compustivel;
	}

	public Integer getNumPorta() {
		return numPorta;
	}

	public void setNumPorta(Integer numPorta) {
		this.numPorta = numPorta;
	}

	public String getCompustivel() {
		return compustivel;
	}

	public void setCompustivel(String compustivel) {
		this.compustivel = compustivel;
	}

	@Override
	public String exibirInformações() {
		return getMarca() + " " + getModelo() + " " + getAnoFabricacao() + " " + getPreco() + " " + numPorta + " "
				+ compustivel;
	}

	
}
