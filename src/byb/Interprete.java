/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byb;

import java.util.ArrayList;

/**
 *
 * @author afelr
 */
public class Interprete {
    
    private String problema="";
    private final String SALTO ="\n"; 
    
    public void interpretar(ArrayList<String> varFunObj, ArrayList<String> varRes, String obj, ArrayList<String> operacion, ArrayList<String> valSol,int cVar){
        
        funcionObj(varFunObj, obj);
        restricciones(varRes, operacion, valSol, cVar);
        rango(cVar, "0", "lower  ");
        rango(cVar, ".", "upper  ");
        rango(cVar, "1", "integer");
        
        System.out.println(problema);
        
    }
    
    public void funcionObj(ArrayList<String> fo, String obj){
        for(String f:fo){
            problema+=f+" ";
        }
        problema+=obj;
        problema+="      . " +SALTO;
    }
    
    public void restricciones(ArrayList<String> r, ArrayList<String> s, ArrayList<String> iR,int cVar){
        int y=0;
        int x=0;
        for(int i = 1; i<=(r.size()+s.size());i++){
            if(i%(cVar+1)==0&&i!=0){
                problema+=cambioSimb(s.get(y))+"       "+iR.get(y)+" "+SALTO;
                y++;
            }else{
                problema+=r.get(x)+" ";
                x++;
            }
        }
    }
    
    public void rango(int cVar, String numero, String tipo){
        for(int i=0;i<cVar;i++){
                problema+=numero+" ";
            }
            problema+=tipo+"  . "+SALTO;
    }
    
    public String cambioSimb(String simb){
        if(simb.equals("<="))
            simb="le";
        else
            simb="ge";
        return simb;
    }
    
}
