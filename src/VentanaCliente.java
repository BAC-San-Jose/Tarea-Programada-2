
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VentanaCliente extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VentanaCliente() {
        //EnvioEmail = new Email();
        Discapacitados = new ArrayList();
        Embarazadas = new ArrayList();
        Corporativos = new ArrayList();
        Regulares = new ArrayList();
        CorreoDiscapacitados = new ArrayList();
        CorreoMayores = new ArrayList();
        CorreoEmbarazadas = new ArrayList();
        CorreoCorporativos = new ArrayList();
        CorreoRegulares = new ArrayList();
        Mayores = new ArrayList();
        initComponents();
        getContentPane().setBackground(new java.awt.Color(229,55,55));
        setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreCliente = new javax.swing.JTextField();
        CorreoCliente = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        LabelCorreo = new javax.swing.JLabel();
        CheckClienteD = new javax.swing.JCheckBox();
        CheckClienteM = new javax.swing.JCheckBox();
        CheckClienteE = new javax.swing.JCheckBox();
        CheckClienteC = new javax.swing.JCheckBox();
        CheckClienteR = new javax.swing.JCheckBox();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancelRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelNombre.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(254, 254, 254));
        LabelNombre.setText("Nombre");

        LabelCorreo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(254, 254, 254));
        LabelCorreo.setText("Correo electronico");

        CheckClienteD.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        CheckClienteD.setForeground(new java.awt.Color(254, 254, 254));
        CheckClienteD.setText("Persona Discapacitada");
        CheckClienteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckClienteDActionPerformed(evt);
            }
        });

        CheckClienteM.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        CheckClienteM.setForeground(new java.awt.Color(254, 254, 254));
        CheckClienteM.setText("Adulto Mayor");
        CheckClienteM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckClienteMActionPerformed(evt);
            }
        });

        CheckClienteE.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        CheckClienteE.setForeground(new java.awt.Color(254, 254, 254));
        CheckClienteE.setText("Mujer Embarazada");
        CheckClienteE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckClienteEActionPerformed(evt);
            }
        });

        CheckClienteC.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        CheckClienteC.setForeground(new java.awt.Color(254, 254, 254));
        CheckClienteC.setText("Cliente Corporativo");
        CheckClienteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckClienteCActionPerformed(evt);
            }
        });

        CheckClienteR.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        CheckClienteR.setForeground(new java.awt.Color(254, 254, 254));
        CheckClienteR.setText("Cliente Regular");
        CheckClienteR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckClienteRActionPerformed(evt);
            }
        });

        BotonRegistrar.setText("Aceptar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonCancelRegistro.setText("Cancelar");
        BotonCancelRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CheckClienteD)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckClienteM)
                                .addGap(72, 72, 72)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckClienteR)
                            .addComponent(CheckClienteC)
                            .addComponent(BotonCancelRegistro))
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckClienteE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelCorreo)
                                    .addComponent(LabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NombreCliente)
                                    .addComponent(CorreoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))))
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BotonRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCorreo))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckClienteD)
                    .addComponent(CheckClienteC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckClienteM)
                    .addComponent(CheckClienteR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckClienteE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrar)
                    .addComponent(BotonCancelRegistro))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckClienteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckClienteDActionPerformed
        CheckClienteM.setSelected(false);
        CheckClienteE.setSelected(false);
        CheckClienteC.setSelected(false);
        CheckClienteR.setSelected(false);
    }//GEN-LAST:event_CheckClienteDActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        //EnvioEmail = null;
        String clave = "AAAaaa123";
        Nombre = NombreCliente.getText();
        Correo = CorreoCliente.getText();
        if (CheckClienteD.isSelected()) {
            Discapacitados.add(Nombre);
            CorreoDiscapacitados.add(Correo);
        } else if (CheckClienteM.isSelected()) {
            Mayores.add(Nombre);
            CorreoMayores.add(Correo);
        } else if (CheckClienteE.isSelected()) {
            Embarazadas.add(Nombre);
            CorreoEmbarazadas.add(Correo);
        } else if (CheckClienteC.isSelected()) {
            Corporativos.add(Nombre);
            CorreoCorporativos.add(Correo);
        } else if (CheckClienteR.isSelected()) {
            Regulares.add(Nombre);
            CorreoRegulares.add(Correo);
        }
        //EnvioEmail.Email("tecbanco67@gmail.com",clave,"C:\\uno.jpg","TROLL",Correo,"PRUEBA",Nombre);
        
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void CheckClienteMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckClienteMActionPerformed
        CheckClienteD.setSelected(false);
        CheckClienteE.setSelected(false);
        CheckClienteC.setSelected(false);
        CheckClienteR.setSelected(false);
    }//GEN-LAST:event_CheckClienteMActionPerformed

    private void CheckClienteEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckClienteEActionPerformed
        CheckClienteM.setSelected(false);
        CheckClienteD.setSelected(false);
        CheckClienteC.setSelected(false);
        CheckClienteR.setSelected(false);
    }//GEN-LAST:event_CheckClienteEActionPerformed

    private void CheckClienteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckClienteCActionPerformed
        CheckClienteM.setSelected(false);
        CheckClienteE.setSelected(false);
        CheckClienteD.setSelected(false);
        CheckClienteR.setSelected(false);
    }//GEN-LAST:event_CheckClienteCActionPerformed

    private void CheckClienteRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckClienteRActionPerformed
        CheckClienteM.setSelected(false);
        CheckClienteE.setSelected(false);
        CheckClienteC.setSelected(false);
        CheckClienteD.setSelected(false);
    }//GEN-LAST:event_CheckClienteRActionPerformed

    private void BotonCancelRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelRegistroActionPerformed
        VentanaMenu menu = new VentanaMenu ();
        menu.setVisible(true);
        hide();
    }//GEN-LAST:event_BotonCancelRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelRegistro;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JCheckBox CheckClienteC;
    private javax.swing.JCheckBox CheckClienteD;
    private javax.swing.JCheckBox CheckClienteE;
    private javax.swing.JCheckBox CheckClienteM;
    private javax.swing.JCheckBox CheckClienteR;
    private javax.swing.JTextField CorreoCliente;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JTextField NombreCliente;
    // End of variables declaration//GEN-END:variables
    private String Nombre;
    private String Correo;
    public static ArrayList Discapacitados;
    public static ArrayList Mayores;
    public static ArrayList Embarazadas;
    public static ArrayList Corporativos;
    public static ArrayList Regulares;
    public static ArrayList CorreoDiscapacitados;
    public static ArrayList CorreoMayores;
    public static ArrayList CorreoEmbarazadas;
    public static ArrayList CorreoCorporativos;
    public static ArrayList CorreoRegulares;
    public static int contador = 0;
    //public EmailClientes EnvioEmail;
    
}
