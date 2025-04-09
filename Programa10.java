package com.mycompany.roteiro03;
import java.util.Scanner;
public class Programa10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double SalarioB,SalarioF,Imposto,Grat;
        System.out.println("Digite o Salario Base: ");
        SalarioB = sc.nextDouble();
        Grat = SalarioB*0.05;
        Imposto = SalarioB*0.07;
        SalarioF = SalarioB + Grat - Imposto;
        System.out.printf("Salario final = %.2f",SalarioF);
    }
}
