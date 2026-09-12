import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu nome: " );
            String nome = scanner.nextLine();
            
            System.out.println("Olá, " + nome + "! Bem vindo ao Java!");

            scanner.close();
        }
    }
} 

//try oque significa try, try é uma palavra-chave em Java que é usada para iniciar um bloco de código que pode gerar exceções. O bloco try é seguido por um ou mais blocos catch, que são usados para capturar e tratar as exceções que podem ocorrer dentro do bloco try. Se uma exceção ocorrer dentro do bloco try, o fluxo de execução será interrompido e o controle será transferido para o bloco catch correspondente, onde a exceção pode ser tratada de forma adequada.