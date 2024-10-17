package strategy;

public class DescontoClienteVIP implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.20;
    }
}
