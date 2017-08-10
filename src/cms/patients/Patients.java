/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.patients;

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
public class Patients {

    public static class to_patients {

        public final int id;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String sname;
        public final String bday;
        public final int gender;
        public final String blood_type;
        public final String occupation;
        public final String address;
        public final String barangay;
        public final String city;
        public final String province;
        public final String country;
        public final String contact_no;
        public final String email_address;
        public final String allergy_medicine;
        public final String allergy_others;
        public final int is_smoking;
        public final int is_alcohol;
        public final int is_drug_abuse;
        public final String clinic;
        public final String clinic_id;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_patients(int id, String fname, String mi, String lname, String sname, String bday, int gender, String blood_type, String occupation, String address, String barangay, String city, String province, String country, String contact_no, String email_address, String allergy_medicine, String allergy_others, int is_smoking, int is_alcohol, int is_drug_abuse, String clinic, String clinic_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.sname = sname;
            this.bday = bday;
            this.gender = gender;
            this.blood_type = blood_type;
            this.occupation = occupation;
            this.address = address;
            this.barangay = barangay;
            this.city = city;
            this.province = province;
            this.country = country;
            this.contact_no = contact_no;
            this.email_address = email_address;
            this.allergy_medicine = allergy_medicine;
            this.allergy_others = allergy_others;
            this.is_smoking = is_smoking;
            this.is_alcohol = is_alcohol;
            this.is_drug_abuse = is_drug_abuse;
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

    public static void add_data(to_patients to_patients) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into patients("
                    + "fname"
                    + ",mi"
                    + ",lname"
                    + ",sname"
                    + ",bday"
                    + ",gender"
                    + ",blood_type"
                    + ",occupation"
                    + ",address"
                    + ",barangay"
                    + ",city"
                    + ",province"
                    + ",country"
                    + ",contact_no"
                    + ",email_address"
                    + ",allergy_medicine"
                    + ",allergy_others"
                    + ",is_smoking"
                    + ",is_alcohol"
                    + ",is_drug_abuse"
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
                    + ",:bday"
                    + ",:gender"
                    + ",:blood_type"
                    + ",:occupation"
                    + ",:address"
                    + ",:barangay"
                    + ",:city"
                    + ",:province"
                    + ",:country"
                    + ",:contact_no"
                    + ",:email_address"
                    + ",:allergy_medicine"
                    + ",:allergy_others"
                    + ",:is_smoking"
                    + ",:is_alcohol"
                    + ",:is_drug_abuse"
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
                    .setString("fname", to_patients.fname)
                    .setString("mi", to_patients.mi)
                    .setString("lname", to_patients.lname)
                    .setString("sname", to_patients.sname)
                    .setString("bday", to_patients.bday)
                    .setNumber("gender", to_patients.gender)
                    .setString("blood_type", to_patients.blood_type)
                    .setString("occupation", to_patients.occupation)
                    .setString("address", to_patients.address)
                    .setString("barangay", to_patients.barangay)
                    .setString("city", to_patients.city)
                    .setString("province", to_patients.province)
                    .setString("country", to_patients.country)
                    .setString("contact_no", to_patients.contact_no)
                    .setString("email_address", to_patients.email_address)
                    .setString("allergy_medicine", to_patients.allergy_medicine)
                    .setString("allergy_others", to_patients.allergy_others)
                    .setNumber("is_smoking", to_patients.is_smoking)
                    .setNumber("is_alcohol", to_patients.is_alcohol)
                    .setNumber("is_drug_abuse", to_patients.is_drug_abuse)
                    .setString("clinic", to_patients.clinic)
                    .setString("clinic_id", to_patients.clinic_id)
                    .setString("created_by", to_patients.created_by)
                    .setString("updated_by", to_patients.updated_by)
                    .setString("created_at", to_patients.created_at)
                    .setString("updated_at", to_patients.updated_at)
                    .setNumber("status", to_patients.status)
                    .setNumber("is_uploaded", to_patients.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Patients.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_patients to_patients) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update patients set "
                    + "fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + ",bday= :bday "
                    + ",gender= :gender "
                    + ",blood_type= :blood_type "
                    + ",occupation= :occupation "
                    + ",address= :address "
                    + ",barangay= :barangay "
                    + ",city= :city "
                    + ",province= :province "
                    + ",country= :country "
                    + ",contact_no= :contact_no "
                    + ",email_address= :email_address "
                    + ",allergy_medicine= :allergy_medicine "
                    + ",allergy_others= :allergy_others "
                    + ",is_smoking= :is_smoking "
                    + ",is_alcohol= :is_alcohol "
                    + ",is_drug_abuse= :is_drug_abuse "
                    + ",clinic= :clinic "
                    + ",clinic_id= :clinic_id "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_patients.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_patients.fname)
                    .setString("mi", to_patients.mi)
                    .setString("lname", to_patients.lname)
                    .setString("sname", to_patients.sname)
                    .setString("bday", to_patients.bday)
                    .setNumber("gender", to_patients.gender)
                    .setString("blood_type", to_patients.blood_type)
                    .setString("occupation", to_patients.occupation)
                    .setString("address", to_patients.address)
                    .setString("barangay", to_patients.barangay)
                    .setString("city", to_patients.city)
                    .setString("province", to_patients.province)
                    .setString("country", to_patients.country)
                    .setString("contact_no", to_patients.contact_no)
                    .setString("email_address", to_patients.email_address)
                    .setString("allergy_medicine", to_patients.allergy_medicine)
                    .setString("allergy_others", to_patients.allergy_others)
                    .setNumber("is_smoking", to_patients.is_smoking)
                    .setNumber("is_alcohol", to_patients.is_alcohol)
                    .setNumber("is_drug_abuse", to_patients.is_drug_abuse)
                    .setString("clinic", to_patients.clinic)
                    .setString("clinic_id", to_patients.clinic_id)
                    .setString("created_by", to_patients.created_by)
                    .setString("updated_by", to_patients.updated_by)
                    .setString("created_at", to_patients.created_at)
                    .setString("updated_at", to_patients.updated_at)
                    .setNumber("status", to_patients.status)
                    .setNumber("is_uploaded", to_patients.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Patients.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_patients to_patients) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from patients  "
                    + " where id='" + to_patients.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Patients.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_patients> ret_data(String where) {
        List<to_patients> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",sname"
                    + ",bday"
                    + ",gender"
                    + ",blood_type"
                    + ",occupation"
                    + ",address"
                    + ",barangay"
                    + ",city"
                    + ",province"
                    + ",country"
                    + ",contact_no"
                    + ",email_address"
                    + ",allergy_medicine"
                    + ",allergy_others"
                    + ",is_smoking"
                    + ",is_alcohol"
                    + ",is_drug_abuse"
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from patients"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String fname = rs.getString(2);
                String mi = rs.getString(3);
                String lname = rs.getString(4);
                String sname = rs.getString(5);
                String bday = rs.getString(6);
                int gender = rs.getInt(7);
                String blood_type = rs.getString(8);
                String occupation = rs.getString(9);
                String address = rs.getString(10);
                String barangay = rs.getString(11);
                String city = rs.getString(12);
                String province = rs.getString(13);
                String country = rs.getString(14);
                String contact_no = rs.getString(15);
                String email_address = rs.getString(16);
                String allergy_medicine = rs.getString(17);
                String allergy_others = rs.getString(18);
                int is_smoking = rs.getInt(19);
                int is_alcohol = rs.getInt(20);
                int is_drug_abuse = rs.getInt(21);
                String clinic = rs.getString(22);
                String clinic_id = rs.getString(23);
                String created_by = rs.getString(24);
                String updated_by = rs.getString(25);
                String created_at = rs.getString(26);
                String updated_at = rs.getString(27);
                int status = rs.getInt(28);
                int is_uploaded = rs.getInt(29);

                to_patients to = new to_patients(id, fname, mi, lname, sname, bday, gender, blood_type, occupation, address, barangay, city, province, country, contact_no, email_address, allergy_medicine, allergy_others, is_smoking, is_alcohol, is_drug_abuse, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
