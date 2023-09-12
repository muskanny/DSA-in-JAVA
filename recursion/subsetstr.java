package recursion;
import java.util.*;
import java.io.*;
public class subsetstr {
    
   
    public static void substr(String s, String curr,int index)
    {
        if(index==s.length()){
            System.out.println(curr+" ");
            
            return;
        }

      
        
      

        
      
        
       
     
        substr(s, curr+s.charAt(index), index+1);
        substr(s,curr,index+1);


    }



    public static void main(String[] args) {
        substr("abc","", 0);


        
    }
    
}
