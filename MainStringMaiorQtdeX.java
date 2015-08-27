package br.com.tdv.precoleta.model;

import java.util.HashMap;

public class MainStringMaiorQtdeX {
	
    
  public char cadeia(String cadeia){    
	  
       HashMap<Character, Integer> map = new HashMap<Character, Integer>();    
           
       for(int i = 0; i<cadeia.length(); i++){    
           char c = cadeia.charAt(i);    
           Integer val = map.get(new Character(c));    
               
           if(val != null){    
               map.put(c, new Integer(val+1));    
           } else {    
               map.put(c, 1);                  
           }        
       }        
         
       char max = ' ';  
       int maxCount = -1;  
         
       for(char c: map.keySet()) {  
           int count = map.get(c);  
           if(count > maxCount || maxCount == -1) {  
               maxCount = count;  
               max = c;  
           }  
       }  
         
       return max;  
   }    
       
   public static void main(String[] args){    
	   MainStringMaiorQtdeX obj = new MainStringMaiorQtdeX();    
       System.out.println(obj.cadeia("aaaabbbbcccccddiiiikkkk"));    
       System.out.println(obj.cadeia("aaabb"));    
       System.out.println(obj.cadeia("555555ttt44"));    
   }    
   
}
