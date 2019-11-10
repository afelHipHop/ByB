/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byb;

import it.ssc.log.SscLogger;
import it.ssc.parser.exception.InvalidInformatStringException;
import it.ssc.pl.milp.MILP;
import it.ssc.pl.milp.Solution;
import it.ssc.pl.milp.SolutionType;
import it.ssc.pl.milp.Variable;
import it.ssc.ref.InputString;
import java.util.ArrayList;
/**
 *
 * @author afelr
 */
public class ByB {
    
    private MILP milp;
    private SolutionType st;
    private Solution solution;
    
    public ByB(String problema,int cVar) throws Exception{
        milp=new MILP(agregarProblema(problema, cVar));
        st = resolver(milp);
    }

    public Boolean getFactible() throws Exception{
       //milp=new MILP(agregarProblema(problema, cVar));
         
        /*if(resolver(milp)==SolutionType.OPTIMUM) { 
            Solution solution=milp.getSolution();
            for(Variable var:solution.getVariables()) {
                SscLogger.log("Variable :"+var.getName() + " value:"+var.getValue());
            }
            SscLogger.log("o.f. value:"+solution.getOptimumValue());
        }else
            System.out.println("No es posible operar");*/
        
        return st==SolutionType.OPTIMUM;
    }
    
    public String formato(int cVar){
        return "X1-X"+cVar+":double, TYPE:varstring(20),  RHS:double";
    }
    
    public InputString agregarProblema(String problema,int cVar) throws Exception {
        InputString milp_input = new InputString(problema);
        milp_input.setInputFormat(formato(cVar));
        return milp_input;
    }
    
    public SolutionType resolver(MILP milp)throws Exception{
        SolutionType solution_type= milp.resolve();
        return solution_type;
    }
    
    public ArrayList<String> getNombreVariables(){
        sol();
        ArrayList<String> nVar = new ArrayList<>();
        for(Variable var:solution.getVariables()){
            nVar.add(var.getName());
        }
        return nVar;
    }
    
    public ArrayList<Double> getValorVariables(){
        sol();
        ArrayList<Double> vVar = new ArrayList<>();
        for(Variable var:solution.getVariables()){
            vVar.add(var.getValue());
        }
        return vVar;
    }
    
    public Double getResultado(){
        sol();
        return solution.getOptimumValue();
    }
    
    public void sol(){
        if (solution==null)
            solution=milp.getSolution();
        //return solution;
    }
}
