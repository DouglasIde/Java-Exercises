// EXERCISE 1
// Carla começou a praticar trilha e deseja saber quantos degraus precisará subir
//  para chegar ao topo de uma escadaria. Ela sobe um degrau por vez e quer um programa que
//  mostre sua subida até o topo

import java.util.Scanner;

public class ContagemDegraus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus que Carla precisa subir para chegar ao topo: ");
        int degraus = scanner.nextInt();

        for(int i = 1; i <= degraus; i++){
            System.out.println("Subindo o degrau " + i);
            if(i == degraus){
                System.out.println("Você chegou ao topo!");
            }
        }
    }
}