/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  RAZOR Defianz
 * Created: Sep 7, 2017
 */

drop table if exist settings;
create table settings(
id int auto_increment primary key
,company_name varchar(255)
,company_address varchar(255)
,company_operated_by varchar(255)
,company_slogan varchar(255)
,company_contact_no varchar(255)
,company_fax_no varchar(255)
,company_email_address varchar(255)
,bir_serial_no varchar(255)
,bir_permit_no varchar(255)
,bir_accreditation_no varchar(255)
,bir_tin varchar(255)
,bir_machine_no varchar(255)
,bir_min_no varchar(255)
,bir_business_name varchar(255)
,bir_vat_percent varchar(255)
,bir_receipt_footer varchar(255)
,receipt_print_ting_enabled int
,receipt_printer_show_dialog int
,kitchen_printing_enable int
,allow_negative_inventory int
,is_servcer int
,developer varchar(255)
,developer_address varchar(255)
,developer_tin_no varchar(255)
,developer_accreditation_no varchar(255)
,developer_accreditation_date varchar(255)
,developer_contact_no varchar(255)
);

insert into settings(
 company_name
,company_address
,company_operated_by
,company_slogan
,company_contact_no
,company_fax_no
,company_email_address
,bir_serial_no
,bir_permit_no
,bir_accreditation_no
,bir_tin
,bir_machine_no
,bir_min_no
,bir_business_name
,bir_vat_percent
,bir_receipt_footer
,receipt_print_ting_enabled
,receipt_printer_show_dialog
,kitchen_printing_enable
,allow_negative_inventory
,is_servcer
,developer
,developer_address
,developer_tin_no
,developer_accreditation_no
,developer_accreditation_date
,developer_contact_no
)values(
''
,''
,''
,''
,''
,''
,''
,''
,''
,''
,''
,''
,''
,''
,''
,''
,0
,0
,0
,1
,0
,'Synapse Software Technologies'
,'Daro, Dumaguete City, Negros Oriental'
,''
,''
,''
,''
);