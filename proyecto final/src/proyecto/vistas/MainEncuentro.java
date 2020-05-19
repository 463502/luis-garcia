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
import proyecto.entidades.Equipo;
import proyecto.entidades.Evento;
import proyecto.entidades.Jugador;
import proyecto.entidades.Torneo;

/**
 *
 * @author koro
 */
public class MainEncuentro extends javax.swing.JFrame {

    static int hor = 0, min = 0, seg = 0, miliS = 0;
    ArrayList<Jugador> deportista;
    ArrayList<Equipo> equipo;
    ArrayList<Evento> evento;
    ArrayList<Torneo> torneo;

    public MainEncuentro() {
        initComponents();
        deportista = new ArrayList<Jugador>();
        equipo = new ArrayList<Equipo>();
        evento = new ArrayList<Evento>();
        torneo = new ArrayList<Torneo>();
    }
    Thread cronometro = new Thread() {

        public void run() {
            for (;;) {//ciclo infinito para el cronometro/tiempo/reloj...
                try {
                    miliS++;
                    if (miliS > 99) {
                        miliS = 0;
                        seg++;
                    }
                    if (seg > 59) {
                        miliS = 0;
                        seg = 0;
                        min++;
                    }
                    if (min == 90) {
                        JOptionPane.showMessageDialog(null, "fin del partido....");
                        cronometro.stop();

                    }
                    jlbTiempo1.setText(min + ":" + seg + ":" + miliS);

                    Thread.sleep(1);
                } catch (InterruptedException e) {

                }
            }
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConguracionEncuentro = new javax.swing.JButton();
        btnRegistroEquipo = new javax.swing.JButton();
        btnRegistrarDeportistas = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnRegistrarEvento2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jlbEquipo1 = new javax.swing.JLabel();
        jblEquipo2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jblGolesEquipo1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jblGolesEquipo2 = new javax.swing.JLabel();
        jlbTiempo1 = new javax.swing.JLabel();
        btnReanudar1 = new javax.swing.JButton();
        btnTerminar1 = new javax.swing.JButton();
        btnPausar1 = new javax.swing.JButton();
        btnActulizarMarcador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ENCUENTRO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DEPORTIVO");

        btnConguracionEncuentro.setBackground(new java.awt.Color(0, 51, 102));
        btnConguracionEncuentro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConguracionEncuentro.setForeground(new java.awt.Color(255, 255, 255));
        btnConguracionEncuentro.setText("Configurar Encuentro");
        btnConguracionEncuentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConguracionEncuentroActionPerformed(evt);
            }
        });

        btnRegistroEquipo.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistroEquipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistroEquipo.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroEquipo.setText("Registrar Equipos");
        btnRegistroEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEquipoActionPerformed(evt);
            }
        });

        btnRegistrarDeportistas.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistrarDeportistas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrarDeportistas.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarDeportistas.setText("Registrar Deportistas");
        btnRegistrarDeportistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDeportistasActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(0, 51, 102));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnRegistrarEvento2.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistrarEvento2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrarEvento2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEvento2.setText("Registrar Eventos");
        btnRegistrarEvento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEvento2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConguracionEncuentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarDeportistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistroEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistrarEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(94, 94, 94)
                .addComponent(btnRegistroEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarDeportistas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConguracionEncuentro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciar)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ENCUENTRO");

        jlbEquipo1.setBackground(new java.awt.Color(0, 51, 102));
        jlbEquipo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbEquipo1.setForeground(new java.awt.Color(255, 255, 255));

        jblEquipo2.setBackground(new java.awt.Color(0, 51, 102));
        jblEquipo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblEquipo2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(0, 51, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("VS");

        jblGolesEquipo1.setBackground(new java.awt.Color(0, 51, 102));
        jblGolesEquipo1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jblGolesEquipo1.setForeground(new java.awt.Color(255, 255, 255));
        jblGolesEquipo1.setText("0");

        jLabel13.setBackground(new java.awt.Color(0, 51, 102));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(":");

        jblGolesEquipo2.setBackground(new java.awt.Color(0, 51, 102));
        jblGolesEquipo2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jblGolesEquipo2.setForeground(new java.awt.Color(255, 255, 255));
        jblGolesEquipo2.setText("0");

        jlbTiempo1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlbTiempo1.setForeground(new java.awt.Color(255, 255, 255));
        jlbTiempo1.setText("00:00:00");

        btnReanudar1.setBackground(new java.awt.Color(0, 51, 102));
        btnReanudar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReanudar1.setForeground(new java.awt.Color(255, 255, 255));
        btnReanudar1.setText("REANUDAR");
        btnReanudar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReanudar1ActionPerformed(evt);
            }
        });

        btnTerminar1.setBackground(new java.awt.Color(0, 51, 102));
        btnTerminar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTerminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminar1.setText("TERMINAR");
        btnTerminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminar1ActionPerformed(evt);
            }
        });

        btnPausar1.setBackground(new java.awt.Color(0, 51, 102));
        btnPausar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPausar1.setForeground(new java.awt.Color(255, 255, 255));
        btnPausar1.setText("PAUSAR");
        btnPausar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausar1ActionPerformed(evt);
            }
        });

        btnActulizarMarcador.setBackground(new java.awt.Color(0, 51, 102));
        btnActulizarMarcador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActulizarMarcador.setForeground(new java.awt.Color(255, 255, 255));
        btnActulizarMarcador.setText("ACTUALIZAR MARCADOR");
        btnActulizarMarcador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarMarcadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jblGolesEquipo1)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel13)
                                .addGap(34, 34, 34)
                                .addComponent(jblGolesEquipo2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel10))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbTiempo1)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jlbEquipo1)
                                        .addGap(67, 67, 67)
                                        .addComponent(jblEquipo2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)))))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActulizarMarcador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnPausar1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReanudar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTerminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbEquipo1)
                        .addComponent(jblEquipo2))
                    .addComponent(jLabel11))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblGolesEquipo1)
                    .addComponent(jLabel13)
                    .addComponent(jblGolesEquipo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReanudar1)
                    .addComponent(btnTerminar1)
                    .addComponent(btnPausar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActulizarMarcador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/futb.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(198, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(332, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConguracionEncuentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConguracionEncuentroActionPerformed
        JDialog ConfiguracionEncuentroDialog = new ConfiguracionEncuentro(this, true, torneo);
        ConfiguracionEncuentroDialog.setVisible(true);
    }//GEN-LAST:event_btnConguracionEncuentroActionPerformed

    private void btnRegistroEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEquipoActionPerformed
        JDialog RegistrarEquipoDialog = new RegistroEquipo(this, true, equipo);
        RegistrarEquipoDialog.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroEquipoActionPerformed

    private void btnRegistrarDeportistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDeportistasActionPerformed
        JDialog deportistaDialog = new RegistroDeportista(this, true, deportista);
        deportistaDialog.setVisible(true);
    }//GEN-LAST:event_btnRegistrarDeportistasActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        cronometro.start();
        for (int i = 0; i < Control.getEquipos().size(); i++) {
            int o = 0;
            o++;
            jblEquipo2.setText(Control.getEquipos().get(i).getNombre());
            jblEquipo2.setText(Control.getEquipos().get(o).getNombre());
            i = Control.getEquipos().size();
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnReanudar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReanudar1ActionPerformed

        cronometro.resume();
    }//GEN-LAST:event_btnReanudar1ActionPerformed

    private void btnTerminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminar1ActionPerformed
        cronometro.stop();
        JDialog inicioDialog = new Inicio(this, true);
        inicioDialog.setVisible(true);
    }//GEN-LAST:event_btnTerminar1ActionPerformed

    private void btnPausar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausar1ActionPerformed
        cronometro.suspend();
    }//GEN-LAST:event_btnPausar1ActionPerformed

    private void btnRegistrarEvento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEvento2ActionPerformed
        JDialog RegistroEventosDialog = new RegistrarEvento(this, true, evento);
        RegistroEventosDialog.setVisible(true);
    }//GEN-LAST:event_btnRegistrarEvento2ActionPerformed

    private void btnActulizarMarcadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarMarcadorActionPerformed

        jblGolesEquipo1.setText(Integer.toString(Control.getEquipos().get(0).getGol()));
        jblGolesEquipo2.setText(Integer.toString(Control.getEquipos().get(1).getGol()));
    }//GEN-LAST:event_btnActulizarMarcadorActionPerformed

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
            java.util.logging.Logger.getLogger(MainEncuentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainEncuentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainEncuentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainEncuentro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainEncuentro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActulizarMarcador;
    private javax.swing.JButton btnConguracionEncuentro;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPausar1;
    private javax.swing.JButton btnReanudar1;
    private javax.swing.JButton btnRegistrarDeportistas;
    private javax.swing.JButton btnRegistrarEvento2;
    private javax.swing.JButton btnRegistroEquipo;
    private javax.swing.JButton btnTerminar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jblEquipo2;
    private javax.swing.JLabel jblGolesEquipo1;
    private javax.swing.JLabel jblGolesEquipo2;
    private javax.swing.JLabel jlbEquipo1;
    private javax.swing.JLabel jlbTiempo1;
    // End of variables declaration//GEN-END:variables
}
