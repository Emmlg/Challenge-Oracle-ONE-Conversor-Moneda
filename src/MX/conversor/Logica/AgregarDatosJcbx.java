/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mx.conversor.Logica;

import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

/**
 *
 * @author lopez
 */
public class AgregarDatosJcbx {

    JComboBox JcbxFrom,JcbxTo;
    
    public AgregarDatosJcbx(JComboBox from,JComboBox to) {
        
       mElementos = new Hashtable<>();
       this.JcbxFrom = from;
       this.JcbxTo = to;
    }
    
    Hashtable <Object ,ImageIcon> mElementos;
    final int width  = 24;
    final int height = 24;
    
    
    String[] imgRootBanderas = {
        
        "/Mx.Conversor.Img/USD32x32.png",
        "/Mx.Conversor.Img/EUR32x32.png",
        "/Mx.Conversor.Img/GBP32x32.png",
        "/Mx.Conversor.Img/JPY32x32.png",
        "/Mx.Conversor.Img/KRW32x32.png"
    };
    String[] imgRootTemperatura = {
        
        "/Mx.Conversor.Img/centigrado32x32.png",
        "/Mx.Conversor.Img/farenheit32x32.png",
        "/Mx.Conversor.Img/kelvin32x32.png"
    };
    
    String[] monedas = {
        
        "   USD - Dólares",
        "   EUR - Euro",
        "   GBP - Libras Esterlinas",
        "   JPY - Yen japones",
        "   KRW - won Corea Sur"    
    };
    
    String[] temperaturas = {
        
        "   °C - Grados Celsius",
        "   °F - Grados Fahrenheit",
        "   °K - Grados Kelvin"    
    };
    
    
    public void iniComboMonedasFrom(){
    
        //eliminar datos Jcbx
        JcbxFrom.removeAllItems();
        
        //agregamos datos
        JcbxFrom.addItem("   MXN - Pesos");
        mElementos.put("   MXN - Pesos",getIcon( "/Mx.Conversor.Img/MXN32x32.png" ));
        
       
        JComboBoxRender mRender = new JComboBoxRender(mElementos);
        JcbxFrom.setRenderer(mRender);  
        
        
    }
    public void iniComboMonedasTo(){
    
        //eliminar datos Jcbx
        JcbxTo.removeAllItems();
        
        //agregamos datos
         addDataJcbx(monedas,imgRootBanderas);
         JComboBoxRender mRender = new JComboBoxRender(mElementos); 
         JcbxTo.setRenderer(mRender);
        
    }
    
    public void iniComboTemperatura(){
        
        //Eliminamos datos
        delDataJcbx();
    
        //agregamos datos
        addDataJcbxTEmperatura(temperaturas,imgRootTemperatura);
        JComboBoxRender mRender = new JComboBoxRender(mElementos);
        JcbxFrom.setRenderer(mRender); 
        JcbxTo.setRenderer(mRender);
        
        
    }

    
    private void delDataJcbx(){
    
        JcbxFrom.removeAllItems();
        JcbxTo.removeAllItems();
    
    }
    private void addDataJcbx(String[] datos,String[] imgRoot ){
        

        
        for (int i = 0; i < imgRoot.length; i++) {
            
            //agregamos datos a Jcombo
           // JcbxFrom.addItem(datos[i]);
            JcbxTo.addItem(datos[i]);
            
            // agregamos las imagenes al combo
            mElementos.put( datos[i],getIcon(imgRoot[i]));
        }
    
    
    }
    private void addDataJcbxTEmperatura(String[] datos,String[] imgRoot ){
        

        
        for (int i = 0; i < imgRoot.length; i++) {
            
            //agregamos datos a Jcombo
            JcbxFrom.addItem(datos[i]);
            JcbxTo.addItem(datos[i]);
            
            // agregamos las imagenes al combo
            mElementos.put( datos[i],getIcon(imgRoot[i]));
        }
    
    
    }
    
    private ImageIcon getIcon(String path){
        
        return new 
           ImageIcon(new ImageIcon( getClass().getResource(path)).getImage());
                
    } 
    
    

    
    
}
