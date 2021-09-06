package formularios;

import clases.Hilos;
import clases.Reloj2;
import clases.SonidoJuego;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Samuel David Ortiz
 */
public class FrmBienvenida extends javax.swing.JFrame implements Runnable {
    
    private Thread tiempo = null;
    Reloj2 reloj = new Reloj2();
    
    Timer timer;
    ActionListener actionListener;
    int acumuladorProgressBar = 0;
    
    public FrmBienvenida() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        tiempo = new Thread(this);
        tiempo.start();
        
        reloj.setLblReloj(lblReloj);
        reloj.start();
        
        lblReloj.setBackground(Color.black);
        lblReloj.setOpaque(true);
        
        SonidoJuego soundsT = new SonidoJuego();
        soundsT.tiposonido(0);
        soundsT.start();
        
        String mensaje = "BIENVENIDO AL JUEGO DE MEMORIA SDOM UMG";
        Hilos texto = new Hilos(mensaje, 300, lblTexto, new JLabel());
        texto.start();
        
         actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblCargando.setText("Cargando... " + acumuladorProgressBar + "%");
                acumuladorProgressBar += (int) Math.round(Math.random() * 10) + 5;
                ProgressBar.setValue(acumuladorProgressBar);
                //System.out.println("acumuladorProgressBar: " + acumuladorProgressBar);

                if (acumuladorProgressBar > 100) {
                    try {
                        mostrarMenu();
                    } catch (Exception ex) {
                        Logger.getLogger(FrmBienvenida.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        this.setVisible(false);
        timer = new Timer(800, actionListener);
        timer.start();      
    }
    
    public void mostrarMenu() throws Exception{
        timer.stop();
        //soundtracks.DetenerSonido();
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
        this.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        lblReloj = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        lblCargando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/umg.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblReloj.setBackground(new java.awt.Color(0, 0, 0));
        lblReloj.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(102, 255, 0));
        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setText("00:00:00");
        lblReloj.setBorder(new javax.swing.border.MatteBorder(null));

        lblTexto.setText("jLabel3");

        lblCargando.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCargando.setText("Cargando...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReloj)
                            .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(lblCargando)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(70, 70, 70)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCargando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lblReloj)
                .addGap(18, 18, 18))
        );

        setSize(new java.awt.Dimension(658, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmBienvenida().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FrmBienvenida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCargando;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


