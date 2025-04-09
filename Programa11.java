package com.mycompany.roteiro03;
import java.util.Scanner;
public class Programa11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double SalarioB,SalarioF,Imposto,Grat;
        System.out.println("Digite o Salario Base: ");
        SalarioB = sc.nextDouble();
        Grat = Programa11.calcGrat(SalarioB);
        Imposto = Programa11.calcImp(SalarioB);
        SalarioF = SalarioB + Grat - Imposto;
        System.out.printf("Salario final = %.2f",SalarioF);
    }
    public static double calcGrat(double SalarioB){
        return SalarioB*0.05;
    }
    public static double calcImp(double SalarioB){
        return SalarioB*0.07;
    }
}
