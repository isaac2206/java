import java.util.Scanner;

public class Ex2b{
    public static void main(String args[]){
     
    Scanner teclado = new Scanner(System.in);

    float a;
    float b;

    System.out.println("Digite o tamanho da base do retangulo");

    a= teclado.nextInt();

    System.out.println("Digite o tamanho da altura do retangulo");

    b= teclado.nextInt();

    float area;

    area= a*b;

    System.out.println("A area do retangulo e " + area);
    System.out.println("----------------------");

    float x;
    float y;

    System.out.println("Digite o tamanho da base do triangulo");

    x= teclado.nextInt();

    System.out.println("Digite o tamanho da altura do triangulo");

    y= teclado.nextInt();

    float areat;
    areat= (x*y)/2;

    System.out.println("A area do triangulo e " + areat);

    // e se eu quiser usar restrição nas casas decimais?

    System.out.printf("A area e = %f", area )

    }
 }