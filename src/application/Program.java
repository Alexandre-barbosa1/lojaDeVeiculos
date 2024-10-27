package application;

import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;
import services.Loja;

public class Program {

	public static void main(String[] args) {
		Loja loja = new Loja();
		Scanner sc = new Scanner (System.in);
		System.out.println("Loja");
		Veiculo carro = new Carro("ferrari","A4","1993",40.000,2,"eletrico");
		Veiculo moto = new Moto("honda","3A","1994",20.000,4,true);
		loja.adicionar(carro);
		loja.adicionar(moto);
		System.out.println("veiculos disponiveis");
		loja.retorno();
		System.out.println("carros disponiveis");
		loja.listCarros();
		System.out.println("motos disponiveis");
		loja.listMotos();
		
		
		
		sc.close();

	}

}
