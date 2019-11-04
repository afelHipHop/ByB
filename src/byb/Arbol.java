package byb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afelr
 */
public class Arbol {
    private Rama raiz;
    
    public Arbol(){
        raiz = null;
    }
    
    public void insertarRama(double funcion, double[] var){
    
        Rama nuevo = new Rama();
        nuevo.setZ(funcion);
        nuevo.añadirVariables(var);
        if (raiz==null){
            raiz = nuevo;
            nuevo.apuntador = 0;
        }else{
            Rama anterior=null;
        }
        
    }
    
    
    
}
