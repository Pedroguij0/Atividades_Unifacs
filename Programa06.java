package com.mycompany.roteiro_02;
import java.util.Scanner;
public class Programa06 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Informe a nota: ");
            int nota = sc.nextInt();
            if(nota !=-1){
                if(nota >= 7){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }            
            }
            else{
                System.out.println("Encerrando sistema...");
                break;
            }
    }
    }
}
