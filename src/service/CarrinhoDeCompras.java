package service;

import entity.Produto;
import strategy.DescontoStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Nome: Diego Garcia Perez Biguette
 * RA: 1424
 */

public class CarrinhoDeCompras {
    private final List<Produto> produtos = new ArrayList<>();
    private DescontoStrategy descontoStrategy;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularTotalComDesconto() {
        if (descontoStrategy == null) {
            throw new IllegalStateException("Estratégia de desconto não informada");
        }

        var total = totalProdutos();

        return total - descontoStrategy.calcularDesconto(total);
    }

    private double totalProdutos() {
        return produtos.stream().map(Produto::getPreco).reduce(0.0, Double::sum);
    }
}
