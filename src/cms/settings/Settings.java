/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.settings;

import cms.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author RAZOR Defianz
 */
public class Settings {

    public static class to_settings {

        public final int id;
        public final String company_name;
        public final String company_address;
        public final String company_operated_by;
        public final String company_slogan;
        public final String company_contact_no;
        public final String company_fax_no;
        public final String company_email_address;
        public final String bir_serial_no;
        public final String bir_permit_no;
        public final String bir_accreditation_no;
        public final String bir_tin;
        public final String bir_machine_no;
        public final String bir_min_no;
        public final String bir_business_name;
        public final String bir_vat_percent;
        public final String bir_receipt_footer;
        public final int receipt_print_ting_enabled;
        public final int receipt_printer_show_dialog;
        public final int kitchen_printing_enable;
        public final int allow_negative_inventory;
        public final int is_servcer;
        public final String developer;
        public final String developer_address;
        public final String developer_tin_no;
        public final String developer_accreditation_no;
        public final String developer_accreditation_date;
        public final String developer_contact_no;

        public to_settings(int id, String company_name, String company_address, String company_operated_by, String company_slogan, String company_contact_no, String company_fax_no, String company_email_address, String bir_serial_no, String bir_permit_no, String bir_accreditation_no, String bir_tin, String bir_machine_no, String bir_min_no, String bir_business_name, String bir_vat_percent, String bir_receipt_footer, int receipt_print_ting_enabled, int receipt_printer_show_dialog, int kitchen_printing_enable, int allow_negative_inventory, int is_servcer, String developer, String developer_address, String developer_tin_no, String developer_accreditation_no, String developer_accreditation_date, String developer_contact_no) {
            this.id = id;
            this.company_name = company_name;
            this.company_address = company_address;
            this.company_operated_by = company_operated_by;
            this.company_slogan = company_slogan;
            this.company_contact_no = company_contact_no;
            this.company_fax_no = company_fax_no;
            this.company_email_address = company_email_address;
            this.bir_serial_no = bir_serial_no;
            this.bir_permit_no = bir_permit_no;
            this.bir_accreditation_no = bir_accreditation_no;
            this.bir_tin = bir_tin;
            this.bir_machine_no = bir_machine_no;
            this.bir_min_no = bir_min_no;
            this.bir_business_name = bir_business_name;
            this.bir_vat_percent = bir_vat_percent;
            this.bir_receipt_footer = bir_receipt_footer;
            this.receipt_print_ting_enabled = receipt_print_ting_enabled;
            this.receipt_printer_show_dialog = receipt_printer_show_dialog;
            this.kitchen_printing_enable = kitchen_printing_enable;
            this.allow_negative_inventory = allow_negative_inventory;
            this.is_servcer = is_servcer;
            this.developer = developer;
            this.developer_address = developer_address;
            this.developer_tin_no = developer_tin_no;
            this.developer_accreditation_no = developer_accreditation_no;
            this.developer_accreditation_date = developer_accreditation_date;
            this.developer_contact_no = developer_contact_no;
        }
    }

    public static void add_data(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into settings("
                    + "company_name"
                    + ",company_address"
                    + ",company_operated_by"
                    + ",company_slogan"
                    + ",company_contact_no"
                    + ",company_fax_no"
                    + ",company_email_address"
                    + ",bir_serial_no"
                    + ",bir_permit_no"
                    + ",bir_accreditation_no"
                    + ",bir_tin"
                    + ",bir_machine_no"
                    + ",bir_min_no"
                    + ",bir_business_name"
                    + ",bir_vat_percent"
                    + ",bir_receipt_footer"
                    + ",receipt_print_ting_enabled"
                    + ",receipt_printer_show_dialog"
                    + ",kitchen_printing_enable"
                    + ",allow_negative_inventory"
                    + ",is_servcer"
                    + ",developer"
                    + ",developer_address"
                    + ",developer_tin_no"
                    + ",developer_accreditation_no"
                    + ",developer_accreditation_date"
                    + ",developer_contact_no"
                    + ")values("
                    + ":company_name"
                    + ",:company_address"
                    + ",:company_operated_by"
                    + ",:company_slogan"
                    + ",:company_contact_no"
                    + ",:company_fax_no"
                    + ",:company_email_address"
                    + ",:bir_serial_no"
                    + ",:bir_permit_no"
                    + ",:bir_accreditation_no"
                    + ",:bir_tin"
                    + ",:bir_machine_no"
                    + ",:bir_min_no"
                    + ",:bir_business_name"
                    + ",:bir_vat_percent"
                    + ",:bir_receipt_footer"
                    + ",:receipt_print_ting_enabled"
                    + ",:receipt_printer_show_dialog"
                    + ",:kitchen_printing_enable"
                    + ",:allow_negative_inventory"
                    + ",:is_servcer"
                    + ",:developer"
                    + ",:developer_address"
                    + ",:developer_tin_no"
                    + ",:developer_accreditation_no"
                    + ",:developer_accreditation_date"
                    + ",:developer_contact_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("company_name", to_settings.company_name)
                    .setString("company_address", to_settings.company_address)
                    .setString("company_operated_by", to_settings.company_operated_by)
                    .setString("company_slogan", to_settings.company_slogan)
                    .setString("company_contact_no", to_settings.company_contact_no)
                    .setString("company_fax_no", to_settings.company_fax_no)
                    .setString("company_email_address", to_settings.company_email_address)
                    .setString("bir_serial_no", to_settings.bir_serial_no)
                    .setString("bir_permit_no", to_settings.bir_permit_no)
                    .setString("bir_accreditation_no", to_settings.bir_accreditation_no)
                    .setString("bir_tin", to_settings.bir_tin)
                    .setString("bir_machine_no", to_settings.bir_machine_no)
                    .setString("bir_min_no", to_settings.bir_min_no)
                    .setString("bir_business_name", to_settings.bir_business_name)
                    .setString("bir_vat_percent", to_settings.bir_vat_percent)
                    .setString("bir_receipt_footer", to_settings.bir_receipt_footer)
                    .setNumber("receipt_print_ting_enabled", to_settings.receipt_print_ting_enabled)
                    .setNumber("receipt_printer_show_dialog", to_settings.receipt_printer_show_dialog)
                    .setNumber("kitchen_printing_enable", to_settings.kitchen_printing_enable)
                    .setNumber("allow_negative_inventory", to_settings.allow_negative_inventory)
                    .setNumber("is_servcer", to_settings.is_servcer)
                    .setString("developer", to_settings.developer)
                    .setString("developer_address", to_settings.developer_address)
                    .setString("developer_tin_no", to_settings.developer_tin_no)
                    .setString("developer_accreditation_no", to_settings.developer_accreditation_no)
                    .setString("developer_accreditation_date", to_settings.developer_accreditation_date)
                    .setString("developer_contact_no", to_settings.developer_contact_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update settings set "
                    + "company_name= :company_name "
                    + ",company_address= :company_address "
                    + ",company_operated_by= :company_operated_by "
                    + ",company_slogan= :company_slogan "
                    + ",company_contact_no= :company_contact_no "
                    + ",company_fax_no= :company_fax_no "
                    + ",company_email_address= :company_email_address "
                    + ",bir_serial_no= :bir_serial_no "
                    + ",bir_permit_no= :bir_permit_no "
                    + ",bir_accreditation_no= :bir_accreditation_no "
                    + ",bir_tin= :bir_tin "
                    + ",bir_machine_no= :bir_machine_no "
                    + ",bir_min_no= :bir_min_no "
                    + ",bir_business_name= :bir_business_name "
                    + ",bir_vat_percent= :bir_vat_percent "
                    + ",bir_receipt_footer= :bir_receipt_footer "
                    + ",receipt_print_ting_enabled= :receipt_print_ting_enabled "
                    + ",receipt_printer_show_dialog= :receipt_printer_show_dialog "
                    + ",kitchen_printing_enable= :kitchen_printing_enable "
                    + ",allow_negative_inventory= :allow_negative_inventory "
                    + ",is_servcer= :is_servcer "
                    + ",developer= :developer "
                    + ",developer_address= :developer_address "
                    + ",developer_tin_no= :developer_tin_no "
                    + ",developer_accreditation_no= :developer_accreditation_no "
                    + ",developer_accreditation_date= :developer_accreditation_date "
                    + ",developer_contact_no= :developer_contact_no "
                    + " where id='" + to_settings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("company_name", to_settings.company_name)
                    .setString("company_address", to_settings.company_address)
                    .setString("company_operated_by", to_settings.company_operated_by)
                    .setString("company_slogan", to_settings.company_slogan)
                    .setString("company_contact_no", to_settings.company_contact_no)
                    .setString("company_fax_no", to_settings.company_fax_no)
                    .setString("company_email_address", to_settings.company_email_address)
                    .setString("bir_serial_no", to_settings.bir_serial_no)
                    .setString("bir_permit_no", to_settings.bir_permit_no)
                    .setString("bir_accreditation_no", to_settings.bir_accreditation_no)
                    .setString("bir_tin", to_settings.bir_tin)
                    .setString("bir_machine_no", to_settings.bir_machine_no)
                    .setString("bir_min_no", to_settings.bir_min_no)
                    .setString("bir_business_name", to_settings.bir_business_name)
                    .setString("bir_vat_percent", to_settings.bir_vat_percent)
                    .setString("bir_receipt_footer", to_settings.bir_receipt_footer)
                    .setNumber("receipt_print_ting_enabled", to_settings.receipt_print_ting_enabled)
                    .setNumber("receipt_printer_show_dialog", to_settings.receipt_printer_show_dialog)
                    .setNumber("kitchen_printing_enable", to_settings.kitchen_printing_enable)
                    .setNumber("allow_negative_inventory", to_settings.allow_negative_inventory)
                    .setNumber("is_servcer", to_settings.is_servcer)
                    .setString("developer", to_settings.developer)
                    .setString("developer_address", to_settings.developer_address)
                    .setString("developer_tin_no", to_settings.developer_tin_no)
                    .setString("developer_accreditation_no", to_settings.developer_accreditation_no)
                    .setString("developer_accreditation_date", to_settings.developer_accreditation_date)
                    .setString("developer_contact_no", to_settings.developer_contact_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from settings  "
                    + " where id='" + to_settings.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_settings> ret_data(String where) {
        List<to_settings> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",company_name"
                    + ",company_address"
                    + ",company_operated_by"
                    + ",company_slogan"
                    + ",company_contact_no"
                    + ",company_fax_no"
                    + ",company_email_address"
                    + ",bir_serial_no"
                    + ",bir_permit_no"
                    + ",bir_accreditation_no"
                    + ",bir_tin"
                    + ",bir_machine_no"
                    + ",bir_min_no"
                    + ",bir_business_name"
                    + ",bir_vat_percent"
                    + ",bir_receipt_footer"
                    + ",receipt_print_ting_enabled"
                    + ",receipt_printer_show_dialog"
                    + ",kitchen_printing_enable"
                    + ",allow_negative_inventory"
                    + ",is_servcer"
                    + ",developer"
                    + ",developer_address"
                    + ",developer_tin_no"
                    + ",developer_accreditation_no"
                    + ",developer_accreditation_date"
                    + ",developer_contact_no"
                    + " from settings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String company_name = rs.getString(2);
                String company_address = rs.getString(3);
                String company_operated_by = rs.getString(4);
                String company_slogan = rs.getString(5);
                String company_contact_no = rs.getString(6);
                String company_fax_no = rs.getString(7);
                String company_email_address = rs.getString(8);
                String bir_serial_no = rs.getString(9);
                String bir_permit_no = rs.getString(10);
                String bir_accreditation_no = rs.getString(11);
                String bir_tin = rs.getString(12);
                String bir_machine_no = rs.getString(13);
                String bir_min_no = rs.getString(14);
                String bir_business_name = rs.getString(15);
                String bir_vat_percent = rs.getString(16);
                String bir_receipt_footer = rs.getString(17);
                int receipt_print_ting_enabled = rs.getInt(18);
                int receipt_printer_show_dialog = rs.getInt(19);
                int kitchen_printing_enable = rs.getInt(20);
                int allow_negative_inventory = rs.getInt(21);
                int is_servcer = rs.getInt(22);
                String developer = rs.getString(23);
                String developer_address = rs.getString(24);
                String developer_tin_no = rs.getString(25);
                String developer_accreditation_no = rs.getString(26);
                String developer_accreditation_date = rs.getString(27);
                String developer_contact_no = rs.getString(28);

                to_settings to = new to_settings(id, company_name, company_address, company_operated_by, company_slogan, company_contact_no, company_fax_no, company_email_address, bir_serial_no, bir_permit_no, bir_accreditation_no, bir_tin, bir_machine_no, bir_min_no, bir_business_name, bir_vat_percent, bir_receipt_footer, receipt_print_ting_enabled, receipt_printer_show_dialog, kitchen_printing_enable, allow_negative_inventory, is_servcer, developer, developer_address, developer_tin_no, developer_accreditation_no, developer_accreditation_date, developer_contact_no);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
