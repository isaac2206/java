public class Continhas{
    public static void main(String args[]){
        // vamos declarar variáveis
        int a, b, c;
        a=19;
        b=3;
        c=a+b;
        System.out.println("Valor da soma = " + c);
        c=a-b;
        System.out.println("Valor da sub = " + c);
        c=a*b;
        System.out.println("Valor da mult =" + c);
        c= a/b;
        System.out.println("Valor da divi =" + c);
        c=a%b;
        System.out.println("Valor do resto =" +c);

        float x=(float)a/b;
        System.out.println("Valor da divisao com dizima =" +x);

        float y=15.0f/2;
        // float y = 15/2f;
        // float y = (float)15/2;
        System.out.println("Valor da divisao =" +y);
    }
}