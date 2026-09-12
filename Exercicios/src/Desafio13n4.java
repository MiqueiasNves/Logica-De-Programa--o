import java.util.Scanner;

public class Desafio13n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();
// utilizando a estrutura de decisão if, else if e else, podemos verificar se o ano é bissexto ou não. Um ano é bissexto se for divisível por 4, mas não por 100, exceto se for divisível por 400.
// junto com os moderadores lógicos && (E) e || (OU), podemos criar uma condição composta para verificar se o ano é bissexto ou não.

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        sc.close();

    }
}
