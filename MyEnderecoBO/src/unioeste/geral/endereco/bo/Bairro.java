package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Bairro implements Serializable{

	private static final long serialVersionUID = 1L;
	private long idBairro;
    private String nomeBairro;

    public long getIdBairro() {return idBairro;}
    public void setIdBairro(long idBairro) {this.idBairro = idBairro;}
    public String getNomeBairro() {return nomeBairro;}
    public void setNomeBairro(String nomeBairro) {this.nomeBairro = nomeBairro;}

}
