package edittextlistener.ifpb.edu.br.edittextlistenerapp.callback;

import java.util.List;

import edittextlistener.ifpb.edu.br.edittextlistenerapp.entidade.Pessoa;

/**
 * Created by Henrique on 05/03/16.
 */
public interface BuscarPessoaCallBack {

    void backBuscarNome(List<Pessoa> names);

    void errorBuscarNome(String error);
}