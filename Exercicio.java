import java.util.Scanner;

public class Exercicio{
    public static void main(String args[]){
     
    Scanner teclado = new Scanner(System.in);

    float a;

    System.out.println("Digite o tamanho do lado do quadrado");

    a= teclado.nextInt();

    float area;

    area= a*a;

    System.out.println("A área do quadrado e " + area);




    }
}
