import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        
        System.out.println(desconto);
        
        teclado.close();
    }
}
