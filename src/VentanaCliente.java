
import java.awt.HeadlessException;
import java.awt.Image;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import static org.omg.CORBA.AnySeqHelper.insert;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class VentanaCliente extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VentanaCliente() {
        //EnvioEmail = new Email();
        
        initComponents();
        getContentPane().setBackground(new java.awt.Color(229,55,55));
        setResizable(false);
        this.setLocationRelativeTo(null);
        setImagen();
        setTexto();
        
        Reloj hora = new Reloj(jLabel1);
        hora.start();
        Calendar Cal= Calendar.getInstance();
        String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        jLabel2.setText(fec);
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
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        NombreVentana = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoClienteActionPerformed(evt);
            }
        });

        LabelNombre.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(254, 254, 254));
        LabelNombre.setText("Nombre:");

        LabelCorreo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(254, 254, 254));
        LabelCorreo.setText("Correo electrónico:");

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

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Hora:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Fecha:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("fecha");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Hora:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckClienteE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCorreo)
                            .addComponent(LabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreCliente)
                            .addComponent(CorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckClienteM)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonRegistrar)
                                    .addComponent(CheckClienteD))
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckClienteR)
                            .addComponent(CheckClienteC)
                            .addComponent(BotonCancelRegistro))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCorreo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelRegistro)
                    .addComponent(BotonRegistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String nl = System.getProperty("line.separator");//variable utilizada para saltos de linea
        try {
            if (CheckClienteD.isSelected()==true) {
                //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
                File archivo=new File("Clientes\\Discapacitados.txt");


                //Escribimos en el archivo con el metodo write
                try ( //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribimos en el archivo con el metodo write
                    escribir.write(contadorDiscapacitados+"   "+NombreCliente.getText()+"   "+CorreoCliente.getText()+"   "+Hora+nl);
                    contadorDiscapacitados++;
                    
                    //Cerramos la conexion
                }
            }
            else if (CheckClienteM.isSelected()==true) {
                    //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
                File archivo=new File("Clientes\\Mayores.txt");


                //Escribimos en el archivo con el metodo write
                try ( //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribimos en el archivo con el metodo write
                    escribir.write(contadorMayores+"   "+NombreCliente.getText()+"   "+CorreoCliente.getText()+"   "+Hora+nl);
                    contadorMayores++;
                    
                    //Cerramos la conexion
                }
            }
            else if (CheckClienteE.isSelected()==true) {
                
                     //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
                File archivo=new File("Clientes\\Embarazadas.txt");


                //Escribimos en el archivo con el metodo write
                try ( //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribimos en el archivo con el metodo write
                    escribir.write(contadorEmbarazadas+"   "+NombreCliente.getText()+"   "+CorreoCliente.getText()+"   "+Hora+nl);
                    contadorEmbarazadas++;
                    
                    //Cerramos la conexion
                }
            }
            else if (CheckClienteC.isSelected()==true) {
                File archivo=new File("Clientes\\Corporativos.txt");
                //Escribimos en el archivo con el metodo write
                try ( //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribimos en el archivo con el metodo write
                    escribir.write(contadorCorporativos+"   "+NombreCliente.getText()+"   "+CorreoCliente.getText()+"   "+Hora+nl);
                    contadorCorporativos++;
                    
                    //Cerramos la conexion
                }
            } 
            else if (CheckClienteR.isSelected()==true) {
                File archivo=new File("Clientes\\Regulares.txt");
                //Escribimos en el archivo con el metodo write
                try ( //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribimos en el archivo con el metodo write
                    escribir.write(contadorRegulares+"   "+NombreCliente.getText()+"   "+CorreoCliente.getText()+"   "+Hora+nl);
                    contadorRegulares++;
                    
                    //Cerramos la conexion
                }
                

            }
            JOptionPane.showMessageDialog(null,"Datos Guardados");
        }
        catch(IOException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"Error en los datos dados");
        }
        String clave = "AAAaaa123";
        Nombre = NombreCliente.getText();
        Correo = CorreoCliente.getText();
        Hora = jLabel1.getText();
        Fecha = jLabel2.getText();
        if (CheckClienteD.isSelected()) {
            Persona cliente = new Persona (Nombre,Correo,"D");
            VentanaPrincipal.Discapacitados.queue(cliente);
            VentanaPrincipal.HorasDiscapacitados.add(Hora);
            VentanaPrincipal.FechaDiscapacitados.add(Fecha);
            sizeDiscapacitados = VentanaPrincipal.Discapacitados.getSize();
        } /*
        else if (CheckClienteM.isSelected()) {
            VentanaPrincipal.Mayores.add(Nombre);
            VentanaPrincipal.CorreoMayores.add(Correo);
            VentanaPrincipal.HorasMayores.add(Hora);
            VentanaPrincipal.FechaMayores.add(Fecha);
            sizeMayores = VentanaPrincipal.Mayores.getSize();
        } else if (CheckClienteE.isSelected()) {
            VentanaPrincipal.Embarazadas.add(Nombre);
            VentanaPrincipal.CorreoEmbarazadas.add(Correo);
            VentanaPrincipal.HorasEmbarazadas.add(Hora);
            VentanaPrincipal.FechaEmbarazadas.add(Fecha);
            sizeEmbarazadas = VentanaPrincipal.Embarazadas.getSize();
        } else if (CheckClienteC.isSelected()) {
            VentanaPrincipal.Corporativos.add(Nombre);
            VentanaPrincipal.CorreoCorporativos.add(Correo);
            VentanaPrincipal.HorasCorporativo.add(Hora);
            VentanaPrincipal.FechaCorporativo.add(Fecha);
            sizeCorporativos = VentanaPrincipal.Corporativos.getSize();
        } else if (CheckClienteR.isSelected()) {
            VentanaPrincipal.Regulares.add(Nombre);
            VentanaPrincipal.CorreoRegulares.add(Correo);
            VentanaPrincipal.HorasRegulares.add(Hora);
            VentanaPrincipal.FechaRegulares.add(Fecha);
            sizeRegulares = VentanaPrincipal.Regulares.getSize();
        }*/
        //EnvioEmail.Email("tecbanco67@gmail.com",clave,"C:\\uno.jpg","TROLL",Correo,"PRUEBA",Nombre);
        
        
        //VentanaMenu.sendEmail();
        
        
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
        //VentanaMenu menu = new VentanaMenu ();
        //menu.setVisible(true);
        hide();
    }//GEN-LAST:event_BotonCancelRegistroActionPerformed

    private void CorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoClienteActionPerformed

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
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JLabel NombreVentana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private String Nombre;
    private String Correo;
    private String Hora;
    private String Fecha;
    public static int contadorDiscapacitados = 0;
    public static int contadorMayores = 0;
    public static int contadorEmbarazadas = 0;
    public static int contadorCorporativos = 0;
    public static int contadorRegulares = 0;
    //public EmailClientes EnvioEmail;
    public static int sizeDiscapacitados;
    public static int sizeMayores;
    public static int sizeEmbarazadas;
    public static int sizeCorporativos;
    public static int sizeRegulares;
    
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
    
}
