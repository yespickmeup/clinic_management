/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.opd;

import cms.inventory.Inventory;
import cms.inventory.Inventory_prescriptions;
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
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author RAZOR Defianz
 */
public class Dlg_opd_prescription extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_opd_prescription
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

        public final Inventory_prescriptions.to_inventory_prescriptions pres;
        public final double qty;
        public final String dosage;
        public final int days;
        public final double dosage_qty;
        public final String dosage_remarks;
        public final String remarks;

        public OutputData(Inventory_prescriptions.to_inventory_prescriptions pres, double qty, String dosage, int days, double dosage_qty, String dosage_remarks, String remarks) {
            this.pres = pres;
            this.qty = qty;
            this.dosage = dosage;
            this.days = days;
            this.dosage_qty = dosage_qty;
            this.dosage_remarks = dosage_remarks;
            this.remarks = remarks;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_opd_prescription(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_opd_prescription(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_opd_prescription() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_opd_prescription myRef;

    private void setThisRef(Dlg_opd_prescription myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_opd_prescription> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_opd_prescription create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_opd_prescription create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_opd_prescription dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_opd_prescription((java.awt.Frame) parent, false);
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
            Dlg_opd_prescription dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_opd_prescription((java.awt.Dialog) parent, false);
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

        Dlg_opd_prescription dialog = Dlg_opd_prescription.create(new javax.swing.JFrame(), true);
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
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new Field.Input();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new Field.Input();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new Field.Input();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_inventory_prescriptions = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Item Code:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setFocusable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Description:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setFocusable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Generic Name:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setFocusable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 342, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Prescription", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tbl_inventory_prescriptions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_inventory_prescriptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_inventory_prescriptionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_inventory_prescriptions);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void tbl_inventory_prescriptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_inventory_prescriptionsMouseClicked
        select_inventory_prescription();
    }//GEN-LAST:event_tbl_inventory_prescriptionsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tbl_inventory_prescriptions;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_inventory_prescriptions(tbl_inventory_prescriptions);
    }

    public void do_pass(Inventory.to_inventory to) {
        jTextField2.setText(to.item_code);
        jTextField3.setText(to.description);
        jTextField4.setText(to.generic_name);

        int id = -1;
        String item_code = to.item_code;
        String generic_name = to.generic_name;
        String description = to.description;
        String uom = to.uom;
        String dosage = "";
        int days = 1;
        double dosage_qty = 1;
        String dosage_remarks = "";
        String remarks = "";
        String type_of_use = to.type_of_use;
        double product_qty = 1;
        double cost = to.cost;
        double selling_price = to.selling_price;
        double reorder_level = to.reorder_level;
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
        String clinic = to.clinic;
        String clinic_id = to.clinic_id;
        String created_by = to.created_by;
        String updated_by = to.updated_by;
        String created_at = to.created_at;
        String updated_at = to.updated_at;
        int status = to.status;
        int is_uploaded = to.is_uploaded;

        Inventory_prescriptions.to_inventory_prescriptions pre = new Inventory_prescriptions.to_inventory_prescriptions(id, item_code, generic_name, description, uom, dosage, days, dosage_qty, dosage_remarks, remarks, type_of_use, product_qty, cost, selling_price, reorder_level, category, category_id, classification, classification_id, sub_classification, sub_classification_id, brand, brand_id, model, model_id, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
        tbl_inventory_prescriptions_ALM.add(pre);
        ret_inventory_prescriptions(to);
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

    //<editor-fold defaultstate="collapsed" desc=" inventory_prescriptions "> 
    public static ArrayListModel tbl_inventory_prescriptions_ALM;
    public static Tblinventory_prescriptionsModel tbl_inventory_prescriptions_M;

    public static void init_tbl_inventory_prescriptions(JTable tbl_inventory_prescriptions) {
        tbl_inventory_prescriptions_ALM = new ArrayListModel();
        tbl_inventory_prescriptions_M = new Tblinventory_prescriptionsModel(tbl_inventory_prescriptions_ALM);
        tbl_inventory_prescriptions.setModel(tbl_inventory_prescriptions_M);
        tbl_inventory_prescriptions.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_inventory_prescriptions.setRowHeight(25);
        int[] tbl_widths_inventory_prescriptions = {100, 80, 80, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_inventory_prescriptions.length; i < n; i++) {
            if (i == 3) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_inventory_prescriptions, i, tbl_widths_inventory_prescriptions[i]);
        }
        Dimension d = tbl_inventory_prescriptions.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_inventory_prescriptions.getTableHeader().setPreferredSize(d);
        tbl_inventory_prescriptions.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_inventory_prescriptions.setRowHeight(25);
        tbl_inventory_prescriptions.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_inventory_prescriptions.getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer());
        tbl_inventory_prescriptions.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_inventory_prescriptions(List<Inventory_prescriptions.to_inventory_prescriptions> acc) {
//        tbl_inventory_prescriptions_ALM.clear();
        tbl_inventory_prescriptions_ALM.addAll(acc);
    }

    public static class Tblinventory_prescriptionsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Dosage", "Days", "Qty", "Dosage Remarks", "", "", "days", "dosage_qty", "dosage_remarks", "remarks", "type_of_use", "product_qty", "cost", "selling_price", "reorder_level", "category", "category_id", "classification", "classification_id", "sub_classification", "sub_classification_id", "brand", "brand_id", "model", "model_id", "clinic", "clinic_id", "created_by", "updated_by", "created_at", "updated_at", "status", "is_uploaded"
        };

        public Tblinventory_prescriptionsModel(ListModel listmodel) {
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
            Inventory_prescriptions.to_inventory_prescriptions tt = (Inventory_prescriptions.to_inventory_prescriptions) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.dosage;
                case 1:
                    return " " + tt.days;
                case 2:
                    return " " + tt.dosage_qty;
                case 3:
                    return " " + tt.dosage_remarks;
                case 4:
                    return "/cms/icons/new-file.png";
                case 5:
                    return "/cms/icons/remove11.png";
                case 6:
                    return tt.days;
                case 7:
                    return tt.dosage_qty;
                case 8:
                    return tt.dosage_remarks;
                case 9:
                    return tt.remarks;
                case 10:
                    return tt.type_of_use;
                case 11:
                    return tt.product_qty;
                case 12:
                    return tt.cost;
                case 13:
                    return tt.selling_price;
                case 14:
                    return tt.reorder_level;
                case 15:
                    return tt.category;
                case 16:
                    return tt.category_id;
                case 17:
                    return tt.classification;
                case 18:
                    return tt.classification_id;
                case 19:
                    return tt.sub_classification;
                case 20:
                    return tt.sub_classification_id;
                case 21:
                    return tt.brand;
                case 22:
                    return tt.brand_id;
                case 23:
                    return tt.model;
                case 24:
                    return tt.model_id;
                case 25:
                    return tt.clinic;
                case 26:
                    return tt.clinic_id;
                case 27:
                    return tt.created_by;
                case 28:
                    return tt.updated_by;
                case 29:
                    return tt.created_at;
                case 30:
                    return tt.updated_at;
                case 31:
                    return tt.status;
                default:
                    return tt.is_uploaded;
            }
        }
    }

    private void ret_inventory_prescriptions(Inventory.to_inventory inventory) {
        String where = " where item_code='" + inventory.item_code + "' and clinic_id='" + inventory.clinic_id + "' ";
        List<Inventory_prescriptions.to_inventory_prescriptions> prescriptions = Inventory_prescriptions.ret_data(where);

        loadData_inventory_prescriptions(prescriptions);

    }

    private void select_inventory_prescription() {
        int row = tbl_inventory_prescriptions.getSelectedRow();
        if (row < 0) {
            return;
        }
        Inventory_prescriptions.to_inventory_prescriptions prescription = (Inventory_prescriptions.to_inventory_prescriptions) tbl_inventory_prescriptions_ALM.get(row);
        Window p = (Window) this;
        Dlg_opd_prescription_qty nd = Dlg_opd_prescription_qty.create(p, true);
        nd.setTitle("");
        nd.do_pass_with_pres(prescription);
        nd.setCallback(new Dlg_opd_prescription_qty.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_opd_prescription_qty.OutputData data) {
                closeDialog.ok();
                ok2(prescription, data.qty, data.dosage, data.days, data.dosage_qty, data.dosage_remarks, data.remarks);
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void ok2(Inventory_prescriptions.to_inventory_prescriptions prescription, double qty,
             String dosage, int days, double dosage_qty, String dosage_remarks, String remarks) {

        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(prescription, qty, dosage, days, dosage_qty, dosage_remarks, remarks));
        }
    }
//</editor-fold> 
}
