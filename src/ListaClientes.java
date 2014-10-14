
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * Clase encargada de mostrar los datos de los clientes en uan tabla
 */
public class ListaClientes extends javax.swing.JFrame {

    Ordenar orden;
    ClientesLeidos listas;
    /**
     * Metodo constructor de ListaClientes
     */
    public ListaClientes() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(229,55,55));
        TablaClientes.setVisible(false);
        this.setLocationRelativeTo(null);
        listas = new ClientesLeidos ();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        Crear = new javax.swing.JButton();
        CheckNombre = new javax.swing.JRadioButton();
        CheckCorreo = new javax.swing.JRadioButton();
        CheckPrioridad = new javax.swing.JRadioButton();
        CheckHoraFecha = new javax.swing.JRadioButton();
        Ordenar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Correo", "Prioridad", "Hora", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaClientes);

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        CheckNombre.setText("Nombre");
        CheckNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckNombreActionPerformed(evt);
            }
        });

        CheckCorreo.setText("Correo");
        CheckCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckCorreoActionPerformed(evt);
            }
        });

        CheckPrioridad.setText("Prioridad");

        CheckHoraFecha.setText("Hora y Fecha");

        Ordenar.setText("Ordenar");
        Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(CheckNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckPrioridad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckHoraFecha))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Crear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ordenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckNombre)
                    .addComponent(CheckCorreo)
                    .addComponent(CheckPrioridad)
                    .addComponent(CheckHoraFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crear)
                    .addComponent(Ordenar)
                    .addComponent(botonCancelar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metodo del boton "Crear" que crea la lista con los datos de los clientes
     * @param evt 
     */
    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        try {
            listas.Tipo();
            String [] Columnas={"Nombre","Correo","Prioridad","Hora","Fecha"};
            DefaultTableModel Clientes = new DefaultTableModel(null, Columnas);
            for (int a = 0; a< ClientesLeidos.listaCorporativos.getSize();a++){
                String [] Cliente={
                    ClientesLeidos.listaCorporativos.getElemento(a), //nombre
                    ClientesLeidos.listaCorporativos.getElemento(a+1), // corre
                    ClientesLeidos.listaCorporativos.getElemento(a+2), // prioridad
                    ClientesLeidos.listaCorporativos.getElemento(a+3), // hora
                    ClientesLeidos.listaCorporativos.getElemento(a+4),}; // fecha
                Clientes.addRow(Cliente);
                a = a+4;
            }
            for (int a = 0; a< ClientesLeidos.listaDiscapacitados.getSize();a++){
                String [] Cliente={
                    ClientesLeidos.listaDiscapacitados.getElemento(a), //nombre
                    ClientesLeidos.listaDiscapacitados.getElemento(a+1), // corre
                    ClientesLeidos.listaDiscapacitados.getElemento(a+2), // prioridad
                    ClientesLeidos.listaDiscapacitados.getElemento(a+3), // hora
                    ClientesLeidos.listaDiscapacitados.getElemento(a+4),}; // fecha
                Clientes.addRow(Cliente);
                a = a+4;
            }
            for (int a = 0; a< ClientesLeidos.listaEmbarazadas.getSize();a++){
                String [] Cliente={
                    ClientesLeidos.listaEmbarazadas.getElemento(a), //nombre
                    ClientesLeidos.listaEmbarazadas.getElemento(a+1), // corre
                    ClientesLeidos.listaEmbarazadas.getElemento(a+2), // prioridad
                    ClientesLeidos.listaEmbarazadas.getElemento(a+3), // hora
                    ClientesLeidos.listaEmbarazadas.getElemento(a+4),}; // fecha
                Clientes.addRow(Cliente);
                a = a+4;
            }
            for (int a = 0; a< ClientesLeidos.listaMayores.getSize();a++){
                String [] Cliente={
                    ClientesLeidos.listaMayores.getElemento(a), //nombre
                    ClientesLeidos.listaMayores.getElemento(a+1), // corre
                    ClientesLeidos.listaMayores.getElemento(a+2), // prioridad
                    ClientesLeidos.listaMayores.getElemento(a+3), // hora
                    ClientesLeidos.listaMayores.getElemento(a+4),}; // fecha
                Clientes.addRow(Cliente);
                a = a+4;
            }
            for (int a = 0; a< ClientesLeidos.listaRegulares.getSize();a++){
                String [] Cliente={
                    ClientesLeidos.listaRegulares.getElemento(a), //nombre
                    ClientesLeidos.listaRegulares.getElemento(a+1), // corre
                    ClientesLeidos.listaRegulares.getElemento(a+2), // prioridad
                    ClientesLeidos.listaRegulares.getElemento(a+3), // hora
                    ClientesLeidos.listaRegulares.getElemento(a+4),}; // fecha
                Clientes.addRow(Cliente);
                a = a+4;
            }
            TablaClientes.setModel(Clientes);
            TablaClientes.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ListaClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ListaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearActionPerformed
    
    /**
     * Metodo del boton "Ordenar", que ordena la lista segun lo solicitado por el usuario
     * @param evt 
     */
    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
        ClientesLeidos nombres=new ClientesLeidos();
        if(CheckNombre.isSelected()==true){ 

        }
        if(CheckCorreo.isSelected()==true){ 
            
        }
        if(CheckPrioridad.isSelected()==true){ 
            
        }
        if(CheckHoraFecha.isSelected()==true){ 
            
        }
    }//GEN-LAST:event_OrdenarActionPerformed

    /**
     * oculta la ventana
     * @param evt 
     */
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        hide();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void CheckNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckNombreActionPerformed

    private void CheckCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CheckCorreo;
    private javax.swing.JRadioButton CheckHoraFecha;
    private javax.swing.JRadioButton CheckNombre;
    private javax.swing.JRadioButton CheckPrioridad;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Ordenar;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
