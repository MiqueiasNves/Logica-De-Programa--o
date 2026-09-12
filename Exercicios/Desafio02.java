import java.util.Scanner;

public class Desafio02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int x,y;

        System.out.println("Digite o primeiro número: ");
        x = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        y = sc.nextInt();

        System.out.println("Resultado: " + (x + y));

        sc.close();
    }
}
