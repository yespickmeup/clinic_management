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
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author RAZOR Defianz
 */
public class Inventory {

    public static class to_inventory {

        public final int id;
        public final String item_code;
        public final String generic_name;
        public final String description;
        public final String uom;
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

        public to_inventory(int id, String item_code, String generic_name, String description, String uom, String type_of_use, double product_qty, double cost, double selling_price, double reorder_level, String category, String category_id, String classification, String classification_id, String sub_classification, String sub_classification_id, String brand, String brand_id, String model, String model_id, String clinic, String clinic_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.item_code = item_code;
            this.generic_name = generic_name;
            this.description = description;
            this.uom = uom;
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

    public static void add_data(to_inventory to_inventory) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into inventory("
                    + "item_code"
                    + ",generic_name"
                    + ",description"
                    + ",uom"
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
                    .setString("item_code", to_inventory.item_code)
                    .setString("generic_name", to_inventory.generic_name)
                    .setString("description", to_inventory.description)
                    .setString("uom", to_inventory.uom)
                    .setString("type_of_use", to_inventory.type_of_use)
                    .setNumber("product_qty", to_inventory.product_qty)
                    .setNumber("cost", to_inventory.cost)
                    .setNumber("selling_price", to_inventory.selling_price)
                    .setNumber("reorder_level", to_inventory.reorder_level)
                    .setString("category", to_inventory.category)
                    .setString("category_id", to_inventory.category_id)
                    .setString("classification", to_inventory.classification)
                    .setString("classification_id", to_inventory.classification_id)
                    .setString("sub_classification", to_inventory.sub_classification)
                    .setString("sub_classification_id", to_inventory.sub_classification_id)
                    .setString("brand", to_inventory.brand)
                    .setString("brand_id", to_inventory.brand_id)
                    .setString("model", to_inventory.model)
                    .setString("model_id", to_inventory.model_id)
                    .setString("clinic", to_inventory.clinic)
                    .setString("clinic_id", to_inventory.clinic_id)
                    .setString("created_by", to_inventory.created_by)
                    .setString("updated_by", to_inventory.updated_by)
                    .setString("created_at", to_inventory.created_at)
                    .setString("updated_at", to_inventory.updated_at)
                    .setNumber("status", to_inventory.status)
                    .setNumber("is_uploaded", to_inventory.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_inventory to_inventory) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update inventory set "
                    + "item_code= :item_code "
                    + ",generic_name= :generic_name "
                    + ",description= :description "
                    + ",uom= :uom "
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
                    + " where id='" + to_inventory.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("item_code", to_inventory.item_code)
                    .setString("generic_name", to_inventory.generic_name)
                    .setString("description", to_inventory.description)
                    .setString("uom", to_inventory.uom)
                    .setString("type_of_use", to_inventory.type_of_use)
                    .setNumber("product_qty", to_inventory.product_qty)
                    .setNumber("cost", to_inventory.cost)
                    .setNumber("selling_price", to_inventory.selling_price)
                    .setNumber("reorder_level", to_inventory.reorder_level)
                    .setString("category", to_inventory.category)
                    .setString("category_id", to_inventory.category_id)
                    .setString("classification", to_inventory.classification)
                    .setString("classification_id", to_inventory.classification_id)
                    .setString("sub_classification", to_inventory.sub_classification)
                    .setString("sub_classification_id", to_inventory.sub_classification_id)
                    .setString("brand", to_inventory.brand)
                    .setString("brand_id", to_inventory.brand_id)
                    .setString("model", to_inventory.model)
                    .setString("model_id", to_inventory.model_id)
                    .setString("clinic", to_inventory.clinic)
                    .setString("clinic_id", to_inventory.clinic_id)
                    .setString("created_by", to_inventory.created_by)
                    .setString("updated_by", to_inventory.updated_by)
                    .setString("created_at", to_inventory.created_at)
                    .setString("updated_at", to_inventory.updated_at)
                    .setNumber("status", to_inventory.status)
                    .setNumber("is_uploaded", to_inventory.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_inventory to_inventory) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from inventory  "
                    + " where id='" + to_inventory.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_inventory> ret_data(String where) {
        List<to_inventory> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",item_code"
                    + ",generic_name"
                    + ",description"
                    + ",uom"
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
                    + " from inventory"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String item_code = rs.getString(2);
                String generic_name = rs.getString(3);
                String description = rs.getString(4);
                String uom = rs.getString(5);
                String type_of_use = rs.getString(6);
                double product_qty = rs.getDouble(7);
                double cost = rs.getDouble(8);
                double selling_price = rs.getDouble(9);
                double reorder_level = rs.getDouble(10);
                String category = rs.getString(11);
                String category_id = rs.getString(12);
                String classification = rs.getString(13);
                String classification_id = rs.getString(14);
                String sub_classification = rs.getString(15);
                String sub_classification_id = rs.getString(16);
                String brand = rs.getString(17);
                String brand_id = rs.getString(18);
                String model = rs.getString(19);
                String model_id = rs.getString(20);
                String clinic = rs.getString(21);
                String clinic_id = rs.getString(22);
                String created_by = rs.getString(23);
                String updated_by = rs.getString(24);
                String created_at = rs.getString(25);
                String updated_at = rs.getString(26);
                int status = rs.getInt(27);
                int is_uploaded = rs.getInt(28);

                to_inventory to = new to_inventory(id, item_code, generic_name, description, uom, type_of_use, product_qty, cost, selling_price, reorder_level, category, category_id, classification, classification_id, sub_classification, sub_classification_id, brand, brand_id, model, model_id, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(increment_id("1"));
    }
    public static String increment_id(String clinic_id) {
        String id = "00000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from inventory where clinic_id='" + clinic_id + "' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select item_code from inventory where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "00000";
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
