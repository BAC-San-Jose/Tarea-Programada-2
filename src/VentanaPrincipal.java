
import java.awt.Color;
import java.awt.Image;
import java.io.*;
import java.util.Calendar;
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
     * Funcion constructora de VentanaPrincipal
     */
    public VentanaPrincipal() {
        FileWriter escribirEmbarazadas = null;
        try {
            FileWriter escribir = null;
            Discapacitados = new Queue();
            Embarazadas = new Queue();
            Corporativos = new Queue();
            Regulares = new Queue();
            Mayores = new Queue();
            Prioridad = new Queue();
            Clientes = new Queue();
            Cajas = new ArrayList();
            DisponibilidadCajas = new ArrayList();
            initComponents();
            File folder = new File(System.getProperty("user.dir")+"/Clientes");
            folder.mkdir();
            txtEmbarazadas = new File(System.getProperty("user.dir")+"/Clientes/Embarazadas.txt");
            escribirEmbarazadas = new FileWriter(txtEmbarazadas,true);
            escribirEmbarazadas.close();
            txtDiscapacitados = new File(System.getProperty("user.dir")+"/Clientes/Discapacitados.txt");
            FileWriter escribirDiscapacitados = new FileWriter(txtDiscapacitados,true);
            escribirDiscapacitados.close();
            txtMayores = new File(System.getProperty("user.dir")+"/Clientes/Mayores.txt");
            FileWriter escribirMayores = new FileWriter(txtMayores,true);
            escribirMayores.close();
            txtCorporativos = new File(System.getProperty("user.dir")+"/Clientes/Corporativos.txt");
            FileWriter escribirCorporativos = new FileWriter(txtCorporativos,true);
            escribirCorporativos.close();
            txtRegulares = new File(System.getProperty("user.dir")+"/Clientes/Regulares.txt");
            FileWriter escribirRegulares = new FileWriter(txtRegulares,true);
            escribirRegulares.close();
            this.setLocationRelativeTo(null);
            getContentPane().setBackground(new java.awt.Color(229,55,55));
            NombreVentana.setBackground(Color.white);
            NombreVentana.setOpaque(true);
            setResizable(false);
            Reloj hora = new Reloj(jLabel1);
            hora.start();
            Calendar Cal= Calendar.getInstance();
            String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
            jLabel2.setText(fec);
            archivo = new LeerTxt();
            /**
             * contadorDiscapacitados = archivo.Tipo("Discapacitados");
             * contadorMayores = archivo.Tipo("Mayores");
             * contadorEmbarazadas = archivo.Tipo("Embarazadas");
             * contadorCorporativos = archivo.Tipo("Corporativos");
             * contadorRegulares = archivo.Tipo("Regulares");
             **/
            contadorDiscapacitados = archivo.resultadodiscapacitados;
            contadorMayores = archivo.resultadomayores;
            contadorEmbarazadas = archivo.resultadoembarazadas;
            contadorCorporativos = archivo.resultadocorporativos;
            contadorRegulares = archivo.resultadocorporativos;
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escribirEmbarazadas.close();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        NombreVentana = new javax.swing.JLabel();
        BtncambiarLogo = new javax.swing.JButton();
        BtnCambiarNombre = new javax.swing.JButton();
        EtiquetaCantidadDeCajas = new javax.swing.JLabel();
        CantidadCajas = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtNombre = new javax.swing.JTextPane();
        BtnAceptar = new javax.swing.JButton();
        BtnPredeterminado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BAC San Jose");
        setBackground(new java.awt.Color(242, 36, 36));
        setFocusCycleRoot(false);
        setPreferredSize(new java.awt.Dimension(567, 380));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(43, Short.MAX_VALUE)
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

        EtiquetaCantidadDeCajas.setForeground(new java.awt.Color(254, 254, 254));
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

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Hora:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("fecha");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Hora:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Fecha:");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCambiarNombre)
                            .addComponent(BtncambiarLogo))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtncambiarLogo)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCambiarNombre)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CantidadCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaCantidadDeCajas))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnPredeterminado)
                        .addComponent(BtnAceptar)))
                .addGap(18, 18, Short.MAX_VALUE))
        );

        CantidadCajas.getAccessibleContext().setAccessibleParent(CantidadCajas);

        setBounds(0, 0, 690, 373);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton que devuelve el nombre y la imagen del banco a la configuracion inicial
     * @param evt 
     */
    private void BtnPredeterminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPredeterminadoActionPerformed
        // TODO add your handling code here:
        NombreVentana.setText("Sistema de Atención a Clientes BAC");
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagenes/Logo BAC.gif")));
        imagen = System.getProperty("user.dir")+"/Imagenes/Logo BAC.gif";
        this.setTitle("BAC San Jose");
        imagen = "/Imagenes/Logo BAC.gif";
        texto = "Sistema de Atención a Clientes BAC";
    }//GEN-LAST:event_BtnPredeterminadoActionPerformed

    /**
     * Funcion que cambia el nombre del banco
     * @param evt 
     */
    private void BtnCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiarNombreActionPerformed
        // TODO add your handling code here:  
        if("".equals(TxtNombre.getText())){}
        else{
            NombreVentana.setText(TxtNombre.getText());
            this.setTitle(TxtNombre.getText());
            texto = TxtNombre.getText();
            TxtNombre.setText("");
            
        }
            
        
    }//GEN-LAST:event_BtnCambiarNombreActionPerformed

    /**
     * Funcion que cambia el logo del banco
     * @param evt 
     */
    private void BtncambiarLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncambiarLogoActionPerformed
        // TODO add your handling code here:
        //Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("\\Imagenes\\wallpaper-1133041.jpg")));
        JFileChooser elemento = new JFileChooser();  //Crea un objeto de dialogo JFileChooser
        elemento.setFileFilter(png);
        elemento.setFileFilter(gif);
        elemento.setFileFilter(jpg);
        int option = elemento.showOpenDialog(this);  // Abre la ventana en dialogo
        if (option == JFileChooser.APPROVE_OPTION){
            try {
                String file = elemento.getSelectedFile().getPath();  //Obtener ruta y nombre al hacer click
                ImageIcon fot = new ImageIcon(file); 
                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(241, 33, Image.SCALE_DEFAULT)); 
                //System.out.println(Logo.getWidth()+" "+ Logo.getHeight());
                Logo.setIcon(icono); 
                this.repaint();
                imagen = file;
                
            } catch (Exception ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
                                            
    }//GEN-LAST:event_BtncambiarLogoActionPerformed

    /**
     * Funcion que inicializa el sistema, si ya se introdujo un numero de cajas
     * @param evt 
     */
    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        // TODO add your handling code here:
        if (CantidadCajas.getValue().equals(0)){
            JOptionPane.showMessageDialog(null,"No ha seleccionado la cantidad de cajas");   
        }
        else if (imagen == null){
            JOptionPane.showMessageDialog(null,"No ha seleccionado la imagen");   
        }
        else{
            //System.out.print(CantidadCajas.getValue());
            cantidadCajas = (int) CantidadCajas.getValue();
            for(int i=1;i<=cantidadCajas;i++){
                Cajas.add(""+i);
                DisponibilidadCajas.add(""+0);
            }
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
    private javax.swing.JLabel NombreVentana;
    private javax.swing.JTextPane TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Declaracion de variables
     */
    private static final FileNameExtensionFilter jpg = new FileNameExtensionFilter("Archivo JPG","jpg");
    private static final FileNameExtensionFilter png = new FileNameExtensionFilter("Archivo PNG","png");
    private static final FileNameExtensionFilter gif = new FileNameExtensionFilter("Archivo GIF","gif");
    public static String imagen = null;// System.getProperty("user.dir")+"/Imagenes/Logo BAC.gif";
    public static String texto = "Sistema de Atención a Clientes BAC";
    public static int cantidadCajas;
    public static String Dato;
    public static ArrayList Cajas;
    public static ArrayList DisponibilidadCajas;
    
    public static Queue Discapacitados;
    public static Queue Mayores;
    public static Queue Embarazadas;
    public static Queue Corporativos;
    public static Queue Regulares;
    public static Queue Prioridad;
    public static Queue Clientes;
    public static int contadorDiscapacitados;
    public static int contadorMayores;
    public static int contadorEmbarazadas;
    public static int contadorCorporativos;
    public static int contadorRegulares;
    LeerTxt archivo;
    File txtEmbarazadas;
    File txtDiscapacitados;
    File txtRegulares;
    File txtCorporativos;
    File txtMayores;    
}
