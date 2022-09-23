import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        final int tam = 10;
        int[] num = {9,0,5,4,7,6,2,58,8,10};
        int[] numeros = new int[tam];
        int pesquisa = 3;

        //ordena o array
        // -> Arrays.sort(num);

        //preenche o array com o valor indicado
        // -> Arrays.fill(numeros, 10);

        //Copiando um array para o outro
        //System.arraycopy(src(origem), srcPos(a partir de qual pos), dest(destino), destPos(a partir de que pos), length);
        // -> System.arraycopy(num, 0, numeros, 0, tam);

        //compara um array com outro
        // -> System.out.printf("Array são iguais?:%s",Arrays.equals(num, numeros) ? "Sim" : "Não");

        System.out.printf("O elemento %d está no array? :%s",pesquisa,Arrays.binarySearch(num,pesquisa) > 0 ? "Sim" : "Não");

        //para percorrer o array n percorrera num
        /* for(int n:numeros){
            System.out.printf("%d - ",n);
        }*/
    }
}
