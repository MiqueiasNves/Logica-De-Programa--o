import java.util.Scanner;

public class Desafio17int {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      Double soma = 0.0;

      for (int i = 1; i <= 5; i++){
        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();

        soma += numero;
      }
      
      double media = soma / 5;

      System.out.println("Soma: " + soma);
      System.out.println("Média: " + media);

      if (media >= 7){
        System.out.println("Resultado: Média é maior ou igual a 7!");
      } else {
        System.out.println("Resultado: Média é menor que 7!");
      }

      sc.close();
    }
}
