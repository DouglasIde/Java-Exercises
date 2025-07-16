// EXERCISE 3
// Maria quer calcular a soma de todos os números pares de 1 a 100.
// Ela decidiu usar um loop para iterar pelos números e somar apenas aqueles divisíveis por 2.

public class NumerosPares{
    public static void main(String[] args) {

        int soma = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                soma += i;
            }
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
        
    }
}