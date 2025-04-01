package com.mycompany.roteiro_2;
import java.util.Scanner;
public class Programa04 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int n = 1;
        while(c<5){
            System.out.println("Informe a nota"+n+": ");
            int nota = sc.nextInt();
            if(nota >= 7){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
    }
    }
}
