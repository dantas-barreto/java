import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int n;
        int m;
        double r;
        
        System.out.print("Digite um numero:");
        n = teclado.nextInt();
        
        System.out.print("Digite outro numero:");
        m = teclado.nextInt();
        
        r = n / m;

        if (r * m == n) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao Sao Multiplos");
        }
        teclado.close();
    }
}