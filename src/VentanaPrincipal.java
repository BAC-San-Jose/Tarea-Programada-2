
import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
//import java.awt.BuferredImage;

public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public VentanaPrincipal() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(229,55,55));
        Nombre.setBackground(Color.white);
        //Nombre.setOpaque(true);
        //setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        BtncambiarLogo = new javax.swing.JButton();
        BtnCambiarNombre = new javax.swing.JButton();
        EtiquetaCantidadDeCajas = new javax.swing.JLabel();
        CantidadCajas = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtNombre = new javax.swing.JTextPane();
        BtnAceptar = new javax.swing.JButton();
        BtnPredeterminado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BAC San Jose");
        setBackground(new java.awt.Color(242, 36, 36));
        setFocusCycleRoot(false);
        //setPreferredSize(new java.awt.Dimension(567, 380));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo BAC.gif"))); // NOI18N

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        Nombre.setForeground(new java.awt.Color(229, 55, 55));
        Nombre.setText("Sistema de Atención a Clientes BAC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtncambiarLogo.setText("Cambiar Logo");
        BtncambiarLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncambiarLogoActionPerformed(evt);
            }
        });

        BtnCambiarNombre.setText("Cambiar Nombre");
        BtnCambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiarNombreActionPerformed(evt);
            }
        });

        EtiquetaCantidadDeCajas.setText("Cantidad de Cajas:");

        CantidadCajas.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        CantidadCajas.setToolTipText("");

        jScrollPane1.setViewportView(TxtNombre);

        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnPredeterminado.setText("Predeterminado");
        BtnPredeterminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPredeterminadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EtiquetaCantidadDeCajas)
                                .addGap(33, 33, 33)
                                .addComponent(CantidadCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnAceptar)
                                .addGap(41, 41, 41)))
                        .addComponent(BtnPredeterminado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCambiarNombre)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtncambiarLogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtncambiarLogo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnCambiarNombre)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CantidadCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaCantidadDeCajas))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnPredeterminado)
                            .addComponent(BtnAceptar))))
                .addGap(18, 18, 18))
        );

        CantidadCajas.getAccessibleContext().setAccessibleParent(CantidadCajas);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPredeterminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPredeterminadoActionPerformed
        // TODO add your handling code here:
        Nombre.setText("Sistema de Atención a Clientes BAC");
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/Logo BAC.gif")));
        this.setTitle("BAC San Jose");
    }//GEN-LAST:event_BtnPredeterminadoActionPerformed

    private void BtnCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiarNombreActionPerformed
        // TODO add your handling code here:  
        if("".equals(TxtNombre.getText())){}
        else{
            Nombre.setText(TxtNombre.getText());
            this.setTitle(TxtNombre.getText());
            TxtNombre.setText("");
        }
            
        
    }//GEN-LAST:event_BtnCambiarNombreActionPerformed

    private void BtncambiarLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncambiarLogoActionPerformed
        // TODO add your handling code here:
        //Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("\\Imagenes\\wallpaper-1133041.jpg")));
        JFileChooser elemento = new JFileChooser();  //Crea un objeto de dialogo JFileChooser
        elemento.setFileFilter(filter);
        int option = elemento.showOpenDialog(this);  // Abre la ventana en dialogo
        if (option == JFileChooser.APPROVE_OPTION){
            try {
                String file = elemento.getSelectedFile().getPath();  //Obtener ruta y nombre al hacer click
                ImageIcon fot = new ImageIcon(file); 
                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_DEFAULT)); 
                Logo.setIcon(icono); 
                this.repaint();
                
            } catch (Exception ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
                                            
    }//GEN-LAST:event_BtncambiarLogoActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        // TODO add your handling code here:
        
        if (CantidadCajas.getValue().equals(0)){
            JOptionPane.showMessageDialog(null,"No ha seleccionado la cantidad de cajas");   
        }
        
        else{
            System.out.print(CantidadCajas.getValue());
            VentanaMenu MenuTrabajar = new VentanaMenu ();
            MenuTrabajar.setVisible(true);
            hide(); 
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCambiarNombre;
    private javax.swing.JButton BtnPredeterminado;
    private javax.swing.JButton BtncambiarLogo;
    private javax.swing.JSpinner CantidadCajas;
    private javax.swing.JLabel EtiquetaCantidadDeCajas;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextPane TxtNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private static final FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo JPG","jpg");
    
    private void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
