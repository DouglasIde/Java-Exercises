// EXERCISE 4
// Crie um programa que receba o nome de um arquivo e exiba o nome sem a extensão

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        String newFile = sc.nextLine();

        Pattern padrao = Pattern.compile("^(.+)\\.[^.]+$");
        Matcher match = padrao.matcher(newFile);

        if(match.matches()){
            String FileMatch = match.group(1);
            System.out.printf("Nome do arquivo sem extensão: %s", FileMatch);
        }
    }
}
