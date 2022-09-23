import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* 
        final int TAM = 5;
        
        //Criando array com 5 posições
        int[] num = new int[TAM];

        //criando array com valores
        int[] numeros = {10,20,30,40,50};

        //adicionando elementos no array
        num[0] = 10;
        num[1] = 14;
        num[2] = 16;
        num[3] = 15;
        num[4] = 1;

        //usar o for de preferencia para percorrer o array
        for(int i=0; i < numeros.length;i++){
            System.out.printf("%d - ", numeros[i]);
        }*/

        final int tam=5;

        char[] gabarito = {'a','a','d','b','c'};
        char[] respostas = new char[tam];

        int nota = 0;

        Scanner scan = new Scanner(System.in);

        respostas[0]='a'; respostas[1]='b'; respostas[2]='c'; respostas[3]='b'; respostas[4]='c';

        for(int i = 0; i < tam; i++){
            System.out.printf("Informe a respota %d: ",i+1);
            //lendo a nota
            respostas[i] = scan.nextLine().charAt(0);
        }

        for(int i = 0; i < tam; i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }

        System.out.printf("\nNota do aluno:%d",nota);

    }
}
