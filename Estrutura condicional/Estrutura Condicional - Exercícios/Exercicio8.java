import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        double s;
        double ir;
        
        System.out.print("Insira o seu salario: ");
        s = teclado.nextDouble();
        
        if (s >= 0.00 && s <= 2000.00) {
            System.out.println("Isento");
        }
        else if (s >= 2000.01 && s <= 3000.00) {
            ir = ((s - 2000.00) * 8) / 100;
            System.out.printf("R$ %.2f%n", ir);
        }
        else if (s >= 3000.01 && s <= 4500.00) {
            ir = (((s - 3000.00) * 18) / 100) + 80;
            System.out.printf("R$ %.2f%n", ir);
        }
        else {
            ir = (((s - 4500.00) * 28) / 100) + 350;
            System.out.printf("R$ %.2f%n", ir);
        }
        teclado.close();
    }
}