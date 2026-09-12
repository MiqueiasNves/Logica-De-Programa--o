import java.util.Scanner;

public class Desafio19int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor: ");
        int valor = sc.nextInt();

        int[] notas = {100,50,20,10,5,2,1};

        System.out.println("Valor: " + valor);

        for (int i = 0; i < notas.length; i++){
            int quantidade = valor / notas[i];
            valor = valor % notas[i];
            if (quantidade > 0){
                System.out.println(quantidade + " nota(s) de " + notas[i]);
            } else {
                System.out.println("0 nota(s) de " + notas[i]);
            }
        }
        

        sc.close();
    }
}
