/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author edanP
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 2; i < 30; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPrimo(int numero){
      int contador = 2;
      boolean primo = true;
      while ((primo) && (contador!=numero)){
        if (numero % contador == 0)
          primo = false;
        
        contador++;
      }
      return primo;
    }
    
}
