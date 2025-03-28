package com.mycompany.lista.vetores;
import java.util.Scanner;
import java.util.ArrayList;
public class ListaVetores3 {
    public static void main(String args[]){
        /*Escreva um programa que leia duas seqüências de até 10 elementos de números
        inteiros e positivos (o número 999 indica o término de cada seqüência). Em seguida
        ele deve gerar um vetor C que seja a união entre estas duas seqüências iniciais e um
        vetor D com os elementos do vetor A que não existem no vetor B (A complementar
        B).*/
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        System.out.println("Digite 10 numeros positivos e inteiros: ");
        for(int c = 0; c<A.length; c++){
            A[c] = sc.nextInt();
            if(A[c]<0){
                System.out.println("Atencao!! Voce digitou um numero negativo. encerrando sistema");
                break;
            }
        }
        boolean numI = false;
        for(int r = 0; r<A.length; r++){
            for(int c = r+1; c<A.length; c++){
                if(A[r]==A[c]){
                    numI = true;
                    break;
                }
            }
        }
        int B[] = new int[10];
        if(!numI){
        System.out.println("Digite 10 numeros positivos e inteiros: ");
        for(int c = 0; c<B.length; c++){
            B[c] = sc.nextInt();
            if(B[c]<0){
                System.out.println("Atencao!! Voce digitou um numero negativo. encerrando sistema");
                break;
                }
            }
        boolean numeroR = false;
        for(int r = 0; r<A.length; r++){
            for(int c = r+1; c<A.length; c++){
                if(A[r]==A[c]){
                    numeroR = true;
                    break;
                }
            }
        }
        if(!numeroR){
        int C[] = new int[20];
        int aux = 0;
        for(int c=0; c<10; c++){
            C[aux++] = A[c];
            C[aux++] = B[c];
        }
        System.out.println("\n");
        for(int n:C){
            System.out.print(n+" ");
        }
        System.out.println("\n");
        ArrayList<Integer> D = new ArrayList<>();
        for(int numA:A){
            boolean existeB = false;
            for(int numB:B){
                if(numA == numB){
                    existeB = true;
                    break;
                }
            }
            if(!existeB){
                D.add(numA);
            }
        }
        for(int c:D){
            System.out.print(c+" ");
        };
        }
        else{
            System.out.println("Atencao! Na sequencia anterior tinham 2 valores "
                    + "iguais. Encerrando sistema...");
        }
        }
        else{
            System.out.println("Atencao! Na sequencia anterior tinham 2 valores "
                    + "iguais. Encerrando sistema...");
        }
    }   
}
