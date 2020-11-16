import java.util.Scanner;

public class Exercicio4{
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n, hr;
        double vl, sl;
        
        System.out.println("Digite o numero do funcionario:");
        n = teclado.nextInt();
        
        System.out.println("Digite o numero de horas trabalhadas:");
        hr = teclado.nextInt();
        
        System.out.println("Digite o valor por hora de trabalho:");
        vl = teclado.nextDouble();
        
        sl = hr * vl;
        
        System.out.printf("O funcionario n°%d recebera o salario de R$%.2f", n, sl);
        
        teclado.close();
    }
}