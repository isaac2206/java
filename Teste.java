import java.util.Scanner;
public class Teste{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // se B maior que C
        // se D maior que A
        // soma de C com D maior que a soma A com B
        // se C e D, ambos, forem positivos
        // se a variavel A for par

        int A,B,C,D;
        A=teclado.nextInt();
        B=teclado.nextInt();
        C=teclado.nextInt();
        D=teclado.nextInt();

        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0 ){
            System.out.println("Valores aceitos");
            }
            else {
                System.out.println("Valores nao aceitos");
            }
        

    }
}
