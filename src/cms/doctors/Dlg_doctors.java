/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.doctors;

import cms.clinics.Clinics;
import cms.degrees.Degrees;
import cms.degrees.Dlg_degrees;
import cms.departments.Departments;
import cms.departments.Dlg_departments;
import cms.designations.Designations;
import cms.designations.Dlg_designations;
import cms.doctors.Doctor_daily_schedules.to_doctor_daily_schedules;
import cms.doctors.Doctor_none_working_days.to_doctor_none_working_days;
import cms.doctors.Doctors.to_doctors;
import cms.users.MyUser;
import cms.util.Alert;
import cms.util.CheckBox;
import cms.util.DateType;
import cms.util.Dlg_confirm_action;
import cms.util.Dlg_confirm_delete;
import cms.util.TableCheckBoxRenderer;
import cms.util.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
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
 * @author Guinness
 */
public class Dlg_doctors extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_doctors
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
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_doctors(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_doctors(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_doctors() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_doctors myRef;

    private void setThisRef(Dlg_doctors myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_doctors> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_doctors create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_doctors create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_doctors dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_doctors((java.awt.Frame) parent, false);
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
            Dlg_doctors dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_doctors((java.awt.Dialog) parent, false);
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

        Dlg_doctors dialog = Dlg_doctors.create(new javax.swing.JFrame(), true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        dialog.setSize(xSize, ySize);
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_doctors = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField17 = new Field.Input();
        jButton3 = new Button.Default();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new Field.Search();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new Field.Input();
        jTextField3 = new Field.Input();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new Field.Input();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new Field.Input();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new Field.Combo();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new Field.Input();
        jTextField8 = new Field.Combo();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new Field.Combo();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new Field.Input();
        jTextField11 = new Field.Combo();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new Field.Combo();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new Field.Combo();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new Field.Combo();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new Field.Combo();
        jLabel18 = new javax.swing.JLabel();
        jTextField16 = new Field.Combo();
        jButton2 = new Button.Default();
        jButton1 = new Button.Success();
        jLabel19 = new javax.swing.JLabel();
        jTextField18 = new Field.Combo();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_doctor_daily_schedules = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_doctor_none_working_days = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jButton4 = new Button.Default();
        jButton5 = new Button.Default();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_doctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_doctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_doctorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_doctors);

        jLabel1.setText("Total no. of rows:");

        jLabel2.setText("0");

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Clinic:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("First Name:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Middle Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Last Name:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Suffix Name:");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Degree:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Reg. No.:");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Designation:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Specialization:");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Address:");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Province:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("City/Municipality:");

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Barangay:");

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Department:");

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Contact No.:");

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Email Address:");

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Country:");

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5)
                            .addComponent(jTextField3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField14))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField18))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Basic Information", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daily Schedules", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        tbl_doctor_daily_schedules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_doctor_daily_schedules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_doctor_daily_schedulesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_doctor_daily_schedules);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "None Working Days", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_doctor_none_working_days.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_doctor_none_working_days.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_doctor_none_working_daysMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_doctor_none_working_days);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Year:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("All");

        jYearChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Month:");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("All");

        jMonthChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox1))
                            .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox2))
                            .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Schedules", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new_doctor();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        save_doctor();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ret_doctors();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbl_doctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_doctorsMouseClicked
        select_doctor();
    }//GEN-LAST:event_tbl_doctorsMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        init_clinic();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        init_clinic();
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        init_compartments(jTextField6);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        init_compartments(jTextField6);
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        init_departments(jTextField14);
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        init_departments(jTextField14);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        init_designation(jTextField8);
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        init_designation(jTextField8);
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        ret_daily_schedules();
    }//GEN-LAST:event_jList1MouseClicked

    private void tbl_doctor_daily_schedulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_doctor_daily_schedulesMouseClicked
        select_time_schedule();
    }//GEN-LAST:event_tbl_doctor_daily_schedulesMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new_doctor_none_working_days();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ret_doctor_none_working_days();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_doctor_none_working_daysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_doctor_none_working_daysMouseClicked
        select_doctor_none_working_days();
    }//GEN-LAST:event_tbl_doctor_none_working_daysMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTable tbl_doctor_daily_schedules;
    private javax.swing.JTable tbl_doctor_none_working_days;
    private javax.swing.JTable tbl_doctors;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_clinics();
        init_degrees();
        init_departments();
        init_designations();

        init_tbl_doctors(tbl_doctors);
        init_tbl_doctor_daily_schedules(tbl_doctor_daily_schedules);
        init_tbl_doctor_none_working_days(tbl_doctor_none_working_days);
        ret_doctors();
        jTextField2.grabFocus();
    }

    public void do_pass() {

    }

    private void init_clinics() {
        String where = " order by clinic asc";
        clinic_list = Clinics.ret_data(where);

        if (!clinic_list.isEmpty()) {
            Clinics.to_clinics clinic = (Clinics.to_clinics) clinic_list.get(0);
            Field.Search cl = (Field.Search) jTextField1;
            cl.setText(clinic.clinic);
            cl.setId("" + clinic.id);
        }
    }

    private void init_degrees() {
        degrees = Degrees.ret_data(" order by degree asc ");
    }

    private void init_departments() {
        departments = Departments.ret_data(" order by department asc ");
    }

    private void init_designations() {
        designations = Designations.ret_data(" order by designation asc");
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

        jTextField6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_degrees();
                }
            }
        });
        jTextField14.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_departments();
                }
            }
        });
        jTextField8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_designations();
                }
            }
        });
    }

    private void dlg_degrees() {
        Window p = (Window) this;
        Dlg_degrees nd = Dlg_degrees.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_degrees.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_degrees.OutputData data) {
                init_degrees();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_designations() {
        Window p = (Window) this;
        Dlg_designations nd = Dlg_designations.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_designations.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_designations.OutputData data) {
                init_designations();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_departments() {
        Window p = (Window) this;
        Dlg_departments nd = Dlg_departments.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_departments.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_departments.OutputData data) {
                init_departments();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" init cb ">
    List<Clinics.to_clinics> clinic_list = new ArrayList();

    private void init_clinic() {

        Object[][] obj = new Object[clinic_list.size()][1];
        int i = 0;
        for (Clinics.to_clinics to : clinic_list) {
            obj[i][0] = to.clinic;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField1.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Clinics.to_clinics clinic = (Clinics.to_clinics) clinic_list.get(data.selected_row);
                Field.Search cl = (Field.Search) jTextField1;
                cl.setText(clinic.clinic);
                cl.setId("" + clinic.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" doctors "> 
    public static ArrayListModel tbl_doctors_ALM;
    public static TbldoctorsModel tbl_doctors_M;

    public static void init_tbl_doctors(JTable tbl_doctors) {
        tbl_doctors_ALM = new ArrayListModel();
        tbl_doctors_M = new TbldoctorsModel(tbl_doctors_ALM);
        tbl_doctors.setModel(tbl_doctors_M);
        tbl_doctors.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_doctors.setRowHeight(25);
        int[] tbl_widths_doctors = {90, 100, 150, 150, 50, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_doctors.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_doctors, i, tbl_widths_doctors[i]);
        }
        Dimension d = tbl_doctors.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_doctors.getTableHeader().setPreferredSize(d);
        tbl_doctors.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_doctors.setRowHeight(25);
        tbl_doctors.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_doctors.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
        tbl_doctors.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_doctors(List<to_doctors> acc) {
        tbl_doctors_ALM.clear();
        tbl_doctors_ALM.addAll(acc);
    }

    public static class TbldoctorsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Designation", "Name", "Clinic", "Department", "Status", "", "", "designation", "specialization", "address", "barangay", "city", "province", "country", "contact_no", "email_address", "department", "created_at", "updated_at", "status", "is_uploaded"
        };

        public TbldoctorsModel(ListModel listmodel) {
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
            to_doctors tt = (to_doctors) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.designation;
                case 1:
                    return " " + tt.fname + " " + tt.mi + " " + tt.lname;
                case 2:
                    return " " + tt.clinic;
                case 3:
                    return " " + tt.department;
                case 4:
                    if (tt.status == 0) {
                        return " Active";
                    } else {
                        return " Inactive";
                    }

                case 5:
                    return "/cms/icons/new-file.png";
                case 6:
                    return "/cms/icons/remove11.png";
                case 7:
                    return tt.designation;
                case 8:
                    return tt.specialization;
                case 9:
                    return tt.address;
                case 10:
                    return tt.barangay;
                case 11:
                    return tt.city;
                case 12:
                    return tt.province;
                case 13:
                    return tt.country;
                case 14:
                    return tt.contact_no;
                case 15:
                    return tt.email_address;
                case 16:
                    return tt.department;
                case 17:
                    return tt.created_at;
                case 18:
                    return tt.updated_at;
                case 19:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_doctors() {
        String where = "";
        List<to_doctors> datas = Doctors.ret_data(where);
        loadData_doctors(datas);
        jLabel2.setText("" + datas.size());
    }

    private void new_doctor() {
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");

        jTextField6.setText("");
        jTextField14.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");

        jTextField10.setText("");
        jTextField15.setText("");
        jTextField16.setText("");

        tbl_doctors.clearSelection();
        jTextField2.grabFocus();
    }

    private void save_doctor() {
        int row = tbl_doctors.getSelectedRow();
        Field.Search cl = (Field.Search) jTextField1;
        if (row < 0) {
            int id = 0;
            String fname = jTextField2.getText();
            String mi = jTextField3.getText();
            String lname = jTextField4.getText();
            String sname = jTextField5.getText();
            String degree = jTextField6.getText();
            String registration_no = jTextField7.getText();
            String designation = jTextField8.getText();
            String specialization = jTextField9.getText();
            String address = jTextField10.getText();
            String barangay = jTextField13.getText();
            String city = jTextField12.getText();
            String province = jTextField11.getText();
            String country = jTextField18.getText();
            String contact_no = jTextField15.getText();
            String email_address = jTextField16.getText();
            String department = jTextField14.getText();
            String clinic = cl.getText();
            String clinic_id = cl.getId();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String created_at = DateType.now();
            String updated_at = DateType.now();
            int status = 0;
            int is_uploaded = 0;
            Doctors.to_doctors doctor = new to_doctors(id, fname, mi, lname, sname, degree, registration_no, designation, specialization, address, barangay, city, province, country, contact_no, email_address, department, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.do_pass("Proceed adding this record?");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Doctors.add_data(doctor);
                    ret_doctors();
                    new_doctor();
                    Alert.set(1, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        } else {
            Doctors.to_doctors doctor = (Doctors.to_doctors) tbl_doctors_ALM.get(row);
            int id = doctor.id;
            String fname = jTextField2.getText();
            String mi = jTextField3.getText();
            String lname = jTextField4.getText();
            String sname = jTextField5.getText();
            String degree = jTextField6.getText();
            String registration_no = jTextField7.getText();
            String designation = jTextField8.getText();
            String specialization = jTextField9.getText();
            String address = jTextField10.getText();
            String barangay = jTextField13.getText();
            String city = jTextField12.getText();
            String province = jTextField11.getText();
            String country = jTextField18.getText();
            String contact_no = jTextField15.getText();
            String email_address = jTextField16.getText();
            String department = jTextField14.getText();
            String clinic = cl.getText();
            String clinic_id = cl.getId();
            String created_by = doctor.created_by;
            String updated_by = MyUser.getUser_id();
            String created_at = doctor.created_at;
            String updated_at = DateType.now();
            int status = doctor.status;
            int is_uploaded = 0;
            Doctors.to_doctors doctor2 = new to_doctors(id, fname, mi, lname, sname, degree, registration_no, designation, specialization, address, barangay, city, province, country, contact_no, email_address, department, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.do_pass("Are you sure you want to update this record?");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Doctors.update_data(doctor2);
                    ret_doctors();
                    new_doctor();
                    Alert.set(2, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }

    }

    private void select_doctor() {
        int row = tbl_doctors.getSelectedRow();
        if (row < 0) {
            return;
        }
        Doctors.to_doctors doctor = (Doctors.to_doctors) tbl_doctors_ALM.get(row);
        int col = tbl_doctors.getSelectedColumn();
        if (col == 5) {
            Field.Search cl = (Field.Search) jTextField1;
            cl.setText(doctor.clinic);
            cl.setId(doctor.clinic_id);

            jTextField2.setText(doctor.fname);
            jTextField3.setText(doctor.mi);
            jTextField4.setText(doctor.lname);
            jTextField5.setText(doctor.sname);

            jTextField6.setText(doctor.degree);
            jTextField14.setText(doctor.department);
            jTextField7.setText(doctor.registration_no);
            jTextField8.setText(doctor.designation);
            jTextField9.setText(doctor.specialization);

            jTextField10.setText(doctor.address);
            jTextField18.setText(doctor.country);
            jTextField11.setText(doctor.province);
            jTextField12.setText(doctor.city);
            jTextField13.setText(doctor.barangay);

            jTextField15.setText(doctor.contact_no);
            jTextField16.setText(doctor.email_address);

        }
        if (col == 6) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Doctors.delete_data(doctor);
                    ret_doctors();
                    new_doctor();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
//</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" init degree ">
    List<Degrees.to_degrees> degrees = new ArrayList();

    private void init_compartments(final JTextField tf) {
        Object[][] obj = new Object[degrees.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Degrees.to_degrees to : degrees) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.degree)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.degree;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf.getWidth()};
        String[] col_names = {"", "Name"};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                Degrees.to_degrees to = degrees.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.degree);
                field.setId("" + to.id);

                String values = "";
                List<CheckBox.list> datas = data.output;
                int i = 0;
                for (CheckBox.list l : datas) {
                    if (l.selected == true) {

                        if (i == 0) {
                            values = l.stmt;
                        } else {
                            values = values + "," + l.stmt;
                        }
                        i++;
                    }

                }
                tf.setText(values);
            }
        });
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" init degree ">
    List<Departments.to_departments> departments = new ArrayList();

    private void init_departments(final JTextField tf) {
        Object[][] obj = new Object[departments.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Departments.to_departments to : departments) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.department)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.department;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf.getWidth()};
        String[] col_names = {"", "Name"};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                Departments.to_departments to = departments.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.department);
                field.setId("" + to.id);

                String values = "";
                List<CheckBox.list> datas = data.output;
                int i = 0;
                for (CheckBox.list l : datas) {
                    if (l.selected == true) {

                        if (i == 0) {
                            values = l.stmt;
                        } else {
                            values = values + "," + l.stmt;
                        }
                        i++;
                    }

                }
                tf.setText(values);
            }
        });
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" init designation ">
    List<Designations.to_designations> designations = new ArrayList();

    private void init_designation(final JTextField tf) {

        Object[][] obj = new Object[designations.size()][1];
        int i = 0;
        for (Designations.to_designations to : designations) {
            obj[i][0] = " " + to.designation;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Designations.to_designations to = designations.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.designation);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" doctor_daily_schedules "> 
    public static ArrayListModel tbl_doctor_daily_schedules_ALM;
    public static Tbldoctor_daily_schedulesModel tbl_doctor_daily_schedules_M;

    public static void init_tbl_doctor_daily_schedules(JTable tbl_doctor_daily_schedules) {
        tbl_doctor_daily_schedules_ALM = new ArrayListModel();
        tbl_doctor_daily_schedules_M = new Tbldoctor_daily_schedulesModel(tbl_doctor_daily_schedules_ALM);
        tbl_doctor_daily_schedules.setModel(tbl_doctor_daily_schedules_M);
        tbl_doctor_daily_schedules.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_doctor_daily_schedules.setRowHeight(25);
        int[] tbl_widths_doctor_daily_schedules = {100, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_doctor_daily_schedules.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_doctor_daily_schedules, i, tbl_widths_doctor_daily_schedules[i]);
        }
        Dimension d = tbl_doctor_daily_schedules.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_doctor_daily_schedules.getTableHeader().setPreferredSize(d);
        tbl_doctor_daily_schedules.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_doctor_daily_schedules.setRowHeight(25);
        tbl_doctor_daily_schedules.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_doctor_daily_schedules(List<to_doctor_daily_schedules> acc) {
        tbl_doctor_daily_schedules_ALM.clear();
        tbl_doctor_daily_schedules_ALM.addAll(acc);
    }

    public static class Tbldoctor_daily_schedulesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Time", "", "clinic", "clinic_id", "doctor", "doctor_id", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tbldoctor_daily_schedulesModel(ListModel listmodel) {
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
            if (col == 1) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_doctor_daily_schedules tt = (to_doctor_daily_schedules) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.time;
                case 1:
                    if (tt.id == 0) {
                        return false;
                    } else {
                        return true;
                    }

                case 2:
                    return tt.clinic;
                case 3:
                    return tt.clinic_id;
                case 4:
                    return tt.doctor;
                case 5:
                    return tt.doctor_id;
                case 6:
                    return tt.created_by;
                case 7:
                    return tt.updated_by;
                case 8:
                    return tt.created_at;
                case 9:
                    return tt.updated_at;
                case 10:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_daily_schedules() {
        int row = tbl_doctors.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_doctors to = (to_doctors) tbl_doctors_ALM.get(row);
        String day = jList1.getSelectedValue();
        String where = " where doctor_id='" + to.id + "' and day='" + day + "' ";
        List<to_doctor_daily_schedules> datas = Doctor_daily_schedules.ret_data2(where);
        loadData_doctor_daily_schedules(datas);
    }

    private void select_time_schedule() {
        int row = tbl_doctor_daily_schedules.getSelectedRow();
        if (row < 0) {
            return;
        }

        to_doctor_daily_schedules to = (to_doctor_daily_schedules) tbl_doctor_daily_schedules_ALM.get(row);
        int col = tbl_doctor_daily_schedules.getSelectedColumn();
        String day = jList1.getSelectedValue();
        if (col == 1) {
            if (to.id == 0) {
                int row2 = tbl_doctors.getSelectedRow();
                Doctors.to_doctors doc = (Doctors.to_doctors) tbl_doctors_ALM.get(row2);
                int id = to.id;
                String time = to.time;
                String clinic = doc.clinic;
                String clinic_id = doc.clinic_id;
                String doctor = doc.designation + " " + doc.fname + " " + doc.mi + " " + doc.lname;
                String doctor_id = "" + doc.id;
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                String created_at = DateType.now();
                String updated_at = DateType.now();
                int status = 0;
                int is_uploaded = 0;
                boolean is_selected = false;
                to_doctor_daily_schedules to2 = new to_doctor_daily_schedules(id, day, time, clinic, clinic_id, doctor, doctor_id, created_by, updated_by, created_at, updated_at, status, is_uploaded, is_selected);
                Doctor_daily_schedules.add_data(to2);
                ret_daily_schedules();
            } else {

                Doctor_daily_schedules.delete_data(to);
                ret_daily_schedules();
            }
        }

    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" doctor_none_working_days "> 
    public static ArrayListModel tbl_doctor_none_working_days_ALM;
    public static Tbldoctor_none_working_daysModel tbl_doctor_none_working_days_M;

    public static void init_tbl_doctor_none_working_days(JTable tbl_doctor_none_working_days) {
        tbl_doctor_none_working_days_ALM = new ArrayListModel();
        tbl_doctor_none_working_days_M = new Tbldoctor_none_working_daysModel(tbl_doctor_none_working_days_ALM);
        tbl_doctor_none_working_days.setModel(tbl_doctor_none_working_days_M);
        tbl_doctor_none_working_days.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_doctor_none_working_days.setRowHeight(25);
        int[] tbl_widths_doctor_none_working_days = {80, 30, 30, 100, 100, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_doctor_none_working_days.length; i < n; i++) {
            if (i == 4) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_doctor_none_working_days, i, tbl_widths_doctor_none_working_days[i]);
        }
        Dimension d = tbl_doctor_none_working_days.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_doctor_none_working_days.getTableHeader().setPreferredSize(d);
        tbl_doctor_none_working_days.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_doctor_none_working_days.setRowHeight(25);
        tbl_doctor_none_working_days.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_doctor_none_working_days.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
        tbl_doctor_none_working_days.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_doctor_none_working_days(List<to_doctor_none_working_days> acc) {
        tbl_doctor_none_working_days_ALM.clear();
        tbl_doctor_none_working_days_ALM.addAll(acc);
    }

    public static class Tbldoctor_none_working_daysModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Date", "AM", "PM", "Interval", "Remarks", "", "", "", "doctor", "doctor_id", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tbldoctor_none_working_daysModel(ListModel listmodel) {
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
            if (col == 1 || col == 2) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_doctor_none_working_days tt = (to_doctor_none_working_days) getRow(row);
            switch (col) {
                case 0:
                    return " " + DateType.convert_slash_datetime2(tt.date);
                case 1:
                    if (tt.am == 0) {
                        return false;
                    } else {
                        return true;
                    }

                case 2:
                    if (tt.pm == 0) {
                        return false;
                    } else {
                        return true;
                    }
                case 3:
                    return " " + tt.time_interval;
                case 4:
                    return " " + tt.remarks;
                case 5:
                    return "/cms/icons/new-file.png";
                case 6:
                    return "/cms/icons/remove11.png";
                case 7:
                    return tt.clinic_id;
                case 8:
                    return tt.doctor;
                case 9:
                    return tt.doctor_id;
                case 10:
                    return tt.created_by;
                case 11:
                    return tt.updated_by;
                case 12:
                    return tt.created_at;
                case 13:
                    return tt.updated_at;
                case 14:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_doctor_none_working_days() {
        String where = " where remarks like '%" + "" + "%' ";
        int row = tbl_doctors.getSelectedRow();
        if (row < 0) {
            return;
        }
        Doctors.to_doctors doc = (Doctors.to_doctors) tbl_doctors_ALM.get(row);
        int year = jYearChooser1.getYear();
        int m = jMonthChooser1.getMonth() + 1;
        String month = "" + m;
        if (month.length() == 1) {
            month = "0" + month;
        }

        if (!jCheckBox2.isSelected() && !jCheckBox1.isSelected()) {
            where = where + " and MONTH(date)='" + month + "' ";
        }

        if (!jCheckBox1.isSelected()) {
            where = where + " and YEAR(date)='" + year + "' ";
        }
        where = where + " and doctor_id='" + doc.id + "' order by id asc ";
        List<Doctor_none_working_days.to_doctor_none_working_days> datas = Doctor_none_working_days.ret_data(where);
        loadData_doctor_none_working_days(datas);
    }

    private void new_doctor_none_working_days() {
        Window p = (Window) this;
        Dlg_doctor_none_working_new nd = Dlg_doctor_none_working_new.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_doctor_none_working_new.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_doctor_none_working_new.OutputData data) {
                closeDialog.ok();
                int row2 = tbl_doctors.getSelectedRow();
                Doctors.to_doctors doc = (Doctors.to_doctors) tbl_doctors_ALM.get(row2);
                int id = 0;
                String date = data.date;
                int am = data.am;
                int pm = data.pm;
                String time_interval = data.interval;
                String remarks = data.remarks;
                String clinic = doc.clinic;
                String clinic_id = doc.clinic_id;
                String doctor = doc.designation + " " + doc.fname + " " + doc.mi + " " + doc.lname;
                String doctor_id = "" + doc.id;
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                String created_at = DateType.now();
                String updated_at = DateType.now();
                int status = 0;
                int is_uploaded = 0;
                Doctor_none_working_days.to_doctor_none_working_days days = new Doctor_none_working_days.to_doctor_none_working_days(id, date, am, pm, time_interval, remarks, clinic, clinic_id, doctor, doctor_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                Doctor_none_working_days.add_data(days);
                ret_doctor_none_working_days();
                Alert.set(1, "");
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_doctor_none_working_days() {
        int row = tbl_doctor_none_working_days.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Doctor_none_working_days.to_doctor_none_working_days work = (Doctor_none_working_days.to_doctor_none_working_days) tbl_doctor_none_working_days_ALM.get(row);
        int col = tbl_doctor_none_working_days.getSelectedColumn();
        if (col == 5) {
            Window p = (Window) this;
            Dlg_doctor_none_working_new nd = Dlg_doctor_none_working_new.create(p, true);
            nd.setTitle("");
            nd.do_pass(work);
            nd.setCallback(new Dlg_doctor_none_working_new.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_doctor_none_working_new.OutputData data) {
                    closeDialog.ok();
                    int id = work.id;
                    String date = data.date;
                    int am = data.am;
                    int pm = data.pm;
                    String time_interval = data.interval;
                    String remarks = data.remarks;
                    String clinic = work.clinic;
                    String clinic_id = work.clinic_id;
                    String doctor = work.doctor;
                    String doctor_id = work.doctor_id;
                    String created_by = work.created_by;
                    String updated_by = MyUser.getUser_id();
                    String created_at = work.created_at;
                    String updated_at = DateType.now();
                    int status = work.status;
                    int is_uploaded = work.is_uploaded;
                    Doctor_none_working_days.to_doctor_none_working_days days = new Doctor_none_working_days.to_doctor_none_working_days(id, date, am, pm, time_interval, remarks, clinic, clinic_id, doctor, doctor_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                    Doctor_none_working_days.update_data(days);
                    ret_doctor_none_working_days();
                    Alert.set(2, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 6) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");

            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    Doctor_none_working_days.delete_data(work);
                    ret_doctor_none_working_days();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
//</editor-fold> 

}
