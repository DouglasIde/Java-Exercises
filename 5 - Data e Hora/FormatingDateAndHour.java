// EXERCISE 2
// Capturar a data e a hora atual
// Formatar a data no padrão dd-MM-yyyy 
// Formatar a hora no padrão HH:mm 
// Exibir o resultado da formatação

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatingDateAndHour {
    public static void main(String[] args) {
        String relatorio = "Relatorio A";

        // Pegando o horario e data atual
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        // Formatando a Data
        DateTimeFormatter DataFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataAtual.format(DataFormatter);

        // Formatando o Horário
        DateTimeFormatter HoraFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormatada = horaAtual.format(HoraFormatter);

        System.out.printf("O relatório: %s%n", relatorio);
        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);


    }
    
}
