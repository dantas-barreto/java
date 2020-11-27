import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        double x;
        double y;
        
        System.out.print("Digite o valor de X: ");
        x = teclado.nextDouble();
        
        System.out.print("Digite o valor de Y: ");
        y = teclado.nextDouble();
        
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x != 0 && y == 0) {
            System.out.println("Eixo X");
        }
        else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        }
        else {
            System.out.println("Quadrante 4");
        }
        teclado.close();
    }
}