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
public class Dlg_option_history extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_option_history
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
    private Dlg_option_history(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_option_history(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_option_history() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_option_history myRef;

    private void setThisRef(Dlg_option_history myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_option_history> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_option_history create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_option_history create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_option_history dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_option_history((java.awt.Frame) parent, false);
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
            Dlg_option_history dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_option_history((java.awt.Dialog) parent, false);
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

        Dlg_option_history dialog = Dlg_option_history.create(new javax.swing.JFrame(), true);
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
        tbl_option_history_group = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_search_patient = new Field.Search();
        jButton4 = new Button.Primary();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_option_history_classification = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_search_patient1 = new Field.Search();
        jButton5 = new Button.Primary();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_option_history_sub_classification = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_search_patient2 = new Field.Search();
        jButton6 = new Button.Primary();
        jButton7 = new Button.Default();
        jButton8 = new Button.Primary();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new Button.Default();
        jButton3 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Group", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_option_history_group.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_option_history_group.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_option_history_groupMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_option_history_group);

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
                        .addGap(0, 111, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sub Group", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_option_history_classification.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_option_history_classification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_option_history_classificationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_option_history_classification);

        jLabel3.setText("Total no. of rows:");

        jLabel4.setText("0");

        tf_search_patient1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_search_patient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_search_patient1MouseClicked(evt);
            }
        });
        tf_search_patient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_search_patient1ActionPerformed(evt);
            }
        });

        jButton5.setText("New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 140, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tf_search_patient1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_search_patient1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_option_history_sub_classification.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_option_history_sub_classification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_option_history_sub_classificationMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_option_history_sub_classification);

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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 199, Short.MAX_VALUE))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea1);

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
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
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

    private void tbl_option_history_groupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_option_history_groupMouseClicked
        select_history_category();
    }//GEN-LAST:event_tbl_option_history_groupMouseClicked

    private void tf_search_patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_search_patientMouseClicked

    }//GEN-LAST:event_tf_search_patientMouseClicked

    private void tf_search_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_search_patientActionPerformed
        ret_history_category();
    }//GEN-LAST:event_tf_search_patientActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new_history_category();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_option_history_classificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_option_history_classificationMouseClicked
        select_history_classification();
    }//GEN-LAST:event_tbl_option_history_classificationMouseClicked

    private void tf_search_patient1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_search_patient1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_search_patient1MouseClicked

    private void tf_search_patient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_search_patient1ActionPerformed
        ret_history_classification();
    }//GEN-LAST:event_tf_search_patient1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new_history_classification();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_option_history_sub_classificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_option_history_sub_classificationMouseClicked
        select_history_sub_classification();
    }//GEN-LAST:event_tbl_option_history_sub_classificationMouseClicked

    private void tf_search_patient2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_search_patient2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_search_patient2MouseClicked

    private void tf_search_patient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_search_patient2ActionPerformed
        ret_history_sub_classification();
    }//GEN-LAST:event_tf_search_patient2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new_history_sub_classification();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        tbl_option_history_classification.clearSelection();
        tbl_option_history_group.clearSelection();
        tbl_option_history_sub_classification.clearSelection();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        add_history();
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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbl_option_history_classification;
    private javax.swing.JTable tbl_option_history_group;
    private javax.swing.JTable tbl_option_history_sub_classification;
    private javax.swing.JTextField tf_search_patient;
    private javax.swing.JTextField tf_search_patient1;
    private javax.swing.JTextField tf_search_patient2;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_option_history_group(tbl_option_history_group);
        init_tbl_option_history_classification(tbl_option_history_classification);
        init_tbl_option_history_sub_classification(tbl_option_history_sub_classification);
        ret_history_category();
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

    //<editor-fold defaultstate="collapsed" desc=" option history category "> 
    public static ArrayListModel tbl_option_history_group_ALM;
    public static Tbloption_history_groupModel tbl_option_history_group_M;

    public static void init_tbl_option_history_group(JTable tbl_option_history_group) {
        tbl_option_history_group_ALM = new ArrayListModel();
        tbl_option_history_group_M = new Tbloption_history_groupModel(tbl_option_history_group_ALM);
        tbl_option_history_group.setModel(tbl_option_history_group_M);
        tbl_option_history_group.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_option_history_group.setRowHeight(25);
        int[] tbl_widths_option_history_group = {100, 30, 30, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_option_history_group.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_option_history_group, i, tbl_widths_option_history_group[i]);
        }
        Dimension d = tbl_option_history_group.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_option_history_group.getTableHeader().setPreferredSize(d);
        tbl_option_history_group.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_history_group.setRowHeight(25);
        tbl_option_history_group.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_history_group.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        tbl_option_history_group.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_option_history_group(List<Option_history_categories.to_option_history_categories> acc) {
        tbl_option_history_group_ALM.clear();
        tbl_option_history_group_ALM.addAll(acc);
    }

    public static class Tbloption_history_groupModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Group", "", "", "clinic_id", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tbloption_history_groupModel(ListModel listmodel) {
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
            Option_history_categories.to_option_history_categories tt = (Option_history_categories.to_option_history_categories) getRow(row);
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

    private void ret_history_category() {
        String where = " where category like '%" + tf_search_patient.getText() + "%' "
                + " order by category asc ";
        List<Option_history_categories.to_option_history_categories> datas = Option_history_categories.ret_data(where);
        loadData_option_history_group(datas);
        jLabel2.setText("" + datas.size());
    }

    private void new_history_category() {
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
                Option_history_categories.to_option_history_categories comp = new Option_history_categories.to_option_history_categories(id, category, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                Option_history_categories.add_data(comp);
                ret_history_category();
                Alert.set(1, "");
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_history_category() {
        int row = tbl_option_history_group.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_history_categories.to_option_history_categories to = (Option_history_categories.to_option_history_categories) tbl_option_history_group_ALM.get(row);
        int col = tbl_option_history_group.getSelectedColumn();
        if (col == 0) {
            ret_history_classification();
            tbl_option_history_sub_classification_ALM.clear();
            jLabel6.setText("0");
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
                    Option_history_categories.to_option_history_categories comp = new Option_history_categories.to_option_history_categories(id, category, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                    Option_history_categories.update_data(comp);
                    ret_history_category();
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
                    Option_history_categories.delete_data(to);
                    ret_history_category();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" option history classification "> 
    public static ArrayListModel tbl_option_history_classification_ALM;
    public static Tbloption_history_classificationModel tbl_option_history_classification_M;

    public static void init_tbl_option_history_classification(JTable tbl_option_history_classification) {
        tbl_option_history_classification_ALM = new ArrayListModel();
        tbl_option_history_classification_M = new Tbloption_history_classificationModel(tbl_option_history_classification_ALM);
        tbl_option_history_classification.setModel(tbl_option_history_classification_M);
        tbl_option_history_classification.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_option_history_classification.setRowHeight(25);
        int[] tbl_widths_option_history_classification = {100, 30, 30, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_option_history_classification.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_option_history_classification, i, tbl_widths_option_history_classification[i]);
        }
        Dimension d = tbl_option_history_classification.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_option_history_classification.getTableHeader().setPreferredSize(d);
        tbl_option_history_classification.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_history_classification.setRowHeight(25);
        tbl_option_history_classification.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_history_classification.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        tbl_option_history_classification.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_option_history_classification(List<Option_history_classifications.to_option_history_classifications> acc) {
        tbl_option_history_classification_ALM.clear();
        tbl_option_history_classification_ALM.addAll(acc);
    }

    public static class Tbloption_history_classificationModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Sub-group", "", "", "clinic_id", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tbloption_history_classificationModel(ListModel listmodel) {
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
            Option_history_classifications.to_option_history_classifications tt = (Option_history_classifications.to_option_history_classifications) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.classification;
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

    private void ret_history_classification() {
        int row = tbl_option_history_group.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_history_categories.to_option_history_categories to = (Option_history_categories.to_option_history_categories) tbl_option_history_group_ALM.get(row);
        String where = " where category_id='" + to.id + "' and classification like '%" + tf_search_patient1.getText() + "%' "
                + " order by classification asc ";
        List<Option_history_classifications.to_option_history_classifications> datas = Option_history_classifications.ret_data(where);
        loadData_option_history_classification(datas);
        jLabel4.setText("" + datas.size());
    }

    private void new_history_classification() {
        int row = tbl_option_history_group.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_history_categories.to_option_history_categories to = (Option_history_categories.to_option_history_categories) tbl_option_history_group_ALM.get(row);
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
                String classification = data.complaint;
                String clinic = MyUser.getClinic();
                String clinic_id = MyUser.getClinic_id();
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                String created_at = DateType.now();
                String updated_at = DateType.now();
                int status = 0;
                int is_uploaded = 0;
                Option_history_classifications.to_option_history_classifications comp = new Option_history_classifications.to_option_history_classifications(id, category, category_id, classification, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                Option_history_classifications.add_data(comp);
                ret_history_classification();
                Alert.set(1, "");
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_history_classification() {
        int row = tbl_option_history_classification.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_history_classifications.to_option_history_classifications to = (Option_history_classifications.to_option_history_classifications) tbl_option_history_classification_ALM.get(row);
        int col = tbl_option_history_classification.getSelectedColumn();
        if (col == 0) {
            ret_history_sub_classification();
        }
        if (col == 1) {
            Window p = (Window) this;
            Dlg_option_new nd = Dlg_option_new.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.classification, "Sub-group:");
            nd.setCallback(new Dlg_option_new.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_option_new.OutputData data) {
                    closeDialog.ok();
                    int id = to.id;
                    String category = to.category;
                    String category_id = to.category_id;
                    String classification = data.complaint;
                    String clinic = to.clinic;
                    String clinic_id = to.clinic_id;
                    String created_by = to.created_by;
                    String updated_by = MyUser.getUser_id();
                    String created_at = to.created_at;
                    String updated_at = DateType.now();
                    int status = to.status;
                    int is_uploaded = 0;
                    Option_history_classifications.to_option_history_classifications comp = new Option_history_classifications.to_option_history_classifications(id, category, category_id, classification, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                    Option_history_classifications.update_data(comp);
                    ret_history_classification();
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
                    Option_history_classifications.delete_data(to);
                    ret_history_classification();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" option history details "> 
    public static ArrayListModel tbl_option_history_sub_classification_ALM;
    public static Tbloption_history_sub_classificationModel tbl_option_history_sub_classification_M;

    public static void init_tbl_option_history_sub_classification(JTable tbl_option_history_sub_classification) {
        tbl_option_history_sub_classification_ALM = new ArrayListModel();
        tbl_option_history_sub_classification_M = new Tbloption_history_sub_classificationModel(tbl_option_history_sub_classification_ALM);
        tbl_option_history_sub_classification.setModel(tbl_option_history_sub_classification_M);
        tbl_option_history_sub_classification.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_option_history_sub_classification.setRowHeight(25);
        int[] tbl_widths_option_history_sub_classification = {100, 30, 30, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_option_history_sub_classification.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_option_history_sub_classification, i, tbl_widths_option_history_sub_classification[i]);
        }
        Dimension d = tbl_option_history_sub_classification.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_option_history_sub_classification.getTableHeader().setPreferredSize(d);
        tbl_option_history_sub_classification.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_history_sub_classification.setRowHeight(25);
        tbl_option_history_sub_classification.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_option_history_sub_classification.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer());
        tbl_option_history_sub_classification.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_option_history_sub_classification(List<Option_history_sub_classifications.to_option_history_sub_classifications> acc) {
        tbl_option_history_sub_classification_ALM.clear();
        tbl_option_history_sub_classification_ALM.addAll(acc);
    }

    public static class Tbloption_history_sub_classificationModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Sub-group", "", "", "clinic_id", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tbloption_history_sub_classificationModel(ListModel listmodel) {
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
            Option_history_sub_classifications.to_option_history_sub_classifications tt = (Option_history_sub_classifications.to_option_history_sub_classifications) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.sub_classification;
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

    private void ret_history_sub_classification() {
        int row = tbl_option_history_classification.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_history_classifications.to_option_history_classifications to = (Option_history_classifications.to_option_history_classifications) tbl_option_history_classification_ALM.get(row);
        String where = " where classification_id='" + to.id + "' and sub_classification like '%" + tf_search_patient2.getText() + "%' "
                + " order by sub_classification asc ";
        List<Option_history_sub_classifications.to_option_history_sub_classifications> datas = Option_history_sub_classifications.ret_data(where);
        loadData_option_history_sub_classification(datas);
        jLabel6.setText("" + datas.size());
    }

    private void new_history_sub_classification() {
        int row = tbl_option_history_classification.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_history_classifications.to_option_history_classifications to = (Option_history_classifications.to_option_history_classifications) tbl_option_history_classification_ALM.get(row);
        Window p = (Window) this;
        Dlg_option_new nd = Dlg_option_new.create(p, true);
        nd.setTitle("");
        nd.do_pass("", "Details:");
        nd.setCallback(new Dlg_option_new.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_option_new.OutputData data) {
                closeDialog.ok();
                int id = 0;
                String category = to.category;
                String category_id = to.category_id;
                String classification = to.classification;
                String classification_id = "" + to.id;
                String sub_classification = data.complaint;
                String clinic = MyUser.getClinic();
                String clinic_id = MyUser.getClinic_id();
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                String created_at = DateType.now();
                String updated_at = DateType.now();
                int status = 0;
                int is_uploaded = 0;
                Option_history_sub_classifications.to_option_history_sub_classifications comp = new Option_history_sub_classifications.to_option_history_sub_classifications(id, category, category_id, classification, classification_id, sub_classification, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                Option_history_sub_classifications.add_data(comp);
                ret_history_sub_classification();
                Alert.set(1, "");
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_history_sub_classification() {
        int row = tbl_option_history_sub_classification.getSelectedRow();
        if (row < 0) {
            return;
        }
        Option_history_sub_classifications.to_option_history_sub_classifications to = (Option_history_sub_classifications.to_option_history_sub_classifications) tbl_option_history_sub_classification_ALM.get(row);
        int col = tbl_option_history_sub_classification.getSelectedColumn();
        if (col == 0) {

        }
        if (col == 1) {
            Window p = (Window) this;
            Dlg_option_new nd = Dlg_option_new.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.sub_classification, "Details:");
            nd.setCallback(new Dlg_option_new.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_option_new.OutputData data) {
                    closeDialog.ok();
                    int id = to.id;
                    String category = to.category;
                    String category_id = to.category_id;
                    String classification = to.classification;
                    String classification_id = to.classification_id;
                    String sub_classification = data.complaint;
                    String clinic = to.clinic;
                    String clinic_id = to.clinic_id;
                    String created_by = to.created_by;
                    String updated_by = MyUser.getUser_id();
                    String created_at = to.created_at;
                    String updated_at = DateType.now();
                    int status = to.status;
                    int is_uploaded = 0;
                    Option_history_sub_classifications.to_option_history_sub_classifications comp = new Option_history_sub_classifications.to_option_history_sub_classifications(id, category, category_id, classification, classification_id, sub_classification, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                    Option_history_sub_classifications.update_data(comp);
                    ret_history_sub_classification();
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
                    Option_history_sub_classifications.delete_data(to);
                    ret_history_sub_classification();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

//</editor-fold> 
    private void add_history() {
        int row = tbl_option_history_sub_classification.getSelectedRow();
        if (row < 0) {
            return;

        }
        Option_history_sub_classifications.to_option_history_sub_classifications sub = (Option_history_sub_classifications.to_option_history_sub_classifications) tbl_option_history_sub_classification_ALM.get(row);
        String stmt = sub.category + ""
                + " - " + sub.classification + ""
                + " - " + sub.sub_classification;
        String text = jTextArea1.getText();
        if (text.isEmpty()) {
            jTextArea1.setText(stmt);
        } else {
            jTextArea1.setText(text + "\n" + stmt);
        }
    }

    private void ok() {
        String stmt = jTextArea1.getText();
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(stmt));
        }
    }
}
