package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Cidade implements Serializable{

	private static final long serialVersionUID = 1L;
	private long idCidade;
	private String nomeCidade;
	private UnidadeFederacao unidadeFedaracao;

    public Cidade() {}

    public Cidade(long idCidade) {
        this.idCidade = idCidade;
    }

    public Cidade(long idCidade, String nomeCidade) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
    }

    public long getIdCidade() {return idCidade;}
    public void setIdCidade(long idCidade) {this.idCidade = idCidade;}
    public String getNomeCidade() {
        return nomeCidade;
    }
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public boolean isValido(){
        return idCidade > 0 && nomeCidade != null && !nomeCidade.isEmpty();
    }
}
