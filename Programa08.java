package com.mycompany.roteiro_02;
import java.util.Scanner;
public class Programa08 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int vetorN[] = new int[5];
        for(int i =0; i<vetorN.length; i++){
            System.out.println("Informe uma nota: ");
            int nota = sc.nextInt();
            vetorN[i] = nota;
        }
        for(int c:vetorN){
            System.out.print(c+" ");
        }
    }
}
