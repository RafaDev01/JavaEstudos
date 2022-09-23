public class App {
    public static void main(String[] args) throws Exception {   

        int r;

        r=soma2(10,5);

        System.out.println(r);

        System.out.println(soma(1,5,7.5,8,4,5,20,2.5));
    }

    // --------------------------------------------------------------
    //metodo que soma com quantidade indefinida de valores
    public static int soma(int... numeros){ 
        int res=0;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }

    //Sobrecarga, retorna um mesmo metodo porem com tipos de valores diferentes
    public static double soma(double... numeros){ 
        double res=0.0;
        for(double n:numeros){
            res+=n;
        }
        return res;
    }

    //-------------------------------------------

    //com retorno de saida
    public static int soma2(int n1, int n2){
        int res = n1 + n2;
        return res;
    }

    //com parametro de entrada
    public static void msg(String m, int l){
        for(int i=0; i<l; i++){
            System.out.println(m);
        }
    }

}
