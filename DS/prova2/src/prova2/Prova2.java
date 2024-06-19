
package prova2;

import java.util.Scanner;


public class Prova2 {
    
    Scanner teclado = new Scanner(System.in);

    
    public static void main(String[] args) {
        int numeros[] = new int[10];
        
        
            
            numeros[0] = 1;
            numeros[1] = 4;
            numeros[2] = 9;
            numeros[3] = 16;
            numeros[4] = 25;
            numeros[5] = 36;
            numeros[6] = 49;
            numeros[7] = 64;
            numeros[8] = 81;
            numeros[9] = 100;
            
            
        
            
            for(int i = 0; i <= numeros.length; i++){
                System.out.println("numero ao quadrado "+(i+1)+":"+numeros[i]);
            }
    
    
}
}
