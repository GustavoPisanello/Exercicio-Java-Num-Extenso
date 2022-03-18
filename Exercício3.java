
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
    String uni[] = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};

  
        if(uniUser == 0 && dezeUser == 0 && centUser ==0){
            System.out.print("zero");
        }
        else if(dezeUser == 1 && uniUser == 1){
            System.out.print("onze");
         }
         else if(dezeUser == 1 && uniUser == 2){
            System.out.print("doze");
         }
         else if(dezeUser == 1 && uniUser == 3){
            System.out.print("treze");
         }
         else if(dezeUser == 1 && uniUser == 4){
            System.out.print("quatorze/catorze");
         }
         else if(dezeUser == 1 && uniUser == 5){
            System.out.print("quinze");
         }
         else if(dezeUser == 1 && uniUser == 6){
            System.out.print("dezesseis");
         }
         else if(dezeUser == 1 && uniUser == 7){
            System.out.print("dezessete");
         }
         else if(dezeUser == 1 && uniUser == 8){
            System.out.print("dezoito");
         }
         else if(dezeUser == 1 && uniUser == 9){
            System.out.print("dezenove");
         }

    if(centUser >= 1){
        System.out.print(cent[centUser] + " e " + deze[dezeUser] + " e " + uni[uniUser]);

    }
    else if (dezeUser>=1 && uniUser == 0){

        System.out.print(deze[dezeUser] );     
    }
    else if (dezeUser>=1){

        System.out.print(cent[centUser] + deze[dezeUser] + " e " + uni[uniUser]);     
    }
    else {
        System.out.print(uni[uniUser]);  
    }

    }
}
