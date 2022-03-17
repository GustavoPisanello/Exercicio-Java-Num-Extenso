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
public class Exercícos {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int x;  
        System.out.print("Escreva um número:");
        x = s1.nextInt();
        int i = 0;
        int result = 0;
        
        do {
            i++;
            System.out.println(result += i);
        } while ( i < x);
    }
}

