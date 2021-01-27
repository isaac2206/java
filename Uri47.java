import java.util.Scanner;
public class Uri47{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    int hi,mi,hf,mf,h,m,ti,tf,ht,mt;

    hi = teclado.nextInt();
    mi = teclado.nextInt();
    hf = teclado.nextInt();
    mf = teclado.nextInt();
    
    ti = hi*60 + mi;
    tf = hf*60 + mf;
    ht=tf-ti;

    if (ht<=0)[
        ht =ht+1440;
    ]
    
    if (hi==hf && mi==mf){
        h=24;
        m= 0;
        System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
    } 
    else{ 
        if(hi==hf){
            h= 0;
            m= mf-mi;
        System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        }
    }
    
        if (hf<hi){
            h = 24 - hi + hf;
            m = mf - mi;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        }
        else{
            h = (tf - ti)/60;
            m = ((tf-ti)%60);
            System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        }

        
    }
    
}

