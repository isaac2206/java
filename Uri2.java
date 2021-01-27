import java.util.Scanner;

public class Uri2{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int X,A,B,C;
    
    X= teclado.nextInt();

   
    A=X/365;
    B=(X%365)/30;
    C=(X%365)%30;



    System.out.println(A +" anos(s)");
    System.out.println(B +" mes(es)");
    System.out.println(C +" dia(s)");

    }
}