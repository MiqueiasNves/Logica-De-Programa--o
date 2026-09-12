import java.util.Scanner;

public class Desafio06n2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Média: " + media);
        } else {
            System.out.println("Média: " + media);
        }

        System.out.println("Situação: " + (media >= 7 ? "Aprovado" : "Reprovado"));

        sc.close();
    }
}
