/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cajero.funciones;

import cajero.Cuentas;
import cajero.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
/**
 *
 * @author ETHAN PIERCE
 */
public class Sesion extends javax.swing.JFrame {
    String user;
    String nCuentaU;
    boolean idioma;
    String tipoCuenta;
    /**
     * Creates new form Sesion
     */
    public Sesion() {
        initComponents();
        jPanel1.setBackground(Color.getHSBColor(0.53f, 0.52f, 0.92f));
    }
    
        public Sesion(String user, boolean idioma){
        initComponents();
        this.user = user;
        this.idioma = idioma;
        cambiarIdioma();
        getCuenta(tipoCuenta);
        mostrarCuenta();
        jPanel1.setBackground(Color.getHSBColor(0.53f, 0.52f, 0.92f));
    }
    
    public Sesion(String user, boolean idioma, String tipoCuenta){
        initComponents();
        this.user = user;
        this.idioma = idioma;
        this.tipoCuenta = tipoCuenta;
        cambiarIdioma();
        getCuenta(tipoCuenta);
        mostrarCuenta();
        jPanel1.setBackground(Color.getHSBColor(0.53f, 0.52f, 0.92f));
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
        bMoneda = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bTransacciones = new javax.swing.JButton();
        bTransferir = new javax.swing.JButton();
        bSaldo = new javax.swing.JButton();
        bRetirar = new javax.swing.JButton();
        bDepositar = new javax.swing.JButton();
        lnCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bMoneda.setText("Cambiar Moneda");
        bMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMonedaActionPerformed(evt);
            }
        });
        bMoneda.setForeground(Color.WHITE);
        bMoneda.setFont(new Font("Helvetica", Font.BOLD, 20));
        bMoneda.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.7f));

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        bSalir.setForeground(Color.WHITE);
        bSalir.setFont(new Font("Helvetica", Font.BOLD, 20));
        bSalir.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.7f));

        bTransacciones.setText("Transacciones");
        bTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTransaccionesActionPerformed(evt);
            }
        });
        bTransacciones.setForeground(Color.WHITE);
        bTransacciones.setFont(new Font("Helvetica", Font.BOLD, 20));
        bTransacciones.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.7f));

        bTransferir.setText("Transferir");
        bTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTransferirActionPerformed(evt);
            }
        });
        bTransferir.setForeground(Color.WHITE);
        bTransferir.setFont(new Font("Helvetica", Font.BOLD, 20));
        bTransferir.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.7f));

        bSaldo.setText("Saldo");
        bSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaldoActionPerformed(evt);
            }
        });
        bSaldo.setForeground(Color.WHITE);
        bSaldo.setFont(new Font("Helvetica", Font.BOLD, 20));
        bSaldo.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.7f));

        bRetirar.setText("Retirar");
        bRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetirarActionPerformed(evt);
            }
        });
        bRetirar.setForeground(Color.WHITE);
        bRetirar.setFont(new Font("Helvetica", Font.BOLD, 20));
        bRetirar.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.7f));

        bDepositar.setText("Depositar");
        bDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDepositarActionPerformed(evt);
            }
        });
        bDepositar.setForeground(Color.WHITE);
        bDepositar.setFont(new Font("Helvetica", Font.BOLD, 20));
        bDepositar.setBackground(Color.getHSBColor(0.0f, 0.0f, 0.7f));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(bDepositar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(bSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(lnCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addGap(248, 248, 248)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(bTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bTransacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(333, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaldoActionPerformed

        getCuenta(tipoCuenta);
        Saldo saldo = new Saldo(this.nCuentaU, user, idioma, tipoCuenta);
        saldo.setVisible(true);
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_bSaldoActionPerformed

    private void bRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetirarActionPerformed
        Retirar retirar = new Retirar(nCuentaU, user, idioma, tipoCuenta);
        retirar.setVisible(true);
        System.out.println("Cuenta enviada:" + nCuentaU);
        this.dispose();
    }//GEN-LAST:event_bRetirarActionPerformed

    private void bDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDepositarActionPerformed
        getCuenta(tipoCuenta);
        Depositar depositar = new Depositar(this.nCuentaU, user, idioma, tipoCuenta);
        depositar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bDepositarActionPerformed

    private void bTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTransferirActionPerformed
        Transferir Transferir = new Transferir(this.nCuentaU, user, idioma, tipoCuenta);
        Transferir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bTransferirActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMonedaActionPerformed
        ElegirCuenta e = new ElegirCuenta(user, idioma);
        e.setVisible(true);
        dispose();
    }//GEN-LAST:event_bMonedaActionPerformed

    private void bTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTransaccionesActionPerformed
        Transacciones t = new Transacciones(this.nCuentaU, user, idioma, tipoCuenta);
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_bTransaccionesActionPerformed

   public void getCuenta(String tipoCuenta){
       Cuentas cuenta = new Cuentas();
       this.nCuentaU = cuenta.getnCuenta(user, tipoCuenta);
   }
   
   public void cambiarIdioma(){
       if(idioma == false)
       {
           bDepositar.setText("Deposit");
           bRetirar.setText("Withdraw");
           bSaldo.setText("Balance");
           bSalir.setText("Sign Out");
           bTransferir.setText("Transfer");
           bTransacciones.setText("Transactions");
           bMoneda.setText("Change Coin");
       }
   }
   public void mostrarCuenta(){
            String tipo;
            switch(this.tipoCuenta){
                case "Bolivianos":
                        tipo = "Bs.";
                        break;
                case "Dolares":
                        tipo = "Dolar.";
                        break;
                case "Euros":
                        tipo = "Euro.";
                        break;
                default:
                    tipo = "error";
                    break;
            }
            lnCuenta.setText(idioma ? "Numero de cuenta: "+nCuentaU+ "\n Tipo: "+tipo : "Account number: " + nCuentaU+ " Type: "+tipo);
            lnCuenta.setFont(new Font("Times New Roman", Font.PLAIN, 17));
            lnCuenta.setForeground(Color.darkGray);
            lnCuenta.setHorizontalAlignment(SwingConstants.CENTER);

   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDepositar;
    private javax.swing.JButton bMoneda;
    private javax.swing.JButton bRetirar;
    private javax.swing.JButton bSaldo;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bTransacciones;
    private javax.swing.JButton bTransferir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lnCuenta;
    // End of variables declaration//GEN-END:variables
}
