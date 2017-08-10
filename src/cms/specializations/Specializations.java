/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.specializations;

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
public class Specializations {

    public static class to_specializations {

        public final int id;
        public final String specialization;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_specializations(int id, String specialization, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.specialization = specialization;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_specializations to_specializations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into specializations("
                    + "specialization"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":specialization"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("specialization", to_specializations.specialization)
                    .setString("created_by", to_specializations.created_by)
                    .setString("updated_by", to_specializations.updated_by)
                    .setString("created_at", to_specializations.created_at)
                    .setString("updated_at", to_specializations.updated_at)
                    .setNumber("status", to_specializations.status)
                    .setNumber("is_uploaded", to_specializations.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Specializations.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_specializations to_specializations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update specializations set "
                    + "specialization= :specialization "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_specializations.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("specialization", to_specializations.specialization)
                    .setString("created_by", to_specializations.created_by)
                    .setString("updated_by", to_specializations.updated_by)
                    .setString("created_at", to_specializations.created_at)
                    .setString("updated_at", to_specializations.updated_at)
                    .setNumber("status", to_specializations.status)
                    .setNumber("is_uploaded", to_specializations.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Specializations.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_specializations to_specializations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from specializations  "
                    + " where id='" + to_specializations.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Specializations.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_specializations> ret_data(String where) {
        List<to_specializations> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",specialization"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from specializations"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String specialization = rs.getString(2);
                String created_by = rs.getString(3);
                String updated_by = rs.getString(4);
                String created_at = rs.getString(5);
                String updated_at = rs.getString(6);
                int status = rs.getInt(7);
                int is_uploaded = rs.getInt(8);

                to_specializations to = new to_specializations(id, specialization, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
