// EXERCISE 5
// Crie um programa que receba um texto e uma palavra, e exiba uma mensagem indicando se a palavra está presente

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String text = sc.nextLine();

        System.out.println("Digite uma palavra do texto: ");
        String wordText = sc.nextLine();

        if(text.contains(wordText)){
            System.out.printf("A palavra '%s' está presente no texto.", wordText);
        } else {
            System.out.printf("A palavra '%s' não está presente no texto", wordText);
        }
    }
}
