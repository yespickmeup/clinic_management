/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.appointments;

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
public class Appointments {

    public static class to_appointments {

        public final int id;
        public final String clinic;
        public final String clinic_id;
        public final String doctor;
        public final String doctor_id;
        public final String patient_id;
        public final String patient_fname;
        public final String patient_mi;
        public final String patient_lname;
        public final String patient_sname;
        public final String patient_bday;
        public final String patient_gender;
        public final String patient_blood_type;
        public final String appointment_date;
        public final String appointment_time;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_appointments(int id, String clinic, String clinic_id, String doctor, String doctor_id, String patient_id, String patient_fname, String patient_mi, String patient_lname, String patient_sname, String patient_bday, String patient_gender, String patient_blood_type, String appointment_date, String appointment_time, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.clinic = clinic;
            this.clinic_id = clinic_id;
            this.doctor = doctor;
            this.doctor_id = doctor_id;
            this.patient_id = patient_id;
            this.patient_fname = patient_fname;
            this.patient_mi = patient_mi;
            this.patient_lname = patient_lname;
            this.patient_sname = patient_sname;
            this.patient_bday = patient_bday;
            this.patient_gender = patient_gender;
            this.patient_blood_type = patient_blood_type;
            this.appointment_date = appointment_date;
            this.appointment_time = appointment_time;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_appointments to_appointments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into appointments("
                    + "clinic"
                    + ",clinic_id"
                    + ",doctor"
                    + ",doctor_id"
                    + ",patient_id"
                    + ",patient_fname"
                    + ",patient_mi"
                    + ",patient_lname"
                    + ",patient_sname"
                    + ",patient_bday"
                    + ",patient_gender"
                    + ",patient_blood_type"
                    + ",appointment_date"
                    + ",appointment_time"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":clinic"
                    + ",:clinic_id"
                    + ",:doctor"
                    + ",:doctor_id"
                    + ",:patient_id"
                    + ",:patient_fname"
                    + ",:patient_mi"
                    + ",:patient_lname"
                    + ",:patient_sname"
                    + ",:patient_bday"
                    + ",:patient_gender"
                    + ",:patient_blood_type"
                    + ",:appointment_date"
                    + ",:appointment_time"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("clinic", to_appointments.clinic)
                    .setString("clinic_id", to_appointments.clinic_id)
                    .setString("doctor", to_appointments.doctor)
                    .setString("doctor_id", to_appointments.doctor_id)
                    .setString("patient_id", to_appointments.patient_id)
                    .setString("patient_fname", to_appointments.patient_fname)
                    .setString("patient_mi", to_appointments.patient_mi)
                    .setString("patient_lname", to_appointments.patient_lname)
                    .setString("patient_sname", to_appointments.patient_sname)
                    .setString("patient_bday", to_appointments.patient_bday)
                    .setString("patient_gender", to_appointments.patient_gender)
                    .setString("patient_blood_type", to_appointments.patient_blood_type)
                    .setString("appointment_date", to_appointments.appointment_date)
                    .setString("appointment_time", to_appointments.appointment_time)
                    .setString("created_by", to_appointments.created_by)
                    .setString("updated_by", to_appointments.updated_by)
                    .setString("created_at", to_appointments.created_at)
                    .setString("updated_at", to_appointments.updated_at)
                    .setNumber("status", to_appointments.status)
                    .setNumber("is_uploaded", to_appointments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Appointments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_appointments to_appointments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update appointments set "
                    + "clinic= :clinic "
                    + ",clinic_id= :clinic_id "
                    + ",doctor= :doctor "
                    + ",doctor_id= :doctor_id "
                    + ",patient_id= :patient_id "
                    + ",patient_fname= :patient_fname "
                    + ",patient_mi= :patient_mi "
                    + ",patient_lname= :patient_lname "
                    + ",patient_sname= :patient_sname "
                    + ",patient_bday= :patient_bday "
                    + ",patient_gender= :patient_gender "
                    + ",patient_blood_type= :patient_blood_type "
                    + ",appointment_date= :appointment_date "
                    + ",appointment_time= :appointment_time "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_appointments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("clinic", to_appointments.clinic)
                    .setString("clinic_id", to_appointments.clinic_id)
                    .setString("doctor", to_appointments.doctor)
                    .setString("doctor_id", to_appointments.doctor_id)
                    .setString("patient_id", to_appointments.patient_id)
                    .setString("patient_fname", to_appointments.patient_fname)
                    .setString("patient_mi", to_appointments.patient_mi)
                    .setString("patient_lname", to_appointments.patient_lname)
                    .setString("patient_sname", to_appointments.patient_sname)
                    .setString("patient_bday", to_appointments.patient_bday)
                    .setString("patient_gender", to_appointments.patient_gender)
                    .setString("patient_blood_type", to_appointments.patient_blood_type)
                    .setString("appointment_date", to_appointments.appointment_date)
                    .setString("appointment_time", to_appointments.appointment_time)
                    .setString("created_by", to_appointments.created_by)
                    .setString("updated_by", to_appointments.updated_by)
                    .setString("created_at", to_appointments.created_at)
                    .setString("updated_at", to_appointments.updated_at)
                    .setNumber("status", to_appointments.status)
                    .setNumber("is_uploaded", to_appointments.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Appointments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(int id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from appointments  "
                    + " where id='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Appointments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_appointments> ret_data(String where) {
        List<to_appointments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",clinic"
                    + ",clinic_id"
                    + ",doctor"
                    + ",doctor_id"
                    + ",patient_id"
                    + ",patient_fname"
                    + ",patient_mi"
                    + ",patient_lname"
                    + ",patient_sname"
                    + ",patient_bday"
                    + ",patient_gender"
                    + ",patient_blood_type"
                    + ",appointment_date"
                    + ",appointment_time"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from appointments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String clinic = rs.getString(2);
                String clinic_id = rs.getString(3);
                String doctor = rs.getString(4);
                String doctor_id = rs.getString(5);
                String patient_id = rs.getString(6);
                String patient_fname = rs.getString(7);
                String patient_mi = rs.getString(8);
                String patient_lname = rs.getString(9);
                String patient_sname = rs.getString(10);
                String patient_bday = rs.getString(11);
                String patient_gender = rs.getString(12);
                String patient_blood_type = rs.getString(13);
                String appointment_date = rs.getString(14);
                String appointment_time = rs.getString(15);
                String created_by = rs.getString(16);
                String updated_by = rs.getString(17);
                String created_at = rs.getString(18);
                String updated_at = rs.getString(19);
                int status = rs.getInt(20);
                int is_uploaded = rs.getInt(21);

                to_appointments to = new to_appointments(id, clinic, clinic_id, doctor, doctor_id, patient_id, patient_fname, patient_mi, patient_lname, patient_sname, patient_bday, patient_gender, patient_blood_type, appointment_date, appointment_time, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
