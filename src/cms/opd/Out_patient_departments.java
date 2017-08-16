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
 * @author Guinness
 */
public class Out_patient_departments {

    public static class to_out_patient_departments {

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
        public final double patient_height;
        public final double patient_weight;
        public final double patient_bmi;
        public final String patient_pressure;
        public final double patient_pulse;
        public final double patient_temperature;
        public final double patient_respiratory;
        public final double patient_waist;
        public final double patient_hip;
        public final double patient_spo2;
        public final String complaints;
        public final String past_personal_family_history;
        public final String investigation;
        public final String findings;
        public final String provisional_diagnosis;
        public final String remarks;
        public final int followup_days;
        public final String followup_date;
        public final String referred_to;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_out_patient_departments(int id, String opd_no, String clinic, String clinic_id, String doctor, String doctor_id, String patient, String patient_id, String opd_date, String opd_time, String opd_type, double patient_height, double patient_weight, double patient_bmi, String patient_pressure, double patient_pulse, double patient_temperature, double patient_respiratory, double patient_waist, double patient_hip, double patient_spo2, String complaints, String past_personal_family_history, String investigation, String findings, String provisional_diagnosis, String remarks, int followup_days, String followup_date, String referred_to, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
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
            this.patient_height = patient_height;
            this.patient_weight = patient_weight;
            this.patient_bmi = patient_bmi;
            this.patient_pressure = patient_pressure;
            this.patient_pulse = patient_pulse;
            this.patient_temperature = patient_temperature;
            this.patient_respiratory = patient_respiratory;
            this.patient_waist = patient_waist;
            this.patient_hip = patient_hip;
            this.patient_spo2 = patient_spo2;
            this.complaints = complaints;
            this.past_personal_family_history = past_personal_family_history;
            this.investigation = investigation;
            this.findings = findings;
            this.provisional_diagnosis = provisional_diagnosis;
            this.remarks = remarks;
            this.followup_days = followup_days;
            this.followup_date = followup_date;
            this.referred_to = referred_to;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_out_patient_departments to_out_patient_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into out_patient_departments("
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
                    + ",patient_height"
                    + ",patient_weight"
                    + ",patient_bmi"
                    + ",patient_pressure"
                    + ",patient_pulse"
                    + ",patient_temperature"
                    + ",patient_respiratory"
                    + ",patient_waist"
                    + ",patient_hip"
                    + ",patient_spo2"
                    + ",complaints"
                    + ",past_personal_family_history"
                    + ",investigation"
                    + ",findings"
                    + ",provisional_diagnosis"
                    + ",remarks"
                    + ",followup_days"
                    + ",followup_date"
                    + ",referred_to"
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
                    + ",:patient_height"
                    + ",:patient_weight"
                    + ",:patient_bmi"
                    + ",:patient_pressure"
                    + ",:patient_pulse"
                    + ",:patient_temperature"
                    + ",:patient_respiratory"
                    + ",:patient_waist"
                    + ",:patient_hip"
                    + ",:patient_spo2"
                    + ",:complaints"
                    + ",:past_personal_family_history"
                    + ",:investigation"
                    + ",:findings"
                    + ",:provisional_diagnosis"
                    + ",:remarks"
                    + ",:followup_days"
                    + ",:followup_date"
                    + ",:referred_to"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("opd_no", to_out_patient_departments.opd_no)
                    .setString("clinic", to_out_patient_departments.clinic)
                    .setString("clinic_id", to_out_patient_departments.clinic_id)
                    .setString("doctor", to_out_patient_departments.doctor)
                    .setString("doctor_id", to_out_patient_departments.doctor_id)
                    .setString("patient", to_out_patient_departments.patient)
                    .setString("patient_id", to_out_patient_departments.patient_id)
                    .setString("opd_date", to_out_patient_departments.opd_date)
                    .setString("opd_time", to_out_patient_departments.opd_time)
                    .setString("opd_type", to_out_patient_departments.opd_type)
                    .setNumber("patient_height", to_out_patient_departments.patient_height)
                    .setNumber("patient_weight", to_out_patient_departments.patient_weight)
                    .setNumber("patient_bmi", to_out_patient_departments.patient_bmi)
                    .setString("patient_pressure", to_out_patient_departments.patient_pressure)
                    .setNumber("patient_pulse", to_out_patient_departments.patient_pulse)
                    .setNumber("patient_temperature", to_out_patient_departments.patient_temperature)
                    .setNumber("patient_respiratory", to_out_patient_departments.patient_respiratory)
                    .setNumber("patient_waist", to_out_patient_departments.patient_waist)
                    .setNumber("patient_hip", to_out_patient_departments.patient_hip)
                    .setNumber("patient_spo2", to_out_patient_departments.patient_spo2)
                    .setString("complaints", to_out_patient_departments.complaints)
                    .setString("past_personal_family_history", to_out_patient_departments.past_personal_family_history)
                    .setString("investigation", to_out_patient_departments.investigation)
                    .setString("findings", to_out_patient_departments.findings)
                    .setString("provisional_diagnosis", to_out_patient_departments.provisional_diagnosis)
                    .setString("remarks", to_out_patient_departments.remarks)
                    .setNumber("followup_days", to_out_patient_departments.followup_days)
                    .setString("followup_date", to_out_patient_departments.followup_date)
                    .setString("referred_to", to_out_patient_departments.referred_to)
                    .setString("created_by", to_out_patient_departments.created_by)
                    .setString("updated_by", to_out_patient_departments.updated_by)
                    .setString("created_at", to_out_patient_departments.created_at)
                    .setString("updated_at", to_out_patient_departments.updated_at)
                    .setNumber("status", to_out_patient_departments.status)
                    .setNumber("is_uploaded", to_out_patient_departments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_departments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_out_patient_departments to_out_patient_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update out_patient_departments set "
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
                    + ",patient_height= :patient_height "
                    + ",patient_weight= :patient_weight "
                    + ",patient_bmi= :patient_bmi "
                    + ",patient_pressure= :patient_pressure "
                    + ",patient_pulse= :patient_pulse "
                    + ",patient_temperature= :patient_temperature "
                    + ",patient_respiratory= :patient_respiratory "
                    + ",patient_waist= :patient_waist "
                    + ",patient_hip= :patient_hip "
                    + ",patient_spo2= :patient_spo2 "
                    + ",complaints= :complaints "
                    + ",past_personal_family_history= :past_personal_family_history "
                    + ",investigation= :investigation "
                    + ",findings= :findings "
                    + ",provisional_diagnosis= :provisional_diagnosis "
                    + ",remarks= :remarks "
                    + ",followup_days= :followup_days "
                    + ",followup_date= :followup_date "
                    + ",referred_to= :referred_to "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_out_patient_departments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("opd_no", to_out_patient_departments.opd_no)
                    .setString("clinic", to_out_patient_departments.clinic)
                    .setString("clinic_id", to_out_patient_departments.clinic_id)
                    .setString("doctor", to_out_patient_departments.doctor)
                    .setString("doctor_id", to_out_patient_departments.doctor_id)
                    .setString("patient", to_out_patient_departments.patient)
                    .setString("patient_id", to_out_patient_departments.patient_id)
                    .setString("opd_date", to_out_patient_departments.opd_date)
                    .setString("opd_time", to_out_patient_departments.opd_time)
                    .setString("opd_type", to_out_patient_departments.opd_type)
                    .setNumber("patient_height", to_out_patient_departments.patient_height)
                    .setNumber("patient_weight", to_out_patient_departments.patient_weight)
                    .setNumber("patient_bmi", to_out_patient_departments.patient_bmi)
                    .setString("patient_pressure", to_out_patient_departments.patient_pressure)
                    .setNumber("patient_pulse", to_out_patient_departments.patient_pulse)
                    .setNumber("patient_temperature", to_out_patient_departments.patient_temperature)
                    .setNumber("patient_respiratory", to_out_patient_departments.patient_respiratory)
                    .setNumber("patient_waist", to_out_patient_departments.patient_waist)
                    .setNumber("patient_hip", to_out_patient_departments.patient_hip)
                    .setNumber("patient_spo2", to_out_patient_departments.patient_spo2)
                    .setString("complaints", to_out_patient_departments.complaints)
                    .setString("past_personal_family_history", to_out_patient_departments.past_personal_family_history)
                    .setString("investigation", to_out_patient_departments.investigation)
                    .setString("findings", to_out_patient_departments.findings)
                    .setString("provisional_diagnosis", to_out_patient_departments.provisional_diagnosis)
                    .setString("remarks", to_out_patient_departments.remarks)
                    .setNumber("followup_days", to_out_patient_departments.followup_days)
                    .setString("followup_date", to_out_patient_departments.followup_date)
                    .setString("referred_to", to_out_patient_departments.referred_to)
                    .setString("created_by", to_out_patient_departments.created_by)
                    .setString("updated_by", to_out_patient_departments.updated_by)
                    .setString("created_at", to_out_patient_departments.created_at)
                    .setString("updated_at", to_out_patient_departments.updated_at)
                    .setNumber("status", to_out_patient_departments.status)
                    .setNumber("is_uploaded", to_out_patient_departments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_departments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_out_patient_departments to_out_patient_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from out_patient_departments  "
                    + " where id='" + to_out_patient_departments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_departments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_out_patient_departments> ret_data(String where) {
        List<to_out_patient_departments> datas = new ArrayList();

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
                    + ",patient_height"
                    + ",patient_weight"
                    + ",patient_bmi"
                    + ",patient_pressure"
                    + ",patient_pulse"
                    + ",patient_temperature"
                    + ",patient_respiratory"
                    + ",patient_waist"
                    + ",patient_hip"
                    + ",patient_spo2"
                    + ",complaints"
                    + ",past_personal_family_history"
                    + ",investigation"
                    + ",findings"
                    + ",provisional_diagnosis"
                    + ",remarks"
                    + ",followup_days"
                    + ",followup_date"
                    + ",referred_to"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from out_patient_departments"
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
                double patient_height = rs.getDouble(12);
                double patient_weight = rs.getDouble(13);
                double patient_bmi = rs.getDouble(14);
                String patient_pressure = rs.getString(15);
                double patient_pulse = rs.getDouble(16);
                double patient_temperature = rs.getDouble(17);
                double patient_respiratory = rs.getDouble(18);
                double patient_waist = rs.getDouble(19);
                double patient_hip = rs.getDouble(20);
                double patient_spo2 = rs.getDouble(21);
                String complaints = rs.getString(22);
                String past_personal_family_history = rs.getString(23);
                String investigation = rs.getString(24);
                String findings = rs.getString(25);
                String provisional_diagnosis = rs.getString(26);
                String remarks = rs.getString(27);
                int followup_days = rs.getInt(28);
                String followup_date = rs.getString(29);
                String referred_to = rs.getString(30);
                String created_by = rs.getString(31);
                String updated_by = rs.getString(32);
                String created_at = rs.getString(33);
                String updated_at = rs.getString(34);
                int status = rs.getInt(35);
                int is_uploaded = rs.getInt(36);

                to_out_patient_departments to = new to_out_patient_departments(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, opd_date, opd_time, opd_type, patient_height, patient_weight, patient_bmi, patient_pressure, patient_pulse, patient_temperature, patient_respiratory, patient_waist, patient_hip, patient_spo2, complaints, past_personal_family_history, investigation, findings, provisional_diagnosis, remarks, followup_days, followup_date, referred_to, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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