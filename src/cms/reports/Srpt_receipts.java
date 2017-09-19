/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.reports;

import cms.util.DateType;
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
public class Srpt_receipts {

    public final String clinic_name;
    public final String clinic_address;
    public final String clinic_contact_no;
    public final List<field> fields;
    public final String date;
    public Srpt_receipts(String clinic_name, String clinic_address, String clinic_contact_no,String date) {
        this.clinic_name = clinic_name;
        this.clinic_address = clinic_address;
        this.clinic_contact_no = clinic_contact_no;
        this.fields = new ArrayList();
        this.date=date;
    }

    public static class field {
        int id;
        String clinic_id;
        String clinic;
        String doctor;
        String patient;
        String opd_no;
        String opd_date;
        String opd_time;
        String opd_type;
        String receipt_no;
        String receipt_date;
        String reference_no;
        String status;
        double amount_due;
        double discount_amount;
        double net_due;

        public field() {
        }

        public field(int id ,String clinic_id,String clinic, String doctor, String patient, String opd_no, String opd_date, String opd_time, String opd_type, String receipt_no, String receipt_date, String reference_no, String status, double amount_due, double discount_amount, double net_due) {
            this.id=id;
            this.clinic_id=clinic_id;
            this.clinic = clinic;
            this.doctor = doctor;
            this.patient = patient;
            this.opd_no = opd_no;
            this.opd_date = opd_date;
            this.opd_time = opd_time;
            this.opd_type = opd_type;
            this.receipt_no = receipt_no;
            this.receipt_date = receipt_date;
            this.reference_no = reference_no;
            this.status = status;
            this.amount_due = amount_due;
            this.discount_amount = discount_amount;
            this.net_due = net_due;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getClinic_id() {
            return clinic_id;
        }

        public void setClinic_id(String clinic_id) {
            this.clinic_id = clinic_id;
        }
        

        public String getClinic() {
            return clinic;
        }

        public void setClinic(String clinic) {
            this.clinic = clinic;
        }

        public String getDoctor() {
            return doctor;
        }

        public void setDoctor(String doctor) {
            this.doctor = doctor;
        }

        public String getPatient() {
            return patient;
        }

        public void setPatient(String patient) {
            this.patient = patient;
        }

        public String getOpd_no() {
            return opd_no;
        }

        public void setOpd_no(String opd_no) {
            this.opd_no = opd_no;
        }

        public String getOpd_date() {
            return opd_date;
        }

        public void setOpd_date(String opd_date) {
            this.opd_date = opd_date;
        }

        public String getOpd_time() {
            return opd_time;
        }

        public void setOpd_time(String opd_time) {
            this.opd_time = opd_time;
        }

        public String getOpd_type() {
            return opd_type;
        }

        public void setOpd_type(String opd_type) {
            this.opd_type = opd_type;
        }

        public String getReceipt_no() {
            return receipt_no;
        }

        public void setReceipt_no(String receipt_no) {
            this.receipt_no = receipt_no;
        }

        public String getReceipt_date() {
            return receipt_date;
        }

        public void setReceipt_date(String receipt_date) {
            this.receipt_date = receipt_date;
        }

        public String getReference_no() {
            return reference_no;
        }

        public void setReference_no(String reference_no) {
            this.reference_no = reference_no;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public double getAmount_due() {
            return amount_due;
        }

        public void setAmount_due(double amount_due) {
            this.amount_due = amount_due;
        }

        public double getDiscount_amount() {
            return discount_amount;
        }

        public void setDiscount_amount(double discount_amount) {
            this.discount_amount = discount_amount;
        }

        public double getNet_due() {
            return net_due;
        }

        public void setNet_due(double net_due) {
            this.net_due = net_due;
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
                    + ",reference_no"
                    + ",amount_due"
                    + ",discount"
                    + ",cash"
                    + ",check_bank"
                    + ",check_no"
                    + ",check_holder"
                    + ",check_amount"
                    + ",check_date"
                    + ",credit_card_type"
                    + ",credit_card_holder"
                    + ",credit_card_app_code"
                    + ",credit_card_rate"
                    + ",credit_card_amount"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from out_patient_department_receipts"
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
                String reference_no = rs.getString(14);
                double amount_due = rs.getDouble(15);
                double discount = rs.getDouble(16);
                double cash = rs.getDouble(17);
                String check_bank = rs.getString(18);
                String check_no = rs.getString(19);
                String check_holder = rs.getString(20);
                double check_amount = rs.getDouble(21);
                String check_date = rs.getString(22);
                String credit_card_type = rs.getString(23);
                String credit_card_holder = rs.getString(24);
                String credit_card_app_code = rs.getString(25);
                double credit_card_rate = rs.getDouble(26);
                double credit_card_amount = rs.getDouble(27);
                String created_by = rs.getString(28);
                String updated_by = rs.getString(29);
                String created_at = rs.getString(30);
                String updated_at = rs.getString(31);
                int status = rs.getInt(32);
                int is_uploaded = rs.getInt(33);

                String status1 = "Paid";
                if (status == 0) {
                    status1 = "Unpaid";
                }
                if (status == 2) {
                    status1 = "Void";
                }
                receipt_date=DateType.convert_slash_datetime2(receipt_date);
                double discount_amount = discount;
                double net_due = amount_due - discount_amount;
                field f = new field(id,clinic_id,clinic, doctor, patient, opd_no, opd_date, opd_time, opd_type, receipt_no, receipt_date, reference_no, status1, amount_due, discount_amount, net_due);
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
