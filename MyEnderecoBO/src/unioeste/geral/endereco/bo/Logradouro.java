package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class Logradouro implements Serializable{
    
	private static final long serialVersionUID = 1L;
	private TipoLogradouro tipoLogradouro;
    private String nomeLogradouro;

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }
    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }
    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }
    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

}
