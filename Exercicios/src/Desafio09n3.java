import java.util.Scanner;

public class Desafio09n3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o 2º número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o 3º número: ");
        int num3 = sc.nextInt();

        System.out.println("Digite o 4º número: ");
        int num4 = sc.nextInt();

        System.out.println("Digite o 5º número: ");
        int num5 = sc.nextInt();

        int soma = num1 + num2 + num3 + num4 + num5;
        
        System.out.println("A soma dos números é: " + soma);

        sc.close();
    }
}
