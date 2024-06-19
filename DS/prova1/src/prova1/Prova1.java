/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class Prova1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declarando as variaveis e o Scanner;
        
        int n1, n2, res;
        Scanner teclado = new Scanner(System.in);
        
        //fazendo as perguntas;
        
        System.out.println("Digite o primeiro número: ");
        n1 = teclado.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = teclado.nextInt();
        
        //calculo da soma;
        
        res = n1 + n2;
        
        System.out.printf("A soma dos dois valores foi: "+ res);
        
        
        
    }
    
}
