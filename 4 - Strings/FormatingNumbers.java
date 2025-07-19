// EXERCISE 6
// Construa um programa que receba um valor monetário e exiba o valor formatado com 2 casas decimais

import java.util.Scanner;

public class FormatingNumbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // Tem que ser valor em REAL (R$) utilize a "," vírgula
       System.out.println("Digite o valor monetário: ");
       double value = sc.nextDouble();

       String formatedValue = String.format("R$%.2f", value);
       System.out.printf("Valor formatado: %s", formatedValue);

    }
}
