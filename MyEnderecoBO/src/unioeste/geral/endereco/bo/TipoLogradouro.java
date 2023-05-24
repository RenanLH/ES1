package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class TipoLogradouro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String siglaLogradouro;
	private String nomeLogradouro;
	
	public String getSiglaLogradouro() {return siglaLogradouro;}
	
	public void setSiglaLogradouro(String siglaLogradouro) {this.siglaLogradouro = siglaLogradouro;}
	
	public String getNomeLogradouro() {return nomeLogradouro;}
	
	public void setNomeLogradouro(String nomeLogradouro) {this.nomeLogradouro = nomeLogradouro;}
	
}
