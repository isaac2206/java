import java.util.Scanner;

public class Uri{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int X;
    double Y;

    
    X= teclado.nextInt();

   
    Y= teclado.nextDouble();

    double consumo;

    consumo = (X/Y);

    System.out.printf("%.3f km/l\n" ,consumo);

    }
}