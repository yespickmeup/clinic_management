/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.options;

import cms.users.MyUser;
import cms.util.Alert;
import cms.util.DateType;
import cms.util.Dlg_confirm_delete;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author RAZOR Defianz
 */
public class Dlg_option_remarks extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_option_investigation
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {
        public final String stmt;

        public OutputData(String stmt) {
            this.stmt = stmt;
        }
        
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_option_remarks(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_option_remarks(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_option_remarks() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_option_remarks myRef;

    private void setThisRef(Dlg_option_remarks myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_option_remarks> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_option_remarks create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_option_remarks create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_option_remarks dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_option_remarks((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_option_remarks dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_option_remarks((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_option_remarks dialog = Dlg_option_remarks.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }

    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_option_investigation_category = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_search_patient = new Field.Search();
        jButton4 = new Button.Primary();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_option_investigation_details = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_search_patient2 = new Field.Search();
        jButton6 = new Button.Primary();
        jButton7 = new Button.Default();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton8 = new Button.Primary();
        jButton2 = new Button.Default();
        jButton3 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Group", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_option_investigation_category.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_option_investigation_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_option_investigation_categoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_option_investigation_category);

        jLabel1.setText("Total no. of rows:");

        jLabel2.setText("0");

        tf_search_patient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_search_patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_search_patientMouseClicked(evt);
            }
        });
        tf_search_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_search_patientActionPerformed(evt);
            }
        });

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 157, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tf_search_patient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_search_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_option_investigation_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_option_investigation_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_option_investigation_detailsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_option_investigation_details);

        jLabel5.setText("Total no. of rows:");

        jLabel6.setText("0");

        tf_search_patient2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_search_patient2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_search_patient2MouseClicked(evt);
            }
        });
        tf_search_patient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_search_patient2ActionPerformed(evt);
            }
        });

        jButton6.setText("New");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tf_search_patient2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_search_patient2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jButton7.setText("Clear Selection");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea1);

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ok");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
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

    private void tbl_option_investigation_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_option_investigation_categoryMouseClicked
        select_investigation_category();
    }//GEN-LAST:event_tbl_option_investigation_categoryMouseClicked

    private void tf_search_patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_search_patientMouseClicked

    }//GEN-LAST:event_tf_search_patientMouseClicked

    private void tf_search_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_search_patientActionPerformed
        ret_investigation_categories();
    }//GEN-LAST:event_tf_search_patientActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new_investigation_category();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_option_investigation_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_option_investigation_detailsMouseClicked
        select_investigation_details();
    }//GEN-LAST:event_tbl_option_investigation_detailsMouseClicked

    private void tf_search_patient2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_search_patient2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_search_patient2MouseClicked

    private void tf_search_patient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_search_patient2ActionPerformed
        ret_investigation_details();
    }//GEN-LAST:event_tf_search_patient2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new_investigation_detail();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        tbl_option_investigation_category.clearSelection();

        tbl_option_investigation_details.clearSelection();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        add_investigation();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ok();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbl_option_investigation_category;
    private javax.swing.JTable tbl_option_investigation_details;
    private javax.swing.JTextField tf_search_patient;
    private javax.swing.JTextField tf_search_patient2;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_option_investigation_category(tbl_option_investigation_category);
        ret_investigation_categories();
        init_tbl_option_investigation_details(tbl_option_investigation_details);
    }

    public void do_pass() {

    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" option investigation category "> 
    public static ArrayListModel tbl_option_investigation_category_ALM;
    public static Tbloption_investigation_categoryModel tbl_option_investigation_category_M;

    public static void init_tbl_option_investigation_category(JTable tbl_option_investigation_category) {
        tbl_option_investigation_category_ALM = new ArrayListModel();
        tbl_option_investigation_category_M = new Tbloption_investigation_categoryModel(tbl_option_investigation_category_ALM);
        tbl_option_investigation_category.setModel(tbl_option_investigation_category_M);
        tbl_option_investigation_category.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_option_investigation_category.setRowHeight(25);
        int[] tbl_widths_option_investigation_category = {100, 30, 30, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_option_investigation_category.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_option_investigation_category, i, tbl_widths_option_investigation_category[i]);
        }
        Dimension d = tbl_option_investigation_category.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_option_investigation_category.getTableHeader().setPreferredSize(d);
        tbl_option_investigation_category.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_investigation_category.setRowHeight(25);
        tbl_option_investigation_category.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_investigation_category.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        tbl_option_investigation_category.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_option_investigation_category(List<Option_remarks_categories.to_option_remarks_categories> acc) {
        tbl_option_investigation_category_ALM.clear();
        tbl_option_investigation_category_ALM.addAll(acc);
    }

    public static class Tbloption_investigation_categoryModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Group", "", "", "clinic_id", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tbloption_investigation_categoryModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Option_remarks_categories.to_option_remarks_categories tt = (Option_remarks_categories.to_option_remarks_categories) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.category;
                case 1:
                    return "/cms/icons/new-file.png";
                case 2:
                    return "/cms/icons/remove11.png";
                case 3:
                    return tt.clinic_id;
                case 4:
                    return tt.created_by;
                case 5:
                    return tt.updated_by;
                case 6:
                    return tt.created_at;
                case 7:
                    return tt.updated_at;
                case 8:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_investigation_categories() {
        String where = " where category like '%" + tf_search_patient.getText() + "%' "
                + " order by category asc ";
        List<Option_remarks_categories.to_option_remarks_categories> datas = Option_remarks_categories.ret_data(where);
        loadData_option_investigation_category(datas);
        jLabel2.setText("" + datas.size());
    }

    private void new_investigation_category() {
        Window p = (Window) this;
        Dlg_option_new nd = Dlg_option_new.create(p, true);
        nd.setTitle("");
        nd.do_pass("", "Group:");
        nd.setCallback(new Dlg_option_new.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_option_new.OutputData data) {
                closeDialog.ok();
                int id = 0;
                String category = data.complaint;
                String clinic = MyUser.getClinic();
                String clinic_id = MyUser.getClinic_id();
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                String created_at = DateType.now();
                String updated_at = DateType.now();
                int status = 0;
                int is_uploaded = 0;
                Option_remarks_categories.to_option_remarks_categories comp = new Option_remarks_categories.to_option_remarks_categories(id, category, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                Option_remarks_categories.add_data(comp);
                ret_investigation_categories();
                Alert.set(1, "");
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_investigation_category() {
        int row = tbl_option_investigation_category.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_remarks_categories.to_option_remarks_categories to = (Option_remarks_categories.to_option_remarks_categories) tbl_option_investigation_category_ALM.get(row);
        int col = tbl_option_investigation_category.getSelectedColumn();
        if (col == 0) {
            ret_investigation_details();
        }
        if (col == 1) {
            Window p = (Window) this;
            Dlg_option_new nd = Dlg_option_new.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.category, "Group:");
            nd.setCallback(new Dlg_option_new.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_option_new.OutputData data) {
                    closeDialog.ok();
                    int id = to.id;
                    String category = data.complaint;
                    String clinic = to.clinic;
                    String clinic_id = to.clinic_id;
                    String created_by = to.created_by;
                    String updated_by = MyUser.getUser_id();
                    String created_at = to.created_at;
                    String updated_at = DateType.now();
                    int status = to.status;
                    int is_uploaded = 0;
                    Option_remarks_categories.to_option_remarks_categories comp = new Option_remarks_categories.to_option_remarks_categories(id, category, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                    Option_remarks_categories.update_data(comp);
                    ret_investigation_categories();
                    Alert.set(2, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 2) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Option_remarks_categories.delete_data(to);
                    ret_investigation_categories();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" option investigation details "> 
    public static ArrayListModel tbl_option_investigation_details_ALM;
    public static Tbloption_investigation_detailsModel tbl_option_investigation_details_M;

    public static void init_tbl_option_investigation_details(JTable tbl_option_investigation_details) {
        tbl_option_investigation_details_ALM = new ArrayListModel();
        tbl_option_investigation_details_M = new Tbloption_investigation_detailsModel(tbl_option_investigation_details_ALM);
        tbl_option_investigation_details.setModel(tbl_option_investigation_details_M);
        tbl_option_investigation_details.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_option_investigation_details.setRowHeight(25);
        int[] tbl_widths_option_investigation_details = {100, 30, 30, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_option_investigation_details.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_option_investigation_details, i, tbl_widths_option_investigation_details[i]);
        }
        Dimension d = tbl_option_investigation_details.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_option_investigation_details.getTableHeader().setPreferredSize(d);
        tbl_option_investigation_details.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_investigation_details.setRowHeight(25);
        tbl_option_investigation_details.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_investigation_details.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        tbl_option_investigation_details.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_option_investigation_details(List<Option_remarks_details.to_option_remarks_details> acc) {
        tbl_option_investigation_details_ALM.clear();
        tbl_option_investigation_details_ALM.addAll(acc);
    }

    public static class Tbloption_investigation_detailsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Sub-group", "", "", "clinic_id", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tbloption_investigation_detailsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Option_remarks_details.to_option_remarks_details tt = (Option_remarks_details.to_option_remarks_details) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.details;
                case 1:
                    return "/cms/icons/new-file.png";
                case 2:
                    return "/cms/icons/remove11.png";
                case 3:
                    return tt.clinic_id;
                case 4:
                    return tt.created_by;
                case 5:
                    return tt.updated_by;
                case 6:
                    return tt.created_at;
                case 7:
                    return tt.updated_at;
                case 8:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_investigation_details() {
        int row = tbl_option_investigation_category.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_remarks_categories.to_option_remarks_categories to = (Option_remarks_categories.to_option_remarks_categories) tbl_option_investigation_category_ALM.get(row);
        String where = " where category_id='" + to.id + "' and details like '%" + tf_search_patient2.getText() + "%' "
                + " order by details asc ";
        List<Option_remarks_details.to_option_remarks_details> datas = Option_remarks_details.ret_data(where);
        loadData_option_investigation_details(datas);
        jLabel6.setText("" + datas.size());
    }

    private void new_investigation_detail() {
        int row = tbl_option_investigation_category.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_remarks_categories.to_option_remarks_categories to = (Option_remarks_categories.to_option_remarks_categories) tbl_option_investigation_category_ALM.get(row);
        Window p = (Window) this;
        Dlg_option_new nd = Dlg_option_new.create(p, true);
        nd.setTitle("");
        nd.do_pass("", "Sub-group:");
        nd.setCallback(new Dlg_option_new.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_option_new.OutputData data) {
                closeDialog.ok();
                int id = 0;
                String category = to.category;
                String category_id = "" + to.id;
                String details = data.complaint;

                String clinic = MyUser.getClinic();
                String clinic_id = MyUser.getClinic_id();
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                String created_at = DateType.now();
                String updated_at = DateType.now();
                int status = 0;
                int is_uploaded = 0;
                Option_remarks_details.to_option_remarks_details comp = new Option_remarks_details.to_option_remarks_details(id, category, category_id, details, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                Option_remarks_details.add_data(comp);
                ret_investigation_details();
                Alert.set(1, "");
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_investigation_details() {
        int row = tbl_option_investigation_details.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_remarks_details.to_option_remarks_details to = (Option_remarks_details.to_option_remarks_details) tbl_option_investigation_details_ALM.get(row);
        int col = tbl_option_investigation_details.getSelectedColumn();
        if (col == 0) {

        }
        if (col == 1) {
            Window p = (Window) this;
            Dlg_option_new nd = Dlg_option_new.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.details, "Details:");
            nd.setCallback(new Dlg_option_new.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_option_new.OutputData data) {
                    closeDialog.ok();
                    int id = to.id;
                    String category = to.category;
                    String category_id = to.category_id;
                    String details = data.complaint;

                    String clinic = to.clinic;
                    String clinic_id = to.clinic_id;
                    String created_by = to.created_by;
                    String updated_by = MyUser.getUser_id();
                    String created_at = to.created_at;
                    String updated_at = DateType.now();
                    int status = to.status;
                    int is_uploaded = 0;
                    Option_remarks_details.to_option_remarks_details comp = new Option_remarks_details.to_option_remarks_details(id, category, category_id, details, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                    Option_remarks_details.update_data(comp);
                    ret_investigation_details();
                    Alert.set(2, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 2) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Option_remarks_details.delete_data(to);
                    ret_investigation_details();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

//</editor-fold> 
    private void add_investigation() {
        int row = tbl_option_investigation_details.getSelectedRow();
        if (row < 0) {
            return;

        }
        Option_remarks_details.to_option_remarks_details sub = (Option_remarks_details.to_option_remarks_details) tbl_option_investigation_details_ALM.get(row);
        String stmt = sub.details;

        String text = jTextArea1.getText();
        if (text.isEmpty()) {
            jTextArea1.setText(stmt);
        } else {
            jTextArea1.setText(text + "\n" + stmt);
        }
    }
    private void ok() {
          String stmt=jTextArea1.getText();
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(stmt));
        }
    }
}
