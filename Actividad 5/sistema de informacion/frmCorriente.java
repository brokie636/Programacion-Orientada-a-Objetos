/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.universidadnacional;

/**
 *
 * @author usuario
 */
public class frmCorriente extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCorriente
     */
    public frmCorriente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtvoltaje = new javax.swing.JTextField();
        txtresistencia = new javax.swing.JTextField();
        txtcorriente = new javax.swing.JTextField();
        btmCalcular = new javax.swing.JButton();
        btmBorrar = new javax.swing.JButton();
        btmSalir = new javax.swing.JButton();

        setTitle("CalcularCorriente");

        jLabel1.setText("Voltaje");

        jLabel2.setText("Resistencia");

        jLabel3.setText("Corriente");

        btmCalcular.setText("Calcular");
        btmCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCalcularActionPerformed(evt);
            }
        });

        btmBorrar.setText("Borrar");
        btmBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBorrarActionPerformed(evt);
            }
        });

        btmSalir.setText("Salir");
        btmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSalirActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtvoltaje)
                            .addComponent(txtresistencia)
                            .addComponent(txtcorriente, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btmCalcular)
                        .addGap(62, 62, 62)
                        .addComponent(btmBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(btmSalir)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtvoltaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtresistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcorriente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmCalcular)
                    .addComponent(btmBorrar)
                    .addComponent(btmSalir))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_btmSalirActionPerformed

    private void btmBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBorrarActionPerformed
    txtcorriente.setText("");
    txtvoltaje.setText("");
    txtresistencia.setText("");
    }//GEN-LAST:event_btmBorrarActionPerformed

    private void btmCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCalcularActionPerformed
    double corriente, resistencia, voltaje;
    voltaje = Double.parseDouble(txtvoltaje.getText());
    resistencia = Double.parseDouble(txtresistencia.getText());
    corriente = Corriente.calcular_corriente(voltaje, resistencia);
    txtcorriente.setText(String.valueOf(corriente));
    }//GEN-LAST:event_btmCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmBorrar;
    private javax.swing.JButton btmCalcular;
    private javax.swing.JButton btmSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtcorriente;
    private javax.swing.JTextField txtresistencia;
    private javax.swing.JTextField txtvoltaje;
    // End of variables declaration//GEN-END:variables
}