package com.mycompany.roteiro_2;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        String nome = sc.nextLine();
        System.out.println("Nome informado : " + nome);
        sc.close();
    }
}
