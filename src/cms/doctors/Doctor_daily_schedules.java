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
public class Doctor_daily_schedules {

    public static class to_doctor_daily_schedules {

        public final int id;
        public final String day;
        public final String time;
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
        public  boolean is_selected;

        public to_doctor_daily_schedules(int id, String day, String time, String clinic, String clinic_id, String doctor, String doctor_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded, boolean is_selected) {
            this.id = id;
            this.day = day;
            this.time = time;
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
            this.is_selected = is_selected;
        }

        public boolean isIs_selected() {
            return is_selected;
        }

        public void setIs_selected(boolean is_selected) {
            this.is_selected = is_selected;
        }
        
    }

    public static void add_data(to_doctor_daily_schedules to_doctor_daily_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into doctor_daily_schedules("
                    + "day"
                    + ",time"
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
                    + ":day"
                    + ",:time"
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
                    .setString("day", to_doctor_daily_schedules.day)
                    .setString("time", to_doctor_daily_schedules.time)
                    .setString("clinic", to_doctor_daily_schedules.clinic)
                    .setString("clinic_id", to_doctor_daily_schedules.clinic_id)
                    .setString("doctor", to_doctor_daily_schedules.doctor)
                    .setString("doctor_id", to_doctor_daily_schedules.doctor_id)
                    .setString("created_by", to_doctor_daily_schedules.created_by)
                    .setString("updated_by", to_doctor_daily_schedules.updated_by)
                    .setString("created_at", to_doctor_daily_schedules.created_at)
                    .setString("updated_at", to_doctor_daily_schedules.updated_at)
                    .setNumber("status", to_doctor_daily_schedules.status)
                    .setNumber("is_uploaded", to_doctor_daily_schedules.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Doctor_daily_schedules.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_doctor_daily_schedules to_doctor_daily_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update doctor_daily_schedules set "
                    + "day= :day"
                    + ",time= :time "
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
                    + " where id='" + to_doctor_daily_schedules.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("day", to_doctor_daily_schedules.day)
                    .setString("time", to_doctor_daily_schedules.time)
                    .setString("clinic", to_doctor_daily_schedules.clinic)
                    .setString("clinic_id", to_doctor_daily_schedules.clinic_id)
                    .setString("doctor", to_doctor_daily_schedules.doctor)
                    .setString("doctor_id", to_doctor_daily_schedules.doctor_id)
                    .setString("created_by", to_doctor_daily_schedules.created_by)
                    .setString("updated_by", to_doctor_daily_schedules.updated_by)
                    .setString("created_at", to_doctor_daily_schedules.created_at)
                    .setString("updated_at", to_doctor_daily_schedules.updated_at)
                    .setNumber("status", to_doctor_daily_schedules.status)
                    .setNumber("is_uploaded", to_doctor_daily_schedules.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Doctor_daily_schedules.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_doctor_daily_schedules to_doctor_daily_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from doctor_daily_schedules  "
                    + " where id='" + to_doctor_daily_schedules.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Doctor_daily_schedules.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_doctor_daily_schedules> ret_data(String where) {
        List<to_doctor_daily_schedules> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",day"
                    + ",time"
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
                    + " from doctor_daily_schedules"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String day = rs.getString(2);
                String time = rs.getString(3);
                String clinic = rs.getString(4);
                String clinic_id = rs.getString(5);
                String doctor = rs.getString(6);
                String doctor_id = rs.getString(7);
                String created_by = rs.getString(8);
                String updated_by = rs.getString(9);
                String created_at = rs.getString(10);
                String updated_at = rs.getString(11);
                int status = rs.getInt(12);
                int is_uploaded = rs.getInt(13);

                to_doctor_daily_schedules to = new to_doctor_daily_schedules(id, day, time, clinic, clinic_id, doctor, doctor_id, created_by, updated_by, created_at, updated_at, status, is_uploaded, false);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_doctor_daily_schedules> ret_data2(String where) {
        List<to_doctor_daily_schedules> datas = new ArrayList();
        List<to_doctor_daily_schedules> list = new ArrayList();
        String slot = "07:00am,07:30am,08:00am,08:30am,09:00am,09:30am,10:00am,10:30am,11:00am,11:30am,12:00pm,12:30pm,01:00pm,01:30pm,02:00pm,02:30pm,03:00pm,03:30pm,04:00pm,04:30pm,05:00pm,05:30pm,06:00pm,06:30pm,07:00pm,07:30pm";
        String time_slots = System.getProperty("time_slots", slot);
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",day"
                    + ",time"
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
                    + " from doctor_daily_schedules"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String day = rs.getString(2);
                String time = rs.getString(3);
                String clinic = rs.getString(4);
                String clinic_id = rs.getString(5);
                String doctor = rs.getString(6);
                String doctor_id = rs.getString(7);
                String created_by = rs.getString(8);
                String updated_by = rs.getString(9);
                String created_at = rs.getString(10);
                String updated_at = rs.getString(11);
                int status = rs.getInt(12);
                int is_uploaded = rs.getInt(13);

                to_doctor_daily_schedules to = new to_doctor_daily_schedules(id, day, time, clinic, clinic_id, doctor, doctor_id, created_by, updated_by, created_at, updated_at, status, is_uploaded, false);

                datas.add(to);
            }
            String[] time_slot = time_slots.split(",");
            for (String s : time_slot) {
                int id = 0;
                String day = "";
                String time = s;
                String clinic = "";
                String clinic_id = "";
                String doctor = "";
                String doctor_id = "";
                String created_by = "";
                String updated_by = "";
                String created_at = "";
                String updated_at = "";
                int status = 0;
                int is_uploaded = 0;

                for (to_doctor_daily_schedules to : datas) {
                    if (to.time.equalsIgnoreCase(s)) {
                        id = to.id;
                        day = to.day;
                        clinic = to.clinic;
                        clinic_id = to.clinic_id;
                        doctor = to.doctor;
                        doctor_id = to.doctor_id;
                        created_by = to.created_by;
                        updated_by = to.updated_by;
                        created_at = to.created_at;
                        updated_at = to.updated_at;
                        status = to.status;
                        is_uploaded = to.is_uploaded;
                        break;
                    }
                }
                to_doctor_daily_schedules to2 = new to_doctor_daily_schedules(id, day, time, clinic, clinic_id, doctor, doctor_id, created_by, updated_by, created_at, updated_at, status, is_uploaded, false);
                list.add(to2);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
