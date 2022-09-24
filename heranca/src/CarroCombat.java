//extends Carro -> herda as caracteriscas da class carro
public class CarroCombat extends Carro{
  private final int MAX_ARMAMENTO = 100;
  private final int MIN_ARMAMENTO = 0;
  private int qtdArmamento;

  public CarroCombat(String nome, int blindagem){
    //super chama a classe pai, nesse caso foi chamado o construtor e passado o parametro
    super(nome);
    //chamando da classe pai
    super.setArmamento(true);
    super.setBlindagem(blindagem);
    
    //atributo da classe atual
    this.qtdArmamento = 100;
  }

  public void setQtdArmamento(int armamento){
    this.qtdArmamento += armamento;
    if(this.qtdArmamento >= MAX_ARMAMENTO){
      this.qtdArmamento = MAX_ARMAMENTO;
    }

    if(this.qtdArmamento <= MIN_ARMAMENTO){
      this.qtdArmamento = MIN_ARMAMENTO;
    }
  }

  public int getQtdArmamento(){
    return this.qtdArmamento;
  }

  public void atirar(){
    if(this.qtdArmamento > MIN_ARMAMENTO){
      setQtdArmamento(-1);
    }else{
      System.out.println("Sem munição");
    }
  }

  public void info(){
    super.info();
    System.out.printf("QTD.Armamento......:%d%n",this.qtdArmamento);
  }


}
