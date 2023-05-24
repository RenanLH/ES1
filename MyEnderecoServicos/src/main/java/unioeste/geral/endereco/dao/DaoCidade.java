package unioeste.geral.endereco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCidade extends Dao{
	public DaoCidade(Connection connection) {
	    this.connection = connection;
	}
	
	public ResultSet buscarCidade(String campo, Object valor) throws SQLException {
	    String sql = "SELECT * FROM CIDADE WHERE" + campo + " = ?";
	
	    PreparedStatement statement = connection.prepareStatement(sql);
	    setStatementValue(statement, 0, valor);
	
	    return statement.executeQuery();
	}
	
	
	public ResultSet buscarCidadePorId(long idCidade) throws SQLException {
	    return buscarCidade("idCidade", idCidade);
	}
}
