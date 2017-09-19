/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.reports;

import cms.util.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RAZOR Defianz
 */
public class Srpt_receipt {

    public final String clinic;
    public final String clinic_id;
    public final String clinic_address;
    public final String clinic_contact_no;
    public final String doctor;
    public final String patient;
    public final String opd_no;
    public final String opd_date;
    public final String opd_time;
    public final String opd_type;
    public final String receipt_no;
    public final String receipt_date;
    public final String reference_no;
    public final double amount_due;
    public final double discount_amount;
    public final double ne_due;
    public final List<field> fields;

    public Srpt_receipt(String clinic, String clinic_id, String clinic_address, String clinic_contact_no, String doctor, String patient, String opd_no, String opd_date, String opd_time, String opd_type, String receipt_no, String receipt_date, String reference_no, double amount_due, double discount_amount, double ne_due
    ) {
        this.clinic = clinic;
        this.clinic_id = clinic_id;
        this.clinic_address = clinic_address;
        this.clinic_contact_no = clinic_contact_no;
        this.doctor = doctor;
        this.patient = patient;
        this.opd_no = opd_no;
        this.opd_date = opd_date;
        this.opd_time = opd_time;
        this.opd_type = opd_type;
        this.receipt_no = receipt_no;
        this.receipt_date = receipt_date;
        this.reference_no = reference_no;
        this.amount_due = amount_due;
        this.discount_amount = discount_amount;
        this.ne_due = ne_due;
        this.fields = new ArrayList();
    }

    public static class field {

        String particular;
        double amount;
        double discount;
        double total;

        public field() {
        }

        public field(String particular, double amount, double discount, double total) {
            this.particular = particular;
            this.amount = amount;
            this.discount = discount;
            this.total = total;
        }

        public String getParticular() {
            return particular;
        }

        public void setParticular(String particular) {
            this.particular = particular;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

    }

    public static List<field> ret_data(String where) {
        List<field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",opd_no"
                    + ",clinic"
                    + ",clinic_id"
                    + ",doctor"
                    + ",doctor_id"
                    + ",patient"
                    + ",patient_id"
                    + ",opd_date"
                    + ",opd_time"
                    + ",opd_type"
                    + ",receipt_no"
                    + ",receipt_date"
                    + ",particular"
                    + ",particular_id"
                    + ",amount"
                    + ",discount"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ",reference_no"
                    + " from out_patient_department_receipt_items"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String opd_no = rs.getString(2);
                String clinic = rs.getString(3);
                String clinic_id = rs.getString(4);
                String doctor = rs.getString(5);
                String doctor_id = rs.getString(6);
                String patient = rs.getString(7);
                String patient_id = rs.getString(8);
                String opd_date = rs.getString(9);
                String opd_time = rs.getString(10);
                String opd_type = rs.getString(11);
                String receipt_no = rs.getString(12);
                String receipt_date = rs.getString(13);
                String particular = rs.getString(14);
                String particular_id = rs.getString(15);
                double amount = rs.getDouble(16);
                double discount = rs.getDouble(17);
                String created_by = rs.getString(18);
                String updated_by = rs.getString(19);
                String created_at = rs.getString(20);
                String updated_at = rs.getString(21);
                int status = rs.getInt(22);
                int is_uploaded = rs.getInt(23);
                String reference_no = rs.getString(24);

                double total = amount - discount;
                field f=new field(particular, amount, discount, total);
                datas.add(f);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
