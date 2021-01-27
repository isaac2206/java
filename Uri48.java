import java.util.Scanner;
public class Uri48{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    double sal,ns,rs;

    sal = teclado.nextDouble();
    
    if (sal<=400){
        rs = 0.15*sal;
        ns = 1.15*sal;
        System.out.printf("Novo Salario: %.2f\n",ns);
        System.out.printf("Reajuste ganho: %.2f\n",rs);
        System.out.println("Em percentual: 15%");
    }
    else if (sal<=800){
        rs=0.12*sal;
        ns=1.12*sal;
        System.out.printf("Novo Salario: %.2f\n",ns);
        System.out.printf("Reajuste ganho: %.2f\n",rs);
        System.out.println("Em percentual: 12%");
    }
    else if (sal<=1200){
        rs=0.1*sal;
        ns=1.1*sal;
        System.out.printf("Novo Salario: %.2f\n",ns);
        System.out.printf("Reajuste ganho: %.2f\n",rs);
        System.out.println("Em percentual: 10%");
    }
    else if (sal<=2000){
        rs=0.07*sal;
        ns=1.07*sal;
        System.out.printf("Novo Salario: %.2f\n",ns);
        System.out.printf("Reajuste ganho: %.2f\n",rs);
        System.out.println("Em percentual: 7%");
    }
    else{
        rs=0.04*sal;
        ns=1.04*sal;
        System.out.printf("Novo Salario: %.2f\n",ns);
        System.out.printf("Reajuste ganho: %.2f\n",rs);
        System.out.println("Em percentual: 4%");
    }
    }
    }