
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
        
        this.capaPastelTipo.setVisible(false);
        this.capaBarrasTipo.setVisible(false);
        
        this.setVisible(true);
        
        setTitle("Gráficos");
        getContentPane().setBackground(new java.awt.Color(229,55,55));
        capaPastelTipo.setBackground(new java.awt.Color(229,55,55));
        capaBarrasTipo.setBackground(new java.awt.Color(229,55,55));
        capaPastelHora.setBackground(new java.awt.Color(229,55,55));
        capaBarrasHora.setBackground(new java.awt.Color(229,55,55));
        capaPastelDia.setBackground(new java.awt.Color(229,55,55));
        capaBarrasDia.setBackground(new java.awt.Color(229,55,55));
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioPastelTipo = new javax.swing.JRadioButton();
        radioBarrasTipo = new javax.swing.JRadioButton();
        botonGraficar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioPastelHora = new javax.swing.JRadioButton();
        radioBarrasHora = new javax.swing.JRadioButton();
        radioPastelDia = new javax.swing.JRadioButton();
        radioBarrasDia = new javax.swing.JRadioButton();
        capas = new javax.swing.JLayeredPane();
        capaPastelTipo = new javax.swing.JPanel();
        capaBarrasTipo = new javax.swing.JPanel();
        capaPastelHora = new javax.swing.JPanel();
        capaBarrasHora = new javax.swing.JPanel();
        capaPastelDia = new javax.swing.JPanel();
        capaBarrasDia = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radioPastelTipo.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        radioPastelTipo.setForeground(new java.awt.Color(254, 254, 254));
        radioPastelTipo.setText("Pastel");
        radioPastelTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPastelTipoActionPerformed(evt);
            }
        });

        radioBarrasTipo.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        radioBarrasTipo.setForeground(new java.awt.Color(254, 254, 254));
        radioBarrasTipo.setText("Barras");
        radioBarrasTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBarrasTipoActionPerformed(evt);
            }
        });

        botonGraficar.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        botonGraficar.setText("Graficar");
        botonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Cantidad de Clientes por Tipo");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Cantidad de Clientes por Hora");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Cantidad de Clientes por Día");

        radioPastelHora.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        radioPastelHora.setForeground(new java.awt.Color(254, 254, 254));
        radioPastelHora.setText("Pastel");
        radioPastelHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPastelHoraActionPerformed(evt);
            }
        });

        radioBarrasHora.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        radioBarrasHora.setForeground(new java.awt.Color(254, 254, 254));
        radioBarrasHora.setText("Barras");
        radioBarrasHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBarrasHoraActionPerformed(evt);
            }
        });

        radioPastelDia.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        radioPastelDia.setForeground(new java.awt.Color(254, 254, 254));
        radioPastelDia.setText("Pastel");
        radioPastelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPastelDiaActionPerformed(evt);
            }
        });

        radioBarrasDia.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        radioBarrasDia.setForeground(new java.awt.Color(254, 254, 254));
        radioBarrasDia.setText("Barras");
        radioBarrasDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBarrasDiaActionPerformed(evt);
            }
        });

        capas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        capaPastelTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout capaPastelTipoLayout = new javax.swing.GroupLayout(capaPastelTipo);
        capaPastelTipo.setLayout(capaPastelTipoLayout);
        capaPastelTipoLayout.setHorizontalGroup(
            capaPastelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        capaPastelTipoLayout.setVerticalGroup(
            capaPastelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        capaBarrasTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout capaBarrasTipoLayout = new javax.swing.GroupLayout(capaBarrasTipo);
        capaBarrasTipo.setLayout(capaBarrasTipoLayout);
        capaBarrasTipoLayout.setHorizontalGroup(
            capaBarrasTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        capaBarrasTipoLayout.setVerticalGroup(
            capaBarrasTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        capaPastelHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout capaPastelHoraLayout = new javax.swing.GroupLayout(capaPastelHora);
        capaPastelHora.setLayout(capaPastelHoraLayout);
        capaPastelHoraLayout.setHorizontalGroup(
            capaPastelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        capaPastelHoraLayout.setVerticalGroup(
            capaPastelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        capaBarrasHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout capaBarrasHoraLayout = new javax.swing.GroupLayout(capaBarrasHora);
        capaBarrasHora.setLayout(capaBarrasHoraLayout);
        capaBarrasHoraLayout.setHorizontalGroup(
            capaBarrasHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        capaBarrasHoraLayout.setVerticalGroup(
            capaBarrasHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        capaPastelDia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout capaPastelDiaLayout = new javax.swing.GroupLayout(capaPastelDia);
        capaPastelDia.setLayout(capaPastelDiaLayout);
        capaPastelDiaLayout.setHorizontalGroup(
            capaPastelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        capaPastelDiaLayout.setVerticalGroup(
            capaPastelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        capaBarrasDia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout capaBarrasDiaLayout = new javax.swing.GroupLayout(capaBarrasDia);
        capaBarrasDia.setLayout(capaBarrasDiaLayout);
        capaBarrasDiaLayout.setHorizontalGroup(
            capaBarrasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        capaBarrasDiaLayout.setVerticalGroup(
            capaBarrasDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(capaPastelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(capaBarrasTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(capaPastelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(capaBarrasHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(capaPastelDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(capaBarrasDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(capaPastelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(capaBarrasTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(capaPastelHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(capaBarrasHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(capaPastelDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(capasLayout.createSequentialGroup()
                    .addComponent(capaBarrasDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        capas.setLayer(capaPastelTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(capaBarrasTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(capaPastelHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(capaBarrasHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(capaPastelDia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(capaBarrasDia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        botonSalir.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
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
                        .addGap(13, 13, 13)
                        .addComponent(radioPastelTipo)
                        .addGap(33, 33, 33)
                        .addComponent(radioBarrasTipo))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(radioPastelHora)
                        .addGap(33, 33, 33)
                        .addComponent(radioBarrasHora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioPastelDia)
                            .addComponent(botonGraficar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBarrasDia)))))
                .addGap(39, 39, 39)
                .addComponent(capas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBarrasTipo)
                            .addComponent(radioPastelTipo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioPastelHora)
                            .addComponent(radioBarrasHora))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioPastelDia)
                            .addComponent(radioBarrasDia))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGraficar)
                            .addComponent(botonSalir))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioPastelTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPastelTipoActionPerformed
       capaPastelTipo.setVisible(true);
       capaBarrasTipo.setVisible(false);
       capaPastelHora.setVisible(false);
       capaBarrasHora.setVisible(false);
       capaPastelDia.setVisible(false);
       capaBarrasDia.setVisible(false);
       capas.setLayer(capaPastelTipo, 0,0);
       radioBarrasTipo.setSelected(false);
       radioPastelHora.setSelected(false);
       radioBarrasHora.setSelected(false);
       radioPastelDia.setSelected(false);
       radioBarrasDia.setSelected(false);
    }//GEN-LAST:event_radioPastelTipoActionPerformed

    private void botonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficarActionPerformed
        ChartPanel panel;
        JFreeChart chart = null;        
        
        //Grafico de Cantidad de clientes por TIPO
        if (radioBarrasTipo.isSelected()){
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            
            String clientes = "Clientes";
            
            String discapacitado = "Discapacitados";
            String adultoMayor = "Adulto Mayor";
            String mujerEmbarazada = "Mujer Embarazada";
            String clienteCorporativo = "Cliente Corporativo";
            String clienteRegular = "Cliente Regular";
            
            int hola = VentanaCliente.Discapacitados.getSize();
            System.out.println(hola);
            
            data.addValue(hola, clientes, discapacitado);
            
            data.addValue(30, clientes, adultoMayor);
            data.addValue(50, clientes, mujerEmbarazada);
            data.addValue(22, clientes, clienteCorporativo);
            data.addValue(100, clientes, clienteRegular);
            
            chart = ChartFactory.createBarChart("Gráfico Cantidad Clientes por Tipo", "Tipo", "Cantidad", 
                    data, 
                    PlotOrientation.HORIZONTAL,
                    true, true, true);
            CategoryPlot plot = (CategoryPlot) chart.getCategoryPlot();
            plot.setDomainGridlinesVisible(true);
            
        }
        if (radioPastelTipo.isSelected()){
            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("Discapacitado", 1000);
            data.setValue("Adulto Mayor", 60);
            data.setValue("Mujer Embarazada", 20);
            data.setValue("Cliente Corporativo", 20);
            data.setValue("Cliente Regular", 20);

            chart = ChartFactory.createPieChart3D("Gráfico Cantidad Clientes por Tipo", data, true, true, true);
            
        }
        
        //Grafico de HORA
        if (radioBarrasHora.isSelected()){
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            
            String clientes = "Clientes";
            
            String discapacitado = "Discapacitados";
            String adultoMayor = "Adulto Mayor";
            String mujerEmbarazada = "Mujer Embarazada";
            String clienteCorporativo = "Cliente Corporativo";
            String clienteRegular = "Cliente Regular";
            
            data.addValue(8, clientes, discapacitado);
            data.addValue(1, clientes, adultoMayor);
            data.addValue(666, clientes, mujerEmbarazada);
            data.addValue(38, clientes, clienteCorporativo);
            data.addValue(29, clientes, clienteRegular);
            
            chart = ChartFactory.createBarChart("Gráfico Cantidad Clientes por Hora", "Tipo", "Cantidad", 
                    data, 
                    PlotOrientation.HORIZONTAL,
                    true, true, true);
            CategoryPlot plot = (CategoryPlot) chart.getCategoryPlot();
            plot.setDomainGridlinesVisible(true);
            
        }
        if (radioPastelHora.isSelected()){
            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("Discapacitado", 8);
            data.setValue("Adulto Mayor", 13);
            data.setValue("Mujer Embarazada", 14);
            data.setValue("Cliente Corporativo", 21);
            data.setValue("Cliente Regular", 30);

            chart = ChartFactory.createPieChart3D("Gráfico Cantidad Clientes por Hora", data, true, true, true);
            
        }
        if (radioBarrasDia.isSelected()){
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            
            String clientes = "Clientes";
            
            String discapacitado = "Discapacitados";
            String adultoMayor = "Adulto Mayor";
            String mujerEmbarazada = "Mujer Embarazada";
            String clienteCorporativo = "Cliente Corporativo";
            String clienteRegular = "Cliente Regular";
            
            data.addValue(555, clientes, discapacitado);
            data.addValue(321, clientes, adultoMayor);
            data.addValue(108, clientes, mujerEmbarazada);
            data.addValue(889, clientes, clienteCorporativo);
            data.addValue(333, clientes, clienteRegular);
            
            chart = ChartFactory.createBarChart("Gráfico Cantidad Clientes por Dia", "Tipo", "Cantidad", 
                    data, 
                    PlotOrientation.HORIZONTAL,
                    true, true, true);
            CategoryPlot plot = (CategoryPlot) chart.getCategoryPlot();
            plot.setDomainGridlinesVisible(true);
            
        }
        if (radioPastelDia.isSelected()){
            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("Discapacitado", 250);
            data.setValue("Adulto Mayor", 88);
            data.setValue("Mujer Embarazada", 22);
            data.setValue("Cliente Corporativo", 16);
            data.setValue("Cliente Regular", 24);

            chart = ChartFactory.createPieChart3D("Gráfico Cantidad Clientes por Dia", data, true, true, true);
            
        }
        
    panel = new ChartPanel (chart);
    panel.setBounds(0, 0, 540, 349);
    
    if (radioBarrasTipo.isSelected()){
        capaBarrasTipo.add(panel);
        capaBarrasTipo.repaint();
    }
    if (radioPastelTipo.isSelected()){
        capaPastelTipo.add(panel);
        capaPastelTipo.repaint();
    }
    if (radioBarrasHora.isSelected()){
        capaBarrasHora.add(panel);
        capaBarrasHora.repaint();
    }
    if (radioPastelHora.isSelected()){
        capaPastelHora.add(panel);
        capaPastelHora.repaint();
    }
    if (radioBarrasDia.isSelected()){
        capaBarrasDia.add(panel);
        capaBarrasDia.repaint();
    }
    if (radioPastelDia.isSelected()){
        capaPastelDia.add(panel);
        capaPastelDia.repaint();
    }
    
    }//GEN-LAST:event_botonGraficarActionPerformed

    private void radioBarrasTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBarrasTipoActionPerformed
       capaPastelTipo.setVisible(false);
       capaBarrasTipo.setVisible(true);
       capaPastelHora.setVisible(false);
       capaBarrasHora.setVisible(false);
       capaPastelDia.setVisible(false);
       capaBarrasDia.setVisible(false);
       capas.setLayer(capaPastelTipo, 0,0);
       radioPastelTipo.setSelected(false);
       radioPastelHora.setSelected(false);
       radioBarrasHora.setSelected(false);
       radioPastelDia.setSelected(false);
       radioBarrasDia.setSelected(false);
    }//GEN-LAST:event_radioBarrasTipoActionPerformed

    private void radioPastelHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPastelHoraActionPerformed
       capaPastelTipo.setVisible(false);
       capaBarrasTipo.setVisible(false);
       capaPastelHora.setVisible(true);
       capaBarrasHora.setVisible(false);
       capaPastelDia.setVisible(false);
       capaBarrasDia.setVisible(false);
       capas.setLayer(capaPastelTipo, 0,0);
       radioBarrasTipo.setSelected(false);
       radioPastelTipo.setSelected(false);
       radioBarrasHora.setSelected(false);
       radioPastelDia.setSelected(false);
       radioBarrasDia.setSelected(false);
    }//GEN-LAST:event_radioPastelHoraActionPerformed

    private void radioBarrasHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBarrasHoraActionPerformed
       capaPastelTipo.setVisible(false);
       capaBarrasTipo.setVisible(false);
       capaPastelHora.setVisible(false);
       capaBarrasHora.setVisible(true);
       capaPastelDia.setVisible(false);
       capaBarrasDia.setVisible(false);
       capas.setLayer(capaPastelTipo, 0,0);
       radioBarrasTipo.setSelected(false);
       radioPastelHora.setSelected(false);
       radioPastelTipo.setSelected(false);
       radioPastelDia.setSelected(false);
       radioBarrasDia.setSelected(false);
    }//GEN-LAST:event_radioBarrasHoraActionPerformed

    private void radioPastelDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPastelDiaActionPerformed
       capaPastelTipo.setVisible(false);
       capaBarrasTipo.setVisible(false);
       capaPastelHora.setVisible(false);
       capaBarrasHora.setVisible(false);
       capaPastelDia.setVisible(true);
       capaBarrasDia.setVisible(false);
       capas.setLayer(capaPastelTipo, 0,0);
       radioBarrasTipo.setSelected(false);
       radioPastelHora.setSelected(false);
       radioBarrasHora.setSelected(false);
       radioPastelTipo.setSelected(false);
       radioBarrasDia.setSelected(false);
    }//GEN-LAST:event_radioPastelDiaActionPerformed

    private void radioBarrasDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBarrasDiaActionPerformed
       capaPastelTipo.setVisible(false);
       capaBarrasTipo.setVisible(false);
       capaPastelHora.setVisible(false);
       capaBarrasHora.setVisible(false);
       capaPastelDia.setVisible(false);
       capaBarrasDia.setVisible(true);
       capas.setLayer(capaPastelTipo, 0,0);
       radioBarrasTipo.setSelected(false);
       radioPastelHora.setSelected(false);
       radioBarrasHora.setSelected(false);
       radioPastelDia.setSelected(false);
       radioPastelTipo.setSelected(false);
    }//GEN-LAST:event_radioBarrasDiaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        VentanaMenu ventanaMenu = new VentanaMenu ();
        ventanaMenu.setVisible(true);
        hide();
    }//GEN-LAST:event_botonSalirActionPerformed

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
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel capaBarrasDia;
    private javax.swing.JPanel capaBarrasHora;
    private javax.swing.JPanel capaBarrasTipo;
    private javax.swing.JPanel capaPastelDia;
    private javax.swing.JPanel capaPastelHora;
    private javax.swing.JPanel capaPastelTipo;
    private javax.swing.JLayeredPane capas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioBarrasDia;
    private javax.swing.JRadioButton radioBarrasHora;
    private javax.swing.JRadioButton radioBarrasTipo;
    private javax.swing.JRadioButton radioPastelDia;
    private javax.swing.JRadioButton radioPastelHora;
    private javax.swing.JRadioButton radioPastelTipo;
    // End of variables declaration//GEN-END:variables
}
