package br.com.zup.estrelas.programaPrincipal;

import java.util.Scanner;

import br.com.zup.estrelas.DAO.CarroDAO;
import br.com.zup.estrelas.POJO.Carro;

public class ProgramaPrincipal {

	public static final String MENU_PRINCIPAL = "\t|#####CADASTRO E GERENCIAMENTO DE CARROS#####|\n"
			+ "\t|--------------------------------------------|\n"
			+ "\t|                                            |\n"
			+ "\t| 1 -> INSERIR CARRO NO ESTOQUE              |\n"
			+ "\t| 2 -> CONSULTAR LISTA DE CARROS             |\n"
			+ "\t| 3 -> BUSCAR CARRO PELA COR                 |\n"
			+ "\t| 4 -> BUSCAR CARRO PELO MODELO              |\n"
			+ "\t| 5 -> BUSCAR CARRO PELO ANO DE FABRICAÇÃO   |\n"
			+ "\t| 6 -> BUSCAR CARRO PELA PLACA               |\n"
			+ "\t| 0 -> ENCERRAR O PROGRAMA                   |\n"
			+ "\t|                                            |\n"
			+ "\t|--------------------------------------------|\n";

	public static void criaCarro(Scanner teclado, Carro veiculo) {

		System.out.println("Digite a placa do veiculo");
		veiculo.setPlaca(teclado.nextLine());

		System.out.println("Digite a cor do veiculo");
		veiculo.setCor(teclado.nextLine());

		System.out.println("Digite o modelo do veiculo");
		veiculo.setModelo(teclado.nextLine());

		System.out.println("Digite a marca do veiculo");
		veiculo.setMarca(teclado.nextLine());

		System.out.println("Digite o combustivel do veiculo");
		veiculo.setCombustível(teclado.nextLine());

		System.out.println("Digite o ano de fabricação do veículo");
		veiculo.setAnoFabricacao(teclado.nextInt());

	};

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CarroDAO carro = new CarroDAO();
		Carro veiculo = new Carro();
		int opcao = 0;

		do {
			try {

				System.out.println(MENU_PRINCIPAL);

				opcao = teclado.nextInt();

				switch (opcao) {
				case 1:
					
					criaCarro(teclado, veiculo);

					carro.cadastrarCarro(veiculo);

					break;

				case 2:
					
					carro.listaTodosCarros();

					break;

				case 3:

					break;

				case 4:

					break;

				case 5:

					break;

				case 6:

					break;
					
				case 7:
					
					veiculo.setPlaca("erb0000");
					veiculo.setCor("preto");
					veiculo.setModelo("megane");
					veiculo.setMarca("renault");
					veiculo.setCombustível("flex");
					veiculo.setAnoFabricacao(2011);
					carro.cadastrarCarro(veiculo);
					break;	

				default:
					break;
				}

			} catch (Exception e) {
				System.err.println("erro ao inserir veículo");
				System.err.println(e.getMessage());
			}

		} while (opcao != 0);

		teclado.close();
	}
}
