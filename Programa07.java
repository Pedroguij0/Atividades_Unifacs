package com.mycompany.roteiro_02;
import java.util.Scanner;
public class Programa07{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int n = 0;
        while(true){
            System.out.println("Informe a nota: ");
            int nota = sc.nextInt();
            if(nota !=-1){
                if(nota >= 7){
                System.out.println("Aprovado");
                }
                else{
                    System.out.println("Reprovado");
                }
                cont++;
                n += nota;
            }
            else{
                System.out.println("Encerrando sistema...");
                break;
            }
        }
        int media = n/cont;
        System.out.println("A media = "+media);
    }
}


/*4 – Utilizando a classe Programa07 implementado no pacote roteiro2.parte3, seria possível
implementar uma solução que apresentasse não somente a média, mas quantas notas
ficaram acima da média ? Sim ? Não ? Como ? Por quê ? 
R: Sim, uma possível solução seria coletar o resultado da média, criar um loop FOR
para percorrer o vetor que armazenou todas as notas digitadas anteriormente, em seguida
implementar uma condicional em que caso a posição atual do vetor,a nota,
tenha um valor maior que o valor da média, ela então seria alocada num novo vetor que
tem como objetivo armazenar as notas que estão justamente acima da média. Portanto,
todas as vezes que a condicional IF, dentro do FOR, tiver um resultado verdadeiro,
a nota que tem um valor maior que o da média será alocada no novo vetor.*/

