import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //System.in = ler do teclado
        Scanner entrada = new Scanner(System.in);

        double n1 = 0, n2 = 0,n3 = 0, n4 = 0, media = 0;
        String nome="", res="";

        System.out.println("Digite o nome do aluno: ");
        //para ler a entrada da string
        nome = entrada.next();

        System.out.println("Digite a primeira nota: ");
        //apos ler o teclado a variavel n1 recebe um numero double
        n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextDouble();

        System.out.println("Digite a quarta nota: ");
        n4 = entrada.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;
        if(media >= 7){
            res = "Parabens você foi aprovado";
        }else if(media >= 5){
            res = "Você está de recuperação";
        }else{
            res = "Você foi reprovado";
        }

        //%f double
        //%s string
        //%d valor inteiro
        System.out.printf("%s com as notas: %.2f , %.2f , %.2f , %.2f , você obteu a média de: %.2f\n%s",nome,n1,n2,n3,n4,media,res);
    }
}
