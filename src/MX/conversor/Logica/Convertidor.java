/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mx.conversor.Logica;

import java.text.DecimalFormat;

/**
 *
 * @author lopez
 */
public class Convertidor {

    public Convertidor() {
    
    
    }
    
    
    
    public String ConvertirDe_Peso_A(String abrMoneda,double cantidad){
    
      double total = 0;
     
        switch(abrMoneda){

            case "USD" : total = 0.0588 * cantidad ;break;

            case "EUR" : total = 0.0528 * cantidad ;break;

            case "GBP" : total = 0.0457 * cantidad ;break;

            case "JPY" : total = 8.3455 * cantidad ;break;

            case "KRW" : total = 75.7223 * cantidad ;break;
        }
        
    return formatearNumero(total);
    
    }
    public String Convertir_A_Peso(String abrMoneda,double cantidad){
    
     double total = 0;
     
        switch(abrMoneda){

            case "USD" : total = 16.9904 * cantidad ;break;

            case "EUR" : total = 18.9125 * cantidad ;break;

            case "GBP" : total = 21.8424 * cantidad ;break;

            case "JPY" : total = 0.1198  * cantidad ;break;

            case "KRW" : total = 0.0132  * cantidad ;break;


        }
    return formatearNumero(total);
    
    }
    
    
    public String convertir_C_a(String abr , double cantidad){
    
      double total = 0;
    
        switch(abr){
            
            case "F": total = cantidad * 1.8 + 32 ;break;
            case "K": total = cantidad + 273.15 ;break;

        }
      return formatearNumero(total);
    }
    
    public String convertir_F_a(String abr , double cantidad){
    
      double total = 0;
      
        switch(abr){
            
            case "C": total = (cantidad - 32) * 0.5555 ; break;
            case "K": total = (cantidad - 32) * 0.5555 + 273.15;break;

        }
      return formatearNumero(total);
    }
    
    public String convertir_K_a(String abr , double cantidad){
    
     double total = 0;
     
        switch(abr){
            
            case "F": total = (cantidad - 273.15) * 1.8 + 32; break;
            case "C": total =  cantidad - 273.15 ; break;

        }
      return formatearNumero(total);
    }
    
    
    private String formatearNumero(double cantidad){
    
        DecimalFormat df = new DecimalFormat("#.000");
    
        return df.format(cantidad);
    }
    
    
}
