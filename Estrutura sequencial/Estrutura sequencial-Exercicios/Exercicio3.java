import java.util.Scanner;

public class Exercicio3{
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int a, b, c, d, resultado;
        
        System.out.println("Digite o valor de A");
        a = teclado.nextInt();
        
        System.out.println("Digite o valor de B");
        b = teclado.nextInt();
        
        System.out.println("Digite o valor de C");
        c = teclado.nextInt();
        
        System.out.println("Digite o valor de D");
        d = teclado.nextInt();
        
        resultado = (a * b) - (c * d);
        
        System.out.println("A diferença do produto de A e B pelo produto de C e D: " + resultado);
        
        teclado.close();
    }
}