package entities;

public class Moto  extends Veiculo{
	private Integer cilindradas;
	private Boolean partida;
	
	public Moto() {
		
	}

	public Moto(String marca, String modelo, String anoFabricacao, Double preco, Integer cilindradas, Boolean partida) {
		super(marca, modelo, anoFabricacao, preco);
		this.cilindradas = cilindradas;
		this.partida = partida;
	}

	public Integer getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}

	public Boolean getPartida() {
		return partida;
	}

	public void setPartida(Boolean partida) {
		this.partida = partida;
	}
	@Override
	public String exibirInformações() {
		return getMarca() + " " + getModelo() + " " + getAnoFabricacao() + " " + getPreco() + " " + cilindradas + " "
				+ partida;
	}
	
	

}
