package com.mycompany.lista.vetores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ListaVetores2 {
    public static void main(String args[]){
        /*Escreva um programa que leia duas cadeias de até 10 caracteres cada uma e verifica
         se elas são anagramas, imprimindo a mensagem correspondente.
        Obs: anagramas: palavras que tem as mesmas letras
        Ex: ALMA e LAMA são anagramas
        BOLA e LOBO não são anagrama*/
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> palavras = new ArrayList<>();
        System.out.println("Digite uma palavra com menos de 10 letras: ");
        String p1 = sc.nextLine();
        
        for(char a:p1.toCharArray()){
            palavras.add(a);
        }
        ArrayList<Character> palavras2 = new ArrayList<>();
        System.out.println("Digite a segunda palavra: ");
        String p2 = sc.nextLine();
        
        for(char a:p2.toCharArray()){
            palavras2.add(a);
        }
        Collections.sort(palavras2);
        Collections.sort(palavras);
        if(palavras2.size()>10 || palavras.size()>10){
            System.out.println("Alguma das palavras digitadas tem mais que 10 caracteres, tente novemente.");
        }
        else{
            if(palavras.equals(palavras2)){
            System.out.println("As palavras "+p1+" e "+p2+" sao anagramas");
            }
        else{
            System.out.println("As palavras digitadas nao sao anagramas");
        }
        }
        
    }
}
