// EXERCISE 8
// Ana é professora de matematica e propos um exercício no qual os alunos devam contar:
// Quantos números positivos e negativos existem em uma sequencia de números fornecida por ela


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositivosNegativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String numeroDigitado;
        List<Integer> numerosPositivos = new ArrayList<>();
        List<Integer> numerosNegativos = new ArrayList<>();

        do{
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            numeroDigitado = sc.nextLine();

            // Convertendo o número digitado pelo usuário para INT
            int numero = Integer.parseInt(numeroDigitado);

            // Verifica e adiciona nas listas os números que são positivos e negativos
            if (numero < 0){
                numerosNegativos.add(numero);
            } else {
                numerosPositivos.add(numero);
            }
        } while(numeroDigitado != "fim");

        System.out.println("Números positivos: " + numerosPositivos.size());
        System.out.println("Números negativos: " + numerosNegativos.size());
    }
}