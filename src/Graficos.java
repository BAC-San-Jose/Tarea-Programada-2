import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 * Clase que crea los graficos y los enseña en la ventana
 */
public class Graficos extends javax.swing.JFrame {
    
    /**
     * Constructor de la clase
     */
    public Graficos() {
        this.setExtendedState(this.MAXIMIZED_BOTH);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
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
        setImagen();
        setTexto();
        Reloj hora = new Reloj(jLabel6);
        hora.start();
        Calendar Cal= Calendar.getInstance();
        String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        jLabel7.setText(fec);
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
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        NombreVentana = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radioPastelTipo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        radioPastelTipo.setForeground(new java.awt.Color(254, 254, 254));
        radioPastelTipo.setText("Pastel");
        radioPastelTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPastelTipoActionPerformed(evt);
            }
        });

        radioBarrasTipo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        radioBarrasTipo.setForeground(new java.awt.Color(254, 254, 254));
        radioBarrasTipo.setText("Barras");
        radioBarrasTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBarrasTipoActionPerformed(evt);
            }
        });

        botonGraficar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
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

        radioPastelHora.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        radioPastelHora.setForeground(new java.awt.Color(254, 254, 254));
        radioPastelHora.setText("Pastel");
        radioPastelHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPastelHoraActionPerformed(evt);
            }
        });

        radioBarrasHora.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        radioBarrasHora.setForeground(new java.awt.Color(254, 254, 254));
        radioBarrasHora.setText("Barras");
        radioBarrasHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBarrasHoraActionPerformed(evt);
            }
        });

        radioPastelDia.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        radioPastelDia.setForeground(new java.awt.Color(254, 254, 254));
        radioPastelDia.setText("Pastel");
        radioPastelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPastelDiaActionPerformed(evt);
            }
        });

        radioBarrasDia.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        radioBarrasDia.setForeground(new java.awt.Color(254, 254, 254));
        radioBarrasDia.setText("Barras");
        radioBarrasDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBarrasDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout capaPastelTipoLayout = new javax.swing.GroupLayout(capaPastelTipo);
        capaPastelTipo.setLayout(capaPastelTipoLayout);
        capaPastelTipoLayout.setHorizontalGroup(
            capaPastelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 967, Short.MAX_VALUE)
        );
        capaPastelTipoLayout.setVerticalGroup(
            capaPastelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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

        botonSalir.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(NombreVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Fecha:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Hora:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Hora:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("fecha");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("GRAFICOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonGraficar)
                                        .addGap(35, 35, 35)
                                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioPastelDia)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBarrasDia))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)))
                .addGap(39, 39, 39)
                .addComponent(capas)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capas)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 91, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(62, 62, 62)
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
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioPastelDia)
                            .addComponent(radioBarrasDia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGraficar)
                            .addComponent(botonSalir))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metodo que crea un grafico tipo pastel con los datos de las prioridades de los clientes 
     * @param evt 
     */
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
    /**Metodo del boton "graficar", que crea los graficos 
     * @param evt 
     */
    private void botonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficarActionPerformed
        ChartPanel panel;
        JFreeChart chart = null;
        LeerTxt datos2 = new LeerTxt();
            datos2.Tipo();
        
        if (radioBarrasTipo.isSelected()){
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            
            String clientes = "Clientes";
            
            String discapacitado = "Discapacitados";
            String adultoMayor = "Adulto Mayor";
            String mujerEmbarazada = "Mujer Embarazada";
            String clienteCorporativo = "Cliente Corporativo";
            String clienteRegular = "Cliente Regular";
            
            data.addValue(datos2.resultadodiscapacitados, clientes, discapacitado);
            data.addValue(datos2.resultadomayores, clientes, adultoMayor);
            data.addValue(datos2.resultadoembarazadas, clientes, mujerEmbarazada);
            data.addValue(datos2.resultadocorporativos, clientes, clienteCorporativo);
            data.addValue(datos2.resultadoregulares, clientes, clienteRegular);
            
            chart = ChartFactory.createBarChart("Cantidad Clientes por Tipo", "Tipo", "Cantidad", 
                    data, 
                    PlotOrientation.HORIZONTAL,
                    true, true, true);
            CategoryPlot plot = (CategoryPlot) chart.getCategoryPlot();
            plot.setDomainGridlinesVisible(true);
            
        }
        if (radioPastelTipo.isSelected()){
            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("Discapacitado", datos2.resultadodiscapacitados);
            data.setValue("Adulto Mayor", datos2.resultadomayores);
            data.setValue("Mujer Embarazada", datos2.resultadoembarazadas);
            data.setValue("Cliente Corporativo", datos2.resultadocorporativos);
            data.setValue("Cliente Regular", datos2.resultadoregulares);

            chart = ChartFactory.createPieChart3D("Cantidad Clientes por Tipo", data, true, true, true);
            
        }
        
        LeerTxt datos = new LeerTxt();
            datos.Horas();
        LeerTxt datos1 = new LeerTxt();
        try {
            datos1.Fecha();
        } catch (IOException ex) {
            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            datos.Fecha();
        } catch (IOException ex) {
            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (radioBarrasHora.isSelected()){
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            
            data.addValue(datos.nueve, "9 am","");
            data.addValue(datos.diez, "10 am","");
            data.addValue(datos.once, "11 am","");
            data.addValue(datos.una, "1 pm","");
            data.addValue(datos.dos, "2 pm","");
            data.addValue(datos.tres, "3 pm","");
            data.addValue(datos.cuatro, "4 pm","");
            
            chart = ChartFactory.createBarChart("Cantidad Clientes por Hora", "Tipo", "Cantidad", 
                    data, 
                    PlotOrientation.HORIZONTAL,
                    true, true, true);
            CategoryPlot plot = (CategoryPlot) chart.getCategoryPlot();
            plot.setDomainGridlinesVisible(true);
            
        }
        if (radioPastelHora.isSelected()){
            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("9 am", datos.nueve);
            data.setValue("10 am", datos.diez);
            data.setValue("11 am", datos.once);
            data.setValue("1 pm", datos.una);
            data.setValue("2 pm", datos.dos);
            data.setValue("3 pm", datos.tres);
            data.setValue("4 pm", datos.cuatro);

            chart = ChartFactory.createPieChart3D("Clientes por Hora", data, true, true, true);
            
        }

        if (radioBarrasDia.isSelected()){
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            
            String clientes = "Clientes";
            
            data.addValue(datos1.d1, clientes, "Dia 1");
            data.addValue(datos1.d2, clientes, "Dia 2");
            data.addValue(datos1.d3, clientes, "Dia 3");
            data.addValue(datos1.d4, clientes, "Dia 4");
            data.addValue(datos1.d5, clientes, "Dia 5");
            data.addValue(datos1.d6, clientes, "Dia 6");
            data.addValue(datos1.d7, clientes, "Dia 7");
            data.addValue(datos1.d8, clientes, "Dia 8");
            data.addValue(datos1.d9, clientes, "Dia 9");
            data.addValue(datos1.d10, clientes, "Dia 10");
            data.addValue(datos1.d11, clientes, "Dia 11");
            data.addValue(datos1.d12, clientes, "Dia 12");
            data.addValue(datos1.d13, clientes, "Dia 13");
            data.addValue(datos1.d14, clientes, "Dia 14");
            data.addValue(datos1.d15, clientes, "Dia 15");
            data.addValue(datos1.d16, clientes, "Dia 16");
            data.addValue(datos1.d17, clientes, "Dia 17");
            data.addValue(datos1.d18, clientes, "Dia 18");
            data.addValue(datos1.d19, clientes, "Dia 19");
            data.addValue(datos1.d20, clientes, "Dia 20");
            data.addValue(datos1.d21, clientes, "Dia 21");
            data.addValue(datos1.d22, clientes, "Dia 22");
            data.addValue(datos1.d23, clientes, "Dia 23");
            data.addValue(datos1.d24, clientes, "Dia 24");
            data.addValue(datos1.d25, clientes, "Dia 25");
            data.addValue(datos1.d26, clientes, "Dia 26");
            data.addValue(datos1.d27, clientes, "Dia 27");
            data.addValue(datos1.d28, clientes, "Dia 28");
            data.addValue(datos1.d29, clientes, "Dia 29");
            data.addValue(datos1.d30, clientes, "Dia 30");
            data.addValue(datos1.d31, clientes, "Dia 31");
            
            chart = ChartFactory.createBarChart("Cantidad Clientes por Dia", "Tipo", "Cantidad", 
                    data, 
                    PlotOrientation.HORIZONTAL,
                    true, true, true);
            CategoryPlot plot = (CategoryPlot) chart.getCategoryPlot();
            plot.setDomainGridlinesVisible(true);
            
        }
        if (radioPastelDia.isSelected()){
            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("Dia 1", datos1.d1);
            data.setValue("Dia 2", datos1.d2);
            data.setValue("Dia 3", datos1.d3);
            data.setValue("Dia 4", datos1.d4);
            data.setValue("Dia 5", datos1.d5);
            data.setValue("Dia 6", datos1.d6);
            data.setValue("Dia 7", datos1.d7);
            data.setValue("Dia 8", datos1.d8);
            data.setValue("Dia 9", datos1.d9);
            data.setValue("Dia 10", datos1.d10);
            data.setValue("Dia 11", datos1.d11);
            data.setValue("Dia 12", datos1.d12);
            data.setValue("Dia 13", datos1.d13);
            data.setValue("Dia 14", datos1.d14);
            data.setValue("Dia 15", datos1.d15);
            data.setValue("Dia 16", datos1.d16);
            data.setValue("Dia 17", datos1.d17);
            data.setValue("Dia 18", datos1.d18);
            data.setValue("Dia 19", datos1.d19);
            data.setValue("Dia 20", datos1.d20);
            data.setValue("Dia 21", datos1.d21);
            data.setValue("Dia 22", datos1.d22);
            data.setValue("Dia 23", datos1.d23);
            data.setValue("Dia 24", datos1.d24);
            data.setValue("Dia 25", datos1.d25);
            data.setValue("Dia 26", datos1.d26);
            data.setValue("Dia 27", datos1.d27);
            data.setValue("Dia 28", datos1.d28);
            data.setValue("Dia 29", datos1.d29);
            data.setValue("Dia 30", datos1.d30);
            data.setValue("Dia 31", datos1.d31);
            
            chart = ChartFactory.createPieChart3D("Cantidad Clientes por Dia", data, true, true, true);
        }
        
    panel = new ChartPanel (chart);
    panel.setBounds(0, 0, 980, 600);
    
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
    /**
     * Metodo que crea un grafico de barras con los datos de las prioridades de los clientes
     * @param evt 
     */
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
    /**
     * Metodo que crea un grafico tipo pastel con los datos de 
     * las horas que fueron atendidos los clientes 
     * @param evt 
     */
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
    /**
     * Metodo que crea un grafico de barras con los datos 
     * de las horas en que fueron atendidos los clientes 
     * @param evt 
     */
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
    /**
     * Metodo que crea un grafico tipo pastel con los datos 
     * de los dias en que fueron atendidos los clientes 
     * @param evt 
     */
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
    /**
     * Metodo que crea un grafico de barras con los datos 
     * de los dias en que fueron atendidos los clientes 
     * @param evt 
     */
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
    /**
     * Metodo para cerrar la ventana
     * @param evt 
     */
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
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
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreVentana;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioBarrasDia;
    private javax.swing.JRadioButton radioBarrasHora;
    private javax.swing.JRadioButton radioBarrasTipo;
    private javax.swing.JRadioButton radioPastelDia;
    private javax.swing.JRadioButton radioPastelHora;
    private javax.swing.JRadioButton radioPastelTipo;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Metodo que le pone la imagen del Banco a la ventana
     */
    public void setImagen(){
        if (!"/Imagenes/Logo BAC.gif".equals(VentanaPrincipal.imagen)){
            String file = VentanaPrincipal.imagen;
            ImageIcon fot = new ImageIcon(file); 
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_DEFAULT)); 
            Logo.setIcon(icono); 
            this.repaint();
        }
    }
    
    /**
     * Metodo que le pone el nombre del banco a la ventana
     */
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
