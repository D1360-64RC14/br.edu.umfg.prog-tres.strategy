package strategy;

/**
 * Nome: Diego Garcia Perez Biguette
 * RA: 1424
 */

public class DescontoClienteVIP implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.20;
    }
}
