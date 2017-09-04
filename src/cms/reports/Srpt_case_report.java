/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.reports;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author RAZOR Defianz
 */
public class Srpt_case_report {
    
    public final String clinic_name;
    public final String clinic_address;
    public final String clinic_contact_no;
    public final String patient_id;
    public final String  patient_name;
    public final String bday;
    public final String age;
    public final String gender;
    public final String allergy_drug;
    public final String allergy_others;
    public final String blood_group;
    public final String height;
    public final String weight;
    public final String temperature;
    public final String bp;
    public final String pulse;
    public final String respiratory;
    public final String spo2;
    public final String is_smoking;
    public final String is_alcohol;
    public final String is_drugs;
    public final String complaints;
    public final String history;
    public final String investigation;
    public final List<field> fields;

    public Srpt_case_report(String clinic_name, String clinic_address, String clinic_contact_no, String patient_id, String patient_name, String bday, String age, String gender, String allergy_drug, String allergy_others, String blood_group, String height, String weight, String temperature, String bp, String pulse, String respiratory, String spo2, String is_smoking, String is_alcohol, String is_drugs, String complaints, String history, String investigation) {
        this.clinic_name = clinic_name;
        this.clinic_address = clinic_address;
        this.clinic_contact_no = clinic_contact_no;
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.bday = bday;
        this.age = age;
        this.gender = gender;
        this.allergy_drug = allergy_drug;
        this.allergy_others = allergy_others;
        this.blood_group = blood_group;
        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.bp = bp;
        this.pulse = pulse;
        this.respiratory = respiratory;
        this.spo2 = spo2;
        this.is_smoking = is_smoking;
        this.is_alcohol = is_alcohol;
        this.is_drugs = is_drugs;
        this.complaints = complaints;
        this.history = history;
        this.investigation = investigation;
        this.fields = new ArrayList();
        
    }
    
    public static class field{
        double qty;
        String item_code;
        String description;
        String dosage;
        double days;
        double total;
        String dosage_remarks;

        public field() {
        }

        public field(double qty, String item_code, String description, String dosage, double days, double total, String dosage_remarks) {
            this.qty = qty;
            this.item_code = item_code;
            this.description = description;
            this.dosage = dosage;
            this.days = days;
            this.total = total;
            this.dosage_remarks = dosage_remarks;
        }

        public double getQty() {
            return qty;
        }

        public void setQty(double qty) {
            this.qty = qty;
        }

        public String getItem_code() {
            return item_code;
        }

        public void setItem_code(String item_code) {
            this.item_code = item_code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDosage() {
            return dosage;
        }

        public void setDosage(String dosage) {
            this.dosage = dosage;
        }

        public double getDays() {
            return days;
        }

        public void setDays(double days) {
            this.days = days;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        public String getDosage_remarks() {
            return dosage_remarks;
        }

        public void setDosage_remarks(String dosage_remarks) {
            this.dosage_remarks = dosage_remarks;
        }
        
    }
    
      public static void main(String[] args) {

      
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_case_report.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_case_report to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }
}
