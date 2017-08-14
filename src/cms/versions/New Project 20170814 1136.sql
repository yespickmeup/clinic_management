-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.15


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema db_clinic
--

CREATE DATABASE IF NOT EXISTS db_clinic;
USE db_clinic;

--
-- Definition of table `allergy_medicines`
--

DROP TABLE IF EXISTS `allergy_medicines`;
CREATE TABLE `allergy_medicines` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `allergy` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `allergy_medicines`
--

/*!40000 ALTER TABLE `allergy_medicines` DISABLE KEYS */;
/*!40000 ALTER TABLE `allergy_medicines` ENABLE KEYS */;


--
-- Definition of table `allergy_others`
--

DROP TABLE IF EXISTS `allergy_others`;
CREATE TABLE `allergy_others` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `allergy` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `allergy_others`
--

/*!40000 ALTER TABLE `allergy_others` DISABLE KEYS */;
/*!40000 ALTER TABLE `allergy_others` ENABLE KEYS */;


--
-- Definition of table `clinics`
--

DROP TABLE IF EXISTS `clinics`;
CREATE TABLE `clinics` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `clinic` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clinics`
--

/*!40000 ALTER TABLE `clinics` DISABLE KEYS */;
INSERT INTO `clinics` (`id`,`clinic`,`address`,`contact_no`,`email_address`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Clinic1','','','','','','2017-08-04 19:18:27','2017-08-04 19:18:27',0,0),
 (2,'Clinic2','','','','','','2017-08-04 19:19:27','2017-08-04 19:19:34',0,0);
/*!40000 ALTER TABLE `clinics` ENABLE KEYS */;


--
-- Definition of table `degrees`
--

DROP TABLE IF EXISTS `degrees`;
CREATE TABLE `degrees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `degree` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `degrees`
--

/*!40000 ALTER TABLE `degrees` DISABLE KEYS */;
INSERT INTO `degrees` (`id`,`degree`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (3,'Degree1','','','2017-08-07 14:22:21','2017-08-07 14:22:21',0,0),
 (4,'Degree2','','','2017-08-07 14:22:25','2017-08-07 14:22:25',0,0),
 (5,'Degree3','','','2017-08-07 14:22:29','2017-08-07 14:22:29',0,0),
 (6,'Degree4','','','2017-08-07 14:22:32','2017-08-07 14:22:32',0,0),
 (7,'Degree5','','','2017-08-07 14:22:36','2017-08-07 14:22:36',0,0),
 (8,'Degree6','','','2017-08-07 15:14:52','2017-08-07 15:14:52',0,0);
/*!40000 ALTER TABLE `degrees` ENABLE KEYS */;


--
-- Definition of table `departments`
--

DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departments`
--

/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` (`id`,`department`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (3,'Department1','','','2017-08-07 14:37:21','2017-08-07 14:37:21',0,0),
 (4,'Department2','','','2017-08-07 14:37:32','2017-08-07 14:37:32',0,0),
 (5,'Departmen3','','','2017-08-07 14:37:36','2017-08-07 14:37:36',0,0),
 (6,'Departmen4','','','2017-08-07 14:37:40','2017-08-07 14:37:40',0,0),
 (7,'Departmen5','','','2017-08-07 14:37:43','2017-08-07 14:37:43',0,0);
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;


--
-- Definition of table `designations`
--

DROP TABLE IF EXISTS `designations`;
CREATE TABLE `designations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `designation` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `designations`
--

/*!40000 ALTER TABLE `designations` DISABLE KEYS */;
INSERT INTO `designations` (`id`,`designation`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (2,'Designation1','','','2017-08-07 14:46:11','2017-08-07 14:46:11',0,0),
 (3,'Designation2','','','2017-08-07 14:46:14','2017-08-07 14:46:14',0,0),
 (4,'Designation3','','','2017-08-07 14:46:18','2017-08-07 14:46:18',0,0),
 (5,'Designation4','','','2017-08-07 14:46:21','2017-08-07 14:46:21',0,0),
 (6,'Designation5','','','2017-08-07 14:46:25','2017-08-07 14:46:25',0,0);
/*!40000 ALTER TABLE `designations` ENABLE KEYS */;


--
-- Definition of table `doctors`
--

DROP TABLE IF EXISTS `doctors`;
CREATE TABLE `doctors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(255) DEFAULT NULL,
  `mi` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `degree` varchar(255) DEFAULT NULL,
  `registration_no` varchar(255) DEFAULT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `specialization` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT '',
  `clinic_id` varchar(255) DEFAULT '',
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctors`
--

/*!40000 ALTER TABLE `doctors` DISABLE KEYS */;
INSERT INTO `doctors` (`id`,`fname`,`mi`,`lname`,`sname`,`degree`,`registration_no`,`designation`,`specialization`,`address`,`barangay`,`city`,`province`,`country`,`contact_no`,`email_address`,`department`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Juan','dela','Cruz','','','','Doctor','','','','','','','','','','Clinic2','2','','','2017-08-04 18:49:01','2017-08-04 19:27:58',0,0);
/*!40000 ALTER TABLE `doctors` ENABLE KEYS */;


--
-- Definition of table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
CREATE TABLE `inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_code` varchar(255) DEFAULT NULL,
  `generic_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `uom` varchar(255) DEFAULT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `days` int(11) DEFAULT NULL,
  `dosage_qty` double DEFAULT NULL,
  `dosage_remarks` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `type_of_use` varchar(255) DEFAULT NULL,
  `product_qty` double DEFAULT NULL,
  `cost` double DEFAULT NULL,
  `selling_price` double DEFAULT NULL,
  `reorder_level` double DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `classification_id` varchar(255) DEFAULT NULL,
  `sub_classification` varchar(255) DEFAULT NULL,
  `sub_classification_id` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `brand_id` varchar(255) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `model_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory`
--

/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;


--
-- Definition of table `occupations`
--

DROP TABLE IF EXISTS `occupations`;
CREATE TABLE `occupations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `occupation` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `occupations`
--

/*!40000 ALTER TABLE `occupations` DISABLE KEYS */;
/*!40000 ALTER TABLE `occupations` ENABLE KEYS */;


--
-- Definition of table `out_patient_department_prescriptions`
--

DROP TABLE IF EXISTS `out_patient_department_prescriptions`;
CREATE TABLE `out_patient_department_prescriptions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `opd_no` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `doctor` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `patient` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `opd_date` date DEFAULT NULL,
  `opd_time` varchar(255) DEFAULT NULL,
  `opd_type` varchar(255) DEFAULT NULL,
  `item_code` varchar(255) DEFAULT NULL,
  `generic_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `uom` varchar(255) DEFAULT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `days` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `dosage_remarks` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `cost` double DEFAULT NULL,
  `selling_price` double DEFAULT NULL,
  `discount_amount` double DEFAULT NULL,
  `type_of_use` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `classification_id` varchar(255) DEFAULT NULL,
  `sub_classification` varchar(255) DEFAULT NULL,
  `sub_classification_id` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `brand_id` varchar(255) DEFAULT NULL,
  `model` varchar(255) DEFAULT NULL,
  `model_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_department_prescriptions`
--

/*!40000 ALTER TABLE `out_patient_department_prescriptions` DISABLE KEYS */;
/*!40000 ALTER TABLE `out_patient_department_prescriptions` ENABLE KEYS */;


--
-- Definition of table `out_patient_department_receipts`
--

DROP TABLE IF EXISTS `out_patient_department_receipts`;
CREATE TABLE `out_patient_department_receipts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `opd_no` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `doctor` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `patient` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `opd_date` date DEFAULT NULL,
  `opd_time` varchar(255) DEFAULT NULL,
  `opd_type` varchar(255) DEFAULT NULL,
  `receipt_no` varchar(255) DEFAULT NULL,
  `receipt_date` date DEFAULT NULL,
  `amount_due` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `cash` double DEFAULT NULL,
  `check_bank` varchar(255) DEFAULT NULL,
  `check_no` varchar(255) DEFAULT NULL,
  `check_holder` varchar(255) DEFAULT NULL,
  `check_amount` double DEFAULT NULL,
  `check_date` date DEFAULT NULL,
  `credit_card_type` varchar(255) DEFAULT NULL,
  `credit_card_holder` varchar(255) DEFAULT NULL,
  `credit_card_app_code` varchar(255) DEFAULT NULL,
  `credit_card_rate` double DEFAULT NULL,
  `credit_card_amount` double DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_department_receipts`
--

/*!40000 ALTER TABLE `out_patient_department_receipts` DISABLE KEYS */;
/*!40000 ALTER TABLE `out_patient_department_receipts` ENABLE KEYS */;


--
-- Definition of table `out_patient_departments`
--

DROP TABLE IF EXISTS `out_patient_departments`;
CREATE TABLE `out_patient_departments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `opd_no` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `doctor` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `patient` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `opd_date` date DEFAULT NULL,
  `opd_time` varchar(255) DEFAULT NULL,
  `opd_type` varchar(255) DEFAULT NULL,
  `patient_height` double DEFAULT NULL,
  `patient_weight` double DEFAULT NULL,
  `patient_bmi` double DEFAULT NULL,
  `patient_pressure` varchar(255) DEFAULT NULL,
  `patient_pulse` double DEFAULT NULL,
  `patient_temperature` double DEFAULT NULL,
  `patient_respiratory` double DEFAULT NULL,
  `patient_waist` double DEFAULT NULL,
  `patient_hip` double DEFAULT NULL,
  `patient_spo2` double DEFAULT NULL,
  `complaints` text,
  `past_personal_family_history` text,
  `investigation` text,
  `findings` text,
  `provisional_diagnosis` text,
  `remarks` text,
  `followup_days` int(11) DEFAULT NULL,
  `followup_date` date DEFAULT NULL,
  `referred_to` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_departments`
--

/*!40000 ALTER TABLE `out_patient_departments` DISABLE KEYS */;
/*!40000 ALTER TABLE `out_patient_departments` ENABLE KEYS */;


--
-- Definition of table `patients`
--

DROP TABLE IF EXISTS `patients`;
CREATE TABLE `patients` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(255) DEFAULT NULL,
  `mi` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `bday` date DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `blood_type` varchar(255) DEFAULT NULL,
  `occupation` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `barangay` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `contact_no` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `allergy_medicine` varchar(255) DEFAULT NULL,
  `allergy_others` varchar(255) DEFAULT NULL,
  `is_smoking` int(11) DEFAULT NULL,
  `is_alcohol` int(11) DEFAULT NULL,
  `is_drug_abuse` int(11) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT '',
  `clinic_id` varchar(255) DEFAULT '',
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patients`
--

/*!40000 ALTER TABLE `patients` DISABLE KEYS */;
/*!40000 ALTER TABLE `patients` ENABLE KEYS */;


--
-- Definition of table `specializations`
--

DROP TABLE IF EXISTS `specializations`;
CREATE TABLE `specializations` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `specialization` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `specializations`
--

/*!40000 ALTER TABLE `specializations` DISABLE KEYS */;
INSERT INTO `specializations` (`id`,`specialization`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (4,'Specialization1','','','2017-08-07 14:56:37','2017-08-07 14:56:37',0,0),
 (5,'Specialization2','','','2017-08-07 14:56:41','2017-08-07 14:56:41',0,0),
 (6,'Specialization3','','','2017-08-07 14:56:44','2017-08-07 14:56:44',0,0),
 (7,'Specialization4','','','2017-08-07 14:56:47','2017-08-07 14:56:47',0,0),
 (8,'Specialization5','','','2017-08-07 14:56:51','2017-08-07 14:56:51',0,0);
/*!40000 ALTER TABLE `specializations` ENABLE KEYS */;


--
-- Definition of table `user_default_priveleges`
--

DROP TABLE IF EXISTS `user_default_priveleges`;
CREATE TABLE `user_default_priveleges` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT '',
  `updated_by` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `is_uploaded` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_default_priveleges`
--

/*!40000 ALTER TABLE `user_default_priveleges` DISABLE KEYS */;
INSERT INTO `user_default_priveleges` (`id`,`account`,`name`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Administrator','Users','','',NULL,NULL,0,0),
 (2,'Administrator','Doctors','','',NULL,NULL,0,0),
 (3,'Administrator','Patients','','',NULL,NULL,0,0);
/*!40000 ALTER TABLE `user_default_priveleges` ENABLE KEYS */;


--
-- Definition of table `user_priveleges`
--

DROP TABLE IF EXISTS `user_priveleges`;
CREATE TABLE `user_priveleges` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `privelege` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_priveleges`
--

/*!40000 ALTER TABLE `user_priveleges` DISABLE KEYS */;
INSERT INTO `user_priveleges` (`id`,`account`,`privelege`,`user_id`,`user_name`) VALUES 
 (2,'Administrator','Doctors - (View)','1','admin'),
 (3,'Administrator','Doctors - (Add)','1','admin'),
 (5,'Administrator','Doctors - (Delete)','1','admin'),
 (6,'Administrator','Doctors - (Finalize)','1','admin'),
 (7,'Administrator','Patients - (View)','1','admin'),
 (8,'Administrator','Patients - (Add)','1','admin'),
 (10,'Administrator','Patients - (Delete)','1','admin'),
 (11,'Administrator','Patients - (Finalize)','1','admin'),
 (12,'Administrator','Users - (Finalize)','1','admin'),
 (13,'Administrator','Users - (Delete)','1','admin'),
 (15,'Administrator','Users - (Add)','1','admin'),
 (16,'Administrator','Users - (View)','1','admin'),
 (17,'Administrator','Users - (Edit)','2','doctor');
/*!40000 ALTER TABLE `user_priveleges` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `screen_name` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT '',
  `clinic_id` varchar(255) DEFAULT '',
  `doctor` varchar(255) DEFAULT '',
  `doctor_id` varchar(255) DEFAULT '',
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `is_uploaded` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`,`screen_name`,`user_name`,`password`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Administrator','admin11','admin','','','','',NULL,'2017-08-04 11:17:43',0,0),
 (2,'Doctor','doctor','doctor','','','','',NULL,NULL,0,0),
 (3,'Receptionist','reception','reception','','','','',NULL,NULL,0,0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
