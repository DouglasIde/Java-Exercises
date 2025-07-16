// EXERCISE 6
// Se o usuário errar a senha 3x seguidas, sua conta deve ser bloqueada temporariamente

import java.util.Scanner;

public class LoginSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        for(int tentativas = 3; tentativas > 0; tentativas--){
            System.out.println("Digite sua senha novamente: ");
            String senha_digitada = sc.nextLine();

            // Se voce digitou ambas as senhas corretas, voce acessou!!
            if(senha_digitada.equals(senha)){
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            // Se não, voce terá outra tentativa
            } else if(tentativas > 1){
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes");
            // Caso tenha errado 3x, o programa encerra!!
            } else {
                System.out.println("Conta bloqueada temporariamente");
                break;
            }
        }
        sc.close();
    }
}
