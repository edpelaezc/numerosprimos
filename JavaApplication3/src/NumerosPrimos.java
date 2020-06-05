/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edanP
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        int numero = 1;
        while (count < 10) {
            if (esPrimo(numero)) {
                count++;                
                System.out.println(numero);
            }
            numero++;
        }
    }
    
    static boolean esPrimo(int num) {
        int cont = 2; 
        boolean flag = false; 
        
        while(cont != num && flag){
            if (num % cont == 0) {
                flag = false; 
                cont++;
            }            
        }
        return flag; 
    }
}
