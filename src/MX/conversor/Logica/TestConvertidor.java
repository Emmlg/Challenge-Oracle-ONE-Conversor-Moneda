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
public class TestConvertidor {
    public static void main(String[] args) {
        
        Convertidor convertir = new Convertidor();
        
        System.out.println(convertir.ConvertirDe_Peso_A("USD",100)); //5.880
        System.out.println(convertir.ConvertirDe_Peso_A("KRW",525));//39754.208
        System.out.println(convertir.ConvertirDe_Peso_A("EUR",125.01));//6.601
        
        System.out.println("---------------");
        
        System.out.println(convertir.Convertir_A_Peso("USD",5.88));//100
        System.out.println(convertir.Convertir_A_Peso("KRW",39754.208));//525
        System.out.println(convertir.Convertir_A_Peso("EUR",6.601));//125.01
        
        System.out.println("-------------");
        
        System.out.println(convertir.convertir_C_a("°F",50));//122
        System.out.println(convertir.convertir_C_a("°K", 0));//273.15
        
        System.out.println("88*8*8*8*8");
        System.out.println(5/9);
        System.out.println(convertir.convertir_F_a("°C",500));//260
        System.out.println(convertir.convertir_F_a("°K", 50));//283.15
        
        System.out.println(convertir.convertir_K_a("°F",0));//-459.67
        System.out.println(convertir.convertir_K_a("°C", 0));//-273.15
        
        
        
        
    }
    
}
