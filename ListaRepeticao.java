    package com.mycompany.lista.repeticao;

    import java.util.Scanner;

    public class ListaRepeticao {

        public static void main(String[] args) {
           int cod = 0;
           int SomaOutros = 0;
           int SomaServicos = 0;
           int NumM = 0;
           int NumF = 0;
           Scanner sc = new Scanner(System.in);
            do{
                System.out.println("""
                               Codigo Objetivo
                                 1    Compras
                                 2    Servicos (Banco, correio,etc.)
                                 3    Lazer (Cinema, jogos,etc.)
                                 4    Alimentacao (restaurantes e lanchonetes
                                 5    Encerrar Pesquisa""");
                
                System.out.println("Digite o seu genero (M) = masculino; (F) = feminino: ");
                char gen = sc.next().toUpperCase().charAt(0);
                if(gen != 'M' && gen != 'F'){
                    System.out.println("Genero invalido. Encerrando sistema");
                    break;
                }
                else{
                    if(gen == 'M'){
                        NumM+=1;
                    }
                    else{
                        NumF+=1;
                    }
                }
                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();
                System.out.println("Digite o Codigo conforme seu objetivo vindo ao shopping: ");
                cod = sc.nextInt();
                if(cod <= 0 || cod > 5){
                    System.out.println("Codigo Invalido. Encerrando Sistema");
                    break;
                }
                else{
                    if(cod != 2 && cod != 5){
                         SomaOutros += 1;
                    }
                    else{
                        if(cod == 2 && cod != 5){
                         SomaServicos += 1;
                    }
                    }
                }
            }while(cod != 5);
            sc.close();
            float porcentS = ((float)SomaServicos/(SomaOutros+SomaServicos)) * 100;
            System.out.println("A porcentagem de pessoas que escolheram a opcao 'Servicos' ="+porcentS+"%");
            if(NumF > NumM){
                System.out.println("Frequentaram mais Mulheres que Homens");
            }
            if(NumM > NumF){
                System.out.println("Frequentaram mais Homens que Mulheres");
            }
            else{
                System.out.println("A frequancia de homens e mulheres eh igual");
            }
        }
    }