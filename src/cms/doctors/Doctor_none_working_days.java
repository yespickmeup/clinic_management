/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.doctors;

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
public class Doctor_none_working_days {

    public static class to_doctor_none_working_days {

        public final int id;
        public final String date;
        public final int am;
        public final int pm;
        public final String time_interval;
        public final String remarks;
        public final String clinic;
        public final String clinic_id;
        public final String doctor;
        public final String doctor_id;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_doctor_none_working_days(int id, String date, int am, int pm, String time_interval, String remarks, String clinic, String clinic_id, String doctor, String doctor_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.date = date;
            this.am = am;
            this.pm = pm;
            this.time_interval = time_interval;
            this.remarks = remarks;
            this.clinic = clinic;
            this.clinic_id = clinic_id;
            this.doctor = doctor;
            this.doctor_id = doctor_id;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_doctor_none_working_days to_doctor_none_working_days) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into doctor_none_working_days("
                    + "date"
                    + ",am"
                    + ",pm"
                    + ",time_interval"
                    + ",remarks"
                    + ",clinic"
                    + ",clinic_id"
                    + ",doctor"
                    + ",doctor_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":date"
                    + ",:am"
                    + ",:pm"
                    + ",:time_interval"
                    + ",:remarks"
                    + ",:clinic"
                    + ",:clinic_id"
                    + ",:doctor"
                    + ",:doctor_id"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("date", to_doctor_none_working_days.date)
                    .setNumber("am", to_doctor_none_working_days.am)
                    .setNumber("pm", to_doctor_none_working_days.pm)
                    .setString("time_interval", to_doctor_none_working_days.time_interval)
                    .setString("remarks", to_doctor_none_working_days.remarks)
                    .setString("clinic", to_doctor_none_working_days.clinic)
                    .setString("clinic_id", to_doctor_none_working_days.clinic_id)
                    .setString("doctor", to_doctor_none_working_days.doctor)
                    .setString("doctor_id", to_doctor_none_working_days.doctor_id)
                    .setString("created_by", to_doctor_none_working_days.created_by)
                    .setString("updated_by", to_doctor_none_working_days.updated_by)
                    .setString("created_at", to_doctor_none_working_days.created_at)
                    .setString("updated_at", to_doctor_none_working_days.updated_at)
                    .setNumber("status", to_doctor_none_working_days.status)
                    .setNumber("is_uploaded", to_doctor_none_working_days.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Doctor_none_working_days.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_doctor_none_working_days to_doctor_none_working_days) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update doctor_none_working_days set "
                    + "date= :date "
                    + ",am= :am "
                    + ",pm= :pm "
                    + ",time_interval= :time_interval "
                    + ",remarks= :remarks "
                    + ",clinic= :clinic "
                    + ",clinic_id= :clinic_id "
                    + ",doctor= :doctor "
                    + ",doctor_id= :doctor_id "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_doctor_none_working_days.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("date", to_doctor_none_working_days.date)
                    .setNumber("am", to_doctor_none_working_days.am)
                    .setNumber("pm", to_doctor_none_working_days.pm)
                    .setString("time_interval", to_doctor_none_working_days.time_interval)
                    .setString("remarks", to_doctor_none_working_days.remarks)
                    .setString("clinic", to_doctor_none_working_days.clinic)
                    .setString("clinic_id", to_doctor_none_working_days.clinic_id)
                    .setString("doctor", to_doctor_none_working_days.doctor)
                    .setString("doctor_id", to_doctor_none_working_days.doctor_id)
                    .setString("created_by", to_doctor_none_working_days.created_by)
                    .setString("updated_by", to_doctor_none_working_days.updated_by)
                    .setString("created_at", to_doctor_none_working_days.created_at)
                    .setString("updated_at", to_doctor_none_working_days.updated_at)
                    .setNumber("status", to_doctor_none_working_days.status)
                    .setNumber("is_uploaded", to_doctor_none_working_days.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Doctor_none_working_days.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_doctor_none_working_days to_doctor_none_working_days) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from doctor_none_working_days  "
                    + " where id='" + to_doctor_none_working_days.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Doctor_none_working_days.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_doctor_none_working_days> ret_data(String where) {
        List<to_doctor_none_working_days> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",date"
                    + ",am"
                    + ",pm"
                    + ",time_interval"
                    + ",remarks"
                    + ",clinic"
                    + ",clinic_id"
                    + ",doctor"
                    + ",doctor_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from doctor_none_working_days"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String date = rs.getString(2);
                int am = rs.getInt(3);
                int pm = rs.getInt(4);
                String time_interval = rs.getString(5);
                String remarks = rs.getString(6);
                String clinic = rs.getString(7);
                String clinic_id = rs.getString(8);
                String doctor = rs.getString(9);
                String doctor_id = rs.getString(10);
                String created_by = rs.getString(11);
                String updated_by = rs.getString(12);
                String created_at = rs.getString(13);
                String updated_at = rs.getString(14);
                int status = rs.getInt(15);
                int is_uploaded = rs.getInt(16);

                to_doctor_none_working_days to = new to_doctor_none_working_days(id, date, am, pm, time_interval, remarks, clinic, clinic_id, doctor, doctor_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
