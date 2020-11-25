/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import model.clases.Contrato;
import model.clases.Empresa;
import model.ws.ConexionWS;
import model.ws.ContratoWS;
import model.ws.EmpresaWS;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Contratos extends javax.swing.JFrame {

    private List<Empresa> lista;
    private Empresa empresa;
    private ContratoWS conn;
    private DefaultTableModel dtmModelo;
    public static String codigoEstatico;

    public Contratos() {
        initComponents();

        conn = new ContratoWS();

        try {
            lista = new EmpresaWS().getAllEmpresas();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error de servidor");
        }

        for (Empresa em : lista) {
            cboEmpresas.addItem(em);
        }

        formatoTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cboEmpresas = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTituloContratosAEmpresas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosEmpresa = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnNuevoConrato = new javax.swing.JButton();
        txtRutABuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("logo");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Contratos");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Buscar Empresas: ");

        cboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresasActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOTEL INFORMATICO");

        lblTituloContratosAEmpresas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblTituloContratosAEmpresas.setText("Contratos \"Empresa Seleccionada\":");

        tblDatosEmpresa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDatosEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosEmpresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatosEmpresa);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnNuevoConrato.setText("Nuevo Contrato");
        btnNuevoConrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoConratoActionPerformed(evt);
            }
        });

        txtRutABuscar.setText("Ingrese Rut");
        txtRutABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutABuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblTituloContratosAEmpresas))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevoConrato))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboEmpresas, 0, 176, Short.MAX_VALUE)
                            .addComponent(txtRutABuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtRutABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloContratosAEmpresas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoConrato, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new InicioUser().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNuevoConratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoConratoActionPerformed
        new ContratoCrear().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoConratoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Empresa empresa = (Empresa) cboEmpresas.getSelectedItem();

        limpiarTabla();

        lblTituloContratosAEmpresas.setText("Contratos: " + empresa.getNombre());

        try {
            List<Contrato> listaContratos = conn.getContratosForIDEmpresa(empresa.getId());

            cargartabla(listaContratos);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No hay contratos con esta empresa");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtRutABuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutABuscarKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String rut = txtRutABuscar.getText();

                if (new EmpresaWS().getEmpresaPorRut(rut) != null) {
                    empresa = new EmpresaWS().getEmpresaPorRut(rut);
                    List<Contrato> listaContratos = conn.getContratosForIDEmpresa(empresa.getId());

                    limpiarTabla();
                    cargartabla(listaContratos);
                } else {
                    System.out.println("objeto null no existe");
                }
            } catch (IOException ex) {
                System.out.println("Cayo en el cach");
            }
        }

    }//GEN-LAST:event_txtRutABuscarKeyReleased

    private void tblDatosEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosEmpresaMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = tblDatosEmpresa.rowAtPoint(evt.getPoint());
            int columna = tblDatosEmpresa.columnAtPoint(evt.getPoint());
            if ((fila > -1) && (columna > -1)) {
                System.out.println(dtmModelo.getValueAt(fila, 0));

                codigoEstatico = (String) dtmModelo.getValueAt(fila, 0);

                new ContratoVer().setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_tblDatosEmpresaMouseClicked

    private void cboEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresasActionPerformed
        if (dtmModelo != null) {
            empresa = (Empresa) cboEmpresas.getSelectedItem();
            
            limpiarTabla();
            
            try {
                List<Contrato> listaContratos = conn.getContratosForIDEmpresa(empresa.getId());

                cargartabla(listaContratos);
            } catch (IOException ex) {
                System.out.println("Cayo en el catch");
            }
        }
    }//GEN-LAST:event_cboEmpresasActionPerformed


    private void cargartabla(List<Contrato> lista) {
        for (Contrato c : lista) {
            Object[] fila = new Object[4];

            fila[0] = c.getCodigo();
            fila[1] = c.getNombre();
            fila[2] = c.getFechaInicio();
            fila[3] = c.getFechaFin();

            dtmModelo.addRow(fila);
        }
    }

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
            java.util.logging.Logger.getLogger(Contratos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contratos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contratos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contratos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contratos().setVisible(true);
            }
        });
    }

    public void formatoTabla() {
        dtmModelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

        };

        tblDatosEmpresa.setModel(dtmModelo);

        dtmModelo.addColumn("Numero");
        dtmModelo.addColumn("Nombre");
        dtmModelo.addColumn("Fecha Inicio");
        dtmModelo.addColumn("Fecha Fin");
    }

    private void limpiarTabla() {
        if (dtmModelo.getRowCount() > 0) {
            for (int i = dtmModelo.getRowCount() - 1; i > -1; i--) {
                dtmModelo.removeRow(i);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevoConrato;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Empresa> cboEmpresas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblTituloContratosAEmpresas;
    private javax.swing.JTable tblDatosEmpresa;
    private javax.swing.JTextField txtRutABuscar;
    // End of variables declaration//GEN-END:variables
}
