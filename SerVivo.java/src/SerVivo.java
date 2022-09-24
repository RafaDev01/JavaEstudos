public interface SerVivo {
  //Aqui precisa ser colocado o que as classes que implementem essa interface precisaram definir obrigatoriamente
  public void mover();
  public void comer(int massa);
  public void info();

  //não é comum adicionar atributos em uma interface porem não é proibido
  //os atributos de uma interface ja precisam ser inicializados
  public boolean vivo = true;
}
