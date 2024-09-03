package exceptionhandeling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExc {
    
        //to take input from user we can use readLine() func

        public static void main(String[] args) {

            
            try{// we handle the exception in try block if any exception occurs like not suitable input then it will go in catch block

            //buffered reader expects a object ob reader class so create the object
            InputStreamReader isr=new InputStreamReader(System.in);

            BufferedReader br=new BufferedReader(isr); // to use this we need to import the package java io

            // ioexception sqlexception comes under checked exception so we need to handle them


            int i=Integer.parseInt(br.readLine());//can not convert string to int so we use parseInt()
            int j=Integer.parseInt(br.readLine());//can not convert string to int so we use parseInt()

            //parseInt() func is used to convert string to int and it is a static func of class Integer so we use

            /* readLine() func is used to take input from user and this function belongs to a class called buffer reader 
             * so we need to make a object of the class and then use the method
             * 
             */
            }
            catch(IOException e){
                System.out.println(e);
        }
    }  
}
