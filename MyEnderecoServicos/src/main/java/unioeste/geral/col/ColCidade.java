package unioeste.geral.col;

import java.sql.Connection;
import java.sql.ResultSet;

import unioeste.geral.endereco.bo.Cidade;
import unioeste.geral.endereco.dao.DaoCidade;
import unioeste.geral.infra.GlobalApp;

public class ColCidade {
	public Cidade obterCidadePorId(Cidade cidade) throws Exception {
        Connection conn =  GlobalApp.getConexaoBD();
        DaoCidade daoCidade = new DaoCidade(conn);

        try {
            if (cidade == null || cidade.getIdCidade() <=0){
                throw new Exception("Cidade invalida");
            }
            ResultSet resultSet = daoCidade.buscarCidadePorId(cidade.getIdCidade());

            Cidade cidadeBD = new Cidade();

            while (resultSet.next()){
                cidadeBD.setIdCidade(resultSet.getLong("idCidade"));
                cidadeBD.setNomeCidade(resultSet.getString("nomeCidade"));
            }

            return cidade;

        }finally {
            conn.close();
        }

    }
}
