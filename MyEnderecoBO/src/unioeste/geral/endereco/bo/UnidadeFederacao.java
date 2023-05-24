package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class UnidadeFederacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String siglaUf;
	String nomeUF;
	
	public String getSiglaUf() {return siglaUf;}
	public void setSiglaUf(String siglaUf) {this.siglaUf = siglaUf;}
	
	
	public String getNomeUF() {return nomeUF;}
	public void setNomeUF(String nomeUF) {this.nomeUF = nomeUF;}
	
	

}
