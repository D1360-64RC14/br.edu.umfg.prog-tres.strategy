import entity.Produto;
import service.CarrinhoDeCompras;
import strategy.DescontoClienteNovo;
import strategy.DescontoClienteRegular;
import strategy.DescontoClienteVIP;

public class LojaOnline {
    public static void main(String[] args) {
        var pChocolate = new Produto("Chocolate", 11.00);
        var pGoma = new Produto("Goma mascar x12", 8.50);
        var pFita = new Produto("Fita Adesiva", 5.25);

        var carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(pChocolate);
        carrinho.adicionarProduto(pGoma);
        carrinho.adicionarProduto(pFita);

        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para cliente Novo: R$ " + carrinho.calcularTotalComDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para cliente Regular: R$ " + carrinho.calcularTotalComDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para cliente VIP: R$ " + carrinho.calcularTotalComDesconto());
    }
}
