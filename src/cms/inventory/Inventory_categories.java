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
public class Inventory_categories {

    public static class to_inventory_categories {

        public final int id;
        public final String category;
        public final String clinic;
        public final String clinic_id;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_inventory_categories(int id, String category, String clinic, String clinic_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.category = category;
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

    public static void add_data(to_inventory_categories to_inventory_categories) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into inventory_categories("
                    + "category"
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":category"
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
                    .setString("category", to_inventory_categories.category)
                    .setString("clinic", to_inventory_categories.clinic)
                    .setString("clinic_id", to_inventory_categories.clinic_id)
                    .setString("created_by", to_inventory_categories.created_by)
                    .setString("updated_by", to_inventory_categories.updated_by)
                    .setString("created_at", to_inventory_categories.created_at)
                    .setString("updated_at", to_inventory_categories.updated_at)
                    .setNumber("status", to_inventory_categories.status)
                    .setNumber("is_uploaded", to_inventory_categories.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory_categories.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_inventory_categories to_inventory_categories) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update inventory_categories set "
                    + "category= :category "
                    + ",clinic= :clinic "
                    + ",clinic_id= :clinic_id "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_inventory_categories.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("category", to_inventory_categories.category)
                    .setString("clinic", to_inventory_categories.clinic)
                    .setString("clinic_id", to_inventory_categories.clinic_id)
                    .setString("created_by", to_inventory_categories.created_by)
                    .setString("updated_by", to_inventory_categories.updated_by)
                    .setString("created_at", to_inventory_categories.created_at)
                    .setString("updated_at", to_inventory_categories.updated_at)
                    .setNumber("status", to_inventory_categories.status)
                    .setNumber("is_uploaded", to_inventory_categories.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory_categories.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_inventory_categories to_inventory_categories) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from inventory_categories  "
                    + " where id='" + to_inventory_categories.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Inventory_categories.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_inventory_categories> ret_data(String where) {
        List<to_inventory_categories> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",category"
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from inventory_categories"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String category = rs.getString(2);
                String clinic = rs.getString(3);
                String clinic_id = rs.getString(4);
                String created_by = rs.getString(5);
                String updated_by = rs.getString(6);
                String created_at = rs.getString(7);
                String updated_at = rs.getString(8);
                int status = rs.getInt(9);
                int is_uploaded = rs.getInt(10);

                to_inventory_categories to = new to_inventory_categories(id, category, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
