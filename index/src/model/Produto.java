package model;

//projeto (planta) 0para criar os objetos
public class Produto {
    public String nome;
    public double preco;
    public static double desconto = 0;

    public Produto(String nome, double precoInicial) {
      this.nome = nome;
      preco = precoInicial;
    }
    public double precoComDesconto(){
      return preco * (1 - desconto);
    }
}
