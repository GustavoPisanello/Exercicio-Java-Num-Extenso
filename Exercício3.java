/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícos;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exercício3 {
    
    public static void main(String[] args) {
        
    System.out.print("Escreva a centena: ");
    Scanner s1 = new Scanner (System.in);
    int centUser = s1.nextInt();

    System.out.print("Escreva a dezena: ");
    Scanner s2 = new Scanner (System.in);
    int dezeUser = s2.nextInt();

    System.out.print("Escreva a unidade: ");
    Scanner s3 = new Scanner (System.in);
    int uniUser = s3.nextInt();   
    

    
    String cent[] = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"}; 
    String deze[] = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
    String uni[] = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};

    System.out.print(cent[centUser] + " e " + deze[dezeUser] + " e " + uni[uniUser]);
  
}
}
