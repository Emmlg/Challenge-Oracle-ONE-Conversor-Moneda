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
public class TestValidar {
    public static void main(String[] args) {
        
        ValidarInput test = new ValidarInput();
        
        
        
        System.out.println(test.isNumeric("2222477817225.35"));        
        System.out.println(test.isLetter("25546j"));        
        System.out.println(test.isNumeric("s25"));
        System.out.println(test.isLetter("25546"));        
        System.out.println(test.isLetter("25546.25"));
        
        
        System.out.println("--------");
        System.out.println(test.getAbrMoneda("   USD - Dólares"));
        System.out.println(test.getAbrTemp("   °K - Grados Kelvin"));
        
    }
    
}
