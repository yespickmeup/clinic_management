/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.inventory;


import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.FitIn;

/**
 *
 * @author Guinness
 */
public class UnitOfMeasure {

    public static void main2(String[] args) {
        String uoms = "[pc:765.00/1^1],[box:14000.01/100^0],[sack:15000.50/105^0]";
        String[] list = uoms.split(",");
        for (String s : list) {
            int i = s.indexOf(":");
            int ii = s.indexOf("/");
            int iii = s.indexOf("^");
            String uom = s.substring(1, i);
            double conversion = FitIn.toDouble(s.substring(ii + 1, s.length() - 1));
            double selling_price = FitIn.toDouble(s.substring(i + 1, ii));
            int is_default = FitIn.toInt(s.substring(iii + 1, s.length() - 1));
            System.out.println("Uom: " + uom);
            System.out.println("Conversion : " + FitIn.fmt_woc(conversion));
            System.out.println("Price: " + FitIn.fmt_wc_0(selling_price));
            System.out.println("Default: " + is_default);
        }
    }

    public static String convert_to_string(String uom, double conversion, double selling_price, int is_default) {
        String uoms = "[" + uom + ":" + selling_price + "/" + conversion + "^" + is_default + "]";
        return uoms;
    }

    public static String convert_to_string2(String uoms, Dlg_inventory_uom.to_uom default_uom) {
        List<Dlg_inventory_uom.to_uom> datas = new ArrayList();
        String[] list = uoms.split(",");
        int exist = 0;
        for (String s : list) {
            int i = s.indexOf(":");
            int ii = s.indexOf("/");
            int iii = s.indexOf("^");
            String uom = s.substring(1, i);
            double conversion = FitIn.toDouble(s.substring(ii + 1, s.length() - 1));
            double selling_price = FitIn.toDouble(s.substring(i + 1, ii));
            int is_default = FitIn.toInt(s.substring(iii + 1, s.length() - 1));
            if (default_uom.uom.equalsIgnoreCase(uom)) {
                is_default = 1;
                conversion = default_uom.conversion;
                selling_price = default_uom.selling_price;
                exist = 1;
            }
            Dlg_inventory_uom.to_uom to = new Dlg_inventory_uom.to_uom(0, uom, conversion, selling_price, is_default);
            datas.add(to);
        }
        if (exist == 0) {
            datas.add(default_uom);
        }
        String uom = "";
        for (Dlg_inventory_uom.to_uom to : datas) {
            uom = uom + ",[" + to.uom + ":" + to.selling_price + "/" + to.conversion + "^" + to.is_default + "]";
        }
        uom = uom.substring(1, uom.length());
        return uom;
    }

    public static Dlg_inventory_uom.to_uom default_uom(String uoms) {

        try {
            String[] list = uoms.split(",");
            Dlg_inventory_uom.to_uom to = new Dlg_inventory_uom.to_uom(0, "", 0, 0, 0);

            for (String s : list) {
                int i = s.indexOf(":");
                int ii = s.indexOf("/");
                int iii = s.indexOf("^");

                String uom = s.substring(1, i);
                double conversion = FitIn.toDouble(s.substring(ii + 1, s.length() - 1));
                double selling_price = FitIn.toDouble(s.substring(i + 1, ii));
                int is_default = FitIn.toInt(s.substring(iii + 1, s.length() - 1));
                if (is_default == 1) {
                    to = new Dlg_inventory_uom.to_uom(0, uom, conversion, selling_price, is_default);
                    break;
                }
            }
            return to;
        } catch (Exception e) {
            return null;
        }

    }

   
}
