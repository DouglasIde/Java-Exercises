// EXERCISE 1
// Crie um programa que receba um nome e exiba o nome sem espaços em branco no inicio ou no final

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String nome = "     Douglas Yugo       ";

        System.out.printf("Nome sem espaços: %s", nome.trim());
    }
}