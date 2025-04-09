package com.mycompany.roteiro03;
import java.util.Scanner;
public class Programa13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a operacao desejada(+;-;*;/): ");
        String op = sc.next();
        System.out.println("Digite o segundo numero: ");
        double n2 = sc.nextDouble();
        switch(op){
            case "+": soma(n1,n2);
            break;
            case"-": sub(n1,n2);
            break;
            case"*": mult(n1,n2);
            break;
            case"/": div(n1,n2);
            break;
            default:
                System.out.println("Operacao invalida! Encerrando sitema...");
        }
    }
    
    public static void soma (double n1, double n2){
        System.out.println("O resultado da operacao de soma = "+(n1+n2));
    }
    public static void sub (double n1, double n2){
        System.out.println("O resultado da operacao de soma = "+(n1-n2));
    }
    public static void mult (double n1, double n2){
        System.out.println("O resultado da operacao de soma = "+(n1*n2));
    }
    public static void div (double n1, double n2){
        System.out.println("O resultado da operacao de soma = "+(n1/n2));
    }
}
