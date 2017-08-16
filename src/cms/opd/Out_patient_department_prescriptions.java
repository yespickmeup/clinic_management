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
public class Out_patient_department_prescriptions {

    public static class to_out_patient_department_prescriptions {

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
        public final String item_code;
        public final String generic_name;
        public final String description;
        public final String uom;
        public final String dosage;
        public final int days;
        public final int total;
        public final String dosage_remarks;
        public final String remarks;
        public final double cost;
        public final double selling_price;
        public final double discount_amount;
        public final String type_of_use;
        public final String category;
        public final String category_id;
        public final String classification;
        public final String classification_id;
        public final String sub_classification;
        public final String sub_classification_id;
        public final String brand;
        public final String brand_id;
        public final String model;
        public final String model_id;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_out_patient_department_prescriptions(int id, String opd_no, String clinic, String clinic_id, String doctor, String doctor_id, String patient, String patient_id, String opd_date, String opd_time, String opd_type, String item_code, String generic_name, String description, String uom, String dosage, int days, int total, String dosage_remarks, String remarks, double cost, double selling_price, double discount_amount, String type_of_use, String category, String category_id, String classification, String classification_id, String sub_classification, String sub_classification_id, String brand, String brand_id, String model, String model_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
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
            this.item_code = item_code;
            this.generic_name = generic_name;
            this.description = description;
            this.uom = uom;
            this.dosage = dosage;
            this.days = days;
            this.total = total;
            this.dosage_remarks = dosage_remarks;
            this.remarks = remarks;
            this.cost = cost;
            this.selling_price = selling_price;
            this.discount_amount = discount_amount;
            this.type_of_use = type_of_use;
            this.category = category;
            this.category_id = category_id;
            this.classification = classification;
            this.classification_id = classification_id;
            this.sub_classification = sub_classification;
            this.sub_classification_id = sub_classification_id;
            this.brand = brand;
            this.brand_id = brand_id;
            this.model = model;
            this.model_id = model_id;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_out_patient_department_prescriptions to_out_patient_department_prescriptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into out_patient_department_prescriptions("
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
                    + ",item_code"
                    + ",generic_name"
                    + ",description"
                    + ",uom"
                    + ",dosage"
                    + ",days"
                    + ",total"
                    + ",dosage_remarks"
                    + ",remarks"
                    + ",cost"
                    + ",selling_price"
                    + ",discount_amount"
                    + ",type_of_use"
                    + ",category"
                    + ",category_id"
                    + ",classification"
                    + ",classification_id"
                    + ",sub_classification"
                    + ",sub_classification_id"
                    + ",brand"
                    + ",brand_id"
                    + ",model"
                    + ",model_id"
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
                    + ",:item_code"
                    + ",:generic_name"
                    + ",:description"
                    + ",:uom"
                    + ",:dosage"
                    + ",:days"
                    + ",:total"
                    + ",:dosage_remarks"
                    + ",:remarks"
                    + ",:cost"
                    + ",:selling_price"
                    + ",:discount_amount"
                    + ",:type_of_use"
                    + ",:category"
                    + ",:category_id"
                    + ",:classification"
                    + ",:classification_id"
                    + ",:sub_classification"
                    + ",:sub_classification_id"
                    + ",:brand"
                    + ",:brand_id"
                    + ",:model"
                    + ",:model_id"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("opd_no", to_out_patient_department_prescriptions.opd_no)
                    .setString("clinic", to_out_patient_department_prescriptions.clinic)
                    .setString("clinic_id", to_out_patient_department_prescriptions.clinic_id)
                    .setString("doctor", to_out_patient_department_prescriptions.doctor)
                    .setString("doctor_id", to_out_patient_department_prescriptions.doctor_id)
                    .setString("patient", to_out_patient_department_prescriptions.patient)
                    .setString("patient_id", to_out_patient_department_prescriptions.patient_id)
                    .setString("opd_date", to_out_patient_department_prescriptions.opd_date)
                    .setString("opd_time", to_out_patient_department_prescriptions.opd_time)
                    .setString("opd_type", to_out_patient_department_prescriptions.opd_type)
                    .setString("item_code", to_out_patient_department_prescriptions.item_code)
                    .setString("generic_name", to_out_patient_department_prescriptions.generic_name)
                    .setString("description", to_out_patient_department_prescriptions.description)
                    .setString("uom", to_out_patient_department_prescriptions.uom)
                    .setString("dosage", to_out_patient_department_prescriptions.dosage)
                    .setNumber("days", to_out_patient_department_prescriptions.days)
                    .setNumber("total", to_out_patient_department_prescriptions.total)
                    .setString("dosage_remarks", to_out_patient_department_prescriptions.dosage_remarks)
                    .setString("remarks", to_out_patient_department_prescriptions.remarks)
                    .setNumber("cost", to_out_patient_department_prescriptions.cost)
                    .setNumber("selling_price", to_out_patient_department_prescriptions.selling_price)
                    .setNumber("discount_amount", to_out_patient_department_prescriptions.discount_amount)
                    .setString("type_of_use", to_out_patient_department_prescriptions.type_of_use)
                    .setString("category", to_out_patient_department_prescriptions.category)
                    .setString("category_id", to_out_patient_department_prescriptions.category_id)
                    .setString("classification", to_out_patient_department_prescriptions.classification)
                    .setString("classification_id", to_out_patient_department_prescriptions.classification_id)
                    .setString("sub_classification", to_out_patient_department_prescriptions.sub_classification)
                    .setString("sub_classification_id", to_out_patient_department_prescriptions.sub_classification_id)
                    .setString("brand", to_out_patient_department_prescriptions.brand)
                    .setString("brand_id", to_out_patient_department_prescriptions.brand_id)
                    .setString("model", to_out_patient_department_prescriptions.model)
                    .setString("model_id", to_out_patient_department_prescriptions.model_id)
                    .setString("created_by", to_out_patient_department_prescriptions.created_by)
                    .setString("updated_by", to_out_patient_department_prescriptions.updated_by)
                    .setString("created_at", to_out_patient_department_prescriptions.created_at)
                    .setString("updated_at", to_out_patient_department_prescriptions.updated_at)
                    .setNumber("status", to_out_patient_department_prescriptions.status)
                    .setNumber("is_uploaded", to_out_patient_department_prescriptions.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_department_prescriptions.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_out_patient_department_prescriptions to_out_patient_department_prescriptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update out_patient_department_prescriptions set "
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
                    + ",item_code= :item_code "
                    + ",generic_name= :generic_name "
                    + ",description= :description "
                    + ",uom= :uom "
                    + ",dosage= :dosage "
                    + ",days= :days "
                    + ",total= :total "
                    + ",dosage_remarks= :dosage_remarks "
                    + ",remarks= :remarks "
                    + ",cost= :cost "
                    + ",selling_price= :selling_price "
                    + ",discount_amount= :discount_amount "
                    + ",type_of_use= :type_of_use "
                    + ",category= :category "
                    + ",category_id= :category_id "
                    + ",classification= :classification "
                    + ",classification_id= :classification_id "
                    + ",sub_classification= :sub_classification "
                    + ",sub_classification_id= :sub_classification_id "
                    + ",brand= :brand "
                    + ",brand_id= :brand_id "
                    + ",model= :model "
                    + ",model_id= :model_id "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_out_patient_department_prescriptions.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("opd_no", to_out_patient_department_prescriptions.opd_no)
                    .setString("clinic", to_out_patient_department_prescriptions.clinic)
                    .setString("clinic_id", to_out_patient_department_prescriptions.clinic_id)
                    .setString("doctor", to_out_patient_department_prescriptions.doctor)
                    .setString("doctor_id", to_out_patient_department_prescriptions.doctor_id)
                    .setString("patient", to_out_patient_department_prescriptions.patient)
                    .setString("patient_id", to_out_patient_department_prescriptions.patient_id)
                    .setString("opd_date", to_out_patient_department_prescriptions.opd_date)
                    .setString("opd_time", to_out_patient_department_prescriptions.opd_time)
                    .setString("opd_type", to_out_patient_department_prescriptions.opd_type)
                    .setString("item_code", to_out_patient_department_prescriptions.item_code)
                    .setString("generic_name", to_out_patient_department_prescriptions.generic_name)
                    .setString("description", to_out_patient_department_prescriptions.description)
                    .setString("uom", to_out_patient_department_prescriptions.uom)
                    .setString("dosage", to_out_patient_department_prescriptions.dosage)
                    .setNumber("days", to_out_patient_department_prescriptions.days)
                    .setNumber("total", to_out_patient_department_prescriptions.total)
                    .setString("dosage_remarks", to_out_patient_department_prescriptions.dosage_remarks)
                    .setString("remarks", to_out_patient_department_prescriptions.remarks)
                    .setNumber("cost", to_out_patient_department_prescriptions.cost)
                    .setNumber("selling_price", to_out_patient_department_prescriptions.selling_price)
                    .setNumber("discount_amount", to_out_patient_department_prescriptions.discount_amount)
                    .setString("type_of_use", to_out_patient_department_prescriptions.type_of_use)
                    .setString("category", to_out_patient_department_prescriptions.category)
                    .setString("category_id", to_out_patient_department_prescriptions.category_id)
                    .setString("classification", to_out_patient_department_prescriptions.classification)
                    .setString("classification_id", to_out_patient_department_prescriptions.classification_id)
                    .setString("sub_classification", to_out_patient_department_prescriptions.sub_classification)
                    .setString("sub_classification_id", to_out_patient_department_prescriptions.sub_classification_id)
                    .setString("brand", to_out_patient_department_prescriptions.brand)
                    .setString("brand_id", to_out_patient_department_prescriptions.brand_id)
                    .setString("model", to_out_patient_department_prescriptions.model)
                    .setString("model_id", to_out_patient_department_prescriptions.model_id)
                    .setString("created_by", to_out_patient_department_prescriptions.created_by)
                    .setString("updated_by", to_out_patient_department_prescriptions.updated_by)
                    .setString("created_at", to_out_patient_department_prescriptions.created_at)
                    .setString("updated_at", to_out_patient_department_prescriptions.updated_at)
                    .setNumber("status", to_out_patient_department_prescriptions.status)
                    .setNumber("is_uploaded", to_out_patient_department_prescriptions.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_department_prescriptions.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_out_patient_department_prescriptions to_out_patient_department_prescriptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from out_patient_department_prescriptions  "
                    + " where id='" + to_out_patient_department_prescriptions.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Out_patient_department_prescriptions.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_out_patient_department_prescriptions> ret_data(String where) {
        List<to_out_patient_department_prescriptions> datas = new ArrayList();

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
                    + ",item_code"
                    + ",generic_name"
                    + ",description"
                    + ",uom"
                    + ",dosage"
                    + ",days"
                    + ",total"
                    + ",dosage_remarks"
                    + ",remarks"
                    + ",cost"
                    + ",selling_price"
                    + ",discount_amount"
                    + ",type_of_use"
                    + ",category"
                    + ",category_id"
                    + ",classification"
                    + ",classification_id"
                    + ",sub_classification"
                    + ",sub_classification_id"
                    + ",brand"
                    + ",brand_id"
                    + ",model"
                    + ",model_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from out_patient_department_prescriptions"
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
                String item_code = rs.getString(12);
                String generic_name = rs.getString(13);
                String description = rs.getString(14);
                String uom = rs.getString(15);
                String dosage = rs.getString(16);
                int days = rs.getInt(17);
                int total = rs.getInt(18);
                String dosage_remarks = rs.getString(19);
                String remarks = rs.getString(20);
                double cost = rs.getDouble(21);
                double selling_price = rs.getDouble(22);
                double discount_amount = rs.getDouble(23);
                String type_of_use = rs.getString(24);
                String category = rs.getString(25);
                String category_id = rs.getString(26);
                String classification = rs.getString(27);
                String classification_id = rs.getString(28);
                String sub_classification = rs.getString(29);
                String sub_classification_id = rs.getString(30);
                String brand = rs.getString(31);
                String brand_id = rs.getString(32);
                String model = rs.getString(33);
                String model_id = rs.getString(34);
                String created_by = rs.getString(35);
                String updated_by = rs.getString(36);
                String created_at = rs.getString(37);
                String updated_at = rs.getString(38);
                int status = rs.getInt(39);
                int is_uploaded = rs.getInt(40);

                to_out_patient_department_prescriptions to = new to_out_patient_department_prescriptions(id, opd_no, clinic, clinic_id, doctor, doctor_id, patient, patient_id, opd_date, opd_time, opd_type, item_code, generic_name, description, uom, dosage, days, total, dosage_remarks, remarks, cost, selling_price, discount_amount, type_of_use, category, category_id, classification, classification_id, sub_classification, sub_classification_id, brand, brand_id, model, model_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
