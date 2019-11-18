/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byb;

import it.ssc.pl.milp.LP;
import it.ssc.pl.milp.SimplexException;
//import it.ssc.pl.milp.MILP;
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
    
    private LP lp;
    private SolutionType st;
    private Solution solution;
    
    public ByB(String problema,int cVar) throws Exception{
        lp=new LP(agregarProblema(problema, cVar));
        st = resolver(lp);
    }

    public Boolean getFactible() throws Exception{      
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
    
    public SolutionType resolver(LP milp)throws Exception{
        SolutionType solution_type= milp.resolve();
        return solution_type;
    }
    
    public ArrayList<String> getNombreVariables() throws SimplexException{
        sol();
        ArrayList<String> nVar = new ArrayList<>();
        for(Variable var:solution.getVariables()){
            nVar.add(var.getName());
        }
        return nVar;
    }
    
    public ArrayList<Double> getValorVariables() throws SimplexException{
        sol();
        ArrayList<Double> vVar = new ArrayList<>();
        for(Variable var:solution.getVariables()){
            vVar.add(var.getValue());
        }
        return vVar;
    }
    
    public Double getResultado() throws SimplexException{
        sol();
        return solution.getOptimumValue();
    }
    
    public void sol() throws SimplexException{
        if (solution==null)
            solution=lp.getSolution();
        //return solution;
    }
}
