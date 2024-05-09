package br.com.tabelafipe.TabelaFipe.service;

import java.util.List;

// Interface generica para implementação de desserialização json
public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);

    <T> List<T> obterLista(String json, Class<T> classe);
}
