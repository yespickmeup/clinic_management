/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import mijzcx.synapse.desk.utils.TableWidthUtilities;

/**
 *
 * @author Maytopacka
 */
public class TableCheckBoxRenderer {

    private static Callback callback;

    public void setCallback(Callback callback) {
        TableCheckBoxRenderer.callback = callback;
    }

    public static interface Callback {

        void ok(OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {

        public final List<CheckBox.list> output;
        public final int selected_row;

        public OutputData(List<CheckBox.list> output, int selected_row) {
            this.output = output;
            this.selected_row = selected_row;
        }
    }

    public static void setModel(JTable tbl, Object[][] obj, String[] col_names, int[] tbl_widths_customers1) {
        tbl.setModel(new javax.swing.table.DefaultTableModel(
                obj,
                col_names) {

            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

            @Override
            public Class getColumnClass(int col) {
                if (col == 0) {
                    return Boolean.class;
                }
                return Object.class;
            }

        });
        int[] tbl_widths_customers = tbl_widths_customers1;
        for (int i = 0, n = tbl_widths_customers.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl, i, tbl_widths_customers[i]);
        }
        tbl.setRowHeight(30);
        tbl.setFont(new java.awt.Font("Arial", 0, 11));
        tbl.getTableHeader().setPreferredSize(new Dimension(0, 0));
    }

    public static void setPopup(final JTextField tf, Object[][] obj, final JLabel[] labels, final int[] tbl_widths_customers, String[] col_names) {
        final JPopupMenu popup = new JPopupMenu();
        Dimension d = tf.getSize();

        popup.setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBackground(Color.white);
        JScrollPane pl = new JScrollPane();
        final JTable tbl = new JTable();
        TableCheckBoxRenderer.setModel(tbl, obj, col_names, tbl_widths_customers);
        pl.setViewportView(tbl);
        p.add(pl);
        popup.add(p);
        popup.setPopupSize(d.width, 150);
        popup.show(tf, 0, tf.getHeight());
        tf.grabFocus();
        tbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tbl.getSelectedRow();
                if (row < 0) {
                    return;
                }
                String select = tbl.getModel().getValueAt(row, 0).toString();
                boolean selected = select.equals("false");
                tbl.setValueAt(selected, row, 0);
                List<CheckBox.list> output = new ArrayList();

                for (int i = 0; i < tbl.getRowCount(); i++) {
                    String select2 = tbl.getModel().getValueAt(i, 0).toString();
                    String select3 = tbl.getModel().getValueAt(i, 1).toString();
                    select3=select3.substring(1,select3.length());
                    boolean s = select2.equals("true");                   
                    CheckBox.list li = new CheckBox.list(s, select3);
                    output.add(li);
                }

                ok1(output, row);
            }

        });

    }

    private static void ok1(List<CheckBox.list> datas, int selected_row) {
        if (callback != null) {
            callback.ok(new OutputData(datas, selected_row));
        }
    }
}
