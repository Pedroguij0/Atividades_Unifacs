package com.mycompany.lista.vetores;
import java.util.Arrays;    

public class ListaVetores {    
    public static void main(String[] args) {
           /*Leia dois vetores VET1 e VET2, ambos com 10 elementos cada, sendo que só devem
ser aceitos valores em ordem crescente. Após gere e imprima o vetor VET3, resultado
da intercalação de VET1 e VET2.
*/
           int VET1[] = {20,10,3,4,5,12,13,22,14,9};
           int VET2[] = {1,11,5,8,19,6,21,15,2,7};
           Arrays.sort(VET1);
           Arrays.sort(VET2);
           System.out.print("Vetor 1: ");
           for(int j:VET1){
               System.out.print(j+" ");
           }
           System.out.print("\nVetor 2: ");
           for(int i:VET2){
               System.out.print(i+" ");
           }
           System.out.print("\nJuntos: ");
           for(int n=0; n<=9; n++){
               System.out.print(VET1[n]+" "+VET2[n]+" ");
           }
    }
}
