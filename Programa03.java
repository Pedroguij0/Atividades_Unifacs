package com.mycompany.roteiro_2;
import javax.swing.JOptionPane;
public class Programa03 {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Diga seu nome ae pvt");
        String age = JOptionPane.showInputDialog("Diga sua idade");
        int idade = Integer.parseInt(age); 
        JOptionPane.showMessageDialog(null,"Seu nome: "+nome);
        JOptionPane.showMessageDialog(null, "Tu tem "+idade+" anos");
         /*2) Qual a diferença percebida entre o input das variáveis nome e idade?
        R: devido ao fato de a biblioteca JOptionPane necessitar de um 'parse'
        para reconhecer valores diferentes do objeto String, no caso da variável
        'nome', não houve a necessidade de realizar a sua devida conversão, por ele
        ja atender à necessidade requerida pelo JOptionPane em relação à tipagem.
        Porém, no caso da idade, por ser uma variável do tipo inteiro, houve então
        a necesidade de uma conversão para que os processos fossem devidamente 
        efetuados*/
        
    }
}
