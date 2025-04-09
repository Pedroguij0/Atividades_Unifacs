package com.mycompany.roteiro03;
import java.util.Scanner;
public class Programa12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double SalarioB,SalarioF;
        System.out.println("Digite o Salario Base: ");
        SalarioB = sc.nextDouble();
        double Imposto = Programa12.calcs(SalarioB, 7);
        double Grat = Programa12.calcs(SalarioB, 5);
        SalarioF = SalarioB + Grat - Imposto;
        System.out.printf("Salario final = %.2f",SalarioF);
    }
    public static double calcs(double SalarioB, double perc){
        return SalarioB*perc/100 ;
    }
}
