


drop schema if exist db_clinic;
create schema db_clinic;
use db_clinic;

drop table if exists allergy_medicines;
create table allergy_medicines(
id int auto_increment primary key
,allergy varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists allergy_others;
create table allergy_others(
id int auto_increment primary key
,allergy varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists clinics;
create table clinics(
id int auto_increment primary key
,clinic varchar(255)
,address varchar(255)
,contact_no varchar(255)
,email_address varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists degrees;
create table degrees(
id int auto_increment primary key
,degree varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists departments;
create table departments(
id int auto_increment primary key
,department varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists designations;
create table designations(
id int auto_increment primary key
,designation varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);


drop table if exists doctors;
create table doctors(
id int auto_increment primary key
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,sname varchar(255)
,degree varchar(255)
,registration_no varchar(255)
,designation varchar(255)
,specialization varchar(255)
,address varchar(255)
,barangay varchar(255)
,city varchar(255)
,province varchar(255)
,country varchar(255)
,contact_no varchar(255)
,email_address varchar(255)
,department varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);



drop table if exists occupations;
create table occupations(
id int auto_increment primary key
,occupation varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists patients;
create table patients(
id int auto_increment primary key
,fname varchar(255)
,mi varchar(255)
,lname varchar(255)
,sname varchar(255)
,bday date
,gender int
,blood_type varchar(255)
,address varchar(255)
,barangay varchar(255)
,city varchar(255)
,province varchar(255)
,country varchar(255)
,contact_no varchar(255)
,email_address varchar(255)
,allergy_medicine varchar(255)
,allergy_others varchar(255)
,is_smoking int
,is_alcohol int
,is_drug_abuse int
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists specializations;
create table specializations(
id int auto_increment primary key
,specialization varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists user_default_priveleges;
create table user_default_priveleges(
id int auto_increment primary key
,account varchar(255)
,name varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists user_priveleges;
create table user_priveleges(
id int auto_increment primary key
,account varchar(255)
,privelege varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);


drop table if exists users;
create table users(
id int auto_increment primary key
,screen_name varchar(255)
,user_name varchar(255)
,password varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,doctor varchar(255)
,doctor_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);



drop table if exists out_patient_departments;
create table out_patient_departments(
id int auto_increment primary key
,opd_no varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,doctor varchar(255)
,doctor_id varchar(255)
,patient varchar(255)
,patient_id varchar(255)
,patient_bday date
,patient_gender int
,patient_blood_type varchar(255)
,patient_address varchar(255)
,patient_allergy_medicine varchar(255)
,patient_allergy_others varchar(255)
,patient_is_smoking int
,patient_is_alcohol int
,patient_is_drug_abuse int
,opd_date date
,opd_time varchar(255)
,opd_type varchar(255)
,patient_height double
,patient_weight double
,patient_bmi double
,patient_pressure varchar(255)
,patient_pulse double
,patient_temperature double
,patient_respiratory double
,patient_waist double
,patient_hip double
,patient_spo2 double
,complaints text
,past_personal_family_history text
,investigation text
,findings text
,provisional_diagnosis text
,remarks text
,followup_days int
,followup_date date
,referred_to varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists out_patient_department_prescriptions;
create table out_patient_department_prescriptions(
id int auto_increment primary key
,opd_no varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,doctor varchar(255)
,doctor_id varchar(255)
,patient varchar(255)
,patient_id varchar(255)
,opd_date date
,opd_time varchar(255)
,opd_type varchar(255)
,item_code  varchar(255)
,generic_name  varchar(255)
,description varchar(255)
,uom varchar(255)
,qty double
,dosage varchar(255)
,dosage_qty double
,days int
,dosage_remarks varchar(255)
,remarks varchar(255)
,cost double
,selling_price double
,discount_amount double
,type_of_use  varchar(255)
,category  varchar(255)
,category_id varchar(255)
,classification varchar(255)
,classification_id varchar(255)
,sub_classification varchar(255)
,sub_classification_id varchar(255)
,brand varchar(255)
,brand_id varchar(255)
,model varchar(255)
,model_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists out_patient_department_receipts;
create table out_patient_department_receipts(
id int auto_increment primary key
,opd_no varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,doctor varchar(255)
,doctor_id varchar(255)
,patient varchar(255)
,patient_id varchar(255)
,opd_date date
,opd_time varchar(255)
,opd_type varchar(255)
,receipt_no varchar(255)
,receipt_date date
,reference_no varchar(255)
,amount_due double
,discount double
,cash double
,check_bank varchar(255)
,check_no varchar(255)
,check_holder varchar(255)
,check_amount double
,check_date date
,credit_card_type varchar(255)
,credit_card_holder varchar(255)
,credit_card_app_code varchar(255)
,credit_card_rate double
,credit_card_amount double
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists out_patient_department_receipt_items;
create table out_patient_department_receipt_items(
id int auto_increment primary key
,opd_no varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,doctor varchar(255)
,doctor_id varchar(255)
,patient varchar(255)
,patient_id varchar(255)
,opd_date date
,opd_time varchar(255)
,opd_type varchar(255)
,receipt_no varchar(255)
,receipt_date date
,reference_no varchar(255)
,particular varchar(255)
,particular_id varchar(255)
,amount double
,discount double
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);


drop table if exists inventory;
create table inventory(
id int auto_increment primary key
,item_code  varchar(255)
,generic_name  varchar(255)
,description varchar(255)
,uom varchar(255)
,type_of_use  varchar(255)
,product_qty double
,cost double
,selling_price double
,reorder_level double
,category  varchar(255)
,category_id varchar(255)
,classification varchar(255)
,classification_id varchar(255)
,sub_classification varchar(255)
,sub_classification_id varchar(255)
,brand varchar(255)
,brand_id varchar(255)
,model varchar(255)
,model_id varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists inventory_prescriptions;
create table inventory_prescriptions(
id int auto_increment primary key
,item_code  varchar(255)
,generic_name  varchar(255)
,description varchar(255)
,uom varchar(255)
,dosage varchar(255)
,days int
,dosage_qty double
,dosage_remarks varchar(255)
,remarks varchar(255)
,type_of_use  varchar(255)
,product_qty double
,cost double
,selling_price double
,reorder_level double
,category  varchar(255)
,category_id varchar(255)
,classification varchar(255)
,classification_id varchar(255)
,sub_classification varchar(255)
,sub_classification_id varchar(255)
,brand varchar(255)
,brand_id varchar(255)
,model varchar(255)
,model_id varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists doctor_daily_schedules;
create table doctor_daily_schedules(
id int auto_increment primary key
,day varchar(255)
,time varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,doctor varchar(255)
,doctor_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists doctor_none_working_days;
create table doctor_none_working_days(
id int auto_increment primary key
,date varchar(255)
,am int
,pm int
,time_interval varchar(255)
,remarks varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,doctor varchar(255)
,doctor_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists appointments;
create table appointments(
id int auto_increment primary key
,clinic varchar(255)
,clinic_id varchar(255)
,doctor varchar(255)
,doctor_id varchar(255)
,patient_id varchar(255)
,patient_fname varchar(255)
,patient_mi varchar(255)
,patient_lname varchar(255)
,patient_sname varchar(255)
,patient_bday date
,patient_gender varchar(255)
,patient_blood_type varchar(255)
,appointment_date date
,appointment_time varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists inventory_categories;
create table inventory_categories(
id int auto_increment primary key
,category varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists inventory_classifications;
create table inventory_classifications(
id int auto_increment primary key
,classification varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists inventory_sub_classifications;
create table inventory_sub_classifications(
id int auto_increment primary key
,sub_classification varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists inventory_brands;
create table inventory_brands(
id int auto_increment primary key
,brand varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists inventory_models;
create table inventory_models(
id int auto_increment primary key
,model varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists receipt_particulars;
create table receipt_particulars(
id int auto_increment primary key
,particular varchar(255)
,charge double
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_complaints;
create table option_complaints(
id int auto_increment primary key
,complaint varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_history_categories;
create table option_history_categories(
id int auto_increment primary key
,category varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_history_classifications;
create table option_history_classifications(
id int auto_increment primary key
,category varchar(255)
,category_id varchar(255)
,classification varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_history_sub_classifications;
create table option_history_sub_classifications(
id int auto_increment primary key
,category varchar(255)
,category_id varchar(255)
,classification varchar(255)
,classification_id varchar(255)
,sub_classification varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_investigation_categories;
create table option_investigation_categories(
id int auto_increment primary key
,category varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_investigation_details;
create table option_investigation_details(
id int auto_increment primary key
,category varchar(255)
,category_id varchar(255)
,details varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_findings_categories;
create table option_findings_categories(
id int auto_increment primary key
,category varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_findings_classifications;
create table option_findings_classifications(
id int auto_increment primary key
,category varchar(255)
,category_id varchar(255)
,classification varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_findings_details;
create table option_findings_details(
id int auto_increment primary key
,category varchar(255)
,category_id varchar(255)
,classification varchar(255)
,classification_id varchar(255)
,details varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_diagnosis_categories;
create table option_diagnosis_categories(
id int auto_increment primary key
,category varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_diagnosis_classifications;
create table option_diagnosis_classifications(
id int auto_increment primary key
,category varchar(255)
,category_id varchar(255)
,classification varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_diagnosis_details;
create table option_diagnosis_details(
id int auto_increment primary key
,category varchar(255)
,category_id varchar(255)
,classification varchar(255)
,classification_id varchar(255)
,details varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);

drop table if exists option_remarks_categories;
create table option_remarks_categories(
id int auto_increment primary key
,category varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);


drop table if exists option_remarks_details;
create table option_remarks_details(
id int auto_increment primary key
,category varchar(255)
,category_id varchar(255)
,details varchar(255)
,clinic varchar(255)
,clinic_id varchar(255)
,created_by varchar(255)
,updated_by varchar(255)
,created_at datetime
,updated_at datetime
,status int
,is_uploaded int
);


