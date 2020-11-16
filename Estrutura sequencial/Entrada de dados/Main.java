import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
    // Para texto sem espaços
        String x;
        
        x = teclado.next();
    //-------------------------    
        
    // Para numero inteiro
        int y;
    
        y = teclado.nextInt();
    //-------------------------    
        
    // Numero com ponto flutuante
        double z;
        
        z = teclado.nextDouble();
    //-------------------------
    
    // Para um caractere
        char a;
        
        a = teclado.next().charAt(0);
    //-------------------------
    
    // Para varios dados na mesma linha
        String b;
        int c;
        double d;
        
        b = teclado.next();
        c = teclado.nextInt();
        d = teclado.nextDouble();
    //-------------------------
    
    // Para ler um texto ate a quebra de linha
        String s1, s2, s3;
        
        s1 = teclado.nextLine();
        s2 = teclado.nextLine();
        s3 = teclado.nextLine();
    //-------------------------
    }
}
