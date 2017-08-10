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
 * @author Guinness
 */
public class Doctors {

    public static class to_doctors {

        public final int id;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String sname;
        public final String degree;
        public final String registration_no;
        public final String designation;
        public final String specialization;
        public final String address;
        public final String barangay;
        public final String city;
        public final String province;
        public final String country;
        public final String contact_no;
        public final String email_address;
        public final String department;
        public final String clinic;
        public final String clinic_id;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_doctors(int id, String fname, String mi, String lname, String sname, String degree, String registration_no, String designation, String specialization, String address, String barangay, String city, String province, String country, String contact_no, String email_address, String department, String clinic, String clinic_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.sname = sname;
            this.degree = degree;
            this.registration_no = registration_no;
            this.designation = designation;
            this.specialization = specialization;
            this.address = address;
            this.barangay = barangay;
            this.city = city;
            this.province = province;
            this.country = country;
            this.contact_no = contact_no;
            this.email_address = email_address;
            this.department = department;
            this.clinic = clinic;
            this.clinic_id = clinic_id;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_doctors to_doctors) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into doctors("
                    + "fname"
                    + ",mi"
                    + ",lname"
                    + ",sname"
                    + ",degree"
                    + ",registration_no"
                    + ",designation"
                    + ",specialization"
                    + ",address"
                    + ",barangay"
                    + ",city"
                    + ",province"
                    + ",country"
                    + ",contact_no"
                    + ",email_address"
                    + ",department"
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:sname"
                    + ",:degree"
                    + ",:registration_no"
                    + ",:designation"
                    + ",:specialization"
                    + ",:address"
                    + ",:barangay"
                    + ",:city"
                    + ",:province"
                    + ",:country"
                    + ",:contact_no"
                    + ",:email_address"
                    + ",:department"
                    + ",:clinic"
                    + ",:clinic_id"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_doctors.fname)
                    .setString("mi", to_doctors.mi)
                    .setString("lname", to_doctors.lname)
                    .setString("sname", to_doctors.sname)
                    .setString("degree", to_doctors.degree)
                    .setString("registration_no", to_doctors.registration_no)
                    .setString("designation", to_doctors.designation)
                    .setString("specialization", to_doctors.specialization)
                    .setString("address", to_doctors.address)
                    .setString("barangay", to_doctors.barangay)
                    .setString("city", to_doctors.city)
                    .setString("province", to_doctors.province)
                    .setString("country", to_doctors.country)
                    .setString("contact_no", to_doctors.contact_no)
                    .setString("email_address", to_doctors.email_address)
                    .setString("department", to_doctors.department)
                    .setString("clinic", to_doctors.clinic)
                    .setString("clinic_id", to_doctors.clinic_id)
                    .setString("created_by", to_doctors.created_by)
                    .setString("updated_by", to_doctors.updated_by)
                    .setString("created_at", to_doctors.created_at)
                    .setString("updated_at", to_doctors.updated_at)
                    .setNumber("status", to_doctors.status)
                    .setNumber("is_uploaded", to_doctors.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Doctors.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_doctors to_doctors) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update doctors set "
                    + "fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + ",degree= :degree "
                    + ",registration_no= :registration_no "
                    + ",designation= :designation "
                    + ",specialization= :specialization "
                    + ",address= :address "
                    + ",barangay= :barangay "
                    + ",city= :city "
                    + ",province= :province "
                    + ",country= :country "
                    + ",contact_no= :contact_no "
                    + ",email_address= :email_address "
                    + ",department= :department "
                    + ",clinic= :clinic "
                    + ",clinic_id= :clinic_id "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_doctors.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_doctors.fname)
                    .setString("mi", to_doctors.mi)
                    .setString("lname", to_doctors.lname)
                    .setString("sname", to_doctors.sname)
                    .setString("degree", to_doctors.degree)
                    .setString("registration_no", to_doctors.registration_no)
                    .setString("designation", to_doctors.designation)
                    .setString("specialization", to_doctors.specialization)
                    .setString("address", to_doctors.address)
                    .setString("barangay", to_doctors.barangay)
                    .setString("city", to_doctors.city)
                    .setString("province", to_doctors.province)
                    .setString("country", to_doctors.country)
                    .setString("contact_no", to_doctors.contact_no)
                    .setString("email_address", to_doctors.email_address)
                    .setString("department", to_doctors.department)
                    .setString("clinic", to_doctors.clinic)
                    .setString("clinic_id", to_doctors.clinic_id)
                    .setString("created_by", to_doctors.created_by)
                    .setString("updated_by", to_doctors.updated_by)
                    .setString("created_at", to_doctors.created_at)
                    .setString("updated_at", to_doctors.updated_at)
                    .setNumber("status", to_doctors.status)
                    .setNumber("is_uploaded", to_doctors.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Doctors.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_doctors to_doctors) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from doctors  "
                    + " where id='" + to_doctors.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Doctors.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_doctors> ret_data(String where) {
        List<to_doctors> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",sname"
                    + ",degree"
                    + ",registration_no"
                    + ",designation"
                    + ",specialization"
                    + ",address"
                    + ",barangay"
                    + ",city"
                    + ",province"
                    + ",country"
                    + ",contact_no"
                    + ",email_address"
                    + ",department"
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from doctors"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String fname = rs.getString(2);
                String mi = rs.getString(3);
                String lname = rs.getString(4);
                String sname = rs.getString(5);
                String degree = rs.getString(6);
                String registration_no = rs.getString(7);
                String designation = rs.getString(8);
                String specialization = rs.getString(9);
                String address = rs.getString(10);
                String barangay = rs.getString(11);
                String city = rs.getString(12);
                String province = rs.getString(13);
                String country = rs.getString(14);
                String contact_no = rs.getString(15);
                String email_address = rs.getString(16);
                String department = rs.getString(17);
                String clinic = rs.getString(18);
                String clinic_id = rs.getString(19);
                String created_by = rs.getString(20);
                String updated_by = rs.getString(21);
                String created_at = rs.getString(22);
                String updated_at = rs.getString(23);
                int status = rs.getInt(24);
                int is_uploaded = rs.getInt(25);

                to_doctors to = new to_doctors(id, fname, mi, lname, sname, degree, registration_no, designation, specialization, address, barangay, city, province, country, contact_no, email_address, department, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
