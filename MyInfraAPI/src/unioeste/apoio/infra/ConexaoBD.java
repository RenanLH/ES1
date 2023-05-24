package unioeste.apoio.infra;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
	public ConexaoBD() throws Exception{
        String driver = "";
        Class.forName(driver);
    }

    public Connection getConnection(UsuarioBD usuarioBD) throws Exception{
        Connection connection = null;

        String url = "jdbc:mysql://localhost/" + usuarioBD.getBanco() + "?";
        String user = "user=" + usuarioBD.getUsuario();
        String password = "&password=" + usuarioBD.getSenha();
        connection = DriverManager.getConnection(url + user + password);
        connection.setAutoCommit(false);

        return connection;
    }
}
