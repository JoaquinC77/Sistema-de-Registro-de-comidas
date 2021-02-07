package app;

import app.uieditor.PropiedadesCBO;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
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
        this.setLocationRelativeTo(null);
        cboEmpresas.setUI(PropiedadesCBO.createUI(rootPane));
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cboEmpresas = new javax.swing.JComboBox<>();
        txtRutABuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnNuevoConrato = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblTituloContratosAEmpresas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosEmpresa = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        lblExit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOTEL INFORMATICO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 369, 65));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel3.setText("Contratos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 730, 10));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel4.setText("Buscar Empresas: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 10));

        cboEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresasActionPerformed(evt);
            }
        });
        jPanel1.add(cboEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 190, 30));

        txtRutABuscar.setText("Ingrese Rut Empresa");
        txtRutABuscar.setBorder(null);
        txtRutABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutABuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtRutABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 190, 30));

        btnBuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscar.setForeground(new java.awt.Color(238, 112, 82));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_5_330396.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnBuscarMouseMoved(evt);
            }
        });
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 140, 50));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setForeground(new java.awt.Color(238, 112, 82));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_gtk-go-back-ltr_79911.png"))); // NOI18N
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVolverMouseMoved(evt);
            }
        });
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, 46));

        btnNuevoConrato.setBackground(new java.awt.Color(153, 153, 153));
        btnNuevoConrato.setForeground(new java.awt.Color(238, 112, 82));
        btnNuevoConrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_social_statistics_piechart_diagram_web_information_info_2701085.png"))); // NOI18N
        btnNuevoConrato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnNuevoConrato.setContentAreaFilled(false);
        btnNuevoConrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoConrato.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnNuevoConratoMouseMoved(evt);
            }
        });
        btnNuevoConrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoConratoMouseExited(evt);
            }
        });
        btnNuevoConrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoConratoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoConrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 140, 46));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 730, 10));

        lblTituloContratosAEmpresas.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        lblTituloContratosAEmpresas.setText("Contratos \"Empresa Seleccionada\":");
        jPanel1.add(lblTituloContratosAEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        tblDatosEmpresa.setForeground(new java.awt.Color(238, 112, 82));
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
        tblDatosEmpresa.setGridColor(new java.awt.Color(0, 0, 0));
        tblDatosEmpresa.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tblDatosEmpresa.setSelectionForeground(new java.awt.Color(238, 112, 82));
        tblDatosEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosEmpresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatosEmpresa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 730, 140));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, 10));

        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconfinder_delete_51514.png"))); // NOI18N
        lblExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblExitMouseMoved(evt);
            }
        });
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });
        jPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGOSISTEMA.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new InicioUsuario().setVisible(true);
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

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseMoved
        btnVolver.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnVolverMouseMoved

    private void btnNuevoConratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoConratoMouseExited
        btnNuevoConrato.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnNuevoConratoMouseExited

    private void btnNuevoConratoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoConratoMouseMoved
        btnNuevoConrato.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnNuevoConratoMouseMoved

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseMoved
        btnBuscar.setBorder(BorderFactory.createLineBorder(new Color(238, 112, 82)));
    }//GEN-LAST:event_btnBuscarMouseMoved

    private void lblExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseMoved
        lblExit.setBorder(BorderFactory.createLineBorder(new Color(238,112,82)));
    }//GEN-LAST:event_lblExitMouseMoved

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_lblExitMouseExited

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblTituloContratosAEmpresas;
    private javax.swing.JTable tblDatosEmpresa;
    private javax.swing.JTextField txtRutABuscar;
    // End of variables declaration//GEN-END:variables
}
