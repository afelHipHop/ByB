/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byb;

import java.util.ArrayList;
import it.ssc.pl.milp.*;
/**
 *
 * @author afelr
 */
public class ByB {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    
    public static void main(String[] args) throws Exception {
//        double var[] = {4,5.2,6.1,8};
//        Rama inicio = new Rama();
//        inicio.añadirVariables(var);
//        System.out.println(inicio.elegirVariable());

 

 
//        String milp_string=
//                 
//                        "3 1 4 7 8 min      . "  +"\n"+
//                        "5 2 0 3 0 le       9 "  +"\n"+
//                        "3 1 1 0 5 ge       12"  +"\n"+
//                        "6 3 4 5 0 ge       124" +"\n"+
//                        "1 3 0 3 6 ge       854" +"\n"+
//                        "0 0 0 0 0 lower    . "  +"\n"+
//                        ". . . . . upper    . "  +"\n"+
//                        "1 1 1 1 1 integer  . "  +"\n" ;  
// 
//        InputString milp_input = new InputString(milp_string);
//        milp_input.setInputFormat("X1-X5:double, TYPE:varstring(20),  RHS:double");
                 
        ArrayList< String > constraints = new ArrayList< String >();
          
        constraints.add("min:  3x1 +X2 +4x3 +7x4 +8X5 "); 
        constraints.add("5x1 +2x2 +3X4       <= 9");
        constraints.add("3x1 + X2 +X3 +5X5   >= 12");
        constraints.add("6X1+3.0x2 +4X3 +5X4 >= 124");
        constraints.add(" X1 + 3x2 +3X4 +6X5 >= 854");
        constraints.add(" int x1, x2, X3, x4, x5 ");
        MILP milp=new MILP(constraints);
        SolutionType solution_type= milp.resolve();
 
        if(solution_type==SolutionType.OPTIMUM) { 
            Solution solution=milp.getSolution();
            for(Variable var:solution.getVariables()) {
                System.out.println("Variable :"+var.getName() + " value:"+var.getValue());
            }
            for(SolutionConstraint sol_constraint: solution.getSolutionConstraint()) {
                System.out.println("Contraint: "+sol_constraint.getName()+" : value="+sol_constraint.getValue() + 
                              "[ "+sol_constraint.getRel()+"  "+sol_constraint.getRhs()+" ]" );
            }

            System.out.println("o.f. value:"+solution.getOptimumValue());
        }else
            System.out.println("no es optimo");
    }

    
    
}
