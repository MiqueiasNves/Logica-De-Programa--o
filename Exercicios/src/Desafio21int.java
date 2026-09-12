import java.util.Scanner;

public class Desafio21int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Cadastro

        System.out.println("Cadastre um Usuário: ");
        String usuario = sc.nextLine();

        System.out.println("Cadastre uma Senha: ");
        String senha = sc.nextLine();

        System.out.println("Cadastro realizado com sucesso ");

        //Login

        while (true){
            System.out.println("Digite o usuário: ");
            String usuarioLogin = sc.nextLine();

            System.out.println("Digite a senha: ");
            String senhaLogin = sc.nextLine();

            if (usuarioLogin.equals(usuario) && senhaLogin.equals(senha)){
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                System.out.println("Usuário ou senha incorretos! Tente novamente.");
            }
        }


        sc.close();
    }
}
