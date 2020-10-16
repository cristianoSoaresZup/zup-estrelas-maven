package br.com.zup.estrelas.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.zup.estrelas.POJO.Carro;
import br.com.zup.estrelas.connectionFactory.ConnectionFactory;

public class CarroDAO {
	private Connection connection;

	public CarroDAO() {
		new ConnectionFactory();
		this.connection = ConnectionFactory.conexao();
	}

	public boolean cadastrarCarro(Carro carro) throws SQLException {
		String sql = "INSERT INTO estoque.carros" + "(placa, cor, modelo, marca, combustivel, ano_fabricacao)"
				+ "VALUES" + "(?, ?, ?, ?, ?, ?)";
		PreparedStatement inserindoNovoCarro = connection.prepareStatement(sql);

		inserindoNovoCarro.setString(1, carro.getPlaca());
		inserindoNovoCarro.setString(2, carro.getCor());
		inserindoNovoCarro.setString(3, carro.getModelo());
		inserindoNovoCarro.setString(4, carro.getMarca());
		inserindoNovoCarro.setString(5, carro.getCombustível());
		inserindoNovoCarro.setInt(6, carro.getAnoFabricacao());

		inserindoNovoCarro.execute();
		inserindoNovoCarro.close();

		System.out.println("Carro adicionado a lista com sucesso");

		return true;
	}

	public static void whilePadraoBusca(ResultSet rs, List<Carro> carros) throws SQLException {

		while (rs.next()) {

			Carro carroPesquisado = new Carro();

			carroPesquisado.setPlaca(rs.getString("placa"));
			carroPesquisado.setCor(rs.getString("cor"));
			carroPesquisado.setModelo(rs.getString("modelo"));
			carroPesquisado.setMarca(rs.getString("marca"));
			carroPesquisado.setCombustível(rs.getString("combustivel"));
			carroPesquisado.setAnoFabricacao(rs.getInt("ano_fabricacao"));

			carros.add(carroPesquisado);
		}
	}

	public Carro consultaCarroPelaPlaca(String placa) {

		Carro carro = new Carro();

		String sql = "SELECT c.* FROM estoque.carros c WHERE ?";

		try {
			PreparedStatement pesquisa = connection.prepareStatement(sql);

			pesquisa.setString(1, placa);

			ResultSet rs = pesquisa.executeQuery();

			while (rs.next()) {
				Carro carroPesquisado = new Carro();

				carroPesquisado.setPlaca(rs.getString("placa"));
				carroPesquisado.setCor(rs.getString("cor"));
				carroPesquisado.setModelo(rs.getString("modelo"));
				carroPesquisado.setMarca(rs.getString("marca"));
				carroPesquisado.setCombustível(rs.getString("combustivel"));
				carroPesquisado.setAnoFabricacao(rs.getInt("ano_fabricacao"));

				carro = carroPesquisado;
			}
		} catch (Exception e) {
			System.err.println("Erro ao consultar pela placa do carro");
			System.err.println(e.getMessage());
		}

		return carro;
	};

	public List<Carro> listaTodosCarros() {

		List<Carro> carros = new ArrayList<>();

		String sql = "SELECT * FROM estoque.carros ";

		try {
			PreparedStatement consulta = connection.prepareStatement(sql);
			
			ResultSet rs = consulta.executeQuery();

			whilePadraoBusca(rs, carros);
			consulta.close();

		} catch (Exception e) {
			System.err.println("Erro ao pesquisar pela cor");
			System.err.println(e.getMessage());
		}

		return carros;
	}	
	
	public List<Carro> consultaCarroPelaCor(String cor) {

		List<Carro> carros = new ArrayList<>();

		String sql = "SELECT *.c FROM estoque.carros c WHERE cor = ?";

		try {
			PreparedStatement consulta = connection.prepareStatement(sql);
			consulta.setString(1, cor);
			ResultSet rs = consulta.executeQuery();

			whilePadraoBusca(rs, carros);
			consulta.close();

		} catch (Exception e) {
			System.err.println("Erro ao pesquisar pela cor");
			System.err.println(e.getMessage());
		}

		return carros;
	}

	public List<Carro> consultaCarroPeloModelo(String modelo) {

		List<Carro> carros = new ArrayList<>();

		String sql = "SELECT *.c FROM estoque.carros c WHERE modelo = ?";

		try {
			PreparedStatement consulta = connection.prepareStatement(sql);
			consulta.setString(1, modelo);
			ResultSet rs = consulta.executeQuery();

			whilePadraoBusca(rs, carros);
			consulta.close();

		} catch (Exception e) {
			System.err.println("Erro ao pesquisar pelo modelo");
			System.err.println(e.getMessage());
		}

		return carros;
	}

	public List<Carro> consultaCarroPelaMarca(String marca) {

		List<Carro> carros = new ArrayList<>();

		String sql = "SELECT *.c FROM estoque.carros c WHERE marca = ?";

		try {
			PreparedStatement consulta = connection.prepareStatement(sql);
			consulta.setString(1, marca);
			ResultSet rs = consulta.executeQuery();

			whilePadraoBusca(rs, carros);
			consulta.close();

		} catch (Exception e) {
			System.err.println("Erro ao pesquisar pela marca");
			System.err.println(e.getMessage());
		}

		return carros;
	}

	public List<Carro> consultaCarroPeloCombustuvel(String combustivel) {

		List<Carro> carros = new ArrayList<>();

		String sql = "SELECT *.c FROM estoque.carros c WHERE combustivel = ?";

		try {
			PreparedStatement consulta = connection.prepareStatement(sql);
			consulta.setString(1, combustivel);
			ResultSet rs = consulta.executeQuery();

			whilePadraoBusca(rs, carros);
			consulta.close();

		} catch (Exception e) {
			System.err.println("Erro ao pesquisar pelo combustivel");
			System.err.println(e.getMessage());
		}

		return carros;
	}

	public List<Carro> consultaCarroPeloAno(int anoFabricacao) {

		List<Carro> carros = new ArrayList<>();

		String sql = "SELECT *.c FROM estoque.carros c WHERE ano_fabricacao = ?";

		try {
			PreparedStatement consulta = connection.prepareStatement(sql);
			consulta.setInt(1, anoFabricacao);
			ResultSet rs = consulta.executeQuery();

			whilePadraoBusca(rs, carros);
			consulta.close();

		} catch (Exception e) {
			System.err.println("Erro ao pesquisar pelo ano de fabricação");
			System.err.println(e.getMessage());
		}

		return carros;
	}

}
