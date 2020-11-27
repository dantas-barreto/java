import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int n;
        
        System.out.println("Digite um numero:");
        
        n = teclado.nextInt();

        if (n % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
        teclado.close();
    }
}