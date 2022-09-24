public class Aviao extends Veiculo {
  private int categoria;

  public Aviao(String nome, int categoria){
    //referencia direta a superclass
    super(nome,10);
    this.categoria = categoria;
  }
  
  public void info(){
    //chamadno o info da classe pai
    super.info();
    System.out.printf("Categoria:%d%n",this.categoria);
  }

}
