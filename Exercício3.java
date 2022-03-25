
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
    String deze[] = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
    String uni[] = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
    String excessao[] = {"dez","Onze", "Doze", "Treze", "Catorze", "Quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

      if(centUser == 0 && dezeUser == 1){
         System.out.print(excessao[uniUser]);
      }
      else if(centUser >= 1 && dezeUser == 1){
         System.out.print(cent[centUser] + " e " + excessao[uniUser]);
      }
      else if(uniUser == 0){
         System.out.print(cent[centUser] + " e " + deze[dezeUser]);
      }
      else if(centUser == 0 && dezeUser == 0){
         System.out.print(uni[uniUser]);
      }
      else {
         System.out.print(cent[centUser] + " e " + deze[dezeUser] + " e " + uni[uniUser]);
      }
    }
}
