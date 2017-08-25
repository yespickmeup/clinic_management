/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.receipts;

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
public class Receipt_particulars {

    public static class to_receipt_particulars {

        public final int id;
        public final String particular;
        public final double charge;
        public final String clinic;
        public final String clinic_id;
        public final String created_by;
        public final String updated_by;
        public final String created_at;
        public final String updated_at;
        public final int status;
        public final int is_uploaded;

        public to_receipt_particulars(int id, String particular, double charge, String clinic, String clinic_id, String created_by, String updated_by, String created_at, String updated_at, int status, int is_uploaded) {
            this.id = id;
            this.particular = particular;
            this.charge = charge;
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

    public static void add_data(to_receipt_particulars to_receipt_particulars) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into receipt_particulars("
                    + "particular"
                    + ",charge"
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":particular"
                    + ",:charge"
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
                    .setString("particular", to_receipt_particulars.particular)
                    .setNumber("charge", to_receipt_particulars.charge)
                    .setString("clinic", to_receipt_particulars.clinic)
                    .setString("clinic_id", to_receipt_particulars.clinic_id)
                    .setString("created_by", to_receipt_particulars.created_by)
                    .setString("updated_by", to_receipt_particulars.updated_by)
                    .setString("created_at", to_receipt_particulars.created_at)
                    .setString("updated_at", to_receipt_particulars.updated_at)
                    .setNumber("status", to_receipt_particulars.status)
                    .setNumber("is_uploaded", to_receipt_particulars.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Receipt_particulars.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_receipt_particulars to_receipt_particulars) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update receipt_particulars set "
                    + "particular= :particular "
                    + ",charge= :charge "
                    + ",clinic= :clinic "
                    + ",clinic_id= :clinic_id "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_receipt_particulars.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("particular", to_receipt_particulars.particular)
                    .setNumber("charge", to_receipt_particulars.charge)
                    .setString("clinic", to_receipt_particulars.clinic)
                    .setString("clinic_id", to_receipt_particulars.clinic_id)
                    .setString("created_by", to_receipt_particulars.created_by)
                    .setString("updated_by", to_receipt_particulars.updated_by)
                    .setString("created_at", to_receipt_particulars.created_at)
                    .setString("updated_at", to_receipt_particulars.updated_at)
                    .setNumber("status", to_receipt_particulars.status)
                    .setNumber("is_uploaded", to_receipt_particulars.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Receipt_particulars.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_receipt_particulars to_receipt_particulars) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from receipt_particulars  "
                    + " where id='" + to_receipt_particulars.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Receipt_particulars.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_receipt_particulars> ret_data(String where) {
        List<to_receipt_particulars> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",particular"
                    + ",charge"
                    + ",clinic"
                    + ",clinic_id"
                    + ",created_by"
                    + ",updated_by"
                    + ",created_at"
                    + ",updated_at"
                    + ",status"
                    + ",is_uploaded"
                    + " from receipt_particulars"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String particular = rs.getString(2);
                double charge = rs.getDouble(3);
                String clinic = rs.getString(4);
                String clinic_id = rs.getString(5);
                String created_by = rs.getString(6);
                String updated_by = rs.getString(7);
                String created_at = rs.getString(8);
                String updated_at = rs.getString(9);
                int status = rs.getInt(10);
                int is_uploaded = rs.getInt(11);

                to_receipt_particulars to = new to_receipt_particulars(id, particular, charge, clinic, clinic_id, created_by, updated_by, created_at, updated_at, status, is_uploaded);
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
