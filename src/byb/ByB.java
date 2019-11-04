/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byb;

/**
 *
 * @author afelr
 */
public class ByB {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        double var[] = {4,5.2,6.1,8};
        Rama inicio = new Rama(0.1,var);
        System.out.println(inicio.elegirVariable());
    }
    
}
