/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mx.conversor.Logica;

/**
 *
 * @author lopez
 */
public class ValidarInput {

    
    
    public ValidarInput() {
        
          
    }
    

    
    public boolean isNumeric(String input){
        
        try {
            
            double numero = Double.valueOf(input);
            return true;            
            
        } catch (Exception e) {
            return false;
        }
    
    
    
    }
    
    public boolean isLetter(String input){
    
     return input.matches(".*[a-zA-Z].*");
    
    }
    
    public String getAbrMoneda(String cadena){
        
      cadena = cadena.replaceAll("[^a-zA-Z0-9]", "");
    return cadena.substring(0,3);
    
    }
    public String getAbrTemp(String cadena){
        
      cadena = cadena.replaceAll("[^a-zA-Z0-9]", "");
    return cadena.substring(0,1);
    
    }
    
    
    
    
}
