package strategy;

public class DescontoClienteRegular implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.10;
    }
}
