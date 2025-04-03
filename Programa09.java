package com.mycompany.roteiro_02;
import java.util.Scanner;
public class Programa09{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int vetorN[] = new int[5];
        for(int i =0; i<vetorN.length; i++){
            System.out.println("Informe uma nota: ");
            int nota = sc.nextInt();
            if(nota>0 && nota<=10){
                vetorN[i] = nota;
            }
            else{
                System.out.println("Nota invalida! Digite somente valores"
                        + "ente 0 e 10.");
                i--;
            }
        }
        for(int c:vetorN){
            System.out.print(c+" ");
        }
    }
}
