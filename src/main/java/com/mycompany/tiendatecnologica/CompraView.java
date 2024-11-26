/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tiendatecnologica;

import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author alumno
 */
public class CompraView extends javax.swing.JFrame {

    /**
     * Creates new form TiendaView
     */
    public CompraView() {
        init();
    }
    
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelHead = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonHacerCompra = new javax.swing.JButton();
        jLabelProID = new javax.swing.JLabel();
        jTextFieldPro = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelClintID = new javax.swing.JLabel();
        jTextFieldCli = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonHacerCompra1 = new javax.swing.JButton();
        jPanelImagenes = new javax.swing.JPanel();
        jLabelImagen = new javax.swing.JLabel();
        jTextFieldCant = new javax.swing.JTextField();
        jLabelClintID1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCarac = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setBackground(new java.awt.Color(50, 50, 50));

        jPanelHead.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHead.setPreferredSize(new java.awt.Dimension(1000, 150));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setToolTipText("");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoIcon.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 250, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("B y t e   S h o p");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanelHeadLayout = new javax.swing.GroupLayout(jPanelHead);
        jPanelHead.setLayout(jPanelHeadLayout);
        jPanelHeadLayout.setHorizontalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(557, 557, 557)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHeadLayout.createSequentialGroup()
                        .addGap(567, 567, 567)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeadLayout.setVerticalGroup(
            jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelHeadLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        jButton1.getAccessibleContext().setAccessibleName("jButtonCerrar");

        jButtonHacerCompra.setBackground(new java.awt.Color(255, 255, 0));
        jButtonHacerCompra.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jButtonHacerCompra.setForeground(new java.awt.Color(0, 0, 0));
        jButtonHacerCompra.setText("Comprar");
        jButtonHacerCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHacerCompra.setFocusPainted(false);
        jButtonHacerCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHacerCompraActionPerformed(evt);
            }
        });

        jLabelProID.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabelProID.setForeground(new java.awt.Color(255, 250, 0));
        jLabelProID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProID.setText("Producto ID:");
        jLabelProID.setToolTipText("");

        jTextFieldPro.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPro.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jTextFieldPro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 250, 0));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Realizar Compra");
        jLabelTitle.setToolTipText("");

        jLabelClintID.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabelClintID.setForeground(new java.awt.Color(255, 250, 0));
        jLabelClintID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClintID.setText("Cliente ID:");
        jLabelClintID.setToolTipText("");

        jTextFieldCli.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCli.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jTextFieldCli.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCliActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonHacerCompra1.setBackground(new java.awt.Color(255, 255, 0));
        jButtonHacerCompra1.setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        jButtonHacerCompra1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonHacerCompra1.setText("Cargar Imagen");
        jButtonHacerCompra1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHacerCompra1.setFocusPainted(false);
        jButtonHacerCompra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHacerCompra1ActionPerformed(evt);
            }
        });

        jPanelImagenes.setBackground(new java.awt.Color(255, 255, 255));
        jPanelImagenes.setForeground(new java.awt.Color(0, 0, 0));

        jLabelImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelImagenesLayout = new javax.swing.GroupLayout(jPanelImagenes);
        jPanelImagenes.setLayout(jPanelImagenesLayout);
        jPanelImagenesLayout.setHorizontalGroup(
            jPanelImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelImagenesLayout.setVerticalGroup(
            jPanelImagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextFieldCant.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCant.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        jTextFieldCant.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantActionPerformed(evt);
            }
        });

        jLabelClintID1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabelClintID1.setForeground(new java.awt.Color(255, 250, 0));
        jLabelClintID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClintID1.setText("Cantidad:");
        jLabelClintID1.setToolTipText("");

        jTextAreaCarac.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaCarac.setColumns(20);
        jTextAreaCarac.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaCarac.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCarac);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, 1341, Short.MAX_VALUE)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelClintID1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jTextFieldCant))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelProID)
                        .addGap(39, 39, 39)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPro)
                            .addComponent(jButtonHacerCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelClintID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jTextFieldCli)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonHacerCompra1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabelTitle))
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelProID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelClintID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextFieldCli, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelClintID1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCant, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonHacerCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButtonHacerCompra1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonHacerCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHacerCompraActionPerformed
        BBDD Bd = new BBDD();
        String cliente = jTextFieldCli.getText().trim();
        String producto = jTextFieldPro.getText().trim();
        String cantidad = jTextFieldCant.getText().trim();

       // Verificar si los campos están vacíos antes de intentar convertirlos
       if (("".equals(cliente) || cliente == null) || 
           ("".equals(producto) || producto == null) || 
           ("".equals(cantidad) || cantidad == null)) {

           jTextFieldCli.setText("Escriba algo");
           jTextFieldPro.setText("Escriba algo");
           jTextFieldCant.setText("Escriba algo");
           return;  // Salir del método si los campos están vacíos
       }

       // Si los campos no están vacíos, proceder a la conversión
       try {
           int idUsuario = Integer.parseInt(jTextFieldCli.getText().trim());
           int idProducto = Integer.parseInt(jTextFieldPro.getText().trim());
           int idCantidad = Integer.parseInt(jTextFieldCant.getText().trim());

           if (!Bd.comprobarUsuariosId(idUsuario)) {
               jTextFieldCli.setText("No Existe");
           } else if (!Bd.comprobarProductoId(idProducto)) {
               jTextFieldPro.setText("No Existe");
           } else if (Bd.comprobarStock(idProducto) < idCantidad) {
               jTextFieldCant.setText("No hay Stock");
           } else {
               Bd.nuevaCompra(idUsuario, idProducto, idCantidad);
           }

       } catch (NumberFormatException e) {
           // Capturar el error en caso de que alguno de los campos tenga un valor no numérico
           jTextFieldCli.setText("Error en ID Usuario");
           jTextFieldPro.setText("Error en ID Producto");
           jTextFieldCant.setText("Error en Cantidad");
           e.printStackTrace();  // Imprimir el stack trace para ver el detalle del error
       }
    }//GEN-LAST:event_jButtonHacerCompraActionPerformed

    private void jTextFieldProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProActionPerformed

    private void jTextFieldCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCliActionPerformed

    private void jButtonHacerCompra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHacerCompra1ActionPerformed
        BBDD Bd = new BBDD();
        int idProducto = 0;
        
        if("".equals(jTextFieldPro.getText()) || jTextFieldPro.getText() == null){
            jTextFieldPro.setText("Escriba algo");
        }else{
            idProducto = Integer.parseInt(jTextFieldPro.getText());
        }
        
        if(Bd.comprobarProductoId(idProducto)){
            System.out.println("Existe");
            jTextAreaCarac.setText(Bd.sacarCaracteristicasIdProducto(idProducto));
            ImageIcon icon = new ImageIcon(Bd.sacarImageneIdProducto(idProducto));  // Asegúrate de poner la ruta correcta
        
            // Crear un JLabel y establecer el ImageIcon
            jLabelImagen.setIcon(icon);

            jLabelImagen.revalidate();
            jLabelImagen.repaint();  // Para actualizar la interfaz gráfica y mostrar la imagen

        }else{
            System.out.println("No existe");
        }
    }//GEN-LAST:event_jButtonHacerCompra1ActionPerformed

    private void jTextFieldCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraView().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHacerCompra;
    private javax.swing.JButton jButtonHacerCompra1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClintID;
    private javax.swing.JLabel jLabelClintID1;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelProID;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHead;
    private javax.swing.JPanel jPanelImagenes;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCarac;
    private javax.swing.JTextField jTextFieldCant;
    private javax.swing.JTextField jTextFieldCli;
    private javax.swing.JTextField jTextFieldPro;
    // End of variables declaration//GEN-END:variables
}