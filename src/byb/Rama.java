/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byb;

import java.util.*;

/**
 *
 * @author afelr
 */
public class Rama implements Iterator{
    
    public int apuntador;
    private double z;
    private ArrayList<Double> variables;
    private Rama HojaI;
    private Rama HojaD;
    private Vector restricciones;

    public Rama(){
        variables = new ArrayList<>();
        HojaI=null;
        HojaD=null;
    }

    public void setZ(double z){    
        this.z = z;       
    }
    
    public double getZ(){
        return z;
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void añadirVariables(double[] v){
    
        for (int i = 0; i < v.length ; i++){
            variables.add(v[i]);
        }
        
    }
    
    public double elegirVariable(){
        for (Double variable : variables) {
            if (variable % 1 != 0) {
                return variable;
            }
        }
        return -1;
    }
}
