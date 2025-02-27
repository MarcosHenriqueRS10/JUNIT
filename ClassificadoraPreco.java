package br.com.fiap.prod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassificadoraPreco {

    // Método que recebe uma lista de produtos e ordena por código e depois por preço
    public List<Produto> classificaProdutosPorPreco(List<Produto> produtosPrecos) {
        if (produtosPrecos == null || produtosPrecos.isEmpty()) {
            return new ArrayList<>(); // Retorna lista vazia se não houver produtos
        }

        // Cria uma cópia para evitar modificar a lista original
        List<Produto> produtosOrdenadosPreco = new ArrayList<>(produtosPrecos);

        // Ordena primeiro por código, depois por preço
        produtosOrdenadosPreco.sort(
            Comparator.comparing((Produto p) -> p.codigo)
                      .thenComparing(p -> p.preco)
        );

        return produtosOrdenadosPreco;
    }
}
