package application;

import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;
import services.Loja;

public class Program {

	public static void main(String[] args) {
		Loja loja = new Loja();
		Veiculo carro = null;
		Veiculo moto = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Loja");
		System.out.print("quantos veiculos deseja adicionar?");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("adicione a marca do veiculo:  ");
			String marca = sc.nextLine();
			System.out.print("aidicione o modelo do veiculo: ");
			String modelo = sc.nextLine();
			System.out.print("adicione o ano de  fabricação: ");
			String anoFabri = sc.nextLine();
			System.out.print("adicione o preço do veiculo: ");
			double preco = sc.nextDouble();
			System.out.println("o seu veiculo é um carro ou uma moto? ");
			sc.nextLine();
			String r = sc.nextLine();
			r = r.toLowerCase();
			if (r.equals("carro")) {
				System.out.println("adicione o numero de portas do carro: ");
				Integer num = sc.nextInt();
				System.out.println("qual o tipo de compustivel? ");
				sc.nextLine();
				String combustivel = sc.next();
				carro = new Carro(marca, modelo, anoFabri, preco, num, combustivel);
				loja.adicionar(carro);
			} else {
				System.out.println("Adicione o numero de cilindradas: ");
				Integer cilin = sc.nextInt();
				moto = new Moto(marca, modelo, anoFabri, preco, cilin, true);
				loja.adicionar(moto);

			}
			sc.nextLine();
		}

		System.out.println("veiculos disponiveis: ");
		loja.retorno();
		System.out.println();
		System.out.println("carros disponiveis: ");
		loja.listCarros();
		System.out.println();
		System.out.println("motos disponiveis: ");
		loja.listMotos();

		sc.close();

	}

}
