/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author User
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int num1 = 0;
       int num2 = 1;
       int temp;
       int limite = 100000000;
       
       System.out.println(num1);
       System.out.println(num2);
       
       while( num1 + num2 <= limite){
           temp = num1;
           num1 = num2;
           num2 = num1 + temp;
           
           System.out.println(num2);
       }
       
    }
    
}
