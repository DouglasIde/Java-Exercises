// EXERCISE 5
// Carlos tem uma lista de numeros e quer descobrir qual é o maior valor.
// Para isso, ele decidiu percorrer a lista comparando cada número com o maior encontrado até o momento

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int maior_numero = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço: ");
        String numeros = sc.nextLine();

        // Remove os espaços para entrar na Lista
        String[] numeros_list_str = numeros.split(" ");

        // Converte os numeros digitados para Int
        // Verifica qual é o maior numero
        for(String numeroSTR : numeros_list_str){
            int numero = Integer.parseInt(numeroSTR);
            if(numero > maior_numero){
                maior_numero = numero;
            }
        }

        System.out.println("O maior número é: " + maior_numero);
        sc.close();
    }
}
