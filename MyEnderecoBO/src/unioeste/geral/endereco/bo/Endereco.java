package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private long idEndereco;
	private String cep;
	private Cidade cidade;
	private Bairro bairro;
	private Logradouro logradouro;
	
	
	public Logradouro getLogradouro() {return logradouro;}
	public void setLogradouro(Logradouro logradouro) {this.logradouro = logradouro;}
	
	public Bairro getBairro() {return bairro;}

	public void setBairro(Bairro bairro) {this.bairro = bairro;}

	public long getIdEndereco() {return idEndereco;}
	
	public void setIdEndereco(long idEndereco) {this.idEndereco = idEndereco;}
	
	public String getCep() {return cep;}
	
	public void setCep(String cep) {this.cep = cep;}
	
	public Cidade getCidade() {
	    return cidade;
	}
	
	public void setCidade(Cidade cidade) {
	    this.cidade = cidade;
	}
	
	public boolean isValido(){
	    return idEndereco > 0 && cep != null && !cep.isEmpty() && cidade != null && cidade.isValido();
	}
}
