public class Jogador {

  //Static tem o mesmo end de memoria, nesse caso não precisa usar this
  //Tambem não precisa existir objetos para usar um atributo static
  private final int maxVidas = 3;
  private int num=0;
  private int vidas=0;
  static boolean alerta = false;
  static int qtdJogadores = 0;
  static int pontosJogadores = 0;

  //Método construtor
  public Jogador(int num){
    //this.num referencia a class, num referencia o parametro
    this.num=num;
    this.vidas = 1;
    System.out.printf("Jogador numero %d criado%n",num);
    qtdJogadores++;
  }

  public int getNum() {
    return this.num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getVidas() {
    return this.vidas;
  }

  public void addVidas() {
    if(this.vidas < maxVidas){
      this.vidas++;
    }
  }

  public void info(){
    System.out.printf("%nJogador:%d",this.num);
    System.out.printf("%nVidas:%d",this.vidas);
    //como o alerta é static não se deve colocar this
    System.out.printf("%nAlerta:%s",alerta ? "Sim" : "Nao");
    System.out.printf("%nJogadores:%d",qtdJogadores);
    System.out.printf("%nPontos:%d",pontosJogadores);
    System.out.printf("%n---------------------------------------------------");
  }

  static void pontosGlobal(){
    pontosJogadores+=10;
  }



  /*public void setVidas(int vidas) {
    if(vidas > maxVidas){
      this.vidas = maxVidas;
    }else if(vidas < 0){
      this.vidas = 0;
    }else{
      this.vidas = vidas;
    }
  }*/
}
