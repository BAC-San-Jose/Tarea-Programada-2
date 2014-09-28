import java.awt.Image;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class VentanaMenu extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form VentanaMenu
     */
    public VentanaMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(229,55,55));
        for(int i=1;i<=VentanaPrincipal.Cajas.size;i++){
            ListaCajas.addItem(i);
        }
        setImagen();
        setTexto();
        setResizable(false);
        Reloj hora = new Reloj(jLabel3);
        hora.start();
        Calendar Cal= Calendar.getInstance();
        String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        jLabel2.setText(fec);
        email = new EmailClientes("tecbanco67@gmail.com","AAAaaa123",VentanaPrincipal.imagen,VentanaPrincipal.imagen,"Es su turno");
        CheckDisponible.setSelected(true);
        confirmar();
        actualizar = new Thread(this);
        actualizar.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        BtnGraficos = new javax.swing.JButton();
        BtnTablaLista = new javax.swing.JButton();
        ventanaCliente = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        NombreVentana = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ListaCajas = new javax.swing.JComboBox();
        CheckDisponible = new javax.swing.JRadioButton();
        CheckOcupada = new javax.swing.JRadioButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnGraficos.setText("Gráficos");
        BtnGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGraficosActionPerformed(evt);
            }
        });

        BtnTablaLista.setText("Tabla Lista");
        BtnTablaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTablaListaActionPerformed(evt);
            }
        });

        ventanaCliente.setText("Cliente");
        ventanaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaClienteActionPerformed(evt);
            }
        });

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
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Cajas");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Hora:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Hora:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Fecha:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("fecha");

        ListaCajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaCajasActionPerformed(evt);
            }
        });

        CheckDisponible.setText("Disponible");
        CheckDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDisponibleActionPerformed(evt);
            }
        });

        CheckOcupada.setText("Ocupada");
        CheckOcupada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOcupadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnGraficos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnTablaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ListaCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(96, 96, 96)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ventanaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(CheckDisponible)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CheckOcupada)
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGraficos)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListaCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckOcupada)
                            .addComponent(CheckDisponible))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ventanaCliente)
                        .addGap(18, 18, 18)
                        .addComponent(BtnTablaLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGraficosActionPerformed
        Graficos graficos = new Graficos ();
        graficos.setVisible(true);
        //hide();
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
        //hide();
    }//GEN-LAST:event_ventanaClienteActionPerformed

    private void BtnTablaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTablaListaActionPerformed
        ListaClientes tabla = new ListaClientes();
        tabla.setVisible(true);
    }//GEN-LAST:event_BtnTablaListaActionPerformed

    private void ListaCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaCajasActionPerformed
        Indice=(int)ListaCajas.getSelectedIndex();
        try {
            if (VentanaPrincipal.DisponibilidadCajas.getElemento(Indice)=="0"){
                CheckDisponible.setSelected(true);
                CheckOcupada.setSelected(false);
            }
            else if(VentanaPrincipal.DisponibilidadCajas.getElemento(Indice)=="1"){
                CheckDisponible.setSelected(false);
                CheckOcupada.setSelected(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(VentanaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListaCajasActionPerformed

    private void CheckDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDisponibleActionPerformed
        CheckOcupada.setSelected(false);
        confirmar();
    }//GEN-LAST:event_CheckDisponibleActionPerformed

    private void CheckOcupadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOcupadaActionPerformed
        CheckDisponible.setSelected(false);
        confirmar();
    }//GEN-LAST:event_CheckOcupadaActionPerformed

    public void confirmar (){
        Indice=(int)ListaCajas.getSelectedIndex();
        if (CheckOcupada.isSelected()==true){
            System.out.println(Indice);
            VentanaPrincipal.DisponibilidadCajas.Modificar("1", Indice);
        }
        else if(CheckDisponible.isSelected()==true){
            VentanaPrincipal.DisponibilidadCajas.Modificar("0", Indice);
        }
    }
    
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
    private javax.swing.JButton BtnTablaLista;
    private javax.swing.JRadioButton CheckDisponible;
    private javax.swing.JRadioButton CheckOcupada;
    private javax.swing.JComboBox ListaCajas;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreVentana;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ventanaCliente;
    // End of variables declaration//GEN-END:variables
    public static EmailClientes email;
    public int Caja=1;
    public int Indice;
    public Thread actualizar;
    
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
    
    public static boolean nextLista(){
        if(VentanaPrincipal.Discapacitados.getSize()==0){
            if(VentanaPrincipal.Mayores.getSize()==0){
                if(VentanaPrincipal.Embarazadas.getSize()==0){
                    if(VentanaPrincipal.Corporativos.getSize()==0){
                        if(VentanaPrincipal.Regulares.getSize()==0){
                            System.out.println("NO se manda mail");
                            return false;
                        }
                        else{
                            VentanaPrincipal.Prioridad.queue(VentanaPrincipal.Regulares.getPersona());
                            VentanaPrincipal.Regulares.deque();
                            System.out.println("si esta vacia regulares");
                        }
                    }
                    else{
                        VentanaPrincipal.Prioridad.queue(VentanaPrincipal.Corporativos.getPersona());
                        VentanaPrincipal.Corporativos.deque();
                        System.out.println("si esta vacia corporativos");
                    }
                }
                else{
                    VentanaPrincipal.Prioridad.queue(VentanaPrincipal.Embarazadas.getPersona());
                    VentanaPrincipal.Embarazadas.deque();
                    System.out.println("si esta vacia Embarazadas");
                }
            }
            else{
                VentanaPrincipal.Prioridad.queue(VentanaPrincipal.Mayores.getPersona());
                VentanaPrincipal.Mayores.deque();
                System.out.println("si esta vacia Mayores");
            }
        }
        else{
            VentanaPrincipal.Prioridad.queue(VentanaPrincipal.Discapacitados.getPersona());
            VentanaPrincipal.Discapacitados.deque();
            System.out.println("si esta vacia discapacitados");
        }
        System.out.println("Se manda mail");
        return true;
    }
  
    public boolean sendEmail(int caja){
        if (nextLista() == true){
            String Nombre = VentanaPrincipal.Prioridad.getPersona().getNombre();
            String Correo = VentanaPrincipal.Prioridad.getPersona().getCorreo();
            System.out.println(Nombre + " "+ Correo);
            email.sendMail("Caja #"+caja,Nombre,Correo);
            VentanaPrincipal.Prioridad.deque();
            return true;
        }
        return false;
    }
    
    public void run(){
        while(true){
            try {
                Indice=(int)ListaCajas.getSelectedIndex();
                try {
                    if (VentanaPrincipal.DisponibilidadCajas.getElemento(Indice)=="0"){
                        CheckOcupada.setSelected(false);
                        CheckDisponible.setSelected(true);
                    }
                    else if(VentanaPrincipal.DisponibilidadCajas.getElemento(Indice)=="1"){
                        CheckOcupada.setSelected(true);
                        CheckDisponible.setSelected(false);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(VentanaMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                Thread.sleep(1000);
                Caja = 1;
                for(int i =0;i<=VentanaPrincipal.DisponibilidadCajas.getSize()-1;i++){
                    try {
                        if (VentanaPrincipal.DisponibilidadCajas.getElemento(i)=="0"){
                            if(VentanaPrincipal.Discapacitados.getSize()==1 || VentanaPrincipal.Mayores.getSize()==1 || VentanaPrincipal.Embarazadas.getSize()==1 || VentanaPrincipal.Corporativos.getSize()==1 || VentanaPrincipal.Regulares.getSize()==1){
                                sendEmail(i+1);
                                VentanaPrincipal.DisponibilidadCajas.Modificar("1",i);
                                CheckDisponible.setSelected(false);
                                CheckOcupada.setSelected(true);
                                break;
                            }
                        }
                        Caja++;
                    } catch (Exception ex) {
                        Logger.getLogger(VentanaMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(VentanaMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}