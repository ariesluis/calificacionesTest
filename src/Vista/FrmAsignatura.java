/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAsignatura;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pavilion dv4
 */
public class FrmAsignatura extends javax.swing.JFrame {

    /**
     * Creates new form FrmAsignatura
     */
    public FrmAsignatura() {
        initComponents();
        
    }
    
    
    String dir= new JFileChooser().getFileSystemView().getDefaultDirectory().toString();
    
    private ControladorAsignatura cia=new ControladorAsignatura();
    
    private void cargarDocente()
    {
        cia.buscarDocente(dir+"\\Docente.txt", txtBuscar.getText().trim());
        txtDocente.setText(cia.docente.getNombre()+" "+cia.docente.getApellido());
    }
    
    
    public void guardar()
    {
        try
        {
            List<String> nombres= new ArrayList<>();
            List<Double> valores=new ArrayList<>();
            int n_filas=tblParam.getRowCount();
            for (int i = 0; i < n_filas; i++) {
                nombres.add(tblParam.getValueAt(i, 0).toString());
            }
            for (int i = 0; i < n_filas; i++) {
                valores.add(Double.parseDouble(tblParam.getValueAt(i, 1).toString()));
            }
            cia.guardarAsignatura(cia.docente, txtAsignatura.getText(), nombres, valores, dir+"\\Asignatura.txt");
            
            JOptionPane.showMessageDialog(null, "Asignatura guardada con exito", "Asignatura", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString(), "Asignatura", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar1 = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        lblParametrosCalificacion = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblAsignatura = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        txtDocente = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblParam = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnGuardar1.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        lblParametrosCalificacion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblParametrosCalificacion.setText("Parametros Calificacion");

        lblNombre1.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        lblNombre1.setText("Nombre              :");

        lblAsignatura.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        lblAsignatura.setText("Asignatura         :");

        txtDocente.setEditable(false);

        tblParam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nombre", "Puntaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblParam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblParamKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblParam);

        jLabel1.setText("Cedula:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("* Maximo 5 parametros de calificacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblParametrosCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(lblNombre1)
                            .addGap(56, 56, 56)
                            .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel2))
                                    .addGap(0, 91, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(jLabel1)
                            .addGap(120, 120, 120)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblAsignatura))
                    .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(lblParametrosCalificacion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void tblParamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblParamKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblParam.getModel();
        int nr=model.getRowCount();
        int indice=tblParam.getSelectedColumn();
        if (nr < 5)
        {
            if(indice==1 && evt.getKeyCode()== KeyEvent.VK_ENTER)
            {
                model.addRow(new Object[]{"Nombre", 0});
            }
            if(evt.getKeyCode()== KeyEvent.VK_DELETE)
            {
                model.removeRow(tblParam.getSelectedRow());
            }
        }
    }//GEN-LAST:event_tblParamKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        cargarDocente();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblParametrosCalificacion;
    private javax.swing.JTable tblParam;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDocente;
    // End of variables declaration//GEN-END:variables
}
