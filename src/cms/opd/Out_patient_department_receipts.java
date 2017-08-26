/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.opd;

import cms.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Out_patient_department_receipts {

    public static class to_out_patient_department_receipts {

        public final int id;
        public final String opd_no;
        public final String clinic;
        public final String clinic_id;
        public final String doctor;
        public final String doctor_id;
        public final String patient;
        public final String patient_id;
        public final String opd_date;
        public final String opd_time;
        public final String opd_type;
        public final String receipt_no;
        public final String receipt_date;
        public final String reference_no;
        public final double amount_due;
        public final double discount;
        public final double cash;
        public final String check_bank;
        public final String check_no;
        public final String check_holder;
        public final double check_amount;
        public final String check_date;
        public final String credit_card_type;
        public final String credit_card_holder;
        public final String credit_card_app_code;
        public final double credit_card_rate;
        public final double credit_card_amount;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_out_patient_department_receipts(int id, String opd_no, String clinic, String clinic_id, String doctor, String doctor_id, String patient, String patient_id, String opd_date, String opd_time, String opd_type, String receipt_no, String receipt_date,String reference_no, double amount_due, double discount, double cash, String check_bank, String check_no, String check_holder, double check_amount, String check_date, String credit_card_type, String credit_card_holder, String credit_card_app_code, double credit_card_rate, double credit_card_amount, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.opd_no = opd_no;
            this.clinic = clinic;
            this.clinic_id = clinic_id;
            this.doctor = doctor;
            this.doctor_id = doctor_id;
            this.patient = patient;
            this.patient_id = patient_id;
            this.opd_date = opd_date;
            this.opd_time = opd_time;
            this.opd_type = opd_type;
            this.receipt_no = receipt_no;
            this.receipt_date = receipt_date;
            this.reference_no=reference_no;
            this.amount_due = amount_due;
            this.discount = discount;
            this.cash = cash;
            this.check_bank = check_bank;
            this.check_no = check_no;
            this.check_holder = check_holder;
            this.check_amount = check_amount;
            this.check_date = check_date;
            this.credit_card_type = credit_card_type;
            this.credit_card_holder = credit_card_holder;
            this.credit_card_app_code = credit_card_app_code;
            this.credit_card_rate = credit_card_rate;
            this.credit_card_amount = credit_card_amount;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_out_patient_department_receipts to_out_patient_department_receipts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into out_patient_department_receipts("
                    + "opd_no"
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
                    + ")values("
                    + ":opd_no"
                    + ",:clinic"
                    + ",:clinic_id"
                    + ",:doctor"
                    + ",:doctor_id"
                    + ",:patient"
                    + ",:patient_id"
                    + ",:opd_date"
                    + ",:opd_time"
                    + ",:opd_type"
                    + ",:receipt_no"
                    + ",:receipt_date"
                    + ",:reference_no"
                    + ",:amount_due"
                    + ",:discount"
                    + ",:cash"
                    + ",:check_bank"
                    + ",:check_no"
                    + ",:check_holder"
                    + ",:check_amount"
                    + ",:check_date"
                    + ",:credit_card_type"
                    + ",:credit_card_holder"
                    + ",:credit_card_app_code"
                    + ",:credit_card_rate"
                    + ",:credit_card_amount"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("opd_no", to_out_patient_department_receipts.opd_no)
                    .setString("clinic", to_out_patient_department_receipts.clinic)
                    .setString("clinic_id", to_out_patient_department_receipts.clinic_id)
                    .setString("doctor", to_out_patient_department_receipts.doctor)
                    .setString("doctor_id", to_out_patient_department_receipts.doctor_id)
                    .setString("patient", to_out_patient_department_receipts.patient)
                    .setString("patient_id", to_out_patient_department_receipts.patient_id)
                    .setString("opd_date", to_out_patient_department_receipts.opd_date)
                    .setString("opd_time", to_out_patient_department_receipts.opd_time)
                    .setString("opd_type", to_out_patient_department_receipts.opd_type)
                    .setString("receipt_no", to_out_patient_department_receipts.receipt_no)
                    .setString("receipt_date", to_out_patient_department_receipts.receipt_date)
                    .setString("reference_no",to_out_patient_department_receipts.reference_no)
                    .setNumber("amount_due", to_out_patient_department_receipts.amount_due)
                    .setNumber("discount", to_out_patient_department_receipts.discount)
                    .setNumber("cash", to_out_patient_department_receipts.cash)
                    .setString("check_bank", to_out_patient_department_receipts.check_bank)
                    .setString("check_no", to_out_patient_department_receipts.check_no)
                    .setString("check_holder", to_out_patient_department_receipts.check_holder)
                    .setNumber("check_amount", to_out_patient_department_receipts.check_amount)
                    .setString("check_date", to_out_patient_department_receipts.check_date)
                    .setString("credit_card_type", to_out_patient_department_receipts.credit_card_type)
                    .setString("credit_card_holder", to_out_patient_department_receipts.credit_card_holder)
                    .setString("credit_card_app_code", to_out_patient_department_receipts.credit_card_app_code)
                    .setNumber("credit_card_rate", to_out_patient_department_receipts.credit_card_rate)
                    .setNumber("credit_card_amount", to_out_patient_department_receipts.credit_card_amount)
                    .setString("created_by", to_out_patient_department_receipts.created_by)
                    .setString("updated_by", to_out_patient_department_receipts.updated_by)
                    .setString("created_at", to_out_patient_department_receipts.created_at)
                    .setString("updated_at", to_out_patient_department_receipts.updated_at)
                    .setNumber("status", to_out_patient_department_receipts.status)
                    .setNumber("is_uploaded", to_out_patient_department_receipts.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_department_receipts.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_out_patient_department_receipts to_out_patient_department_receipts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update out_patient_department_receipts set "
                    + "opd_no= :opd_no "
                    + ",clinic= :clinic "
                    + ",clinic_id= :clinic_id "
                    + ",doctor= :doctor "
                    + ",doctor_id= :doctor_id "
                    + ",patient= :patient "
                    + ",patient_id= :patient_id "
                    + ",opd_date= :opd_date "
                    + ",opd_time= :opd_time "
                    + ",opd_type= :opd_type "
                    + ",receipt_no= :receipt_no "
                    + ",receipt_date= :receipt_date "
                    + ",reference_no= :reference_no"
                    + ",amount_due= :amount_due "
                    + ",discount= :discount "
                    + ",cash= :cash "
                    + ",check_bank= :check_bank "
                    + ",check_no= :check_no "
                    + ",check_holder= :check_holder "
                    + ",check_amount= :check_amount "
                    + ",check_date= :check_date "
                    + ",credit_card_type= :credit_card_type "
                    + ",credit_card_holder= :credit_card_holder "
                    + ",credit_card_app_code= :credit_card_app_code "
                    + ",credit_card_rate= :credit_card_rate "
                    + ",credit_card_amount= :credit_card_amount "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_out_patient_department_receipts.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("opd_no", to_out_patient_department_receipts.opd_no)
                    .setString("clinic", to_out_patient_department_receipts.clinic)
                    .setString("clinic_id", to_out_patient_department_receipts.clinic_id)
                    .setString("doctor", to_out_patient_department_receipts.doctor)
                    .setString("doctor_id", to_out_patient_department_receipts.doctor_id)
                    .setString("patient", to_out_patient_department_receipts.patient)
                    .setString("patient_id", to_out_patient_department_receipts.patient_id)
                    .setString("opd_date", to_out_patient_department_receipts.opd_date)
                    .setString("opd_time", to_out_patient_department_receipts.opd_time)
                    .setString("opd_type", to_out_patient_department_receipts.opd_type)
                    .setString("receipt_no", to_out_patient_department_receipts.receipt_no)
                    .setString("receipt_date", to_out_patient_department_receipts.receipt_date)
                    .setString("reference_no",to_out_patient_department_receipts.reference_no)
                    .setNumber("amount_due", to_out_patient_department_receipts.amount_due)
                    .setNumber("discount", to_out_patient_department_receipts.discount)
                    .setNumber("cash", to_out_patient_department_receipts.cash)
                    .setString("check_bank", to_out_patient_department_receipts.check_bank)
                    .setString("check_no", to_out_patient_department_receipts.check_no)
                    .setString("check_holder", to_out_patient_department_receipts.check_holder)
                    .setNumber("check_amount", to_out_patient_department_receipts.check_amount)
                    .setString("check_date", to_out_patient_department_receipts.check_date)
                    .setString("credit_card_type", to_out_patient_department_receipts.credit_card_type)
                    .setString("credit_card_holder", to_out_patient_department_receipts.credit_card_holder)
                    .setString("credit_card_app_code", to_out_patient_department_receipts.credit_card_app_code)
                    .setNumber("credit_card_rate", to_out_patient_department_receipts.credit_card_rate)
                    .setNumber("credit_card_amount", to_out_patient_department_receipts.credit_card_amount)
                    .setString("created_by", to_out_patient_department_receipts.created_by)
                    .setString("updated_by", to_out_patient_department_receipts.updated_by)
                    .setString("created_at", to_out_patient_department_receipts.created_at)
                    .setString("updated_at", to_out_patient_department_receipts.updated_at)
                    .setNumber("status", to_out_patient_department_receipts.status)
                    .setNumber("is_uploaded", to_out_patient_department_receipts.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_department_receipts.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_out_patient_department_receipts to_out_patient_department_receipts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from out_patient_department_receipts  "
                    + " where id='" + to_out_patient_department_receipts.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_department_receipts.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_out_patient_department_receipts> ret_data(String where) {
        List<to_out_patient_department_receipts> datas = new ArrayList();

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
                    + ",reference_no"
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
                double amount_due = rs.getDouble(14);
                double discount = rs.getDouble(15);
                double cash = rs.getDouble(16);
                String check_bank = rs.getString(17);
                String check_no = rs.getString(18);
                String check_holder = rs.getString(19);
                double check_amount = rs.getDouble(20);
                String check_date = rs.getString(21);
                String credit_card_type = rs.getString(22);
                String credit_card_holder = rs.getString(23);
                String credit_card_app_code = rs.getString(24);
                double credit_card_rate = rs.getDouble(25);
                double credit_card_amount = rs.getDouble(26);
                String created_by = rs.getString(27);
                String updated_by = rs.getString(28);
                String created_at = rs.getString(29);
                String updated_at = rs.getString(30);
                int status = rs.getInt(31);
                int is_uploaded = rs.getInt(32);
                String reference_no=rs.getString(33);
                to_out_patient_department_receipts to = new to_out_patient_department_receipts(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, opd_date, opd_time, opd_type, receipt_no, receipt_date,reference_no, amount_due, discount, cash, check_bank, check_no, check_holder, check_amount, check_date, credit_card_type, credit_card_holder, credit_card_app_code, credit_card_rate, credit_card_amount, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String increment_id(String clinic_id) {
        String id = "000000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from out_patient_department_receipts where clinic_id='"+clinic_id+"' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select receipt_no from out_patient_department_receipts where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "000000000000";
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
