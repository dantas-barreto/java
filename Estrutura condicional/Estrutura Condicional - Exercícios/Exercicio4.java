import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int i;
        int f;
        int t;
        
        System.out.print("Digite a hora inicial: ");
        i = teclado.nextInt();
        
        System.out.print("Digite a hora final: ");
        f = teclado.nextInt();
        
        if (i == f) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if (i < f) {
            t = f - i;
            System.out.println("O JOGO DUROU " + t + " HORA(S)");
        }
        else {
            t = (24 - i) + f;
            System.out.println("O JOGO DUROU " + t + " HORA(S)");
        }
        teclado.close();
    }
}