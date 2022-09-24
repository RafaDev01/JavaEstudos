public class App {
    public static void main(String[] args) throws Exception {
        
        int num=0;

        Jogador.pontosGlobal();
        Jogador.pontosGlobal();
        Jogador.pontosGlobal();

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        Jogador.alerta = true;

        j1.addVidas();
        j2.addVidas();

        j1.info();
        j2.info();
        j3.info();

        /* 
        j1.num = 10;
        j2.num = 5;
        System.out.printf("%n%d",j1.num);
        System.out.printf("%n%d",j2.num);
        */
    }
}
