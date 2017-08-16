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
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author RAZOR Defianz
 */
public class Out_patient_department_receipt_items {

    public static class to_out_patient_department_receipt_items {

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
        public final String particular;
        public final String particular_id;
        public final double amount;
        public final double discount;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_out_patient_department_receipt_items(int id, String opd_no, String clinic, String clinic_id, String doctor, String doctor_id, String patient, String patient_id, String opd_date, String opd_time, String opd_type, String receipt_no, String receipt_date, String particular, String particular_id, double amount, double discount, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
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
            this.particular = particular;
            this.particular_id = particular_id;
            this.amount = amount;
            this.discount = discount;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_out_patient_department_receipt_items to_out_patient_department_receipt_items) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into out_patient_department_receipt_items("
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
                    + ",:particular"
                    + ",:particular_id"
                    + ",:amount"
                    + ",:discount"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("opd_no", to_out_patient_department_receipt_items.opd_no)
                    .setString("clinic", to_out_patient_department_receipt_items.clinic)
                    .setString("clinic_id", to_out_patient_department_receipt_items.clinic_id)
                    .setString("doctor", to_out_patient_department_receipt_items.doctor)
                    .setString("doctor_id", to_out_patient_department_receipt_items.doctor_id)
                    .setString("patient", to_out_patient_department_receipt_items.patient)
                    .setString("patient_id", to_out_patient_department_receipt_items.patient_id)
                    .setString("opd_date", to_out_patient_department_receipt_items.opd_date)
                    .setString("opd_time", to_out_patient_department_receipt_items.opd_time)
                    .setString("opd_type", to_out_patient_department_receipt_items.opd_type)
                    .setString("receipt_no", to_out_patient_department_receipt_items.receipt_no)
                    .setString("receipt_date", to_out_patient_department_receipt_items.receipt_date)
                    .setString("particular", to_out_patient_department_receipt_items.particular)
                    .setString("particular_id", to_out_patient_department_receipt_items.particular_id)
                    .setNumber("amount", to_out_patient_department_receipt_items.amount)
                    .setNumber("discount", to_out_patient_department_receipt_items.discount)
                    .setString("created_by", to_out_patient_department_receipt_items.created_by)
                    .setString("updated_by", to_out_patient_department_receipt_items.updated_by)
                    .setString("created_at", to_out_patient_department_receipt_items.created_at)
                    .setString("updated_at", to_out_patient_department_receipt_items.updated_at)
                    .setNumber("status", to_out_patient_department_receipt_items.status)
                    .setNumber("is_uploaded", to_out_patient_department_receipt_items.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_department_receipt_items.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_out_patient_department_receipt_items to_out_patient_department_receipt_items) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from out_patient_department_receipt_items  "
                    + " where id='" + to_out_patient_department_receipt_items.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_department_receipt_items.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_out_patient_department_receipt_items> ret_data(String where) {
        List<to_out_patient_department_receipt_items> datas = new ArrayList();

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

                to_out_patient_department_receipt_items to = new to_out_patient_department_receipt_items(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, opd_date, opd_time, opd_type, receipt_no, receipt_date, particular, particular_id, amount, discount, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
