import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int c;
        int q;
        double p;
        
        System.out.print("Insira o codigo do produto: ");
        c = teclado.nextInt();
        
        System.out.print("Digite a quantidade de itens: ");
        q = teclado.nextInt();

        if (c == 1) {
            p = q * 4;
            System.out.printf("Total: R$ %.2f%n", p);
        }
        else if (c ==2){
            p = q * 4.5;
            System.out.printf("Total: R$ %.2f%n", p);
        }
        else if (c == 3) {
            p = q * 5;
            System.out.printf("Total: R$ %.2f%n", p);
        }
        else if (c == 4) {
            p = q * 2;
            System.out.printf("Total: R$ %.2f%n", p);
        }
        else if (c == 5) {
            p = q * 1.5;
            System.out.printf("Total: R$ %.2f%n", p);
        }
        else {
            System.out.println("Codigo nao encontrado");
        }
        teclado.close();
    }
}