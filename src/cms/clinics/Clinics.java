/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.clinics;

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
public class Clinics {

    public static class to_clinics {
        
        public final int id;
        public final String clinic;
        public final String address;
        public final String contact_no;
        public final String email_address;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;
        public final int no_of_doctors;
        public final int no_of_receptionist;
        
        public to_clinics(int id, String clinic, String address, String contact_no, String email_address, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded, int no_of_doctors, int no_of_receptionist) {
            this.id = id;
            this.clinic = clinic;
            this.address = address;
            this.contact_no = contact_no;
            this.email_address = email_address;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.no_of_doctors = no_of_doctors;
            this.no_of_receptionist = no_of_receptionist;
        }
    }

    public static void add_data(to_clinics to_clinics) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into clinics("
                    + "clinic"
                    + ",address"
                    + ",contact_no"
                    + ",email_address"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":clinic"
                    + ",:address"
                    + ",:contact_no"
                    + ",:email_address"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("clinic", to_clinics.clinic)
                    .setString("address", to_clinics.address)
                    .setString("contact_no", to_clinics.contact_no)
                    .setString("email_address", to_clinics.email_address)
                    .setString("created_by", to_clinics.created_by)
                    .setString("updated_by", to_clinics.updated_by)
                    .setString("created_at", to_clinics.created_at)
                    .setString("updated_at", to_clinics.updated_at)
                    .setNumber("status", to_clinics.status)
                    .setNumber("is_uploaded", to_clinics.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Clinics.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_clinics to_clinics) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update clinics set "
                    + "clinic= :clinic "
                    + ",address= :address "
                    + ",contact_no= :contact_no "
                    + ",email_address= :email_address "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_clinics.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("clinic", to_clinics.clinic)
                    .setString("address", to_clinics.address)
                    .setString("contact_no", to_clinics.contact_no)
                    .setString("email_address", to_clinics.email_address)
                    .setString("created_by", to_clinics.created_by)
                    .setString("updated_by", to_clinics.updated_by)
                    .setString("created_at", to_clinics.created_at)
                    .setString("updated_at", to_clinics.updated_at)
                    .setNumber("status", to_clinics.status)
                    .setNumber("is_uploaded", to_clinics.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Clinics.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_clinics to_clinics) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from clinics  "
                    + " where id='" + to_clinics.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Clinics.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_clinics> ret_data(String where) {
        List<to_clinics> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",clinic"
                    + ",address"
                    + ",contact_no"
                    + ",email_address"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from clinics"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String clinic = rs.getString(2);
                String address = rs.getString(3);
                String contact_no = rs.getString(4);
                String email_address = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                String created_at = rs.getString(8);
                String updated_at = rs.getString(9);
                int status = rs.getInt(10);
                int is_uploaded = rs.getInt(11);
                int no_of_doctors = 0;
                int no_of_receptionist = 0;
                to_clinics to = new to_clinics(id, clinic, address, contact_no, email_address, created_by, updated_by, created_at, updated_at, status, is_uploaded, no_of_doctors, no_of_receptionist);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_clinics> ret_data2(String where) {
        List<to_clinics> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",clinic"
                    + ",address"
                    + ",contact_no"
                    + ",email_address"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from clinics"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String clinic = rs.getString(2);
                String address = rs.getString(3);
                String contact_no = rs.getString(4);
                String email_address = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                String created_at = rs.getString(8);
                String updated_at = rs.getString(9);
                int status = rs.getInt(10);
                int is_uploaded = rs.getInt(11);
                int no_of_doctors = 0;
                String s2 = "select count(id) from doctors where clinic_id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    no_of_doctors = rs2.getInt(1);
                }
                int no_of_receptionist = 0;
                to_clinics to = new to_clinics(id, clinic, address, contact_no, email_address, created_by, updated_by, created_at, updated_at, status, is_uploaded, no_of_doctors, no_of_receptionist);
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
