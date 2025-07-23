// EXERCISE 5
// Os clientes solicitam em alguns casos um adiantamento da data de pagamento, e o sistema precisa calcular a nova data de vencimento com base na quantidade de
// meses adicionados.

// Crie um programa que:
// -> Receba uma data de vencimento original
// -> Adicione um número de meses ao vencimento
// -> A data ajustada deve ser exibida no formato "dd-MM-yyyy"

// Se a data de vencimento original for 20 de março de 2025 e o adiantamento for de 1 mes, a saída deve ser:
// OUTPUT: Nova data de vencimento: 20-04-2025

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
public class AjustandoDataVenc {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        // Estipula a data de vencimento padrão
        LocalDate vencimento = LocalDate.of(2025, Month.AUGUST,16);

        System.out.println("""
            OBS: A cada mês adiado será cobrado 5% de juros por mês.
            
            Informe quantos meses você gostaria de adiar o vencimento:
        """);

        Integer mesAdd = sc.nextInt();

        // Atualiza o mes de vencimento de acordo com o valor do usuário
        LocalDate vencimentoAtt = vencimento.plusMonths(mesAdd);

        System.out.println("Vencimento anterior: " + vencimento);
        System.out.println("Nova data de vencimento: " + vencimentoAtt);
        
    }
}
