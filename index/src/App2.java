import model.Produto;

public class App2 {
   public static void main(String[] args) {
      //Tipos primitivos -> atribuição por valor

      int a = 1;
      int b = a;

      a--;
      b++;

      System.out.println(a);
      System.out.println(b);

      //p1 -> 0xf4e123 (end. de memória para o objeto produto)
      Produto p1 = new Produto("Caneta", 7.99);
      //p2 -> 0xf4e123
      Produto p2 = p1; //atribuição por referencia
      p2.nome = "Caderno";

      System.out.println(p1.nome + " " + p2.nome);

      //p1 -> 0xee3461
      p1 = new Produto("Notebook", 3999.00);
      //p2 0x45edc1
      p2 = new Produto("Mouse", 35.99);

      System.out.println(p1.nome + " " + p2.nome);

   }
}
