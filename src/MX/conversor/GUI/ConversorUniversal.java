/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mx.conversor.GUI;

import Mx.conversor.Logica.AgregarDatosJcbx;
import Mx.conversor.Logica.Convertidor;
import Mx.conversor.Logica.ValidarInput;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;




/**
 *
 * @author lopez
 */
public class ConversorUniversal extends javax.swing.JPanel {

    /**
     * Creates new form Conversor_moneda
     */
    

    AgregarDatosJcbx llenarJcbx,invertirLlenado;
    private String status = "moneda";
    
    public ConversorUniversal(String quien) {
        initComponents();
     llenarJcbx = new AgregarDatosJcbx(jcbx_inConvertFrom, jcbx_inConvertTo);
        
        if(quien.equals("moneda")){
            
            cargarDatosMoneda();        
        
        }else if(quien.equals("temperatura")){
        
            cargarDatosTemp();
        }
        
        
        
    }
    
    
    private void cargarDatosMoneda(){
        
        System.out.println("inicio de moneda");
         llenarJcbx.iniComboMonedasFrom();
         llenarJcbx.iniComboMonedasTo();
         
       Icon icono = new ImageIcon(new ImageIcon(  getClass().getResource("/Mx.Conversor.Img/intercambiar64x64.png" )).getImage());
       lb_outImgConvert.setIcon(icono);
         
         
    
         lb_outTitle.setText("Importe");
         status = "moneda";    
    }
    private void cargarDatosTemp(){
        
        System.out.println("inicio de temperatura");
         llenarJcbx.iniComboTemperatura();
         
         Icon icono = new ImageIcon(new ImageIcon(  getClass().getResource( "/Mx.Conversor.Img/temperatura64x64.png" )).getImage());
         lb_outImgConvert.setIcon(icono);
    
         lb_outTitle.setText("Temperatura");
         status = "temperatura";    
    }
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_outTitle = new javax.swing.JLabel();
        txf_inImporte = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jcbx_inConvertFrom = new javax.swing.JComboBox<>();
        jcbx_inConvertTo = new javax.swing.JComboBox<>();
        bttn_Convertir = new javax.swing.JButton();
        lb_outImgConvert = new javax.swing.JLabel();
        jp_AVISOS = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxa_outAvisos = new javax.swing.JTextArea();
        lb_outMessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(152, 175, 189));

        lb_outTitle.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        lb_outTitle.setText("Importe");

        txf_inImporte.setBackground(new java.awt.Color(152, 175, 189));
        txf_inImporte.setFont(new java.awt.Font("Monospaced", 1, 25)); // NOI18N
        txf_inImporte.setForeground(new java.awt.Color(36, 35, 35));
        txf_inImporte.setBorder(null);
        txf_inImporte.setOpaque(false);
        txf_inImporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txf_inImporteMouseClicked(evt);
            }
        });
        txf_inImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_inImporteKeyPressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jcbx_inConvertFrom.setBackground(new java.awt.Color(253, 254, 253));
        jcbx_inConvertFrom.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jcbx_inConvertFrom.setBorder(null);
        jcbx_inConvertFrom.setOpaque(false);

        jcbx_inConvertTo.setBackground(new java.awt.Color(253, 254, 253));
        jcbx_inConvertTo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        bttn_Convertir.setBackground(new java.awt.Color(253, 254, 253));
        bttn_Convertir.setFont(new java.awt.Font("Arial Black", 1, 35)); // NOI18N
        bttn_Convertir.setText("Convertir");
        bttn_Convertir.setBorderPainted(false);
        bttn_Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_ConvertirActionPerformed(evt);
            }
        });

        lb_outImgConvert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mx.Conversor.Img/intercambiar64x64.png"))); // NOI18N
        lb_outImgConvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_outImgConvertMouseClicked(evt);
            }
        });

        jp_AVISOS.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mx.Conversor.Img/alarma32x32.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Zona de  ¡ Avisos !");

        jtxa_outAvisos.setEditable(false);
        jtxa_outAvisos.setColumns(20);
        jtxa_outAvisos.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jtxa_outAvisos.setRows(5);
        jScrollPane1.setViewportView(jtxa_outAvisos);

        javax.swing.GroupLayout jp_AVISOSLayout = new javax.swing.GroupLayout(jp_AVISOS);
        jp_AVISOS.setLayout(jp_AVISOSLayout);
        jp_AVISOSLayout.setHorizontalGroup(
            jp_AVISOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AVISOSLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_AVISOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jp_AVISOSLayout.setVerticalGroup(
            jp_AVISOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AVISOSLayout.createSequentialGroup()
                .addGroup(jp_AVISOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lb_outMessage.setFont(new java.awt.Font("Monospaced", 1, 38)); // NOI18N
        lb_outMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lb_outImgConvert)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbx_inConvertTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbx_inConvertFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(bttn_Convertir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jp_AVISOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lb_outTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_inImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lb_outMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lb_outTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_inImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_AVISOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbx_inConvertFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jcbx_inConvertTo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lb_outImgConvert)))
                        .addGap(50, 50, 50)
                        .addComponent(bttn_Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lb_outMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_ConvertirActionPerformed
    
        ValidarInput verificar = new ValidarInput();
        Convertidor convertir = new Convertidor();
        
        String input = txf_inImporte.getText();
        String converFrom = jcbx_inConvertFrom.getSelectedItem().toString();
        String convertTo = jcbx_inConvertTo.getSelectedItem().toString();
        
        
        if(! verificar.isLetter(input) && !input.isEmpty()){
            
            double cantidad = Double.valueOf(input);
        
            if(status.equals("moneda")){
                
                 converFrom = verificar.getAbrMoneda(converFrom);
                 convertTo = verificar.getAbrMoneda(convertTo);
                
                if (converFrom.equals("MXN")) {
                   
                    String resul = convertir.ConvertirDe_Peso_A(convertTo,cantidad);
                    lb_outMessage.setText("$ "+cantidad+" MXN = "+resul + " "+convertTo);
                    
                }else if( convertTo.equals("MXN")){
                    
                    String resul = convertir.Convertir_A_Peso(converFrom,cantidad);
                    lb_outMessage.setText(cantidad+" "+converFrom +"  = "+resul + " MXN");
                }
      
            
            }else if(status.equals("temperatura")){
                
                    converFrom = verificar.getAbrTemp(converFrom);
                    convertTo = verificar.getAbrTemp(convertTo);
                
                if(converFrom.equals(convertTo)){
                
                    jtxa_outAvisos.setText("La operación no es \n  ¡ valido !");
                }else{                              
               
                 String resul = "";
                switch(converFrom){
                    
                    case "C" : resul = convertir.convertir_C_a(convertTo, cantidad); break;
                    case "F" : resul = convertir.convertir_F_a(convertTo, cantidad); break;
                    case "K" : resul = convertir.convertir_K_a(convertTo, cantidad); break;
                }
                
                lb_outMessage.setText(cantidad + " " + converFrom + " = " + resul + " "+ convertTo);
                
                }
            
            }
        
        }else{
            
            jtxa_outAvisos.setText("Ingrese Solo Números");        
        }
       
        
        
    }//GEN-LAST:event_bttn_ConvertirActionPerformed

    private void txf_inImporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txf_inImporteMouseClicked
     
        jtxa_outAvisos.setText("");
        lb_outMessage.setText("");
     
    }//GEN-LAST:event_txf_inImporteMouseClicked

    private void lb_outImgConvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_outImgConvertMouseClicked

        lb_outMessage.setText("");
        txf_inImporte.setText("");
        
        if (status.equals("moneda")) {
            
            if( llenarJcbx != null){
           
                invertirLlenado = new AgregarDatosJcbx(jcbx_inConvertTo, jcbx_inConvertFrom);
                llenarJcbx = null;
                invertirLlenado.iniComboMonedasFrom();
                invertirLlenado.iniComboMonedasTo();
            }else{
               invertirLlenado = null;
               llenarJcbx = new AgregarDatosJcbx(jcbx_inConvertFrom, jcbx_inConvertTo);
               llenarJcbx.iniComboMonedasFrom();
               llenarJcbx.iniComboMonedasTo();

            
            
            }
     
        }else if(status.equals("temperatura")){
            
            invertirLlenado = new AgregarDatosJcbx(jcbx_inConvertTo, jcbx_inConvertFrom);
            invertirLlenado.iniComboTemperatura();          
        
        }
        
        
        
    }//GEN-LAST:event_lb_outImgConvertMouseClicked

    private void txf_inImporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_inImporteKeyPressed
        
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            
            bttn_Convertir.doClick();
        }
    }//GEN-LAST:event_txf_inImporteKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_Convertir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbx_inConvertFrom;
    private javax.swing.JComboBox<String> jcbx_inConvertTo;
    private javax.swing.JPanel jp_AVISOS;
    private javax.swing.JTextArea jtxa_outAvisos;
    private javax.swing.JLabel lb_outImgConvert;
    private javax.swing.JLabel lb_outMessage;
    private javax.swing.JLabel lb_outTitle;
    private javax.swing.JTextField txf_inImporte;
    // End of variables declaration//GEN-END:variables
}
