/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.options;

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
public class Option_diagnosis_classifications {

    public static class to_option_diagnosis_classifications {

        public final int id;
        public final String category;
        public final String category_id;
        public final String classification;
        public final String clinic;
        public final String clinic_id;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_option_diagnosis_classifications(int id, String category, String category_id, String classification, String clinic, String clinic_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.category = category;
            this.category_id = category_id;
            this.classification = classification;
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

    public static void add_data(to_option_diagnosis_classifications to_option_diagnosis_classifications) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into option_diagnosis_classifications("
                    + "category"
                    + ",category_id"
                    + ",classification"
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
                    + ",:category_id"
                    + ",:classification"
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
                    .setString("category", to_option_diagnosis_classifications.category)
                    .setString("category_id", to_option_diagnosis_classifications.category_id)
                    .setString("classification", to_option_diagnosis_classifications.classification)
                    .setString("clinic", to_option_diagnosis_classifications.clinic)
                    .setString("clinic_id", to_option_diagnosis_classifications.clinic_id)
                    .setString("created_by", to_option_diagnosis_classifications.created_by)
                    .setString("updated_by", to_option_diagnosis_classifications.updated_by)
                    .setString("created_at", to_option_diagnosis_classifications.created_at)
                    .setString("updated_at", to_option_diagnosis_classifications.updated_at)
                    .setNumber("status", to_option_diagnosis_classifications.status)
                    .setNumber("is_uploaded", to_option_diagnosis_classifications.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Option_diagnosis_classifications.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_option_diagnosis_classifications to_option_diagnosis_classifications) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update option_diagnosis_classifications set "
                    + "category= :category "
                    + ",category_id= :category_id "
                    + ",classification= :classification "
                    + ",clinic= :clinic "
                    + ",clinic_id= :clinic_id "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_option_diagnosis_classifications.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("category", to_option_diagnosis_classifications.category)
                    .setString("category_id", to_option_diagnosis_classifications.category_id)
                    .setString("classification", to_option_diagnosis_classifications.classification)
                    .setString("clinic", to_option_diagnosis_classifications.clinic)
                    .setString("clinic_id", to_option_diagnosis_classifications.clinic_id)
                    .setString("created_by", to_option_diagnosis_classifications.created_by)
                    .setString("updated_by", to_option_diagnosis_classifications.updated_by)
                    .setString("created_at", to_option_diagnosis_classifications.created_at)
                    .setString("updated_at", to_option_diagnosis_classifications.updated_at)
                    .setNumber("status", to_option_diagnosis_classifications.status)
                    .setNumber("is_uploaded", to_option_diagnosis_classifications.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Option_diagnosis_classifications.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_option_diagnosis_classifications to_option_diagnosis_classifications) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from option_diagnosis_classifications  "
                    + " where id='" + to_option_diagnosis_classifications.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Option_diagnosis_classifications.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_option_diagnosis_classifications> ret_data(String where) {
        List<to_option_diagnosis_classifications> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",category"
                    + ",category_id"
                    + ",classification"
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from option_diagnosis_classifications"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String category = rs.getString(2);
                String category_id = rs.getString(3);
                String classification = rs.getString(4);
                String clinic = rs.getString(5);
                String clinic_id = rs.getString(6);
                String created_by = rs.getString(7);
                String updated_by = rs.getString(8);
                String created_at = rs.getString(9);
                String updated_at = rs.getString(10);
                int status = rs.getInt(11);
                int is_uploaded = rs.getInt(12);

                to_option_diagnosis_classifications to = new to_option_diagnosis_classifications(id, category, category_id, classification, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
