package com.mycompany.roteiro_02;
import java.util.Scanner;
public class Programa05 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       for(int c = 0; c<=5; c++){
           System.out.println("Informe a nota");
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
