import java.util.Scanner;

public class Exercicio1{
    
    public static void main(String[] args) {
        
        int x,y,z;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        x = teclado.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        y = teclado.nextInt();
        
        z = x + y;
        
        System.out.printf("Soma dos valores digitados: %d", z);
        
        teclado.close();
    }
}
