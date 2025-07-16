// EXERCISE 2
// João recebeu uma lista de valores representando as recetas de sua loja de roupas.
// Ele quer calcular a soma total dessas receitas para entender o desempenho financeiro semanal

public class SomaNumeros {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        // FOR onde é calculado a soma de todos os valores da lista
        for (int valor : valores){
            soma += valor;
        }

        System.out.println("A soma total dos valores é: " + soma);
    }
}
