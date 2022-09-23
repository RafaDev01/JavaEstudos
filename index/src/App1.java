import model.Produto;

public class App1 {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Caneta", 4.99);
        Produto p2 = new Produto("Geladeira", 3454.99);

        Produto.desconto = 0.5;
        Produto.desconto = 0.0;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());
    }

}
