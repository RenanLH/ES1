package unioeste.apoio.infra;

public class UsuarioBD {
	private String usuario;
    private String senha;
    private String banco;

    public UsuarioBD(String usuario, String senha, String banco) {
        this.usuario = usuario;
        this.senha = senha;
        this.banco = banco;
    }

    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}

    public String getBanco() {return banco;}
    public void setBanco(String banco) {this.banco = banco;}
}
