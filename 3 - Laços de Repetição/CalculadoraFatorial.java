// EXERCISE 4
// Pedro quer calcular o fatorial de um número
// O fatorial de um número é o produto de todos os números inteiros positivos 1 até o próprio número.

import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fatorial = 1;

        // Iterage com o usuário para saber o número
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        // Realiza o calculo do Fatorial
        for(int i = 1; i <= n; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
        sc.close();
    }
}
