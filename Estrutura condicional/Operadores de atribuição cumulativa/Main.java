import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int minutos;
        double conta = 50.0;
        
        System.out.print("Insira a quantidade de minutos: ");
        minutos = teclado.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        
        System.out.printf("Valor da conta: R$ %.2f%n", conta);
        
        teclado.close();
    }
}