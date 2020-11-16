import java.util.Scanner;

public class Exercicio2{
    
    public static void main(String[] args) {
        
        double pi = 3.14159;
        double r;
        double A;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        r = teclado.nextDouble();
        
        A = pi * Math.pow(r,2);
        
        System.out.printf("Area da circunferencia: %.4f%n", A);
        
        teclado.close();
    }
}