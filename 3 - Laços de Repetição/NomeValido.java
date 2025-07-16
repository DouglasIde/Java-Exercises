// EXERCISE 7
// Um sistema de cadastro exige que os usuários informem um nome válido.
// No entanto, alguns usuários tentam deixar o campo em branco ou inserir nomes muitos curtos.
// Com base nesse cenário, crie um programa que continue pedindo um nome até que o usuário insira um valor
// válido com pelo menos 3 caracteres

import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;

        do{
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();

            // Se o nome tiver menos de 3 caracteres ele vai rodar de novo
            if(nome.length() < 3){
                System.out.println("Nome inválido. Digite novamente.");
            } else {
                System.out.println("Nome " + nome + " cadastrado com sucesso!");
            }

        } while(nome.length() < 3);
    }
}
