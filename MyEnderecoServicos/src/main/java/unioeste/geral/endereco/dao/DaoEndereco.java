package unioeste.geral.endereco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import unioeste.geral.endereco.bo.Endereco;

public class DaoEndereco extends Dao{
	
	public DaoEndereco(Connection connection){
	    this.connection = connection;
	}
	
	public ResultSet inserirEndereco(Endereco endereco) throws SQLException {
	    String sql = "INSERT INTO ENDERECO (codigoPostal, idCidade) VALUES ( ?, ? )";
	
	    PreparedStatement statement = connection.prepareStatement(sql);
	
	    setStatementValue(statement, 0, endereco.getCep());
	    setStatementValue(statement, 1, endereco.getCidade().getIdCidade());
	
	    statement.getGeneratedKeys();
	
	    return statement.executeQuery();
	}
	
	private ResultSet buscarEndereco(String campo, Object valor) throws SQLException {
	    String sql = "SELECT * FROM ENDERECO WHERE" + campo + " = ?";
	
	    PreparedStatement statement = connection.prepareStatement(sql);
	    setStatementValue(statement, 0, valor);
	
	    return statement.executeQuery();
	
	}
	
	public ResultSet buscarEnderecoPorId(Long id) throws SQLException {
	    return buscarEndereco("idEndereco", id);
	}
	
	public ResultSet buscarEnderecoPorCodigoPostal(String codigoPostal) throws SQLException {
	    return buscarEndereco("codPostal", codigoPostal);
	}


}
