import java.util.Scanner;

public class Desafio22int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos tem na sala: ");
        int totalAlunos = sc.nextInt();    

        double soma = 0;
        double maior = 10;
        double menor = 0.0;

        for (int i = 1; i <= totalAlunos; i++){
            System.out.println("Digite a nota do " + i + "º aluno: ");
            double nota = sc.nextDouble();

            soma += nota;

            if (nota > maior){
                maior = nota;
            }
            if (nota < menor){
                menor = nota;
            }
        }
        double media = soma / totalAlunos;

        System.out.println("\n=== RESULTADOS DA TURMA ===");
        System.out.printf("Média da turma: %.2f\n", media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

        sc.close();
    }
}
