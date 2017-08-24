/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.inventory;

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
public class Inventory_prescriptions {

    public static class to_inventory_prescriptions {

        public final int id;
        public final String item_code;
        public final String generic_name;
        public final String description;
        public final String uom;
        public final String dosage;
        public final int days;
        public final double dosage_qty;
        public final String dosage_remarks;
        public final String remarks;
        public final String type_of_use;
        public final double product_qty;
        public final double cost;
        public final double selling_price;
        public final double reorder_level;
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
        public final String clinic;
        public final String clinic_id;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_inventory_prescriptions(int id, String item_code, String generic_name, String description, String uom, String dosage, int days, double dosage_qty, String dosage_remarks, String remarks, String type_of_use, double product_qty, double cost, double selling_price, double reorder_level, String category, String category_id, String classification, String classification_id, String sub_classification, String sub_classification_id, String brand, String brand_id, String model, String model_id, String clinic, String clinic_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.item_code = item_code;
            this.generic_name = generic_name;
            this.description = description;
            this.uom = uom;
            this.dosage = dosage;
            this.days = days;
            this.dosage_qty = dosage_qty;
            this.dosage_remarks = dosage_remarks;
            this.remarks = remarks;
            this.type_of_use = type_of_use;
            this.product_qty = product_qty;
            this.cost = cost;
            this.selling_price = selling_price;
            this.reorder_level = reorder_level;
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

    public static void add_data(to_inventory_prescriptions to_inventory_prescriptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into inventory_prescriptions("
                    + "item_code"
                    + ",generic_name"
                    + ",description"
                    + ",uom"
                    + ",dosage"
                    + ",days"
                    + ",dosage_qty"
                    + ",dosage_remarks"
                    + ",remarks"
                    + ",type_of_use"
                    + ",product_qty"
                    + ",cost"
                    + ",selling_price"
                    + ",reorder_level"
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
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":item_code"
                    + ",:generic_name"
                    + ",:description"
                    + ",:uom"
                    + ",:dosage"
                    + ",:days"
                    + ",:dosage_qty"
                    + ",:dosage_remarks"
                    + ",:remarks"
                    + ",:type_of_use"
                    + ",:product_qty"
                    + ",:cost"
                    + ",:selling_price"
                    + ",:reorder_level"
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
                    .setString("item_code", to_inventory_prescriptions.item_code)
                    .setString("generic_name", to_inventory_prescriptions.generic_name)
                    .setString("description", to_inventory_prescriptions.description)
                    .setString("uom", to_inventory_prescriptions.uom)
                    .setString("dosage", to_inventory_prescriptions.dosage)
                    .setNumber("days", to_inventory_prescriptions.days)
                    .setNumber("dosage_qty", to_inventory_prescriptions.dosage_qty)
                    .setString("dosage_remarks", to_inventory_prescriptions.dosage_remarks)
                    .setString("remarks", to_inventory_prescriptions.remarks)
                    .setString("type_of_use", to_inventory_prescriptions.type_of_use)
                    .setNumber("product_qty", to_inventory_prescriptions.product_qty)
                    .setNumber("cost", to_inventory_prescriptions.cost)
                    .setNumber("selling_price", to_inventory_prescriptions.selling_price)
                    .setNumber("reorder_level", to_inventory_prescriptions.reorder_level)
                    .setString("category", to_inventory_prescriptions.category)
                    .setString("category_id", to_inventory_prescriptions.category_id)
                    .setString("classification", to_inventory_prescriptions.classification)
                    .setString("classification_id", to_inventory_prescriptions.classification_id)
                    .setString("sub_classification", to_inventory_prescriptions.sub_classification)
                    .setString("sub_classification_id", to_inventory_prescriptions.sub_classification_id)
                    .setString("brand", to_inventory_prescriptions.brand)
                    .setString("brand_id", to_inventory_prescriptions.brand_id)
                    .setString("model", to_inventory_prescriptions.model)
                    .setString("model_id", to_inventory_prescriptions.model_id)
                    .setString("clinic", to_inventory_prescriptions.clinic)
                    .setString("clinic_id", to_inventory_prescriptions.clinic_id)
                    .setString("created_by", to_inventory_prescriptions.created_by)
                    .setString("updated_by", to_inventory_prescriptions.updated_by)
                    .setString("created_at", to_inventory_prescriptions.created_at)
                    .setString("updated_at", to_inventory_prescriptions.updated_at)
                    .setNumber("status", to_inventory_prescriptions.status)
                    .setNumber("is_uploaded", to_inventory_prescriptions.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory_prescriptions.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_inventory_prescriptions to_inventory_prescriptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update inventory_prescriptions set "
                    + "item_code= :item_code "
                    + ",generic_name= :generic_name "
                    + ",description= :description "
                    + ",uom= :uom "
                    + ",dosage= :dosage "
                    + ",days= :days "
                    + ",dosage_qty= :dosage_qty "
                    + ",dosage_remarks= :dosage_remarks "
                    + ",remarks= :remarks "
                    + ",type_of_use= :type_of_use "
                    + ",product_qty= :product_qty "
                    + ",cost= :cost "
                    + ",selling_price= :selling_price "
                    + ",reorder_level= :reorder_level "
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
                    + ",clinic= :clinic "
                    + ",clinic_id= :clinic_id "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_inventory_prescriptions.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("item_code", to_inventory_prescriptions.item_code)
                    .setString("generic_name", to_inventory_prescriptions.generic_name)
                    .setString("description", to_inventory_prescriptions.description)
                    .setString("uom", to_inventory_prescriptions.uom)
                    .setString("dosage", to_inventory_prescriptions.dosage)
                    .setNumber("days", to_inventory_prescriptions.days)
                    .setNumber("dosage_qty", to_inventory_prescriptions.dosage_qty)
                    .setString("dosage_remarks", to_inventory_prescriptions.dosage_remarks)
                    .setString("remarks", to_inventory_prescriptions.remarks)
                    .setString("type_of_use", to_inventory_prescriptions.type_of_use)
                    .setNumber("product_qty", to_inventory_prescriptions.product_qty)
                    .setNumber("cost", to_inventory_prescriptions.cost)
                    .setNumber("selling_price", to_inventory_prescriptions.selling_price)
                    .setNumber("reorder_level", to_inventory_prescriptions.reorder_level)
                    .setString("category", to_inventory_prescriptions.category)
                    .setString("category_id", to_inventory_prescriptions.category_id)
                    .setString("classification", to_inventory_prescriptions.classification)
                    .setString("classification_id", to_inventory_prescriptions.classification_id)
                    .setString("sub_classification", to_inventory_prescriptions.sub_classification)
                    .setString("sub_classification_id", to_inventory_prescriptions.sub_classification_id)
                    .setString("brand", to_inventory_prescriptions.brand)
                    .setString("brand_id", to_inventory_prescriptions.brand_id)
                    .setString("model", to_inventory_prescriptions.model)
                    .setString("model_id", to_inventory_prescriptions.model_id)
                    .setString("clinic", to_inventory_prescriptions.clinic)
                    .setString("clinic_id", to_inventory_prescriptions.clinic_id)
                    .setString("created_by", to_inventory_prescriptions.created_by)
                    .setString("updated_by", to_inventory_prescriptions.updated_by)
                    .setString("created_at", to_inventory_prescriptions.created_at)
                    .setString("updated_at", to_inventory_prescriptions.updated_at)
                    .setNumber("status", to_inventory_prescriptions.status)
                    .setNumber("is_uploaded", to_inventory_prescriptions.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory_prescriptions.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_inventory_prescriptions to_inventory_prescriptions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from inventory_prescriptions  "
                    + " where id='" + to_inventory_prescriptions.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory_prescriptions.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_inventory_prescriptions> ret_data(String where) {
        List<to_inventory_prescriptions> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",item_code"
                    + ",generic_name"
                    + ",description"
                    + ",uom"
                    + ",dosage"
                    + ",days"
                    + ",dosage_qty"
                    + ",dosage_remarks"
                    + ",remarks"
                    + ",type_of_use"
                    + ",product_qty"
                    + ",cost"
                    + ",selling_price"
                    + ",reorder_level"
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
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from inventory_prescriptions"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String item_code = rs.getString(2);
                String generic_name = rs.getString(3);
                String description = rs.getString(4);
                String uom = rs.getString(5);
                String dosage = rs.getString(6);
                int days = rs.getInt(7);
                double dosage_qty = rs.getDouble(8);
                String dosage_remarks = rs.getString(9);
                String remarks = rs.getString(10);
                String type_of_use = rs.getString(11);
                double product_qty = rs.getDouble(12);
                double cost = rs.getDouble(13);
                double selling_price = rs.getDouble(14);
                double reorder_level = rs.getDouble(15);
                String category = rs.getString(16);
                String category_id = rs.getString(17);
                String classification = rs.getString(18);
                String classification_id = rs.getString(19);
                String sub_classification = rs.getString(20);
                String sub_classification_id = rs.getString(21);
                String brand = rs.getString(22);
                String brand_id = rs.getString(23);
                String model = rs.getString(24);
                String model_id = rs.getString(25);
                String clinic = rs.getString(26);
                String clinic_id = rs.getString(27);
                String created_by = rs.getString(28);
                String updated_by = rs.getString(29);
                String created_at = rs.getString(30);
                String updated_at = rs.getString(31);
                int status = rs.getInt(32);
                int is_uploaded = rs.getInt(33);

                to_inventory_prescriptions to = new to_inventory_prescriptions(id, item_code, generic_name, description, uom, dosage, days, dosage_qty, dosage_remarks, remarks, type_of_use, product_qty, cost, selling_price, reorder_level, category, category_id, classification, classification_id, sub_classification, sub_classification_id, brand, brand_id, model, model_id, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
