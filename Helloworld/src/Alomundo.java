public class Alomundo {
    public static void main(String[] args){

        int n1=0,n2=3,n3=5;
        int res = n1 + n2 + n3;
        String nome = "Rafael";

        //não quebra linha
        System.out.print("Helooo");
        //quebra linha no fim -> \n quebra linha
        System.out.println("Helooo 2");
        //permite imprimir com uma config de formatação
        //%s string
        //%d inteiro
        //%f float
        //%n quebra linha
        System.out.printf("Canal:%s%nAno:%d%n","CFB Cursos",2022);

        System.out.printf("Valor da variavel Res:%d%nNome:%s",res,nome);
    }
}
