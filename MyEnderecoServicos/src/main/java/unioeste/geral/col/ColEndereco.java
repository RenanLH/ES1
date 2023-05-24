package unioeste.geral.col;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import unioeste.geral.endereco.bo.Cidade;
import unioeste.geral.endereco.bo.Endereco;
import unioeste.geral.endereco.dao.DaoEndereco;
import unioeste.geral.infra.GlobalApp;

public class ColEndereco {
    public Endereco cadastrarEndereco(Endereco endereco) throws Exception{
        Connection conn =  GlobalApp.getConexaoBD();
        DaoEndereco daoEndereco = new DaoEndereco(conn);

        try {
            ResultSet resultSet = daoEndereco.inserirEndereco(endereco);

            while (resultSet.next()){
                endereco.setIdEndereco(resultSet.getLong("idEndereco"));
            }

            return endereco;
        }finally {
            conn.close();
        }

    }
    public ArrayList<Endereco> obterEnderecoporCep(String cep) throws Exception {
        Connection conn =  GlobalApp.getConexaoBD();
        DaoEndereco daoEndereco = new DaoEndereco(conn);

        try{
            if (!validaCep(cep)){
                throw new Exception("Cep Invalido");
            }
            ResultSet resultSet = daoEndereco.buscarEnderecoPorCodigoPostal(cep);
            ArrayList<Endereco> enderecoList = new ArrayList<>();

            while (resultSet.next()){
                Endereco endereco = new Endereco();
                endereco.setIdEndereco(resultSet.getLong("idEndereco"));
                endereco.setCep(resultSet.getString("codigoPostal"));
                endereco.setCidade(new Cidade(resultSet.getLong("idCidade")));

                enderecoList.add(endereco);

            }
            return enderecoList;

        }finally {
            conn.close();
        }
    }

    public Endereco obterEnderecoporId(Endereco endereco) throws Exception{
        Connection conn =  GlobalApp.getConexaoBD();
        DaoEndereco daoEndereco = new DaoEndereco(conn);

        try{
            ResultSet resultSet = daoEndereco.buscarEnderecoPorId(endereco.getIdEndereco());
            Endereco enderecoBD = new Endereco();

            while (resultSet.next()){
                enderecoBD.setIdEndereco(resultSet.getLong("idEndereco"));
                enderecoBD.setCep(resultSet.getString("codigoPostal"));
                enderecoBD.setCidade(new Cidade(resultSet.getLong("idCidade")));
            }
            if (!endereco.isValido()){
                throw new Exception("EnderecoException endereco invalido");
            }
            return enderecoBD;

        }finally {
            conn.close();
        }
    }


    protected boolean validaCep(String cep){
        return cep != null && cep.length() >9;
    }

}
