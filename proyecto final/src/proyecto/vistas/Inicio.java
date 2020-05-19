/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.vistas;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import mx.itson.proyectoFinal.Controladores.Control;
import proyecto.entidades.Evento;
import static proyecto.vistas.MainEncuentro.*;

/**
 *
 * @author luis
 */
public class Inicio extends javax.swing.JDialog {

    Control control = new Control();
    ArrayList<Evento> evento;

    public Inicio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        evento = new ArrayList<Evento>();
        jlbTiempo.setText(min + ":" + seg + ":" + miliS);
        jlbEquipo1.setText(Control.getEquipos().get(0).getNombre());
        jblEquipo2.setText(Control.getEquipos().get(1).getNombre());

        jblGolesEquipo1.setText(Integer.toString(Control.getEquipos().get(0).getGol()));
        jblGolesEquipo2.setText(Integer.toString(Control.getEquipos().get(1).getGol()));

        if (Control.getEquipos().get(0).getGol() < Control.getEquipos().get(1).getGol()) {
            JOptionPane.showMessageDialog(this, "Felicidades el equipo: " + Control.getEquipos().get(1).getNombre()
                    + " es el ganador del encuentro");
//            System.out.println("Felicidades el equipo: " + Control.getEquipos().get(1).getNombre()
//                    + " es el ganador del encuentro");
        }
        if (Control.getEquipos().get(0).getGol() > Control.getEquipos().get(1).getGol()) {
            JOptionPane.showMessageDialog(this, "Felicidades el equipo: " + Control.getEquipos().get(1).getNombre()
                    + " es el ganador del encuentro");
//            System.out.println("Felicidades el equipo: " + Control.getEquipos().get(0).getNombre()
//                    + " es el ganador del encuentro");
        }
        if (Control.getEquipos().get(0).getGol() == Control.getEquipos().get(1).getGol()) {
            JOptionPane.showMessageDialog(this, "Fue un empate entre el equipo: " + Control.getEquipos().get(0).getNombre()
                    + " vs " + Control.getEquipos().get(1).getNombre());
//            System.out.println("Fue un empate entre el equipo: " + Control.getEquipos().get(0).getNombre()
//                    + " vs " + Control.getEquipos().get(1).getNombre());
        }
        jblTarjetaRojaEquipo1.setText(Integer.toString(Control.getEquipos().get(0).getTarjetaRoja()));
        jblTarjetaRojaEquipo2.setText(Integer.toString(Control.getEquipos().get(1).getTarjetaRoja()));
        jblTarjetaAmarillaEquipo1.setText(Integer.toString(Control.getEquipos().get(0).getTarjetaAmrailla()));
        jblTarjetaAmarillaEquipo2.setText(Integer.toString(Control.getEquipos().get(1).getTarjetaAmrailla()));
        jblTirosDeEsquinaEquipo1.setText(Integer.toString(Control.getEquipos().get(0).getTiroDeEsquina()));
        jblTirosDeEsquinaEquipo2.setText(Integer.toString(Control.getEquipos().get(1).getTiroDeEsquina()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRegistrarEvento = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbEquipo1 = new javax.swing.JLabel();
        jblEquipo2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jblGolesEquipo1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jblGolesEquipo2 = new javax.swing.JLabel();
        jlbTiempo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jblTarjetaRojaEquipo2 = new javax.swing.JLabel();
        jblTarjetaAmarillaEquipo2 = new javax.swing.JLabel();
        jblTirosDeEsquinaEquipo2 = new javax.swing.JLabel();
        jblTirosDeEsquinaEquipo1 = new javax.swing.JLabel();
        jblTarjetaAmarillaEquipo1 = new javax.swing.JLabel();
        jblTarjetaRojaEquipo1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnRegistrarEvento.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistrarEvento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEvento.setText("Registrar Eventos");
        btnRegistrarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEventoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESULTADO DEL ENCUENTRO");

        jlbEquipo1.setBackground(new java.awt.Color(0, 51, 102));
        jlbEquipo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbEquipo1.setForeground(new java.awt.Color(255, 255, 255));

        jblEquipo2.setBackground(new java.awt.Color(0, 51, 102));
        jblEquipo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblEquipo2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VS");

        jblGolesEquipo1.setBackground(new java.awt.Color(0, 51, 102));
        jblGolesEquipo1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jblGolesEquipo1.setForeground(new java.awt.Color(255, 255, 255));
        jblGolesEquipo1.setText("0");

        jLabel4.setBackground(new java.awt.Color(0, 51, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(":");

        jblGolesEquipo2.setBackground(new java.awt.Color(0, 51, 102));
        jblGolesEquipo2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jblGolesEquipo2.setForeground(new java.awt.Color(255, 255, 255));
        jblGolesEquipo2.setText("0");

        jlbTiempo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlbTiempo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTiempo.setText("00:00:00");

        jLabel6.setBackground(new java.awt.Color(0, 51, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tarjetas Rojas");

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tarjetas Amarillas");

        jLabel8.setBackground(new java.awt.Color(0, 51, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tiros De Esquina");

        jLabel9.setBackground(new java.awt.Color(0, 51, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tarjetas Amarillas");

        jLabel10.setBackground(new java.awt.Color(0, 51, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tiros De Esquina");

        jLabel11.setBackground(new java.awt.Color(0, 51, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tarjetas Rojas");

        jblTarjetaRojaEquipo2.setBackground(new java.awt.Color(0, 51, 102));
        jblTarjetaRojaEquipo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblTarjetaRojaEquipo2.setForeground(new java.awt.Color(255, 255, 255));

        jblTarjetaAmarillaEquipo2.setBackground(new java.awt.Color(0, 51, 102));
        jblTarjetaAmarillaEquipo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblTarjetaAmarillaEquipo2.setForeground(new java.awt.Color(255, 255, 255));

        jblTirosDeEsquinaEquipo2.setBackground(new java.awt.Color(0, 51, 102));
        jblTirosDeEsquinaEquipo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblTirosDeEsquinaEquipo2.setForeground(new java.awt.Color(255, 255, 255));

        jblTirosDeEsquinaEquipo1.setBackground(new java.awt.Color(0, 51, 102));
        jblTirosDeEsquinaEquipo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblTirosDeEsquinaEquipo1.setForeground(new java.awt.Color(255, 255, 255));

        jblTarjetaAmarillaEquipo1.setBackground(new java.awt.Color(0, 51, 102));
        jblTarjetaAmarillaEquipo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblTarjetaAmarillaEquipo1.setForeground(new java.awt.Color(255, 255, 255));

        jblTarjetaRojaEquipo1.setBackground(new java.awt.Color(0, 51, 102));
        jblTarjetaRojaEquipo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblTarjetaRojaEquipo1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jblTirosDeEsquinaEquipo1)
                            .addComponent(jblTarjetaAmarillaEquipo1)
                            .addComponent(jblTarjetaRojaEquipo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jblTarjetaRojaEquipo2)
                            .addComponent(jblTarjetaAmarillaEquipo2)
                            .addComponent(jblTirosDeEsquinaEquipo2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbTiempo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlbEquipo1)
                                        .addGap(67, 67, 67)
                                        .addComponent(jblEquipo2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jblGolesEquipo1)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(34, 34, 34)
                                        .addComponent(jblGolesEquipo2)))))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbEquipo1)
                        .addComponent(jblEquipo2))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblGolesEquipo1)
                    .addComponent(jLabel4)
                    .addComponent(jblGolesEquipo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jblTarjetaRojaEquipo1)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(jblTarjetaAmarillaEquipo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(11, 11, 11)
                        .addComponent(jblTarjetaRojaEquipo2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblTarjetaAmarillaEquipo2)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblTirosDeEsquinaEquipo2)
                    .addComponent(jblTirosDeEsquinaEquipo1))
                .addContainerGap(317, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEventoActionPerformed
////        RegistrarEvento RegistroEventosDialog = new RegistrarEvento(null, true);
////        RegistroEventosDialog.setVisible(true);
    }//GEN-LAST:event_btnRegistrarEventoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jblEquipo2;
    private javax.swing.JLabel jblGolesEquipo1;
    private javax.swing.JLabel jblGolesEquipo2;
    private javax.swing.JLabel jblTarjetaAmarillaEquipo1;
    private javax.swing.JLabel jblTarjetaAmarillaEquipo2;
    private javax.swing.JLabel jblTarjetaRojaEquipo1;
    private javax.swing.JLabel jblTarjetaRojaEquipo2;
    private javax.swing.JLabel jblTirosDeEsquinaEquipo1;
    private javax.swing.JLabel jblTirosDeEsquinaEquipo2;
    private javax.swing.JLabel jlbEquipo1;
    private javax.swing.JLabel jlbTiempo;
    // End of variables declaration//GEN-END:variables
}
