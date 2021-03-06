/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.opd;

import cms.appointments.Dlg_appointments;
import cms.clinics.Clinics;
import cms.doctors.Dlg_doctors;
import cms.doctors.Doctor_daily_schedules;
import cms.doctors.Doctors;
import cms.inventory.Dlg_inventory;
import cms.inventory.Inventory;
import cms.inventory.Inventory_prescriptions;
import cms.opd.Out_patient_department_prescriptions.to_out_patient_department_prescriptions;
import cms.opd.Out_patient_department_receipt_items.to_out_patient_department_receipt_items;
import cms.opd.Out_patient_departments.to_out_patient_departments;
import cms.options.Dlg_option_complaints;
import cms.options.Dlg_option_diagnosis;
import cms.options.Dlg_option_findings;
import cms.options.Dlg_option_history;
import cms.options.Dlg_option_investigation;
import cms.options.Dlg_option_remarks;
import cms.patients.Dlg_patients;
import cms.patients.Patients;
import cms.receipts.Dlg_receipt_particulars;
import cms.receipts.Receipt_particulars;
import cms.reports.Dlg_report_case_report;
import cms.reports.Dlg_report_fitness_certificate;
import cms.reports.Dlg_report_investigation_report;
import cms.reports.Dlg_report_prescription;
import cms.reports.Dlg_report_receipt;
import cms.reports.Dlg_report_referral_letter;
import cms.reports.Dlg_report_sickness_certificate;
import cms.users.MyUser;
import cms.util.Alert;
import cms.util.DateType;
import cms.util.Dlg_confirm_action;
import cms.util.Dlg_confirm_delete;
import cms.util.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
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
public class Dlg_opd extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_opd
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
    private Dlg_opd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_opd(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_opd() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_opd myRef;

    private void setThisRef(Dlg_opd myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_opd> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_opd create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_opd create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_opd dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_opd((java.awt.Frame) parent, false);
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
            Dlg_opd dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_opd((java.awt.Dialog) parent, false);
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

        Dlg_opd dialog = Dlg_opd.create(new javax.swing.JFrame(), true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new Field.Input();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new Field.Input();
        jLabel22 = new javax.swing.JLabel();
        tf_search_patient = new Field.Search();
        jButton1 = new Button.Default();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new Field.Combo();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new Field.Combo();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new Field.Combo();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField14 = new Field.Combo();
        jTextField17 = new Field.Combo();
        jLabel23 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel146 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel148 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField20 = new Field.Input();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField22 = new Field.Input();
        jLabel27 = new javax.swing.JLabel();
        jTextField23 = new Field.Input();
        jLabel28 = new javax.swing.JLabel();
        jTextField24 = new Field.Combo();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton4 = new Button.Default();
        jButton5 = new Button.Default();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField25 = new Field.Input();
        jLabel30 = new javax.swing.JLabel();
        jTextField26 = new Field.Input();
        jTextField27 = new Field.Input();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField28 = new Field.Input();
        jLabel33 = new javax.swing.JLabel();
        jTextField29 = new Field.Input();
        jLabel34 = new javax.swing.JLabel();
        jTextField30 = new Field.Input();
        jLabel35 = new javax.swing.JLabel();
        jTextField31 = new Field.Input();
        jLabel36 = new javax.swing.JLabel();
        jTextField32 = new Field.Input();
        jLabel37 = new javax.swing.JLabel();
        jTextField33 = new Field.Input();
        jLabel38 = new javax.swing.JLabel();
        jTextField34 = new Field.Input();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_out_patient_department_prescriptions = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        jTextField37 = new Field.Search();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new Button.Default();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jTextField38 = new Field.Input();
        jLabel50 = new javax.swing.JLabel();
        jTextField39 = new Field.Input();
        jLabel51 = new javax.swing.JLabel();
        jTextField40 = new Field.Input();
        jLabel52 = new javax.swing.JLabel();
        jTextField41 = new Field.Input();
        jLabel53 = new javax.swing.JLabel();
        jTextField42 = new Field.Input();
        jLabel55 = new javax.swing.JLabel();
        jTextField44 = new Field.Input();
        jLabel56 = new javax.swing.JLabel();
        jTextField45 = new Field.Input();
        jButton9 = new Button.Success();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_out_patient_department_receipt_items = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        jTextField43 = new Field.Input();
        jButton7 = new Button.Default();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jTextField35 = new Field.Input();
        jLabel40 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        jTextField36 = new Field.Input();
        jButton2 = new Button.Default();
        jButton3 = new Button.Success();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_out_patient_departments = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel59 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel60 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jTextField47 = new Field.Combo();
        jTextField46 = new Field.Combo();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel58 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel61 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jButton8 = new Button.Default();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jTextField48 = new Field.Combo();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/documents.png"))); // NOI18N
        jMenuItem1.setText("Case Report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/search.png"))); // NOI18N
        jMenuItem3.setText("Investigation Report");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/tasks.png"))); // NOI18N
        jMenuItem4.setText("Prescription Report");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/invoice.png"))); // NOI18N
        jMenuItem8.setText("Receipt");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem8);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/contract.png"))); // NOI18N
        jMenu1.setText("Certificates");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/contract (2).png"))); // NOI18N
        jMenuItem5.setText("Fitness Certificate");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/contract (2).png"))); // NOI18N
        jMenuItem6.setText("Sickness Certificate");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/contract (2).png"))); // NOI18N
        jMenuItem7.setText("Referring Letter");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jPopupMenu1.add(jMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(239, 238, 238));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Clinic:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setFocusable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Name:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setFocusable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Search Patient:");

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Birth Date:");

        jDateChooser5.setDate(new Date());
        jDateChooser5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Gender:");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Blood Type:");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Address:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Allergies:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("[Medicine]");

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

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("[Others]");

        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel144.setText("Smoking:");

        buttonGroup5.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Yes");

        buttonGroup5.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("No");

        buttonGroup5.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("Quit");

        jLabel146.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel146.setText("Alcohol:");

        buttonGroup6.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Yes");

        buttonGroup6.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setSelected(true);
        jCheckBox5.setText("No");

        buttonGroup6.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("Quit");

        buttonGroup7.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("Yes");

        jLabel148.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel148.setText("Elicit drugs:");

        buttonGroup7.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setSelected(true);
        jCheckBox8.setText("No");

        buttonGroup7.add(jCheckBox9);
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setText("Quit");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox6)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField14)
                            .addComponent(jTextField17)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(tf_search_patient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField6)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_search_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox3))
                    .addComponent(jLabel146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Visit No.:");

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField20.setText("1");
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Visit Date:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Visit Time:");

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField22MouseClicked(evt);
            }
        });
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Type:");

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField23.setText("New");
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField23MouseClicked(evt);
            }
        });
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Doctor:");

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField24MouseClicked(evt);
            }
        });
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/calendar-and-clock.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/add.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Height (cm):");

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Weight (kg):");

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField27.setFocusable(false);
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("BMI:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Pressure (mmHG):");

        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Pulse (BPM):");

        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Temp (F):");

        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Resp (BPM):");

        jTextField31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Waist (Cms):");

        jTextField32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Hip (Cms):");

        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("sPo2:");

        jTextField34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField27)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField28)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField29)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField30)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField31)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField32)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField33)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField34)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
        );

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Complaints:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Findings:");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Past Family/Personal History:");

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Provisional Diagnosis:");

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Investigation:");

        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Remarks:");

        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        jTabbedPane2.addTab("Visit", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tbl_out_patient_department_prescriptions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_out_patient_department_prescriptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_out_patient_department_prescriptionsMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbl_out_patient_department_prescriptions);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Medicine:");

        jTextField37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField37MouseClicked(evt);
            }
        });
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });

        jLabel1.setText("Total no. of rows:");

        jLabel2.setText("0");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/cms.icons.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Prescription", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receipt Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setText("Amount Due:");

        jTextField38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField38.setText("0.00");
        jTextField38.setFocusable(false);
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setText("Discount:");

        jTextField39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });
        jTextField39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField39KeyReleased(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setText("Net Due:");

        jTextField40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField40.setText("0.00");
        jTextField40.setFocusable(false);
        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setText("Cash:");

        jTextField41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });
        jTextField41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField41KeyReleased(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("Change:");

        jTextField42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField42.setText("0.00");
        jTextField42.setFocusable(false);
        jTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField42ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Transaction No.:");

        jTextField44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField44.setFocusable(false);
        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });
        jTextField44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField44KeyReleased(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Reference No.:");

        jTextField45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });
        jTextField45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField45KeyReleased(evt);
            }
        });

        jButton9.setText("Update");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(252, 252, 252))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel49)
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField39)
                                        .addComponent(jTextField38)
                                        .addComponent(jTextField45)))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(6, 6, 6)))
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField40, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                        .addComponent(jTextField41))))
                            .addGap(19, 19, 19)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        tbl_out_patient_department_receipt_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_out_patient_department_receipt_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_out_patient_department_receipt_itemsMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_out_patient_department_receipt_items);

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Add Charge:");

        jTextField43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField43MouseClicked(evt);
            }
        });
        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cms/icons/cms.icons.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setText("Total no. of rows:");

        jLabel7.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Charges", jPanel12);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3)
                        .addGap(2, 2, 2))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Receipt", jPanel9);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Followup Days:");

        jTextField35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Followup Date:");

        jDateChooser2.setFocusable(false);
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Referred to:");

        jTextField36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField35)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTabbedPane2)
                .addGap(1, 1, 1)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("OPD", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_out_patient_departments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_out_patient_departments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_out_patient_departmentsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_out_patient_departmentsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_out_patient_departmentsMouseReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_out_patient_departments);

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Date from:");

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setText("All");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Doctor:");

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setText("All");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("Patient:");

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox12.setText("All");

        jTextField47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField47MouseClicked(evt);
            }
        });
        jTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField47ActionPerformed(evt);
            }
        });

        jTextField46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField46MouseClicked(evt);
            }
        });
        jTextField46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField46ActionPerformed(evt);
            }
        });

        jDateChooser3.setDate(new Date());
        jDateChooser3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("to:");

        jDateChooser4.setDate(new Date());
        jDateChooser4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("Receipt:");

        buttonGroup4.add(jCheckBox13);
        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox13.setSelected(true);
        jCheckBox13.setText("All");

        buttonGroup4.add(jCheckBox14);
        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox14.setText("Paid");

        buttonGroup4.add(jCheckBox15);
        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox15.setText("Unpaid");

        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total no. of rows:");

        jLabel11.setText("0");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("Clinic:");

        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox16.setSelected(true);
        jCheckBox16.setText("All");

        jTextField48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField48MouseClicked(evt);
            }
        });
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(jLabel57)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox10))
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox11))
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox12)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField46)
                            .addComponent(jTextField47)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox15))
                            .addComponent(jTextField48, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox10))
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox13)
                        .addComponent(jCheckBox14)
                        .addComponent(jCheckBox15)))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox16))
                .addGap(1, 1, 1)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox11))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox12)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reports", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jTabbedPane1)
                .addGap(100, 100, 100))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dlg_patient();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        init_time_schedules();
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        init_opd_type();
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        init_doctors();
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new_opd();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        save_opd();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        init_inventory(jTextField37);
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void jTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        init_receipt_particular();
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void tf_search_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_search_patientActionPerformed
        init_patients();
    }//GEN-LAST:event_tf_search_patientActionPerformed

    private void tf_search_patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_search_patientMouseClicked
        init_patients();
    }//GEN-LAST:event_tf_search_patientMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseClicked
        init_doctors();
    }//GEN-LAST:event_jTextField24MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dlg_appointments();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dlg_doctors();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseClicked
        init_time_schedules();
    }//GEN-LAST:event_jTextField22MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dlg_inventory();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField37MouseClicked
        init_inventory(jTextField37);
    }//GEN-LAST:event_jTextField37MouseClicked

    private void tbl_out_patient_department_prescriptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_out_patient_department_prescriptionsMouseClicked
        select_opd_prescription();
    }//GEN-LAST:event_tbl_out_patient_department_prescriptionsMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dlg_receipt_charges();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField43MouseClicked
        init_receipt_particular();
    }//GEN-LAST:event_jTextField43MouseClicked

    private void tbl_out_patient_department_receipt_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_out_patient_department_receipt_itemsMouseClicked
        select_opd_receipt_item();
    }//GEN-LAST:event_tbl_out_patient_department_receipt_itemsMouseClicked

    private void jTextField39KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField39KeyReleased
        compute_change();
    }//GEN-LAST:event_jTextField39KeyReleased

    private void jTextField41KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField41KeyReleased
        compute_change();
    }//GEN-LAST:event_jTextField41KeyReleased

    private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44ActionPerformed

    private void jTextField44KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField44KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44KeyReleased

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void jTextField45KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField45KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45KeyReleased

    private void jTextField23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseClicked
        init_opd_type();
    }//GEN-LAST:event_jTextField23MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

    }//GEN-LAST:event_jPanel5MouseClicked

    private void jTextField46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField46MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46MouseClicked

    private void jTextField46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46ActionPerformed

    private void jTextField47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField47MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47MouseClicked

    private void jTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ret_opd();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tbl_out_patient_departmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_out_patient_departmentsMouseClicked
        select_opd(evt);
    }//GEN-LAST:event_tbl_out_patient_departmentsMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tbl_out_patient_departmentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_out_patient_departmentsMousePressed
        select_opd(evt);
    }//GEN-LAST:event_tbl_out_patient_departmentsMousePressed

    private void tbl_out_patient_departmentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_out_patient_departmentsMouseReleased
        select_opd(evt);
    }//GEN-LAST:event_tbl_out_patient_departmentsMouseReleased

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked

    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed

    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17MouseClicked

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dlg_case_report();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dlg_investigation_report();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dlg_prescription_report();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        dlg_fitness_certificate();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        dlg_sickness_certificate();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        dlg_referral_certificate();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        dlg_receipt();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jTextField48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField48MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48MouseClicked

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        init_clinic();
    }//GEN-LAST:event_jTextField48ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tbl_out_patient_department_prescriptions;
    private javax.swing.JTable tbl_out_patient_department_receipt_items;
    private javax.swing.JTable tbl_out_patient_departments;
    private javax.swing.JTextField tf_search_patient;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_date_schedule();
        init_clinics();
        init_tbl_out_patient_department_prescriptions(tbl_out_patient_department_prescriptions);
        init_tbl_out_patient_department_receipt_items(tbl_out_patient_department_receipt_items);
        init_tbl_out_patient_departments(tbl_out_patient_departments);
        ret_opd();
        init_receipt_item_inventory_charge();

        jButton9.setVisible(false);
    }

    private void init_clinics() {
        String where = " order by clinic asc";
        clinic_list = Clinics.ret_data(where);

        if (!clinic_list.isEmpty()) {
            Clinics.to_clinics clinic = (Clinics.to_clinics) clinic_list.get(0);
            Field.Combo cl = (Field.Combo) jTextField48;
            cl.setText(clinic.clinic);
            cl.setId("" + clinic.id);
        }
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
        jTextArea1.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_option_complaints();
                }
            }

        });
        jTextArea3.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_option_history();
                }
            }

        });
        jTextArea5.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_option_investigation();
                }
            }

        });
        jTextArea2.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_option_findings();
                }
            }

        });
        jTextArea4.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_option_diagnosis();
                }
            }

        });
        jTextArea6.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_option_remarks();
                }
            }

        });

    }
    // </editor-fold>

    private void save_opd() {
        int row = tbl_out_patient_departments.getSelectedRow();
        if (row < 0) {
            Field.Input cl = (Field.Input) jTextField2;
            Field.Combo doc = (Field.Combo) jTextField24;
            Field.Input pat = (Field.Input) jTextField4;
            int id = 0;
            String opd_no = "";
            String clinic = "";
            String clinic_id = "";

            String patient = pat.getText();
            String patient_id = pat.getId();
            if (patient_id == null || patient_id.isEmpty()) {
                Alert.set(0, "Select patient from the list");
                tf_search_patient.grabFocus();
                return;
            }
            String doctor = doc.getText();
            String doctor_id = doc.getId();
            if (doctor_id == null || doctor_id.isEmpty()) {
                Alert.set(0, "Select doctor from the list");
                jTextField24.grabFocus();
                return;
            }
            List<Doctors.to_doctors> docs = Doctors.ret_data("where id='" + doctor_id + "' ");
            if (!docs.isEmpty()) {
                Doctors.to_doctors doc1 = (Doctors.to_doctors) docs.get(0);
                clinic = doc1.clinic;
                clinic_id = doc1.clinic_id;
            }
            String bday = DateType.sf.format(jDateChooser1.getDate());
            int gender = 0;
            if (jTextField7.getText().equalsIgnoreCase("male")) {
                gender = 1;
            }
            String blood_type = jTextField8.getText();

            String address = jTextField6.getText();

            String allergy_medicine = jTextField14.getText();
            String allergy_others = jTextField17.getText();
            int is_smoking = 0;
            if (jCheckBox1.isSelected()) {
                is_smoking = 1;
            }
            if (jCheckBox3.isSelected()) {
                is_smoking = 2;
            }
            int is_alcohol = 0;
            if (jCheckBox4.isSelected()) {
                is_alcohol = 1;
            }
            if (jCheckBox6.isSelected()) {
                is_alcohol = 2;
            }
            int is_drug_abuse = 0;
            if (jCheckBox7.isSelected()) {
                is_drug_abuse = 1;
            }
            if (jCheckBox9.isSelected()) {
                is_drug_abuse = 2;
            }
            String opd_date = DateType.sf.format(jDateChooser1.getDate());
            String opd_time = jTextField22.getText();
            if (opd_time == null || opd_time.isEmpty()) {
                Alert.set(0, "Select time schedule from the list");
                jTextField22.grabFocus();
                return;
            }
            String opd_type = jTextField23.getText();
            double patient_height = FitIn.toDouble(jTextField25.getText());
            double patient_weight = FitIn.toDouble(jTextField26.getText());
            double patient_bmi = FitIn.toDouble(jTextField27.getText());
            String patient_pressure = jTextField28.getText();
            double patient_pulse = FitIn.toDouble(jTextField29.getText());
            double patient_temperature = FitIn.toDouble(jTextField30.getText());
            double patient_respiratory = FitIn.toDouble(jTextField31.getText());
            double patient_waist = FitIn.toDouble(jTextField32.getText());
            double patient_hip = FitIn.toDouble(jTextField33.getText());
            double patient_spo2 = FitIn.toDouble(jTextField34.getText());
            String complaints = jTextArea1.getText();
            String past_personal_family_history = jTextArea3.getText();
            String investigation = jTextArea5.getText();
            String findings = jTextArea2.getText();
            String provisional_diagnosis = jTextArea4.getText();
            String remarks = jTextArea6.getText();
            int followup_days = FitIn.toInt(jTextField35.getText());
            String followup_date = null;
            try {
                followup_date = DateType.sf.format(jDateChooser2.getDate());
            } catch (Exception e) {
                followup_date = null;
            }
            String referred_to = jTextField36.getText();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String created_at = DateType.now();
            String updated_at = DateType.now();
            int status = 0;
            int is_uploaded = 0;
            Out_patient_departments.to_out_patient_departments opd = new Out_patient_departments.to_out_patient_departments(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, bday, gender, blood_type, address, allergy_medicine, allergy_others, is_smoking, is_alcohol, is_drug_abuse, opd_date, opd_time, opd_type, patient_height, patient_weight, patient_bmi, patient_pressure, patient_pulse, patient_temperature, patient_respiratory, patient_waist, patient_hip, patient_spo2, complaints, past_personal_family_history, investigation, findings, provisional_diagnosis, remarks, followup_days, followup_date, referred_to, created_by, updated_by, created_at, updated_at, status, is_uploaded);
            List<Out_patient_department_prescriptions.to_out_patient_department_prescriptions> prescriptions = tbl_out_patient_department_prescriptions_ALM;
            List<Out_patient_department_receipt_items.to_out_patient_department_receipt_items> charges = tbl_out_patient_department_receipt_items_ALM;
            //<editor-fold defaultstate="collapsed" desc=" receipt ">
            String receipt_no = Out_patient_department_receipts.increment_id(clinic_id);
            String receipt_date = DateType.sf.format(new Date());
            String reference_no = jTextField45.getText();
            double amount_due = FitIn.toDouble(jTextField38.getText());
            double discount = FitIn.toDouble(jTextField39.getText());
            double cash = amount_due - discount;
            String check_bank = "";
            String check_no = "";
            String check_holder = "";
            double check_amount = 0;
            String check_date = null;
            String credit_card_type = "";
            String credit_card_holder = "";
            String credit_card_app_code = "";
            double credit_card_rate = 0;
            double credit_card_amount = 0;
            //</editor-fold>
            Out_patient_department_receipts.to_out_patient_department_receipts receipt = new Out_patient_department_receipts.to_out_patient_department_receipts(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, opd_date, opd_time, opd_type, receipt_no, receipt_date, reference_no, amount_due, discount, cash, check_bank, check_no, check_holder, check_amount, check_date, credit_card_type, credit_card_holder, credit_card_app_code, credit_card_rate, credit_card_amount, created_by, updated_by, created_at, updated_at, status, is_uploaded);

            Window p = (Window) this;
            Dlg_opd_save_and_pay nd = Dlg_opd_save_and_pay.create(p, true);
            nd.setTitle("");
            double change = FitIn.toDouble(jTextField42.getText());
            nd.do_pass(change);
            nd.setCallback(new Dlg_opd_save_and_pay.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_opd_save_and_pay.OutputData data) {
                    closeDialog.ok();
                    Out_patient_departments.add_data(opd, prescriptions, charges, receipt, data.is_payed);
                    new_opd();
                    Alert.set(1, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else {
            Out_patient_departments.to_out_patient_departments to = (Out_patient_departments.to_out_patient_departments) tbl_out_patient_departments_ALM.get(row);
            Field.Input cl = (Field.Input) jTextField2;
            Field.Combo doc = (Field.Combo) jTextField24;
            Field.Input pat = (Field.Input) jTextField4;
            int id = to.id;
            String opd_no = "";
            String clinic = MyUser.getClinic();
            String clinic_id = MyUser.getClinic_id();

            String patient = pat.getText();
            String patient_id = pat.getId();
            if (patient_id == null || patient_id.isEmpty()) {
                Alert.set(0, "Select patient from the list");
                tf_search_patient.grabFocus();
                return;
            }
            String doctor = doc.getText();
            String doctor_id = doc.getId();
            if (doctor_id == null || doctor_id.isEmpty()) {
                Alert.set(0, "Select doctor from the list");
                jTextField24.grabFocus();
                return;
            }
            String bday = DateType.sf.format(jDateChooser1.getDate());
            int gender = 0;
            if (jTextField7.getText().equalsIgnoreCase("male")) {
                gender = 1;
            }
            String blood_type = jTextField8.getText();

            String address = jTextField6.getText();

            String allergy_medicine = jTextField14.getText();
            String allergy_others = jTextField17.getText();
            int is_smoking = 0;
            if (jCheckBox1.isSelected()) {
                is_smoking = 1;
            }
            if (jCheckBox3.isSelected()) {
                is_smoking = 2;
            }
            int is_alcohol = 0;
            if (jCheckBox4.isSelected()) {
                is_alcohol = 1;
            }
            if (jCheckBox6.isSelected()) {
                is_alcohol = 2;
            }
            int is_drug_abuse = 0;
            if (jCheckBox7.isSelected()) {
                is_drug_abuse = 1;
            }
            if (jCheckBox9.isSelected()) {
                is_drug_abuse = 2;
            }
            String opd_date = DateType.sf.format(jDateChooser1.getDate());
            String opd_time = jTextField22.getText();
            if (opd_time == null || opd_time.isEmpty()) {
                Alert.set(0, "Select time schedule from the list");
                jTextField22.grabFocus();
                return;
            }
            String opd_type = jTextField23.getText();
            double patient_height = FitIn.toDouble(jTextField25.getText());
            double patient_weight = FitIn.toDouble(jTextField26.getText());
            double patient_bmi = FitIn.toDouble(jTextField27.getText());
            String patient_pressure = jTextField28.getText();
            double patient_pulse = FitIn.toDouble(jTextField29.getText());
            double patient_temperature = FitIn.toDouble(jTextField30.getText());
            double patient_respiratory = FitIn.toDouble(jTextField31.getText());
            double patient_waist = FitIn.toDouble(jTextField32.getText());
            double patient_hip = FitIn.toDouble(jTextField33.getText());
            double patient_spo2 = FitIn.toDouble(jTextField34.getText());
            String complaints = jTextArea1.getText();
            String past_personal_family_history = jTextArea3.getText();
            String investigation = jTextArea5.getText();
            String findings = jTextArea2.getText();
            String provisional_diagnosis = jTextArea4.getText();
            String remarks = jTextArea6.getText();
            int followup_days = FitIn.toInt(jTextField35.getText());
            String followup_date = null;
            try {
                followup_date = DateType.sf.format(jDateChooser2.getDate());
            } catch (Exception e) {
                followup_date = null;
            }
            String referred_to = jTextField36.getText();
            String created_by = to.created_by;
            String updated_by = MyUser.getUser_id();
            String created_at = to.created_at;
            String updated_at = DateType.now();
            int status = to.status;
            int is_uploaded = to.is_uploaded;

            Out_patient_departments.to_out_patient_departments opd = new Out_patient_departments.to_out_patient_departments(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, bday, gender, blood_type, address, allergy_medicine, allergy_others, is_smoking, is_alcohol, is_drug_abuse, opd_date, opd_time, opd_type, patient_height, patient_weight, patient_bmi, patient_pressure, patient_pulse, patient_temperature, patient_respiratory, patient_waist, patient_hip, patient_spo2, complaints, past_personal_family_history, investigation, findings, provisional_diagnosis, remarks, followup_days, followup_date, referred_to, created_by, updated_by, created_at, updated_at, status, is_uploaded);
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.do_pass("Are you sure you want to update this record?");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Out_patient_departments.update_data(opd);
                    ret_opd();
                    tbl_out_patient_departments.setRowSelectionInterval(row, row);
                    select_opd(null);
                    Alert.set(2, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
    }

    private void new_opd() {
        //<editor-fold defaultstate="collapsed" desc=" clear fields ">

        Field.Input cl = (Field.Input) jTextField2;
        Field.Input pa = (Field.Input) jTextField4;
        Field.Combo doc = (Field.Combo) jTextField24;
        cl.setText("");
        cl.setId("");
        pa.setText("");
        pa.setId("");

        jTextField22.setText("");
        jTextField23.setText("New");
        jTextField20.setText("1");

        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextArea1.setText("");
        jTextArea3.setText("");
        jTextArea5.setText("");
        jTextArea2.setText("");
        jTextArea4.setText("");
        jTextArea6.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
        jDateChooser2.setDate(null);
        tbl_out_patient_department_prescriptions_ALM.clear();
        tbl_out_patient_department_receipt_items_ALM.clear();
        init_receipt_item_inventory_charge();
        compute_receipt_item_charges();
        compute_change();
        tbl_out_patient_departments.clearSelection();
        jTextField44.setText("");
        jTextField45.setText("");
        jTextField39.setText("");
        jTextField41.setText("");
        jTabbedPane2.setSelectedIndex(0);
        jButton3.setText("Save");
        jButton9.setVisible(false);
        tf_search_patient.grabFocus();
        //</editor-fold>
    }
    List<Patients.to_patients> patient_list = new ArrayList();

    private void init_patients() {
        String search = tf_search_patient.getText();
        patient_list.clear();
        String where = " where concat(lname,space(1),fname) like '%" + search + "%' "
                + " or concat(fname,space(1),lname) like '%" + search + "%' "
                + " order by lname asc ";
        patient_list = Patients.ret_data(where);
        Object[][] obj = new Object[patient_list.size()][1];
        int i = 0;
        for (Patients.to_patients to : patient_list) {
            obj[i][0] = " " + to.lname + ", " + to.fname + " " + to.mi;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_search_patient.getWidth()};
        String[] col_names = {"NAME"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_search_patient, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Patients.to_patients to = patient_list.get(data.selected_row);
                Field.Input cl = (Field.Input) jTextField2;
                Field.Input pa = (Field.Input) jTextField4;
                cl.setText(to.clinic);
                cl.setId(to.clinic_id);

                pa.setText(to.fname + " " + to.mi + " " + to.lname + " " + to.sname);
                pa.setId("" + to.id);

                try {
                    Date d = DateType.sf.parse(to.bday);
                    jDateChooser1.setDate(d);
                } catch (ParseException ex) {
                    Logger.getLogger(Dlg_patients.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (to.gender == 0) {
                    jTextField7.setText("Female");
                } else {
                    jTextField7.setText("Male");
                }
                jTextField8.setText(to.blood_type);

                jTextField6.setText(to.address + " ," + to.barangay + " ," + to.city + " ," + to.province + " ," + to.country);

                jTextField14.setText(to.allergy_medicine);
                jTextField17.setText(to.allergy_others);

                if (to.is_smoking == 0) {
                    jCheckBox2.setSelected(true);
                }
                if (to.is_smoking == 1) {
                    jCheckBox1.setSelected(true);
                }
                if (to.is_smoking == 2) {
                    jCheckBox3.setSelected(true);
                }

                if (to.is_alcohol == 0) {
                    jCheckBox5.setSelected(true);
                }
                if (to.is_alcohol == 1) {
                    jCheckBox4.setSelected(true);
                }
                if (to.is_alcohol == 2) {
                    jCheckBox6.setSelected(true);
                }

                if (to.is_drug_abuse == 0) {
                    jCheckBox8.setSelected(true);
                }
                if (to.is_drug_abuse == 1) {
                    jCheckBox7.setSelected(true);
                }
                if (to.is_drug_abuse == 2) {
                    jCheckBox9.setSelected(true);
                }

            }
        });
    }

    private void dlg_appointments() {
        Window p = (Window) this;
        Dlg_appointments nd = Dlg_appointments.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_appointments.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_appointments.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_patient() {
        Window p = (Window) this;
        Dlg_patients nd = Dlg_patients.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_patients.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_patients.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    List<Doctors.to_doctors> doctor_list = new ArrayList();

    private void init_doctors() {
        String search = jTextField24.getText();
        doctor_list.clear();
        String where = " where concat(lname,space(1),fname) like '%" + search + "%' "
                + " or concat(fname,space(1),lname) like '%" + search + "%' "
                + " order by lname asc ";
        doctor_list = Doctors.ret_data(where);
        Object[][] obj = new Object[doctor_list.size()][1];
        int i = 0;
        for (Doctors.to_doctors to : doctor_list) {
            obj[i][0] = " " + to.designation + " " + to.fname + ", " + to.mi + " " + to.lname;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField24.getWidth()};
        String[] col_names = {"NAME"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField24, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Doctors.to_doctors to = doctor_list.get(data.selected_row);
                Field.Combo doc = (Field.Combo) jTextField24;
                doc.setText(to.designation + " " + to.fname + " " + to.mi + " " + to.lname);
                doc.setId("" + to.id);
                ret_time_schedules();
            }
        });
    }

    private void dlg_doctors() {
        Window p = (Window) this;
        Dlg_doctors nd = Dlg_doctors.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_doctors.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_doctors.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    List<String> doctor_time_schedules = new ArrayList();

    private void init_date_schedule() {
        jDateChooser1.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                ret_time_schedules();
            }
        });
    }

    private void ret_time_schedules() {
        doctor_time_schedules.clear();
        Field.Combo doc = (Field.Combo) jTextField24;
        String day = DateType.day.format(jDateChooser1.getDate());
        String where = " where doctor_id='" + doc.getId() + "' and day='" + day + "' ";

        List<Doctor_daily_schedules.to_doctor_daily_schedules> schedules = Doctor_daily_schedules.ret_data3(where);

        for (Doctor_daily_schedules.to_doctor_daily_schedules sched : schedules) {
            if (sched.id != 0) {
                doctor_time_schedules.add(sched.time);
            }

        }

    }

    private void init_time_schedules() {

        Object[][] obj = new Object[doctor_time_schedules.size()][1];
        int i = 0;
        for (String to : doctor_time_schedules) {
            obj[i][0] = " " + to;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField22.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField22, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String time = (String) doctor_time_schedules.get(data.selected_row);
                jTextField22.setText(time);
            }
        });
    }

    private void init_opd_type() {
        List<String> types = new ArrayList();
        types.add("New");
        types.add("Regular");
        Object[][] obj = new Object[types.size()][1];
        int i = 0;
        for (String to : types) {
            obj[i][0] = " " + to;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField23.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField23, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String time = (String) types.get(data.selected_row);
                jTextField23.setText(time);
            }
        });
    }

    private void dlg_inventory() {
        Window p = (Window) this;
        Dlg_inventory nd = Dlg_inventory.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_inventory.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_inventory.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    //<editor-fold defaultstate="collapsed" desc=" out_patient_department_prescriptions "> 
    public static ArrayListModel tbl_out_patient_department_prescriptions_ALM;
    public static Tblout_patient_department_prescriptionsModel tbl_out_patient_department_prescriptions_M;

    public static void init_tbl_out_patient_department_prescriptions(JTable tbl_out_patient_department_prescriptions) {
        tbl_out_patient_department_prescriptions_ALM = new ArrayListModel();
        tbl_out_patient_department_prescriptions_M = new Tblout_patient_department_prescriptionsModel(tbl_out_patient_department_prescriptions_ALM);
        tbl_out_patient_department_prescriptions.setModel(tbl_out_patient_department_prescriptions_M);
        tbl_out_patient_department_prescriptions.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_out_patient_department_prescriptions.setRowHeight(25);
        int[] tbl_widths_out_patient_department_prescriptions = {50, 70, 100, 50, 60, 60, 80, 80, 80, 80, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_out_patient_department_prescriptions.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_out_patient_department_prescriptions, i, tbl_widths_out_patient_department_prescriptions[i]);
        }
        Dimension d = tbl_out_patient_department_prescriptions.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_out_patient_department_prescriptions.getTableHeader().setPreferredSize(d);
        tbl_out_patient_department_prescriptions.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_out_patient_department_prescriptions.setRowHeight(25);
        tbl_out_patient_department_prescriptions.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_out_patient_department_prescriptions.getColumnModel().getColumn(10).setCellRenderer(new ImageRenderer());
        tbl_out_patient_department_prescriptions.getColumnModel().getColumn(11).setCellRenderer(new ImageRenderer());
        TableWidthUtilities.setColumnRightRenderer(tbl_out_patient_department_prescriptions, 8);
        TableWidthUtilities.setColumnRightRenderer(tbl_out_patient_department_prescriptions, 9);
    }

    public static void loadData_out_patient_department_prescriptions(List<to_out_patient_department_prescriptions> acc) {
        tbl_out_patient_department_prescriptions_ALM.clear();
        tbl_out_patient_department_prescriptions_ALM.addAll(acc);
    }

    public static class Tblout_patient_department_prescriptionsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Qty", "Item Code", "Description", "Uom", "Dosage", "Day/s", "Dosage Qty", "Total Qty", "Price", "Amount", "", "", "generic_name", "description", "uom", "dosage", "days", "total", "dosage_remarks", "remarks", "cost", "selling_price", "discount_amount", "type_of_use", "category", "category_id", "classification", "classification_id", "sub_classification", "sub_classification_id", "brand", "brand_id", "model", "model_id", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tblout_patient_department_prescriptionsModel(ListModel listmodel) {
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
            to_out_patient_department_prescriptions tt = (to_out_patient_department_prescriptions) getRow(row);
            switch (col) {
                case 0:
                    return " " + FitIn.fmt_woc(tt.qty);
                case 1:
                    return " " + tt.item_code;
                case 2:
                    return " " + tt.description;
                case 3:
                    return " " + tt.uom;
                case 4:
                    return " " + tt.dosage;
                case 5:
                    return " " + tt.days;
                case 6:
                    return " " + FitIn.fmt_woc(tt.dosage_qty);
                case 7:
                    return " " + FitIn.fmt_woc(tt.dosage_qty * tt.qty);
                case 8:
                    return FitIn.fmt_wc_0(tt.selling_price) + " ";
                case 9:
                    return FitIn.fmt_wc_0(tt.selling_price * (tt.dosage_qty * tt.qty)) + " ";
                case 10:
                    return "/cms/icons/new-file.png";
                case 11:
                    return "/cms/icons/remove11.png";
                case 12:
                    return tt.generic_name;
                case 13:
                    return tt.description;
                case 14:
                    return tt.uom;
                case 15:
                    return tt.dosage;
                case 16:
                    return tt.days;
                case 17:
                    return tt.days;
                case 18:
                    return tt.dosage_remarks;
                case 19:
                    return tt.remarks;
                case 20:
                    return tt.cost;
                case 21:
                    return tt.selling_price;
                case 22:
                    return tt.discount_amount;
                case 23:
                    return tt.type_of_use;
                case 24:
                    return tt.category;
                case 25:
                    return tt.category_id;
                case 26:
                    return tt.classification;
                case 27:
                    return tt.classification_id;
                case 28:
                    return tt.sub_classification;
                case 29:
                    return tt.sub_classification_id;
                case 30:
                    return tt.brand;
                case 31:
                    return tt.brand_id;
                case 32:
                    return tt.model;
                case 33:
                    return tt.model_id;
                case 34:
                    return tt.created_by;
                case 35:
                    return tt.updated_by;
                case 36:
                    return tt.created_at;
                case 37:
                    return tt.updated_at;
                case 38:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void init_inventory(final JTextField tf) {
        String search = jTextField37.getText();
        String where = " where item_code='" + search + "' "
                + " or description like '%" + search + "%' "
                + " or generic_name like '%" + search + "%' "
                + " order by description asc ";
        List<Inventory.to_inventory> inventory_list = Inventory.ret_data(where);
        Object[][] obj = new Object[inventory_list.size()][4];
        int i = 0;
        for (Inventory.to_inventory to : inventory_list) {
            obj[i][0] = " " + FitIn.fmt_wc_0(to.product_qty);
            obj[i][1] = " " + to.item_code;
            obj[i][2] = " " + to.description;
            obj[i][3] = " " + FitIn.fmt_wc_0(to.selling_price);
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, 80, tf.getWidth() - 210, 80};
        String[] col_names = {"Qty", "Item Code", "Description", "Price"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Inventory.to_inventory to = inventory_list.get(data.selected_row);
                new_opd_prescription(to);
            }
        });
    }

    private void new_opd_prescription(Inventory.to_inventory to) {
        String where = " where item_code='" + to.item_code + "' and clinic_id='" + to.clinic_id + "' ";
        List<Inventory_prescriptions.to_inventory_prescriptions> prescriptions = Inventory_prescriptions.ret_data(where);
        if (prescriptions.isEmpty()) {
            Window p = (Window) this;
            Dlg_opd_prescription_qty nd = Dlg_opd_prescription_qty.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_opd_prescription_qty.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_opd_prescription_qty.OutputData data) {
                    closeDialog.ok();
                    Field.Combo doc = (Field.Combo) jTextField24;
                    Field.Input pa = (Field.Input) jTextField4;
                    int id = 0;
                    String opd_no = "";
                    String clinic = MyUser.getClinic();
                    String clinic_id = MyUser.getClinic_id();
                    String doctor = doc.getText();
                    String doctor_id = doc.getId();
                    String patient = pa.getText();
                    String patient_id = pa.getId();
                    String opd_date = DateType.sf.format(jDateChooser1.getDate());
                    String opd_time = jTextField22.getText();
                    String opd_type = jTextField23.getText();
                    String item_code = to.item_code;
                    String generic_name = to.generic_name;
                    String description = to.description;
                    String uom = to.uom;
                    double qty = data.qty;
                    String dosage = data.dosage;
                    double dosage_qty = data.dosage_qty;
                    int days = data.days;
                    String dosage_remarks = data.dosage_remarks;
                    String remarks = data.remarks;
                    double cost = to.cost;
                    double selling_price = to.selling_price;
                    double discount_amount = 0;
                    String type_of_use = to.type_of_use;
                    String category = to.category;
                    String category_id = to.category_id;
                    String classification = to.classification;
                    String classification_id = to.classification_id;
                    String sub_classification = to.sub_classification;
                    String sub_classification_id = to.sub_classification_id;
                    String brand = to.brand;
                    String brand_id = to.brand_id;
                    String model = to.model;
                    String model_id = to.model_id;
                    String created_by = "";
                    String updated_by = "";
                    String created_at = "";
                    String updated_at = "";
                    int status = 0;
                    int is_uploaded = 0;
                    to_out_patient_department_prescriptions opd_prescription = new to_out_patient_department_prescriptions(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, opd_date, opd_time, opd_type, item_code, generic_name, description, uom, qty, dosage, dosage_qty, days, dosage_remarks, remarks, cost, selling_price, discount_amount, type_of_use, category, category_id, classification, classification_id, sub_classification, sub_classification_id, brand, brand_id, model, model_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                    tbl_out_patient_department_prescriptions_ALM.add(opd_prescription);
                    update_receipt_item_inventory_charge();
                    compute_receipt_item_charges();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else {
            Window p = (Window) this;
            Dlg_opd_prescription nd = Dlg_opd_prescription.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_opd_prescription.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_opd_prescription.OutputData data) {
                    closeDialog.ok();
                    Field.Combo doc = (Field.Combo) jTextField24;
                    Field.Input pa = (Field.Input) jTextField4;
                    Inventory_prescriptions.to_inventory_prescriptions prescription = data.pres;
                    int id = 0;
                    String opd_no = "";
                    String clinic = MyUser.getClinic();
                    String clinic_id = MyUser.getClinic_id();
                    String doctor = doc.getText();
                    String doctor_id = doc.getId();
                    String patient = pa.getText();
                    String patient_id = pa.getId();
                    String opd_date = DateType.sf.format(jDateChooser1.getDate());
                    String opd_time = jTextField22.getText();
                    String opd_type = jTextField23.getText();
                    String item_code = prescription.item_code;
                    String generic_name = prescription.generic_name;
                    String description = prescription.description;
                    String uom = prescription.uom;
                    double qty = data.qty;
                    String dosage = data.dosage;
                    double dosage_qty = data.dosage_qty;
                    int days = data.days;
                    String dosage_remarks = data.dosage_remarks;
                    String remarks = data.remarks;
                    double cost = prescription.cost;
                    double selling_price = prescription.selling_price;
                    double discount_amount = 0;
                    String type_of_use = prescription.type_of_use;
                    String category = prescription.category;
                    String category_id = prescription.category_id;
                    String classification = prescription.classification;
                    String classification_id = prescription.classification_id;
                    String sub_classification = prescription.sub_classification;
                    String sub_classification_id = prescription.sub_classification_id;
                    String brand = prescription.brand;
                    String brand_id = prescription.brand_id;
                    String model = prescription.model;
                    String model_id = prescription.model_id;
                    String created_by = "";
                    String updated_by = "";
                    String created_at = "";
                    String updated_at = "";
                    int status = 0;
                    int is_uploaded = 0;
                    to_out_patient_department_prescriptions opd_prescription = new to_out_patient_department_prescriptions(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, opd_date, opd_time, opd_type, item_code, generic_name, description, uom, qty, dosage, dosage_qty, days, dosage_remarks, remarks, cost, selling_price, discount_amount, type_of_use, category, category_id, classification, classification_id, sub_classification, sub_classification_id, brand, brand_id, model, model_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                    tbl_out_patient_department_prescriptions_ALM.add(opd_prescription);
                    update_receipt_item_inventory_charge();
                    compute_receipt_item_charges();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

    private void select_opd_prescription() {
        int row = tbl_out_patient_department_prescriptions.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_department_prescriptions to = (to_out_patient_department_prescriptions) tbl_out_patient_department_prescriptions_ALM.get(row);
        int col = tbl_out_patient_department_prescriptions.getSelectedColumn();
        if (col == 10) {
            Window p = (Window) this;
            Dlg_opd_prescription_qty nd = Dlg_opd_prescription_qty.create(p, true);
            nd.setTitle("");
            nd.do_pass_edit(to);
            nd.setCallback(new Dlg_opd_prescription_qty.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_opd_prescription_qty.OutputData data) {
                    closeDialog.ok();
                    if (to.id == 0 || to.id == -1) {
                        to.setQty(data.qty);
                        to.setDosage(data.dosage);
                        to.setDosage_qty(data.dosage_qty);
                        to.setDays(data.days);
                        to.setDosage_remarks(data.dosage_remarks);
                        to.setRemarks(data.remarks);
                        tbl_out_patient_department_prescriptions_M.fireTableDataChanged();
                        update_receipt_item_inventory_charge();
                        compute_receipt_item_charges();
                    } else {
                        Out_patient_department_prescriptions.update_data2(to, data.qty, data.dosage, data.dosage_qty, data.days, data.dosage_remarks, data.remarks);

                    }
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 11) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_delete.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();
                    if (to.id == 0 || to.id == -1) {
                        tbl_out_patient_department_prescriptions_ALM.remove(row);
                        tbl_out_patient_department_prescriptions_M.fireTableDataChanged();
                        update_receipt_item_inventory_charge();
                        compute_receipt_item_charges();
                    } else {

                    }
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" out_patient_department_receipt_items "> 
    public static ArrayListModel tbl_out_patient_department_receipt_items_ALM;
    public static Tblout_patient_department_receipt_itemsModel tbl_out_patient_department_receipt_items_M;

    public static void init_tbl_out_patient_department_receipt_items(JTable tbl_out_patient_department_receipt_items) {
        tbl_out_patient_department_receipt_items_ALM = new ArrayListModel();
        tbl_out_patient_department_receipt_items_M = new Tblout_patient_department_receipt_itemsModel(tbl_out_patient_department_receipt_items_ALM);
        tbl_out_patient_department_receipt_items.setModel(tbl_out_patient_department_receipt_items_M);
        tbl_out_patient_department_receipt_items.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_out_patient_department_receipt_items.setRowHeight(25);
        int[] tbl_widths_out_patient_department_receipt_items = {100, 80, 80, 80, 60, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_out_patient_department_receipt_items.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_out_patient_department_receipt_items, i, tbl_widths_out_patient_department_receipt_items[i]);
        }
        Dimension d = tbl_out_patient_department_receipt_items.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_out_patient_department_receipt_items.getTableHeader().setPreferredSize(d);
        tbl_out_patient_department_receipt_items.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_out_patient_department_receipt_items.setRowHeight(25);
        tbl_out_patient_department_receipt_items.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_out_patient_department_receipt_items.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
        tbl_out_patient_department_receipt_items.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());
        TableWidthUtilities.setColumnRightRenderer(tbl_out_patient_department_receipt_items, 1);
        TableWidthUtilities.setColumnRightRenderer(tbl_out_patient_department_receipt_items, 2);
        TableWidthUtilities.setColumnRightRenderer(tbl_out_patient_department_receipt_items, 3);
    }

    public static void loadData_out_patient_department_receipt_items(List<to_out_patient_department_receipt_items> acc) {
        tbl_out_patient_department_receipt_items_ALM.clear();
        tbl_out_patient_department_receipt_items_ALM.addAll(acc);
    }

    public static class Tblout_patient_department_receipt_itemsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Particular", "Charge", "Discount", "Amount", "Status", "", "", "patient_id", "opd_date", "opd_time", "opd_type", "receipt_no", "receipt_date", "particular", "particular_id", "amount", "discount", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tblout_patient_department_receipt_itemsModel(ListModel listmodel) {
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
            to_out_patient_department_receipt_items tt = (to_out_patient_department_receipt_items) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.particular;
                case 1:
                    return FitIn.fmt_wc_0(tt.amount) + " ";
                case 2:
                    return FitIn.fmt_wc_0(tt.discount) + " ";
                case 3:
                    return FitIn.fmt_wc_0(tt.amount - tt.discount) + " ";
                case 4:
                    if (tt.status == 0) {
                        return "";
                    } else if (tt.status == 1) {
                        return " Paid";
                    } else {
                        return " Void";
                    }
                case 5:
                    return "/cms/icons/new-file.png";
                case 6:
                    return "/cms/icons/remove11.png";
                case 7:
                    return tt.patient_id;
                case 8:
                    return tt.opd_date;
                case 9:
                    return tt.opd_time;
                case 10:
                    return tt.opd_type;
                case 11:
                    return tt.receipt_no;
                case 12:
                    return tt.receipt_date;
                case 13:
                    return tt.particular;
                case 14:
                    return tt.particular_id;
                case 15:
                    return tt.amount;
                case 16:
                    return tt.discount;
                case 17:
                    return tt.created_by;
                case 18:
                    return tt.updated_by;
                case 19:
                    return tt.created_at;
                case 20:
                    return tt.updated_at;
                case 21:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void dlg_receipt_charges() {
        Window p = (Window) this;
        Dlg_receipt_particulars nd = Dlg_receipt_particulars.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_receipt_particulars.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_receipt_particulars.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void init_receipt_particular() {
        String search = jTextField43.getText();

        String where = " where particular like '%" + search + "%' "
                + " order by particular asc ";
        List<Receipt_particulars.to_receipt_particulars> particulars = Receipt_particulars.ret_data(where);

        Object[][] obj = new Object[particulars.size()][2];
        int i = 0;
        for (Receipt_particulars.to_receipt_particulars to : particulars) {
            obj[i][0] = " " + to.particular;
            obj[i][1] = " " + FitIn.fmt_wc_0(to.charge);
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField43.getWidth() - 80, 80};
        String[] col_names = {"particular", "charge"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField43, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Receipt_particulars.to_receipt_particulars to = particulars.get(data.selected_row);
                add_opd_charge_item_charges(to);
            }
        });
    }

    private void add_opd_charge_item_charges(Receipt_particulars.to_receipt_particulars to) {
        Window p = (Window) this;
        Dlg_opd_receipt_item_discount nd = Dlg_opd_receipt_item_discount.create(p, true);
        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_opd_receipt_item_discount.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_opd_receipt_item_discount.OutputData data) {
                closeDialog.ok();
                int id = 0;
                String opd_no = "";
                String clinic = "";
                String clinic_id = "";
                String doctor = "";
                String doctor_id = "";
                String patient = "";
                String patient_id = "";
                String opd_date = "";
                String opd_time = "";
                String opd_type = "";
                String receipt_no = "";
                String receipt_date = "";
                String reference_no = "";
                String particular = to.particular;
                String particular_id = "" + to.id;
                double amount = to.charge;
                double discount = data.discount;
                String created_by = "";
                String updated_by = "";
                String created_at = "";
                String updated_at = "";
                int status = 0;
                int is_uploaded = 0;
                to_out_patient_department_receipt_items charge = new to_out_patient_department_receipt_items(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, opd_date, opd_time, opd_type, receipt_no, receipt_date, reference_no, particular, particular_id, amount, discount, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                tbl_out_patient_department_receipt_items_ALM.add(charge);
                compute_receipt_item_charges();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);

    }

    private void init_receipt_item_inventory_charge() {
        int id = 0;
        String opd_no = "";
        String clinic = "";
        String clinic_id = "";
        String doctor = "";
        String doctor_id = "";
        String patient = "";
        String patient_id = "";
        String opd_date = "";
        String opd_time = "";
        String opd_type = "";
        String receipt_no = "";
        String receipt_date = "";
        String reference_no = "";
        String particular = "Item/s";
        String particular_id = "0";
        double amount = 0;
        double discount = 0;
        String created_by = "";
        String updated_by = "";
        String created_at = "";
        String updated_at = "";
        int status = 0;
        int is_uploaded = 0;
        to_out_patient_department_receipt_items charge = new to_out_patient_department_receipt_items(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, opd_date, opd_time, opd_type, receipt_no, receipt_date, reference_no, particular, particular_id, amount, discount, created_by, updated_by, created_at, updated_at, status, is_uploaded);
        tbl_out_patient_department_receipt_items_ALM.add(charge);
    }

    private void update_receipt_item_inventory_charge() {
        List<to_out_patient_department_prescriptions> items = tbl_out_patient_department_prescriptions_ALM;

        double am = 0;
        for (to_out_patient_department_prescriptions to : items) {
            double am2 = (to.qty * to.dosage_qty) * to.selling_price;
            am += (am2 - to.discount_amount);
        }
        to_out_patient_department_receipt_items receipt_item = (to_out_patient_department_receipt_items) tbl_out_patient_department_receipt_items_ALM.get(0);
        receipt_item.setAmount(am);
        tbl_out_patient_department_receipt_items_M.fireTableDataChanged();

    }

    private void select_opd_receipt_item() {
        int row = tbl_out_patient_department_receipt_items.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_department_receipt_items item = (to_out_patient_department_receipt_items) tbl_out_patient_department_receipt_items_ALM.get(row);
        int col = tbl_out_patient_department_receipt_items.getSelectedColumn();
        if (col == 5) {
            if (item.id == 0) {
                Window p = (Window) this;
                Dlg_opd_receipt_item_discount nd = Dlg_opd_receipt_item_discount.create(p, true);
                nd.setTitle("");
                nd.do_pass_edit(item);
                nd.setCallback(new Dlg_opd_receipt_item_discount.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_opd_receipt_item_discount.OutputData data) {
                        closeDialog.ok();
                        item.setDiscount(data.discount);
                        tbl_out_patient_department_receipt_items_M.fireTableDataChanged();
                        compute_receipt_item_charges();
                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            } else {

            }

        }
        if (col == 6) {
            if (row == 0) {
                Alert.set(0, "Unable to delete this item!");
            } else {
                Window p = (Window) this;
                Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
                nd.setTitle("");

                nd.setCallback(new Dlg_confirm_delete.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                        closeDialog.ok();
                        if (item.id == 0) {
                            tbl_out_patient_department_receipt_items_ALM.remove(row);
                            tbl_out_patient_department_receipt_items_M.fireTableDataChanged();
                            compute_receipt_item_charges();
                        } else {

                        }
                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }
        }
    }

    private void compute_receipt_item_charges() {
        List<to_out_patient_department_receipt_items> charges = tbl_out_patient_department_receipt_items_ALM;
        double amount_due = 0;
        for (to_out_patient_department_receipt_items to : charges) {
            amount_due += (to.amount - to.discount);
        }
        jTextField38.setText(FitIn.fmt_wc_0(amount_due));
        compute_change();
    }

    private void compute_change() {
        double amount_due = FitIn.toDouble(jTextField38.getText());
        double discount = FitIn.toDouble(jTextField39.getText());
        double net_due = amount_due - discount;
        jTextField40.setText(FitIn.fmt_wc_0(net_due));
        double tender = FitIn.toDouble(jTextField41.getText());
        double change = tender - net_due;
        jTextField42.setText(FitIn.fmt_wc_0(change));
    }
//</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" out_patient_departments "> 
    public static ArrayListModel tbl_out_patient_departments_ALM;
    public static Tblout_patient_departmentsModel tbl_out_patient_departments_M;

    public static void init_tbl_out_patient_departments(JTable tbl_out_patient_departments) {
        tbl_out_patient_departments_ALM = new ArrayListModel();
        tbl_out_patient_departments_M = new Tblout_patient_departmentsModel(tbl_out_patient_departments_ALM);
        tbl_out_patient_departments.setModel(tbl_out_patient_departments_M);
        tbl_out_patient_departments.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_out_patient_departments.setRowHeight(25);
        int[] tbl_widths_out_patient_departments = {100, 70, 100, 70, 100, 180, 80, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_out_patient_departments.length; i < n; i++) {
            if (i == 4) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_out_patient_departments, i, tbl_widths_out_patient_departments[i]);
        }
        Dimension d = tbl_out_patient_departments.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_out_patient_departments.getTableHeader().setPreferredSize(d);
        tbl_out_patient_departments.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_out_patient_departments.setRowHeight(25);
        tbl_out_patient_departments.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_out_patient_departments.getColumnModel().getColumn(7).setCellRenderer(new ImageRenderer());
        tbl_out_patient_departments.getColumnModel().getColumn(8).setCellRenderer(new ImageRenderer());
        tbl_out_patient_departments.getColumnModel().getColumn(9).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_out_patient_departments(List<to_out_patient_departments> acc) {
        tbl_out_patient_departments_ALM.clear();
        tbl_out_patient_departments_ALM.addAll(acc);
    }

    public static class Tblout_patient_departmentsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "OPD No.", "Date", "Clinic", "Time", "Patient", "Doctor", "Type", "", "", "", "opd_type", "patient_height", "patient_weight", "patient_bmi", "patient_pressure", "patient_pulse", "patient_temperature", "patient_respiratory", "patient_waist", "patient_hip", "patient_spo2", "complaints", "past_personal_family_history", "investigation", "findings", "provisional_diagnosis", "remarks", "followup_days", "followup_date", "referred_to", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tblout_patient_departmentsModel(ListModel listmodel) {
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
            to_out_patient_departments tt = (to_out_patient_departments) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.opd_no;
                case 1:
                    return " " + DateType.convert_slash_datetime2(tt.opd_date);
                case 2:
                    return " " + tt.clinic;
                case 3:
                    return " " + tt.opd_time;
                case 4:
                    return " " + tt.patient;
                case 5:
                    return " " + tt.doctor;
                case 6:
                    return " " + tt.opd_type;
                case 7:
                    return "/cms/icons/new-file.png";
                case 8:
                    return "/cms/icons/remove11.png";
                case 9:
                    return "/cms/icons/report.png";

                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_opd() {
        String where = "";
        List<to_out_patient_departments> datas = Out_patient_departments.ret_data(where);
        loadData_out_patient_departments(datas);
        jLabel11.setText("" + datas.size());
    }

    private void select_opd(java.awt.event.MouseEvent evt) {
        int row = tbl_out_patient_departments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_departments to = (to_out_patient_departments) tbl_out_patient_departments_ALM.get(row);
        int col = tbl_out_patient_departments.getSelectedColumn();
        if (col == 7) {
            Field.Input cl = (Field.Input) jTextField2;
            cl.setText(to.clinic);
            cl.setId(to.clinic_id);
            Field.Input pa = (Field.Input) jTextField4;
            pa.setText(to.patient);
            pa.setId(to.patient_id);

            Field.Combo doc = (Field.Combo) jTextField24;
            doc.setText(to.doctor);
            doc.setId(to.doctor_id);

            try {
                Date d = DateType.sf.parse(to.patient_bday);
                jDateChooser1.setDate(d);
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_patients.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (to.patient_gender == 0) {
                jTextField7.setText("Female");
            } else {
                jTextField7.setText("Male");
            }
            jTextField8.setText(to.patient_blood_type);

            jTextField6.setText(to.patient_address);

            jTextField14.setText(to.patient_allergy_medicine);
            jTextField17.setText(to.patient_allergy_others);

            if (to.patient_is_smoking == 0) {
                jCheckBox2.setSelected(true);
            }
            if (to.patient_is_smoking == 1) {
                jCheckBox1.setSelected(true);
            }
            if (to.patient_is_smoking == 2) {
                jCheckBox3.setSelected(true);
            }

            if (to.patient_is_alcohol == 0) {
                jCheckBox5.setSelected(true);
            }
            if (to.patient_is_alcohol == 1) {
                jCheckBox4.setSelected(true);
            }
            if (to.patient_is_alcohol == 2) {
                jCheckBox6.setSelected(true);
            }

            if (to.patient_is_drug_abuse == 0) {
                jCheckBox8.setSelected(true);
            }
            if (to.patient_is_drug_abuse == 1) {
                jCheckBox7.setSelected(true);
            }
            if (to.patient_is_drug_abuse == 2) {
                jCheckBox9.setSelected(true);
            }

            try {
                Date visit_date = DateType.sf.parse(to.opd_date);
                jDateChooser1.setDate(visit_date);
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_opd.class.getName()).log(Level.SEVERE, null, ex);
            }

            jTextField22.setText(to.opd_time);
            jTextField23.setText(to.opd_type);

            jTextField25.setText(FitIn.fmt_woc(to.patient_height));
            jTextField26.setText(FitIn.fmt_woc(to.patient_weight));

            jTextField28.setText(to.patient_pressure);
            jTextField29.setText(FitIn.fmt_woc(to.patient_pulse));
            jTextField30.setText(FitIn.fmt_woc(to.patient_temperature));
            jTextField31.setText(FitIn.fmt_woc(to.patient_respiratory));
            jTextField32.setText(FitIn.fmt_woc(to.patient_waist));
            jTextField33.setText(FitIn.fmt_woc(to.patient_hip));
            jTextField34.setText(FitIn.fmt_woc(to.patient_spo2));
            jTextArea1.setText(to.complaints);
            jTextArea3.setText(to.past_personal_family_history);
            jTextArea5.setText(to.investigation);
            jTextArea2.setText(to.findings);
            jTextArea4.setText(to.provisional_diagnosis);
            jTextArea6.setText(to.remarks);

            jTextField35.setText("" + to.followup_days);
            jTextField36.setText(to.referred_to);
            if (to.followup_date != null) {
                try {
                    Date f_date = DateType.sf.parse(to.followup_date);
                    jDateChooser2.setDate(f_date);
                } catch (ParseException ex) {
                    Logger.getLogger(Dlg_opd.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            String where = "where opd_no='" + to.opd_no + "' and clinic_id='" + to.clinic_id + "' ";
            List<Out_patient_department_prescriptions.to_out_patient_department_prescriptions> prescriptions = Out_patient_department_prescriptions.ret_data(where);
            loadData_out_patient_department_prescriptions(prescriptions);
            jLabel2.setText("" + prescriptions.size());

            List<Out_patient_department_receipt_items.to_out_patient_department_receipt_items> charges = Out_patient_department_receipt_items.ret_data(where);
            loadData_out_patient_department_receipt_items(charges);
            jLabel7.setText("" + charges.size());

            List<Out_patient_department_receipts.to_out_patient_department_receipts> receipts = Out_patient_department_receipts.ret_data(where);
            Out_patient_department_receipts.to_out_patient_department_receipts receipt = receipts.get(0);

            Field.Input tr=(Field.Input) jTextField44;
            tr.setId(""+receipt.id);
            tr.setText(receipt.receipt_no);
            jTextField45.setText(receipt.reference_no);

            jTextField38.setText(FitIn.fmt_wc_0(receipt.amount_due));
            jTextField39.setText(FitIn.fmt_wc_0(receipt.discount));
            jTextField41.setText(FitIn.fmt_wc_0(receipt.cash));
            jTextField42.setText(FitIn.fmt_wc_0(receipt.cash - (receipt.amount_due - receipt.discount)));
            jButton3.setText("Update");
            jButton9.setVisible(true);
            jTabbedPane1.setSelectedIndex(0);

        }
        if (col == 8) {
            Window p = (Window) this;
            Dlg_confirm_delete nd = Dlg_confirm_delete.create(p, true);
            nd.setTitle("");

            nd.setCallback(new Dlg_confirm_delete.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_delete.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 9) {
            show_pop_print(evt);
        }
    }

    private void show_pop_print(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(jScrollPane9, evt.getX(), evt.getY());
        }
    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" dlg options ">
    private String remove_empty_line(JTextArea ta) {
        String[] stmt = ta.getText().split("\n");
        String new_string = "";
        for (String s : stmt) {
            if (!s.isEmpty()) {
                new_string = new_string + "\n" + s;
            }
        }
        return new_string;
    }

    private void dlg_option_complaints() {
        Window p = (Window) this;
        Dlg_option_complaints nd = Dlg_option_complaints.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_option_complaints.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_option_complaints.OutputData data) {
                closeDialog.ok();
                String text = jTextArea1.getText();
                if (text.isEmpty()) {
                    jTextArea1.setText(data.complaint);
                } else {
                    jTextArea1.setText(text + "\n" + data.complaint);
                }
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_option_history() {
        Window p = (Window) this;
        Dlg_option_history nd = Dlg_option_history.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_option_history.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_option_history.OutputData data) {
                closeDialog.ok();
                String text = jTextArea3.getText();
                if (text.isEmpty()) {
                    jTextArea3.setText(data.stmt);
                } else {
                    jTextArea3.setText(text + "\n" + data.stmt);
                }
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_option_investigation() {
        Window p = (Window) this;
        Dlg_option_investigation nd = Dlg_option_investigation.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_option_investigation.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_option_investigation.OutputData data) {
                closeDialog.ok();
                String text = jTextArea5.getText();
                if (text.isEmpty()) {
                    jTextArea5.setText(data.stmt);
                } else {
                    jTextArea5.setText(text + "\n" + data.stmt);
                }
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_option_findings() {
        Window p = (Window) this;
        Dlg_option_findings nd = Dlg_option_findings.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_option_findings.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_option_findings.OutputData data) {
                closeDialog.ok();
                String text = jTextArea2.getText();
                if (text.isEmpty()) {
                    jTextArea2.setText(data.stmt);
                } else {
                    jTextArea2.setText(text + "\n" + data.stmt);
                }
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_option_diagnosis() {
        Window p = (Window) this;
        Dlg_option_diagnosis nd = Dlg_option_diagnosis.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_option_diagnosis.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_option_diagnosis.OutputData data) {
                closeDialog.ok();
                String text = jTextArea4.getText();
                if (text.isEmpty()) {
                    jTextArea4.setText(data.stmt);
                } else {
                    jTextArea4.setText(text + "\n" + data.stmt);
                }
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_option_remarks() {
        Window p = (Window) this;
        Dlg_option_remarks nd = Dlg_option_remarks.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_option_remarks.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_option_remarks.OutputData data) {
                closeDialog.ok();
                String text = jTextArea6.getText();
                if (text.isEmpty()) {
                    jTextArea6.setText(data.stmt);
                } else {
                    jTextArea6.setText(text + "\n" + data.stmt);
                }

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" reports ">
    private void dlg_case_report() {
        int row = tbl_out_patient_departments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_departments to = (to_out_patient_departments) tbl_out_patient_departments_ALM.get(row);
        Window p = (Window) this;
        Dlg_report_case_report nd = Dlg_report_case_report.create(p, true);

        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_report_case_report.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_case_report.OutputData data) {
                closeDialog.ok();

            }
        });

        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_investigation_report() {
        int row = tbl_out_patient_departments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_departments to = (to_out_patient_departments) tbl_out_patient_departments_ALM.get(row);
        Window p = (Window) this;
        Dlg_report_investigation_report nd = Dlg_report_investigation_report.create(p, true);

        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_report_investigation_report.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_investigation_report.OutputData data) {
                closeDialog.ok();

            }
        });

        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_prescription_report() {
        int row = tbl_out_patient_departments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_departments to = (to_out_patient_departments) tbl_out_patient_departments_ALM.get(row);
        Window p = (Window) this;
        Dlg_report_prescription nd = Dlg_report_prescription.create(p, true);

        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_report_prescription.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_prescription.OutputData data) {
                closeDialog.ok();

            }
        });

        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_fitness_certificate() {
        int row = tbl_out_patient_departments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_departments to = (to_out_patient_departments) tbl_out_patient_departments_ALM.get(row);
        Window p = (Window) this;
        Dlg_report_fitness_certificate nd = Dlg_report_fitness_certificate.create(p, true);

        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_report_fitness_certificate.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_fitness_certificate.OutputData data) {
                closeDialog.ok();

            }
        });

        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_sickness_certificate() {
        int row = tbl_out_patient_departments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_departments to = (to_out_patient_departments) tbl_out_patient_departments_ALM.get(row);
        Window p = (Window) this;
        Dlg_report_sickness_certificate nd = Dlg_report_sickness_certificate.create(p, true);
        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_report_sickness_certificate.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_sickness_certificate.OutputData data) {
                closeDialog.ok();

            }
        });

        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_referral_certificate() {
        int row = tbl_out_patient_departments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_departments to = (to_out_patient_departments) tbl_out_patient_departments_ALM.get(row);
        Window p = (Window) this;
        Dlg_report_referral_letter nd = Dlg_report_referral_letter.create(p, true);
        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_report_referral_letter.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_referral_letter.OutputData data) {
                closeDialog.ok();

            }
        });

        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_receipt() {
        int row = tbl_out_patient_departments.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_out_patient_departments to = (to_out_patient_departments) tbl_out_patient_departments_ALM.get(row);
        Window p = (Window) this;
        Dlg_report_receipt nd = Dlg_report_receipt.create(p, true);

        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_report_receipt.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_receipt.OutputData data) {
                closeDialog.ok();

            }
        });

        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    //</editor-fold>

    List<Clinics.to_clinics> clinic_list = new ArrayList();

    private void init_clinic() {

        Object[][] obj = new Object[clinic_list.size()][1];
        int i = 0;
        for (Clinics.to_clinics to : clinic_list) {
            obj[i][0] = " " + to.clinic;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField48.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField48, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Clinics.to_clinics clinic = (Clinics.to_clinics) clinic_list.get(data.selected_row);
                Field.Combo cl = (Field.Combo) jTextField48;
                cl.setText(clinic.clinic);
                cl.setId("" + clinic.id);
            }
        });
    }
}
