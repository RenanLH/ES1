package unioeste.geral.infra;

import java.sql.Connection;

import unioeste.apoio.infra.ConexaoBD;
import unioeste.apoio.infra.UsuarioBD;

public class GlobalApp {
	public static ConexaoBD conexaoBD;
    public static UsuarioBD usuarioBD;

    public GlobalApp() {
        usuarioBD = new UsuarioBD("root", "t7L6@jcF*@Pe", "es1");
    }

    public static void setUsuarioBD(UsuarioBD usuarioBD) {
        GlobalApp.usuarioBD = usuarioBD;
    }

    public static Connection getConexaoBD() throws Exception {
        if (conexaoBD == null) {
            conexaoBD = new ConexaoBD();
        }
        return conexaoBD.getConnection(usuarioBD);
    }
}
