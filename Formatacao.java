import java.util.Scanner;

public class Formatacao{
    public static void main(String args[]){
     
    Scanner teclado = new Scanner(System.in);

    float x;
    float y;

    System.out.println("Digite o tamanho da base do triangulo");

    x= teclado.nexInt();

    System.out.println("Digite o tamanho da altura do triangulo");

    y= teclado.nextInt();

    float areat;
    areat= (x*y)/3;

    // e se eu quiser usar restrição nas casas decimais?

    System.out.printf("A area e = %.2f\n", areat);

    }
}