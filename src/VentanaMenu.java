
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class VentanaMenu extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(229,55,55));
        setImagen();
        setTexto();
        setCajas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGraficos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ventanaCliente = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        NombreVentana = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Caja1 = new javax.swing.JCheckBox();
        Caja2 = new javax.swing.JCheckBox();
        Caja3 = new javax.swing.JCheckBox();
        Caja4 = new javax.swing.JCheckBox();
        Caja5 = new javax.swing.JCheckBox();
        Caja6 = new javax.swing.JCheckBox();
        Caja7 = new javax.swing.JCheckBox();
        Caja8 = new javax.swing.JCheckBox();
        Caja9 = new javax.swing.JCheckBox();
        Caja10 = new javax.swing.JCheckBox();
        Caja11 = new javax.swing.JCheckBox();
        Caja12 = new javax.swing.JCheckBox();
        Caja13 = new javax.swing.JCheckBox();
        Caja14 = new javax.swing.JCheckBox();
        Caja15 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnGraficos.setText("Gráficos");
        BtnGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGraficosActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ventanaCliente.setText("Cliente");
        ventanaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaClienteActionPerformed(evt);
            }
        });

        jButton4.setText("jButton1");

        jButton5.setText("jButton1");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo BAC.gif"))); // NOI18N

        NombreVentana.setBackground(new java.awt.Color(255, 255, 255));
        NombreVentana.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        NombreVentana.setForeground(new java.awt.Color(229, 55, 55));
        NombreVentana.setText("Sistema de Atención a Clientes BAC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NombreVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Cajas");

        Caja1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja1.setForeground(new java.awt.Color(254, 254, 254));
        Caja1.setText("Caja # 1");
        Caja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja1ActionPerformed(evt);
            }
        });

        Caja2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja2.setForeground(new java.awt.Color(254, 254, 254));
        Caja2.setText("Caja # 2");
        Caja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja2ActionPerformed(evt);
            }
        });

        Caja3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja3.setForeground(new java.awt.Color(254, 254, 254));
        Caja3.setText("Caja # 3");
        Caja3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja3ActionPerformed(evt);
            }
        });

        Caja4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja4.setForeground(new java.awt.Color(254, 254, 254));
        Caja4.setText("Caja # 4");
        Caja4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja4ActionPerformed(evt);
            }
        });

        Caja5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja5.setForeground(new java.awt.Color(254, 254, 254));
        Caja5.setText("Caja # 5");
        Caja5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja5ActionPerformed(evt);
            }
        });

        Caja6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja6.setForeground(new java.awt.Color(254, 254, 254));
        Caja6.setText("Caja # 6");
        Caja6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja6ActionPerformed(evt);
            }
        });

        Caja7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja7.setForeground(new java.awt.Color(254, 254, 254));
        Caja7.setText("Caja # 7");
        Caja7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja7ActionPerformed(evt);
            }
        });

        Caja8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja8.setForeground(new java.awt.Color(254, 254, 254));
        Caja8.setText("Caja # 8");
        Caja8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja8ActionPerformed(evt);
            }
        });

        Caja9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja9.setForeground(new java.awt.Color(254, 254, 254));
        Caja9.setText("Caja # 9");
        Caja9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja9ActionPerformed(evt);
            }
        });

        Caja10.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja10.setForeground(new java.awt.Color(254, 254, 254));
        Caja10.setText("Caja # 10");
        Caja10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja10ActionPerformed(evt);
            }
        });

        Caja11.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja11.setForeground(new java.awt.Color(254, 254, 254));
        Caja11.setText("Caja # 11");
        Caja11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja11ActionPerformed(evt);
            }
        });

        Caja12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja12.setForeground(new java.awt.Color(254, 254, 254));
        Caja12.setText("Caja # 12");
        Caja12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja12ActionPerformed(evt);
            }
        });

        Caja13.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja13.setForeground(new java.awt.Color(254, 254, 254));
        Caja13.setText("Caja # 13");
        Caja13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja13ActionPerformed(evt);
            }
        });

        Caja14.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja14.setForeground(new java.awt.Color(254, 254, 254));
        Caja14.setText("Caja # 14");
        Caja14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja14ActionPerformed(evt);
            }
        });

        Caja15.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        Caja15.setForeground(new java.awt.Color(254, 254, 254));
        Caja15.setText("Caja # 15");
        Caja15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ventanaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Caja13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Caja14))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Caja10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Caja7)
                                            .addComponent(Caja4)
                                            .addComponent(Caja1))
                                        .addGap(60, 60, 60)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Caja8)
                                        .addComponent(Caja5)
                                        .addComponent(Caja2))
                                    .addComponent(Caja11))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Caja3)
                            .addComponent(Caja15)
                            .addComponent(Caja9)
                            .addComponent(Caja12)
                            .addComponent(Caja6))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGraficos)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ventanaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Caja3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Caja6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Caja2)
                                    .addComponent(Caja1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Caja5)
                                    .addComponent(Caja4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Caja7)
                                .addGap(1, 1, 1))
                            .addComponent(Caja8)
                            .addComponent(Caja9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Caja11)
                            .addComponent(Caja10)
                            .addComponent(Caja12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Caja15)
                            .addComponent(Caja13)
                            .addComponent(Caja14))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGraficosActionPerformed
        Graficos graficos = new Graficos ();
        graficos.setVisible(true);
        hide();
    }//GEN-LAST:event_BtnGraficosActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        VentanaPrincipal.imagen = "/Imagenes/Logo BAC.gif";
        VentanaPrincipal.texto = "Sistema de Atención a Clientes BAC";
        VentanaPrincipal salir = new VentanaPrincipal ();
        salir.setVisible(true);
        hide();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void ventanaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaClienteActionPerformed
        VentanaCliente cliente = new VentanaCliente ();
        cliente.setVisible(true);
        hide();
    }//GEN-LAST:event_ventanaClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Caja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja1ActionPerformed

    private void Caja4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja4ActionPerformed

    private void Caja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja2ActionPerformed

    private void Caja7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja7ActionPerformed

    private void Caja5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja5ActionPerformed

    private void Caja8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja8ActionPerformed

    private void Caja11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja11ActionPerformed

    private void Caja10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja10ActionPerformed

    private void Caja3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja3ActionPerformed

    private void Caja6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja6ActionPerformed

    private void Caja15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja15ActionPerformed

    private void Caja9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja9ActionPerformed

    private void Caja12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja12ActionPerformed

    private void Caja13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja13ActionPerformed

    private void Caja14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja14ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGraficos;
    private javax.swing.JCheckBox Caja1;
    private javax.swing.JCheckBox Caja10;
    private javax.swing.JCheckBox Caja11;
    private javax.swing.JCheckBox Caja12;
    private javax.swing.JCheckBox Caja13;
    private javax.swing.JCheckBox Caja14;
    private javax.swing.JCheckBox Caja15;
    private javax.swing.JCheckBox Caja2;
    private javax.swing.JCheckBox Caja3;
    private javax.swing.JCheckBox Caja4;
    private javax.swing.JCheckBox Caja5;
    private javax.swing.JCheckBox Caja6;
    private javax.swing.JCheckBox Caja7;
    private javax.swing.JCheckBox Caja8;
    private javax.swing.JCheckBox Caja9;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreVentana;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ventanaCliente;
    // End of variables declaration//GEN-END:variables

    public void setImagen(){
        if (!"/Imagenes/Logo BAC.gif".equals(VentanaPrincipal.imagen)){
            String file = VentanaPrincipal.imagen;
            ImageIcon fot = new ImageIcon(file); 
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_DEFAULT)); 
            Logo.setIcon(icono); 
            this.repaint();
        }
    }
    
    public void setTexto (){
        String texto = VentanaPrincipal.texto;
        if (!"Sistema de Atención a Clientes BAC".equals(texto)){
            NombreVentana.setText(texto);
            this.setTitle(texto);
        }
        else {
            this.setTitle("BAC San Jose");
        }
    }

    public void setCajas() {
        Caja1.setVisible(false);
        Caja2.setVisible(false);
        Caja3.setVisible(false);
        Caja4.setVisible(false);
        Caja5.setVisible(false);
        Caja6.setVisible(false);
        Caja7.setVisible(false);
        Caja8.setVisible(false);
        Caja9.setVisible(false);
        Caja10.setVisible(false);
        Caja11.setVisible(false);
        Caja12.setVisible(false);
        Caja13.setVisible(false);
        Caja14.setVisible(false);
        Caja15.setVisible(false);
        if (VentanaPrincipal.cantidadCajas >= 1){
            Caja1.setVisible(true);
            if (VentanaPrincipal.cantidadCajas >= 2){
                Caja2.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 3){
                Caja3.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 4){
                Caja4.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 5){
                Caja5.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 6){
                Caja6.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 7){
                Caja7.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 8){
                Caja8.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 9){
                Caja9.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 10){
                Caja10.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 11){
                Caja11.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 12){
                Caja12.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 13){
                Caja13.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 14){
                Caja14.setVisible(true);
            
            if (VentanaPrincipal.cantidadCajas >= 15){
                Caja15.setVisible(true);
            }
        }
    }}}}}}}}}}}}}}

}