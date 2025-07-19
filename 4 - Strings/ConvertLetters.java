// EXERCISE 2
// Faça um programa que receba um texto e exiba o texto em maiusculas e o texto em minusculas.

import java.util.Scanner;

public class ConvertLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String text = sc.nextLine();

        // Exibe os textos
        System.out.printf("Texto em Maiúsculas: %s%n", text.toUpperCase());
        System.out.printf("Texto em Minúsculas: %s", text.toLowerCase());
        
    }
}
