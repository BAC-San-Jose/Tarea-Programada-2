
import java.awt.Color;
import javax.swing.JOptionPane;

import org.jfree.chart.*;

import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.data.xy.*;

import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import org.jfree.data.general.DefaultPieDataset;

public class Graficos extends javax.swing.JFrame {

    public Graficos() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.capaPastel.setVisible(false);
        
        this.setVisible(true);
        
        setTitle("Gráficos");
        getContentPane().setBackground(new java.awt.Color(229,55,55));
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioPastel = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGraficos = new javax.swing.JTable();
        capas = new javax.swing.JLayeredPane();
        capaPastel = new javax.swing.JPanel();
        botonGraficar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radioPastel.setText("Pastel");
        radioPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPastelActionPerformed(evt);
            }
        });

        tablaGraficos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cantidad", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tablaGraficos);

        capas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout capaPastelLayout = new javax.swing.GroupLayout(capaPastel);
        capaPastel.setLayout(capaPastelLayout);
        capaPastelLayout.setHorizontalGroup(
            capaPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );
        capaPastelLayout.setVerticalGroup(
            capaPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(capaPastel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(capaPastel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        capas.setLayer(capaPastel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        botonGraficar.setText("Graficar");
        botonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioPastel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGraficar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(radioPastel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(botonGraficar)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(capas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPastelActionPerformed
       capaPastel.setVisible(true);
       capas.setLayer(capaPastel, 0,0);
    }//GEN-LAST:event_radioPastelActionPerformed

    private void botonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficarActionPerformed
        ChartPanel panel;
        JFreeChart chart = null;        
        
        if (radioPastel.isSelected()){
            //Grafico de lineas!!!!!!!!!!!!!!!!
            int validar = 1;
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset = new XYSeriesCollection();
            
            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();
            
            XYSeries serie = new XYSeries ("Datos");
            XYPlot plot;
            capaPastel.removeAll();
            
            try {
                for (int fila = 0; fila < 4; fila++){
                    System.out.println(fila);
                    serie.add(Float.parseFloat(String.valueOf(tablaGraficos.getValueAt(fila, 0))),
                            Float.parseFloat(String.valueOf(tablaGraficos.getValueAt(fila, 1))));
                }
            }
            catch (Exception ex){
                System.out.println("cayo");
                validar = 0;
            }
            if (validar == 1){
                dataset.addSeries(serie);
                x.setLabel("Eje x");
                y.setLabel("Eje y");
                plot = new XYPlot (dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("Graficos");
            }
            else {
                JOptionPane.showMessageDialog(this, "Debe llenar la tabla");
            }
        }
    panel = new ChartPanel (chart);
    panel.setBounds(5, 10, 450, 400);
    
    if (radioPastel.isSelected()){
        //lineas
        capaPastel.add(panel);
        capaPastel.repaint();
    }
    
    }//GEN-LAST:event_botonGraficarActionPerformed

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
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGraficar;
    private javax.swing.JPanel capaPastel;
    private javax.swing.JLayeredPane capas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioPastel;
    private javax.swing.JTable tablaGraficos;
    // End of variables declaration//GEN-END:variables
}
