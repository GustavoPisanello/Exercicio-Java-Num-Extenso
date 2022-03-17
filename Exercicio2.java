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
public class Exercicio2 {
    
public static void main(String[] args) {
    
     Scanner s1 = new Scanner (System.in);
     System.out.print("Escreva um número: ");
     float num1 = 0;
     int i = 0;
     float result = 0;
     
    do{
    
      num1 = s1.nextFloat();
      
      if (num1 > 0) {
          System.out.print("Escreva um número: ");
          i++;  
          result = result + num1;  
          
      } else {
          System.out.println( result/i);
      }
      
        
    }  while(num1>0); 
    
    
    

}
    
}
