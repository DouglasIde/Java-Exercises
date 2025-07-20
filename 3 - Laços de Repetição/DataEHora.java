// EXERCISE 1
// Crie um programa que uma nova tarefa é criada, o sistema deve registrar a data e a hora exatas do momento da criação

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class DataEHora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tarefa deseja adicionar: ");
        String tarefa = sc.nextLine();

        LocalDate tarefaData = LocalDate.now();
        LocalTime tarefaHoras = LocalTime.now();

        System.out.println("Tarefa: " + tarefa);
        System.out.println("Data de criação: " + tarefaData);
        System.out.println("Hora de criação: " + tarefaHoras);
    }
}
