import java.util.Scanner;
public class Uri46{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    int i,f,j;

    i = teclado.nextInt();
    f = teclado.nextInt();
    
    if (f>i){
        j = f-i;
        System.out.println("O JOGO DUROU "+j+" HORA(S)");
    }
    else {
        j = 24 - i + f;
        System.out.println("O JOGO DUROU "+j+" HORA(S)");
    }
    
}
}