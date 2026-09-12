import java.util.Scanner;

public class Desafio14n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
// utilizando a estrutura de decisão if, else if e else, podemos verificar em qual faixa etária a pessoa se encontra.
        if (idade <= 12){
            System.out.println("Criança");
        } else if (idade <= 17){
            System.out.println("Adolescente");
        } else if (idade <= 59){
            System.out.println("Adulto");
        } else if (idade >= 60){
            System.out.println("Idoso");
        }

        sc.close();
    }
}
