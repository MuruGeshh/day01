package myapp.core;
//this is my first app
import java.io.Console;

public class Demo {

    public static void main(String[] args){

        Console cons = System.console();
        
        //read from input
        //operand 0
        String operand0 = cons.readLine("Operand 0").trim();

        //operand 1
        String operand1 = cons.readLine("Operand 1").trim();

        //operand 
        String operator = cons.readLine("operator; add,sub,div,mul").trim();
        
        //convert string to integer

        Integer val0 = Integer.parseInt(operand0);
        Integer val1 = Integer.parseInt(operand1);
        Float result = 0f; //float

        switch(operator){

            case "add":
            result = (float)(val0 + val1);
             break;

             case "sub":
             result = (float)(val0 - val1);
             break;

             case "mul":
             result = (float)(val0 * val1);

             break;

             case "div":
             result =   ((float)val0 / val1);

             break;

             default:
        }
             System.out.printf("Result: %d %s %d = %.3f\n ", val0 , operator , val1, result );







        }






        
       
      


       
  
       









    }



    

