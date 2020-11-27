import java.util.Scanner;

public class Exercicio1{
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um numero:");
        n = teclado.nextInt();

        if (n < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }
        teclado.close();
    }
}