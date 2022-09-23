//importando o gerador aleatorio
import java.security.SecureRandom;

public class App {
    public static void main(String[] args) throws Exception {
        
        final int linhas=3;
        final int colunas=5;
        
        //Criando a matriz
        int[][] numeros=new int[linhas][colunas];
        //exp
        //[0,1,2,3,4],[0,1,2,3,4],[0,1,2,3,4]

        //Criando matriz com elementos
        int[][] num={{1,2,3,4,5},{10,20,30,40,50},{100,200,300,400,500}};


        //percorrendo e preenchendo o array
        for(int l=0; l<linhas;l++){
            for(int c=0;c<colunas;c++){
                //preenchendo com numeros aleatorios
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }

        /*for(int l=0; l<linhas;l++){
            for(int c=0;c<colunas;c++){
                System.out.printf("%2d | ", numeros[l][c]);
            }
            System.out.printf("%n");
        }*/

        //percorrendo para mostrar os valores
        for(int[] n:num){
            for(int v:n){
                System.out.printf("%3d | ", v);
            }
            System.out.printf("%n");
        }

    }
}
