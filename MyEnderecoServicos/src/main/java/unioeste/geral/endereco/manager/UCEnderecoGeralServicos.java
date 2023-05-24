package unioeste.geral.endereco.manager;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import unioeste.geral.col.ColCidade;
import unioeste.geral.col.ColEndereco;
import unioeste.geral.endereco.bo.Cidade;
import unioeste.geral.endereco.bo.Endereco;

@Path("/")
public class UCEnderecoGeralServicos {
	
	@GET
	@Produces (MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Server";
	}
	
	@Path("/cadastrarEndereco")
	@POST
	@Consumes (MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public Endereco cadastrarEndereco (Endereco endereco){
        try {
            ColEndereco colEndereco = new ColEndereco();
            endereco = colEndereco.cadastrarEndereco(endereco);

            return endereco;
        }catch (Exception e){
            return null;
        }
    }

	@Path("/obterEnderecoPorCEP/{CEP}")
	@GET
	@Consumes (MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
    public List<Endereco> obterEnderecoPorCEP (@PathParam("CEP")String codigoPostal){
        try {
            ColEndereco colEndereco = new ColEndereco();
            List<Endereco> enderecoList = colEndereco.obterEnderecoporCep(codigoPostal);

            return enderecoList;
        }catch (Exception e){
            return null;

        }
    }

	@Path("/obterEnderecoPorID/")
	@GET
    public Endereco obterEnderecoPorID (Endereco enderecoBO){
        try {
            ColEndereco colEndereco = new ColEndereco();
            Endereco endereco = colEndereco.obterEnderecoporId(enderecoBO);

            return endereco;

        }catch (Exception e){
            return null;

        }
    }
	
	@Path("/obterEnderecoExterno/{site}")
	@GET

    public Endereco obterEnderecoExterno (String site){
        try {
            ColEndereco colEndereco = new ColEndereco();

            return colEndereco.obterEnderecoporId(site);
        }catch (Exception e){
            return null;

        }
    }

	@Path("/obterCidade/")
	@GET
    public Cidade obterCidade (Cidade cidadeBO){
        try {
            ColCidade colCidade = new ColCidade();
            Cidade cidade = colCidade.obterCidadePorId(cidadeBO);

            return cidade;

        }catch (Exception e){
            return null;

        }
    }
}
