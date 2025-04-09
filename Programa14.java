package com.mycompany.roteiro03;
import java.util.Scanner;
public class Programa14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a operacao desejada(+;-;*;/): ");
        String op = sc.next();
        System.out.println("Digite o segundo numero: ");
        double n2 = sc.nextDouble();
        /*Atencao! O codigo abaixo foi um outro meio encontrado para alcançar o 
        mesmo resultado requisitado no roteiro 03. Tudo aquilo que está comentado
        condiz com o meio tradicional de alcançar à meta requisitada*/
        if("+".equals(op)){
            System.out.println("Soma = "+operacao(n1,n2,op));
        }
        else if("-".equals(op)){
            System.out.println("Subtracao = "+operacao(n1,n2,op));
        }
        else if("*".equals(op)){
            System.out.println("Multiplicacao = "+operacao(n1,n2,op));
        }
        else if("/".equals(op)){
            System.out.println("Divisao = "+operacao(n1,n2,op));
        }
        else{
            System.out.println("Operacao invalida! Encerrando sitema...");
        }
            /*switch (op) {
                case "+" : soma(n1, n2);
                break;
                case "-" : sub(n1, n2);
                break;
                case "*" : mult(n1, n2);
                break;
                case "/" : div(n1, n2);
                break;
                default:
                System.out.println("Operacao invalida");
            }*/
    }
    public static double operacao(double n1, double n2, String op){
                switch(op){
                    case "+":return n1+n2;
                    case "-": return n1-n2;
                    case "*": return n1*n2;
                    case "/": return n1/n2;
                    default:
                    System.out.println("Operacao invalida! Encerrando sitema...");
                    return 0;
                }
            }
    /*public static double soma (double n1, double n2){
        return n1+n2;
    }
    public static double sub (double n1, double n2){
        return n1-n2;
    }
    public static double mult (double n1, double n2){
        return n1*n2;
    }
    public static double div (double n1, double n2){
        return n1/n2;
    }*/
}