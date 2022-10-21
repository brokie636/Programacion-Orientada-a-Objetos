package com.mycompany.personas1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal   extends JFrame implements
        ActionListener{
    private ListaPersonas lista;
     
            private JLabel nombre, apellidos, teléfono, dirección;
            private JTextField campoNombre, campoApellidos, campoTeléfono,
            campoDirección;
            private JButton añadir, eliminar, borrarLista; 
            private JList listaNombres; 
            private DefaultListModel modelo; 
            private JScrollPane scrollLista; 
        
    public VentanaPrincipal() {
        
        initComponents();
        lista = new ListaPersonas(); 
        setTitle("Personas"); 
        
        setLocationRelativeTo(null); 
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollLista = new javax.swing.JScrollPane();
        listaNombres = new javax.swing.JList<>();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        teléfono = new javax.swing.JLabel();
        dirección = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoTeléfono = new javax.swing.JTextField();
        campoDirección = new javax.swing.JTextField();
        añadir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        borrarLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scrollLista.setViewportView(listaNombres);

        nombre.setText("Nombre:");

        apellidos.setText("Apellidos:");

        teléfono.setText("Telefono:");

        dirección.setText("Direccion:");

        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");

        borrarLista.setText("Borrar Lista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollLista)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(apellidos)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoApellidos))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(teléfono)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoTeléfono))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dirección)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoDirección))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 14, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(añadir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(borrarLista)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidos)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teléfono)
                    .addComponent(campoTeléfono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirección)
                    .addComponent(campoDirección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(añadir)
                .addGap(18, 18, 18)
                .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(borrarLista))
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
       
    }//GEN-LAST:event_añadirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == añadir) { 
        añadirPersona(); 
            }
        if (e.getSource() == eliminar) { 

        eliminarNombre(listaNombres.getSelectedIndex());
        }
        if (e.getSource() == borrarLista) { 
        borrarLista(); 
        }
        }
       
        private void añadirPersona() {
        
        Persona p = new Persona(campoNombre.getText(), campoApellidos.getText(),campoTeléfono.getText(), campoDirección.getText());
        lista.añadirPersona(p); 
        String elemento = campoNombre.getText() + "-" +
        campoApellidos.getText() +
        "-" + campoTeléfono.getText() + "-" + campoDirección.
        getText();
        modelo.addElement(elemento); 
        listaNombres.setModel(modelo);
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTeléfono.setText("");
        campoDirección.setText("");
        }
      
private void eliminarNombre(int indice) {
        if (indice >= 0) { 
        modelo.removeElementAt(indice); 
        lista.eliminarPersona(indice); 
        } else { 
        JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
        private void borrarLista() {
        lista.borrarLista(); 
        modelo.clear(); 
        }

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
} 
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton añadir;
    private javax.swing.JButton borrarLista;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoDirección;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTeléfono;
    private javax.swing.JLabel dirección;
    private javax.swing.JButton eliminar;
    private javax.swing.JList<String> listaNombres;
    private javax.swing.JLabel nombre;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JLabel teléfono;
    // End of variables declaration//GEN-END:variables

*/
