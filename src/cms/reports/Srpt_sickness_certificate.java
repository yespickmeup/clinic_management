/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms.reports;

/**
 *
 * @author RAZOR Defianz
 */
public class Srpt_sickness_certificate {

    public final String clinic_name;
    public final String clinic_address;
    public final String clinic_contact_no;
    public final String patient_id;
    public final String patient_name;
    public final String sname;
    public final String days;

    public final String findings;

    public final String doctor;
    public final String doctor_id;
    public final String date;
    public final String stmt;
    public Srpt_sickness_certificate(String clinic_name, String clinic_address, String clinic_contact_no, String patient_id, String patient_name, String sname, String days, String findings, String doctor, String doctor_id, String date,String stmt) {
        this.clinic_name = clinic_name;
        this.clinic_address = clinic_address;
        this.clinic_contact_no = clinic_contact_no;
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.sname = sname;
        this.days = days;
        this.findings = findings;
        this.doctor = doctor;
        this.doctor_id = doctor_id;
        this.date = date;
        this.stmt=stmt;
    }

}
