// EXERCISE 3
// Crie um programa que receba um texto a ser substituido e uma nova palavra, exiba o texto com as substituições realizadas
// Se a palavra a ser substituida não for encontrada no texto, o programa deve informar ao usuário

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String text = sc.nextLine();

        System.out.println("Digite a palavra a ser substituida: ");
        String wordReplac = sc.nextLine();

        System.out.println("Digite a nova palavra: ");
        String newOrd = sc.nextLine();

        if(text.contains(wordReplac)){
            String newText = text.replace(wordReplac, newOrd);
            System.out.printf("Texto modificado: %s", newText);
        } else {
            System.out.println("A palavra não foi encontrada para subsituição");
            System.out.println("Encerrando o programa");
        }
    }
    
}
