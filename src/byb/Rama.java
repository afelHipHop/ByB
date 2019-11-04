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
    
    private double z;
    private double[] variables;
    private Vector restricciones;

    public Rama(double z, double[] variables){
        setZ(z);
        setVariables(variables);
    }
    
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double[] getVariables() {
        return variables;
    }

    public void setVariables(double[] variables) {
        this.variables = variables;
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

    public double elegirVariable(){
        for (int i = 0; i < variables.length ; i++){
             if (variables[i] % 1 != 0) {
                return variables[i];
            }
        }
        return -1;
    }
}
