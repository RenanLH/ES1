package unioeste.geral.endereco.bo;

import java.io.Serializable;

public class EnderecoEspecifico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Endereco endereco;
    private long nro;
    private String complemento;


    public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public long getNro() {
        return nro;
    }
    public void setNro(long nro) {
        this.nro = nro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
