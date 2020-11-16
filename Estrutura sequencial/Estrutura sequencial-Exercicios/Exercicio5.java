import java.util.Scanner;

public class Exercicio5{
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int c1, c2, n1, n2;
        double v1, v2, vt;
        
        System.out.println("Digite o codigo do 1° produto:");
        c1 = teclado.nextInt();
        
        System.out.println("Quantidade de itens:");
        n1 = teclado.nextInt();
        
        System.out.println("Valor unitario:");
        v1 = teclado.nextDouble();
        
        System.out.println("Digite o codigo do 2° produto:");
        c2 = teclado.nextInt();
        
        System.out.println("Quantidade de itens:");
        n2 = teclado.nextInt();
        
        System.out.println("Valor unitario:");
        v2 = teclado.nextDouble();
        
        vt = (n1 * v1) + (n2 * v2);
        
        System.out.printf("VALOR A PAGAR: R$%.2f", vt);
        
        teclado.close();
    }
}