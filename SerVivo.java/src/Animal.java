//A classe que implemntar a interface é obrigada a implementar os metodos dessa interface
public class Animal implements SerVivo {

  //constructor
  public Animal(){

  }

  //methods 
  public void mover(){

  }

  public void comer(int massa){

  }

  public void info(){
    System.out.printf("Vivo:%s%n",this.vivo ? "Sim" : "Não");
  }
}
