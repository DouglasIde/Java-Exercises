// EXERCISE 4
// Para garantir que os prazos sejam cumpridos, voce precisa calcular a data de entrega de cada projeto com base na data de inicio
// e no prazo estimado em dias.

// Crie um programa que:
// -> Receba uma data de inicio;
// -> Adicione o prazo em dias ao inicio do projeto;
// -> Exiba a data final formatada corretamente

// Se a data de inicio for 15 de março de 2025 e o prazo for 15 dias, a saída deve ser:
// OUTPUT: Data de entrega: 30-03-2025

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculandoData {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        // Data formatada seguindo o Pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Qual é a data de inicio do Projeto (dd-mm-yyyy): ");
        String dta_inicio = sc.nextLine();

        // Formatar a data que o usuário informou
        LocalDate dataInicioFormat = LocalDate.parse(dta_inicio, formatter);

        System.out.println("Quantos dias tem até o prazo: ");
        Integer diasPrazo = sc.nextInt();

        // Adiciona os dias estipulado pelo usuário a data final
        LocalDate dataFormatada = dataInicioFormat.plusDays(diasPrazo);

        System.out.println("Data da Entrega: " + dataFormatada);

    }
}
