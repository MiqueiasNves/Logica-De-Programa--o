import java.util.Scanner;

public class Desafio23int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entrada: ");
        int numero = sc.nextInt();

        boolean ePrimo = true;

        if (numero <= 1){
            ePrimo = false;
        } else {
            for (int i = 2; i * i <= numero; i++){
                if (numero % i == 0){
                    ePrimo = false;
                    break;
                }
            }
        }
// Pesquisar oque significa ePrimo, ePrimo é uma variável booleana que indica se o número é primo ou não. Se ePrimo for verdadeiro (true), significa que o número é primo; se for falso (false), significa que o número não é primo.
        System.out.println("Saida: ");
        if (ePrimo){
            System.out.println("É primo.");
        }else{
            System.out.println("Digite um numero que possa ser primo.");
        }

        sc.close();
    }
}
