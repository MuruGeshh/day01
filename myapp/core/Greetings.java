package myapp.core;

import java.io.Console;

public class Greetings {

    //write the entry point

    public static void main(String[] args){

        //Get the console 
        Console cons = System.console();
        
        //read from input
       String name = cons.readLine("What is your name?");
       name = name.trim();

       if(name.length() > 0)
       {

       System.out.printf(" [%d] Hello %s. Nice to meet you.\n", 10, name.toUpperCase());

       }

       else {

        System.err.println("You habe not written your name");
       
      }




    }

    
}
