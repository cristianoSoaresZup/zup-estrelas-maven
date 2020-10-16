package br.com.zup.estrelas.connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection conexao() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/estoque?user=root&password=root"
					+ "&useTimezone=true&serverTimezone=UTC");
		} catch (SQLException e) {
			return null;
		}
	}

}
