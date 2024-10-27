package services;

import java.util.ArrayList;
import java.util.List;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Loja {
	List <Veiculo> loja = new ArrayList<>();
	
	public void adicionar(Veiculo veiculo) {
		loja.add(veiculo);
	}
	

	public void retorno() {
		for (Veiculo list: loja) {
			System.out.println(list.exibirInformações());
			
			
	}
	
	}
	public void listCarros() {
		for (Veiculo list:loja) {
			if(list instanceof Carro) {
				System.out.println(list.exibirInformações());
				
			}
		}
		
	}
	public void listMotos() {
		for (Veiculo list:loja) {
			if(list instanceof Moto) {
				System.out.println(list.exibirInformações());
				
			}
		}
		
	}
	

}
