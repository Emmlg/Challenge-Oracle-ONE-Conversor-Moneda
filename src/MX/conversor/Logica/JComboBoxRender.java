/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mx.conversor.Logica;

import java.awt.Component;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;



/**
 *
 * @author lopez
 */
public class JComboBoxRender extends JLabel implements ListCellRenderer{

    Hashtable <Object ,ImageIcon> mElementos;
    ImageIcon mImg = new ImageIcon(this.getClass().getResource("") );
    
    public JComboBoxRender(Hashtable<Object,ImageIcon>mElementos){
    
      this.mElementos = mElementos;
    }
    
    
    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {
       
       if(mElementos.get(e) == null){
       
           setIcon(mImg);
       }else{
       
           setIcon(mElementos.get(e));       
       } 
        
        setText(e.toString());
        return this;
    }
    

    
}
