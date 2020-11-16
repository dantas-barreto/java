import java.util.Scanner;

public class Exercicio6{
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        Double pi = 3.14159;
        
        System.out.println("Digite o valor de A:");
        a = teclado.nextDouble();
        
        System.out.println("Digite o valor de B:");
        b = teclado.nextDouble();
        
        System.out.println("Digite o valor de C:");
        c = teclado.nextDouble();
        
        triangulo = (a * c) / 2;
        System.out.printf("Area do Triangulo: %.3f%n", triangulo);
        
        circulo = pi * Math.pow(c, 2);
        System.out.printf("Area do Circulo: %.3f%n", circulo);
        
        trapezio = ((a + b) * c) / 2;
        System.out.printf("Area do Trapezio: %.3f%n", trapezio);
        
        quadrado = Math.pow(b, 2);
        System.out.printf("Area do Quadrado: %.3f%n", quadrado);
        
        retangulo = a * b;
        System.out.printf("Area do Retangulo: %.3f%n", retangulo);
        
        teclado.close();
    }
}