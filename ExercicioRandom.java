package com.mycompany.roteiro_02;
import java.util.Random;
import java.util.Scanner;
public class ExercicioRandom {
    public static void main(String args[]){
        Random random = new Random();
        int NSecreto = random.nextInt(100)+ 1;
        Scanner sc = new Scanner(System.in);
        boolean acertou = false;
        while(acertou == false){
            System.out.println("Digite seu palpite: ");
            int num = sc.nextInt();
            if(num > NSecreto){
                System.out.println("numero digitado > numero secreto");
                acertou = false;
            }
            if(num < NSecreto){
                System.out.println("numero digitado < numero secreto");
                acertou = false;
            }
            if(num == NSecreto){
                System.out.println("Parabens!!!! Voce acertou o numero secreto");
                acertou = true;
            }
        }

    }
}
