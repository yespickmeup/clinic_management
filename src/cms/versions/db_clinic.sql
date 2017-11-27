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
-- Definition of table `appointments`
--

DROP TABLE IF EXISTS `appointments`;
CREATE TABLE `appointments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `doctor` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `patient_fname` varchar(255) DEFAULT NULL,
  `patient_mi` varchar(255) DEFAULT NULL,
  `patient_lname` varchar(255) DEFAULT NULL,
  `patient_sname` varchar(255) DEFAULT NULL,
  `patient_bday` date DEFAULT NULL,
  `patient_gender` varchar(255) DEFAULT NULL,
  `patient_blood_type` varchar(255) DEFAULT NULL,
  `appointment_date` date DEFAULT NULL,
  `appointment_time` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointments`
--

/*!40000 ALTER TABLE `appointments` DISABLE KEYS */;
INSERT INTO `appointments` (`id`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient_id`,`patient_fname`,`patient_mi`,`patient_lname`,`patient_sname`,`patient_bday`,`patient_gender`,`patient_blood_type`,`appointment_date`,`appointment_time`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Clinic2','2','Doctor Juan dela Cruz','1','2','Ronald','Cadayday','Pascua','','2017-08-15','Male','A','2017-08-17','08:00am','','','2017-08-17 23:31:04','2017-08-17 23:31:04',0,0),
 (2,'Clinic2','2','Doctor Juan dela Cruz','1','2','Ronald','Cadayday','Pascua','','2017-08-15','Male','A','2017-08-17','10:00am','','','2017-08-17 23:31:07','2017-08-17 23:31:07',0,0),
 (3,'Clinic2','2','Doctor Juan dela Cruz','1','2','Ronald','Cadayday','Pascua','','2017-08-15','Male','A','2017-08-17','12:00pm','','','2017-08-17 23:31:10','2017-08-17 23:31:10',0,0),
 (4,'Clinic2','2','Doctor Juan dela Cruz','1','2','Ronald','Cadayday','Pascua','','2017-08-15','Male','A','2017-08-17','05:30pm','','','2017-08-17 23:31:16','2017-08-17 23:31:16',0,0),
 (5,'',NULL,'Doctor Juan dela Cruz','1',NULL,'','','','','2017-08-25','','','2017-08-25','07:30am','','','2017-08-25 22:57:44','2017-08-25 22:57:44',0,0);
INSERT INTO `appointments` (`id`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient_id`,`patient_fname`,`patient_mi`,`patient_lname`,`patient_sname`,`patient_bday`,`patient_gender`,`patient_blood_type`,`appointment_date`,`appointment_time`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (6,'Clinic2','2','Doctor Juan dela Cruz','1','2','Ronald','Cadayday','Pascua','','2017-08-15','Male','A','2017-08-25','10:00am','','','2017-08-25 22:57:56','2017-08-25 22:57:56',0,0),
 (8,'Clinic2','2','Doctor Juan dela Cruz','1','2','Ronald','Cadayday','Pascua','','2017-08-15','Male','A','2017-09-19','09:00am','1','1','2017-09-19 13:19:34','2017-09-19 13:19:34',0,0),
 (9,'Clinic1','1','Doctor Juan dela Cruz','1','1','Juan','dela','Cruz','','2017-08-01','Male','O','2017-09-19','08:00am','','','2017-09-19 13:28:33','2017-09-19 13:28:33',0,0),
 (11,'Clinic1','1','Doctor Juan dela Cruz','1','1','Juan','dela','Cruz','','2017-08-01','Male','O','2017-09-19','11:30am','','','2017-09-19 13:44:10','2017-09-19 13:44:10',0,0),
 (12,'',NULL,'Doctor Juan dela Cruz','1','3','Diego','','Silang','','2017-09-04','Male','A','2017-09-19','12:00pm','','','2017-09-19 13:44:18','2017-09-19 13:44:18',0,0);
INSERT INTO `appointments` (`id`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient_id`,`patient_fname`,`patient_mi`,`patient_lname`,`patient_sname`,`patient_bday`,`patient_gender`,`patient_blood_type`,`appointment_date`,`appointment_time`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (13,'',NULL,'Doctor Juan dela Cruz','1','3','Diego','','Silang','','2017-09-04','Male','A','2017-09-28','08:00am','1','1','2017-09-27 18:49:11','2017-09-27 18:49:11',0,0),
 (14,'',NULL,'Doctor Juan dela Cruz','1','3','Diego','','Silang','','2017-09-04','Male','A','2017-09-28','10:00am','1','1','2017-09-27 18:49:15','2017-09-27 18:49:15',0,0);
/*!40000 ALTER TABLE `appointments` ENABLE KEYS */;


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
 (1,'XYZ Clinic','Daro, Dumaguete City','422-12345/0916 123 4567','','','','2017-08-04 19:18:27','2017-09-04 16:08:45',0,0),
 (2,'RTY Clinic','Bantayan, Dumaguete City','225-1000/0919-093-001','','','','2017-08-04 19:19:27','2017-09-04 16:09:25',0,0);
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
-- Definition of table `doctor_daily_schedules`
--

DROP TABLE IF EXISTS `doctor_daily_schedules`;
CREATE TABLE `doctor_daily_schedules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `day` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `doctor` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=168 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor_daily_schedules`
--

/*!40000 ALTER TABLE `doctor_daily_schedules` DISABLE KEYS */;
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (3,'Monday','08:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:34','2017-08-16 15:07:34',0,0),
 (4,'Monday','08:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:35','2017-08-16 15:07:35',0,0),
 (5,'Monday','09:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:36','2017-08-16 15:07:36',0,0),
 (6,'Monday','09:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:37','2017-08-16 15:07:37',0,0),
 (7,'Monday','10:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:37','2017-08-16 15:07:37',0,0),
 (8,'Monday','10:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:38','2017-08-16 15:07:38',0,0),
 (9,'Monday','11:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:40','2017-08-16 15:07:40',0,0),
 (10,'Monday','11:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:40','2017-08-16 15:07:40',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (11,'Monday','12:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:41','2017-08-16 15:07:41',0,0),
 (12,'Monday','01:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:45','2017-08-16 15:07:45',0,0),
 (13,'Monday','01:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:46','2017-08-16 15:07:46',0,0),
 (14,'Monday','02:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:46','2017-08-16 15:07:46',0,0),
 (15,'Monday','02:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:47','2017-08-16 15:07:47',0,0),
 (16,'Monday','03:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:50','2017-08-16 15:07:50',0,0),
 (17,'Monday','03:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:51','2017-08-16 15:07:51',0,0),
 (18,'Monday','04:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:51','2017-08-16 15:07:51',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (19,'Monday','04:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:52','2017-08-16 15:07:52',0,0),
 (20,'Monday','05:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:53','2017-08-16 15:07:53',0,0),
 (21,'Monday','05:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:55','2017-08-16 15:07:55',0,0),
 (22,'Monday','06:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:56','2017-08-16 15:07:56',0,0),
 (23,'Monday','06:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:56','2017-08-16 15:07:56',0,0),
 (24,'Monday','07:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:07:58','2017-08-16 15:07:58',0,0),
 (25,'Monday','07:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:01','2017-08-16 15:08:01',0,0),
 (26,'Monday','12:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:09','2017-08-16 15:08:09',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (27,'Tuesday','07:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:16','2017-08-16 15:08:16',0,0),
 (28,'Tuesday','07:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:17','2017-08-16 15:08:17',0,0),
 (29,'Tuesday','08:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:18','2017-08-16 15:08:18',0,0),
 (30,'Tuesday','08:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:19','2017-08-16 15:08:19',0,0),
 (31,'Tuesday','09:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:19','2017-08-16 15:08:19',0,0),
 (32,'Tuesday','09:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:20','2017-08-16 15:08:20',0,0),
 (33,'Tuesday','10:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:25','2017-08-16 15:08:25',0,0),
 (34,'Tuesday','10:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:26','2017-08-16 15:08:26',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (35,'Tuesday','11:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:27','2017-08-16 15:08:27',0,0),
 (36,'Tuesday','11:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:28','2017-08-16 15:08:28',0,0),
 (37,'Tuesday','12:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:28','2017-08-16 15:08:28',0,0),
 (38,'Tuesday','12:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:33','2017-08-16 15:08:33',0,0),
 (39,'Tuesday','01:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:34','2017-08-16 15:08:34',0,0),
 (40,'Tuesday','01:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:39','2017-08-16 15:08:39',0,0),
 (41,'Tuesday','02:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:40','2017-08-16 15:08:40',0,0),
 (42,'Tuesday','02:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:41','2017-08-16 15:08:41',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (43,'Tuesday','03:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:44','2017-08-16 15:08:44',0,0),
 (44,'Tuesday','03:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:45','2017-08-16 15:08:45',0,0),
 (45,'Tuesday','04:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:46','2017-08-16 15:08:46',0,0),
 (46,'Tuesday','04:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:46','2017-08-16 15:08:46',0,0),
 (47,'Tuesday','05:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:47','2017-08-16 15:08:47',0,0),
 (48,'Tuesday','05:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:48','2017-08-16 15:08:48',0,0),
 (49,'Tuesday','06:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:49','2017-08-16 15:08:49',0,0),
 (50,'Tuesday','06:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:52','2017-08-16 15:08:52',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (51,'Tuesday','07:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:53','2017-08-16 15:08:53',0,0),
 (52,'Tuesday','07:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:08:54','2017-08-16 15:08:54',0,0),
 (54,'Wednesday','07:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:05','2017-08-16 15:09:05',0,0),
 (55,'Wednesday','07:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:06','2017-08-16 15:09:06',0,0),
 (56,'Wednesday','06:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:07','2017-08-16 15:09:07',0,0),
 (57,'Wednesday','06:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:07','2017-08-16 15:09:07',0,0),
 (58,'Wednesday','05:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:08','2017-08-16 15:09:08',0,0),
 (59,'Wednesday','05:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:10','2017-08-16 15:09:10',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (60,'Wednesday','04:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:10','2017-08-16 15:09:10',0,0),
 (61,'Wednesday','04:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:11','2017-08-16 15:09:11',0,0),
 (62,'Wednesday','03:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:14','2017-08-16 15:09:14',0,0),
 (63,'Wednesday','03:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:15','2017-08-16 15:09:15',0,0),
 (64,'Wednesday','02:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:16','2017-08-16 15:09:16',0,0),
 (65,'Wednesday','02:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:17','2017-08-16 15:09:17',0,0),
 (66,'Wednesday','01:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:20','2017-08-16 15:09:20',0,0),
 (67,'Wednesday','01:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:21','2017-08-16 15:09:21',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (68,'Wednesday','12:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:21','2017-08-16 15:09:21',0,0),
 (69,'Wednesday','12:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:25','2017-08-16 15:09:25',0,0),
 (70,'Wednesday','11:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:26','2017-08-16 15:09:26',0,0),
 (71,'Wednesday','11:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:27','2017-08-16 15:09:27',0,0),
 (72,'Wednesday','10:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:27','2017-08-16 15:09:27',0,0),
 (73,'Wednesday','10:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:33','2017-08-16 15:09:33',0,0),
 (74,'Wednesday','09:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:34','2017-08-16 15:09:34',0,0),
 (75,'Wednesday','09:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:34','2017-08-16 15:09:34',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (76,'Wednesday','08:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:35','2017-08-16 15:09:35',0,0),
 (77,'Wednesday','08:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:38','2017-08-16 15:09:38',0,0),
 (78,'Wednesday','07:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:39','2017-08-16 15:09:39',0,0),
 (79,'Wednesday','07:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:39','2017-08-16 15:09:39',0,0),
 (80,'Thursday','07:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:43','2017-08-16 15:09:43',0,0),
 (81,'Thursday','07:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:44','2017-08-16 15:09:44',0,0),
 (82,'Thursday','08:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:45','2017-08-16 15:09:45',0,0),
 (83,'Thursday','08:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:46','2017-08-16 15:09:46',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (84,'Thursday','09:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:46','2017-08-16 15:09:46',0,0),
 (85,'Thursday','09:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:47','2017-08-16 15:09:47',0,0),
 (86,'Thursday','10:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:48','2017-08-16 15:09:48',0,0),
 (87,'Thursday','10:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:49','2017-08-16 15:09:49',0,0),
 (88,'Thursday','11:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:50','2017-08-16 15:09:50',0,0),
 (89,'Thursday','11:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:50','2017-08-16 15:09:50',0,0),
 (90,'Thursday','12:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:51','2017-08-16 15:09:51',0,0),
 (91,'Thursday','12:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:54','2017-08-16 15:09:54',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (92,'Thursday','01:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:55','2017-08-16 15:09:55',0,0),
 (93,'Thursday','01:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:56','2017-08-16 15:09:56',0,0),
 (94,'Thursday','02:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:56','2017-08-16 15:09:56',0,0),
 (95,'Thursday','02:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:09:57','2017-08-16 15:09:57',0,0),
 (96,'Thursday','03:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:00','2017-08-16 15:10:00',0,0),
 (97,'Thursday','03:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:01','2017-08-16 15:10:01',0,0),
 (98,'Thursday','04:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:03','2017-08-16 15:10:03',0,0),
 (99,'Thursday','04:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:03','2017-08-16 15:10:03',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (100,'Thursday','05:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:04','2017-08-16 15:10:04',0,0),
 (101,'Thursday','05:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:05','2017-08-16 15:10:05',0,0),
 (102,'Thursday','06:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:07','2017-08-16 15:10:07',0,0),
 (103,'Thursday','06:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:08','2017-08-16 15:10:08',0,0),
 (104,'Thursday','07:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:09','2017-08-16 15:10:09',0,0),
 (105,'Thursday','07:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:10','2017-08-16 15:10:10',0,0),
 (106,'Friday','07:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:14','2017-08-16 15:10:14',0,0),
 (107,'Friday','07:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:15','2017-08-16 15:10:15',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (108,'Friday','06:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:15','2017-08-16 15:10:15',0,0),
 (109,'Friday','06:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:16','2017-08-16 15:10:16',0,0),
 (110,'Friday','05:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:17','2017-08-16 15:10:17',0,0),
 (111,'Friday','05:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:19','2017-08-16 15:10:19',0,0),
 (112,'Friday','04:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:20','2017-08-16 15:10:20',0,0),
 (113,'Friday','04:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:21','2017-08-16 15:10:21',0,0),
 (114,'Friday','03:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:21','2017-08-16 15:10:21',0,0),
 (115,'Friday','03:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:22','2017-08-16 15:10:22',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (116,'Friday','02:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:23','2017-08-16 15:10:23',0,0),
 (117,'Friday','02:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:26','2017-08-16 15:10:26',0,0),
 (118,'Friday','01:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:27','2017-08-16 15:10:27',0,0),
 (119,'Friday','01:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:27','2017-08-16 15:10:27',0,0),
 (120,'Friday','12:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:31','2017-08-16 15:10:31',0,0),
 (121,'Friday','12:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:32','2017-08-16 15:10:32',0,0),
 (122,'Friday','11:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:33','2017-08-16 15:10:33',0,0),
 (123,'Friday','11:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:33','2017-08-16 15:10:33',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (124,'Friday','10:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:36','2017-08-16 15:10:36',0,0),
 (125,'Friday','10:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:37','2017-08-16 15:10:37',0,0),
 (126,'Friday','09:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:37','2017-08-16 15:10:37',0,0),
 (127,'Friday','09:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:38','2017-08-16 15:10:38',0,0),
 (128,'Friday','08:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:41','2017-08-16 15:10:41',0,0),
 (129,'Friday','08:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:42','2017-08-16 15:10:42',0,0),
 (130,'Friday','07:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:42','2017-08-16 15:10:42',0,0),
 (131,'Friday','07:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:43','2017-08-16 15:10:43',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (132,'Saturday','07:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:47','2017-08-16 15:10:47',0,0),
 (133,'Saturday','07:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:48','2017-08-16 15:10:48',0,0),
 (134,'Saturday','08:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:49','2017-08-16 15:10:49',0,0),
 (135,'Saturday','08:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:50','2017-08-16 15:10:50',0,0),
 (136,'Saturday','09:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:50','2017-08-16 15:10:50',0,0),
 (137,'Saturday','09:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:51','2017-08-16 15:10:51',0,0),
 (138,'Saturday','10:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:52','2017-08-16 15:10:52',0,0),
 (139,'Saturday','10:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:53','2017-08-16 15:10:53',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (140,'Saturday','11:00am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:54','2017-08-16 15:10:54',0,0),
 (141,'Saturday','11:30am','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:54','2017-08-16 15:10:54',0,0),
 (142,'Saturday','12:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:55','2017-08-16 15:10:55',0,0),
 (143,'Saturday','12:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:58','2017-08-16 15:10:58',0,0),
 (144,'Saturday','01:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:10:59','2017-08-16 15:10:59',0,0),
 (145,'Saturday','01:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:00','2017-08-16 15:11:00',0,0),
 (146,'Saturday','02:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:00','2017-08-16 15:11:00',0,0),
 (147,'Saturday','02:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:01','2017-08-16 15:11:01',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (148,'Saturday','03:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:04','2017-08-16 15:11:04',0,0),
 (149,'Saturday','03:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:05','2017-08-16 15:11:05',0,0),
 (150,'Saturday','04:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:05','2017-08-16 15:11:05',0,0),
 (151,'Saturday','04:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:06','2017-08-16 15:11:06',0,0),
 (152,'Saturday','05:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:07','2017-08-16 15:11:07',0,0),
 (153,'Saturday','05:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:10','2017-08-16 15:11:10',0,0),
 (154,'Saturday','06:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:11','2017-08-16 15:11:11',0,0),
 (155,'Saturday','06:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:12','2017-08-16 15:11:12',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (156,'Saturday','07:00pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:12','2017-08-16 15:11:12',0,0),
 (157,'Saturday','07:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:17','2017-08-16 15:11:17',0,0),
 (158,'Monday','07:00am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:12:59','2017-09-04 16:12:59',0,0),
 (159,'Monday','07:30am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:12:59','2017-09-04 16:12:59',0,0),
 (160,'Monday','08:00am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:13:00','2017-09-04 16:13:00',0,0),
 (161,'Monday','08:30am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:13:00','2017-09-04 16:13:00',0,0),
 (162,'Monday','09:00am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:13:01','2017-09-04 16:13:01',0,0),
 (163,'Monday','09:30am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:13:01','2017-09-04 16:13:01',0,0);
INSERT INTO `doctor_daily_schedules` (`id`,`day`,`time`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (164,'Monday','10:00am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:13:02','2017-09-04 16:13:02',0,0),
 (165,'Monday','10:30am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:13:02','2017-09-04 16:13:02',0,0),
 (166,'Monday','11:00am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:13:03','2017-09-04 16:13:03',0,0),
 (167,'Monday','11:30am','RTY Clinic','2','Doctor John  Santos','2','1','1','2017-09-04 16:13:03','2017-09-04 16:13:03',0,0);
/*!40000 ALTER TABLE `doctor_daily_schedules` ENABLE KEYS */;


--
-- Definition of table `doctor_none_working_days`
--

DROP TABLE IF EXISTS `doctor_none_working_days`;
CREATE TABLE `doctor_none_working_days` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(255) DEFAULT NULL,
  `am` int(11) DEFAULT NULL,
  `pm` int(11) DEFAULT NULL,
  `time_interval` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `doctor` varchar(255) DEFAULT NULL,
  `doctor_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor_none_working_days`
--

/*!40000 ALTER TABLE `doctor_none_working_days` DISABLE KEYS */;
INSERT INTO `doctor_none_working_days` (`id`,`date`,`am`,`pm`,`time_interval`,`remarks`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'2017-08-17',0,1,'07:00am,07:30am','remarks','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 21:50:17','2017-08-16 22:46:31',0,0);
/*!40000 ALTER TABLE `doctor_none_working_days` ENABLE KEYS */;


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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctors`
--

/*!40000 ALTER TABLE `doctors` DISABLE KEYS */;
INSERT INTO `doctors` (`id`,`fname`,`mi`,`lname`,`sname`,`degree`,`registration_no`,`designation`,`specialization`,`address`,`barangay`,`city`,`province`,`country`,`contact_no`,`email_address`,`department`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Juan','dela','Cruz','','','','Doctor','','','','','','','','','','Clinic2','2','','','2017-08-04 18:49:01','2017-08-04 19:27:58',0,0),
 (2,'John','','Cruz','','','','Dr.','','','','','','','','','','XYZ Clinic','1','1','1','2017-09-04 16:12:31','2017-09-04 16:18:12',0,0);
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
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory`
--

/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` (`id`,`item_code`,`generic_name`,`description`,`uom`,`type_of_use`,`product_qty`,`cost`,`selling_price`,`reorder_level`,`category`,`category_id`,`classification`,`classification_id`,`sub_classification`,`sub_classification_id`,`brand`,`brand_id`,`model`,`model_id`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (2,'00001','','item 1','[Pc:25.0/1.0^1]','1',0,20,25,0,'','','','','','','','','','','','','','','2017-08-23 16:28:35','2017-08-25 21:36:58',0,0),
 (3,'00002','','item 2','[Pc:1200.0/1.0^1]','1',0,1000,1200,0,'','','','','','','','','','','','','','','2017-08-23 16:28:41','2017-08-25 21:37:02',0,0),
 (4,'00003','','item 3','[box:7.5/1.0^1],[case:100.0/10.0^0]','1',0,6,7.5,0,'','','','','','','','','','','','','','','2017-08-23 16:28:53','2017-08-25 21:37:06',0,0),
 (5,'00004','','Item 4','[Pc:150.0/1.0^1]','1',0,100,150,0,'',NULL,'',NULL,'',NULL,'',NULL,'',NULL,'','','','','2017-08-25 21:28:25','2017-08-25 21:37:10',0,0);
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;


--
-- Definition of table `inventory_brands`
--

DROP TABLE IF EXISTS `inventory_brands`;
CREATE TABLE `inventory_brands` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brand` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory_brands`
--

/*!40000 ALTER TABLE `inventory_brands` DISABLE KEYS */;
INSERT INTO `inventory_brands` (`id`,`brand`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (2,'Brand1','','','','','2017-08-23 22:26:49','2017-08-23 22:26:49',0,0),
 (3,'Brand2','','','','','2017-08-23 22:26:53','2017-08-23 22:26:53',0,0),
 (4,'Brand3','','','','','2017-08-23 22:26:57','2017-08-23 22:26:57',0,0),
 (5,'Brand4','','','','','2017-08-23 22:27:01','2017-08-23 22:27:01',0,0),
 (6,'Brand5','','','','','2017-08-23 22:27:05','2017-08-23 22:27:05',0,0);
/*!40000 ALTER TABLE `inventory_brands` ENABLE KEYS */;


--
-- Definition of table `inventory_categories`
--

DROP TABLE IF EXISTS `inventory_categories`;
CREATE TABLE `inventory_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory_categories`
--

/*!40000 ALTER TABLE `inventory_categories` DISABLE KEYS */;
INSERT INTO `inventory_categories` (`id`,`category`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Category1','','','','','2017-08-23 21:54:19','2017-08-23 21:54:19',0,0),
 (3,'Category2','','','','','2017-08-23 21:54:41','2017-08-23 21:54:41',0,0),
 (4,'Category3','','','','','2017-08-23 21:54:47','2017-08-23 21:54:47',0,0),
 (5,'Category4','','','','','2017-08-23 21:54:52','2017-08-23 21:54:58',0,0),
 (6,'Category5','','','','','2017-08-23 21:55:03','2017-08-23 21:55:03',0,0);
/*!40000 ALTER TABLE `inventory_categories` ENABLE KEYS */;


--
-- Definition of table `inventory_classifications`
--

DROP TABLE IF EXISTS `inventory_classifications`;
CREATE TABLE `inventory_classifications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classification` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory_classifications`
--

/*!40000 ALTER TABLE `inventory_classifications` DISABLE KEYS */;
INSERT INTO `inventory_classifications` (`id`,`classification`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Classification1','','','','','2017-08-23 22:00:27','2017-08-23 22:00:27',0,0),
 (2,'Classification2','','','','','2017-08-23 22:00:30','2017-08-23 22:00:38',0,0),
 (3,'Classification3','','','','','2017-08-23 22:02:58','2017-08-23 22:02:58',0,0),
 (4,'Classification4','','','','','2017-08-23 22:03:06','2017-08-23 22:03:06',0,0),
 (5,'Classification5','','','','','2017-08-23 22:03:18','2017-08-23 22:03:18',0,0);
/*!40000 ALTER TABLE `inventory_classifications` ENABLE KEYS */;


--
-- Definition of table `inventory_models`
--

DROP TABLE IF EXISTS `inventory_models`;
CREATE TABLE `inventory_models` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory_models`
--

/*!40000 ALTER TABLE `inventory_models` DISABLE KEYS */;
INSERT INTO `inventory_models` (`id`,`model`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (2,'Model1','','','','','2017-08-23 22:44:03','2017-08-23 22:44:03',0,0),
 (3,'Model2','','','','','2017-08-23 22:44:06','2017-08-23 22:44:06',0,0),
 (4,'Model3','','','','','2017-08-23 22:44:10','2017-08-23 22:44:10',0,0),
 (5,'Model4','','','','','2017-08-23 22:44:14','2017-08-23 22:44:14',0,0),
 (6,'Model5','','','','','2017-08-23 22:44:17','2017-08-23 22:44:17',0,0);
/*!40000 ALTER TABLE `inventory_models` ENABLE KEYS */;


--
-- Definition of table `inventory_prescriptions`
--

DROP TABLE IF EXISTS `inventory_prescriptions`;
CREATE TABLE `inventory_prescriptions` (
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
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory_prescriptions`
--

/*!40000 ALTER TABLE `inventory_prescriptions` DISABLE KEYS */;
INSERT INTO `inventory_prescriptions` (`id`,`item_code`,`generic_name`,`description`,`uom`,`dosage`,`days`,`dosage_qty`,`dosage_remarks`,`remarks`,`type_of_use`,`product_qty`,`cost`,`selling_price`,`reorder_level`,`category`,`category_id`,`classification`,`classification_id`,`sub_classification`,`sub_classification_id`,`brand`,`brand_id`,`model`,`model_id`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'00001','','item 1','[Pc:25.0/1.0^1]','00-00-01',1,3,'remarks','','1',0,20,25,0,'','','','','','','','','','','','','','','2017-08-23 16:28:35','2017-08-25 21:36:58',0,0),
 (2,'00001','','item 1','[Pc:25.0/1.0^1]','023',2,2,'r2','r1','1',0,20,25,0,'','','','','','','','','','','','','','','2017-08-23 16:28:35','2017-08-25 21:36:58',0,0),
 (3,'00001','','item 1','[Pc:25.0/1.0^1]','01-01-01-01-01-01-01',0,6,'','','1',0,20,25,0,'','','','','','','','','','','','','','','2017-08-29 17:34:21','2017-08-29 17:34:21',0,0);
/*!40000 ALTER TABLE `inventory_prescriptions` ENABLE KEYS */;


--
-- Definition of table `inventory_sub_classifications`
--

DROP TABLE IF EXISTS `inventory_sub_classifications`;
CREATE TABLE `inventory_sub_classifications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sub_classification` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory_sub_classifications`
--

/*!40000 ALTER TABLE `inventory_sub_classifications` DISABLE KEYS */;
INSERT INTO `inventory_sub_classifications` (`id`,`sub_classification`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (2,'Sub-Classification1','','','','','2017-08-23 22:10:21','2017-08-23 22:10:21',0,0),
 (3,'Sub-Classification2','','','','','2017-08-23 22:10:26','2017-08-23 22:10:26',0,0),
 (4,'Sub-Classification3','','','','','2017-08-23 22:10:30','2017-08-23 22:10:30',0,0),
 (5,'Sub-Classification4','','','','','2017-08-23 22:10:35','2017-08-23 22:10:35',0,0),
 (6,'Sub-Classification5','','','','','2017-08-23 22:10:39','2017-08-23 22:10:39',0,0);
/*!40000 ALTER TABLE `inventory_sub_classifications` ENABLE KEYS */;


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
-- Definition of table `option_complaints`
--

DROP TABLE IF EXISTS `option_complaints`;
CREATE TABLE `option_complaints` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `complaint` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_complaints`
--

/*!40000 ALTER TABLE `option_complaints` DISABLE KEYS */;
INSERT INTO `option_complaints` (`id`,`complaint`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (5,'Abdominal Pain','','','1','1','2017-08-30 17:06:08','2017-08-30 17:06:08',0,0),
 (6,'Abdominal Pain - Burning','','','1','1','2017-08-30 17:06:21','2017-08-30 17:06:21',0,0),
 (7,'Abdominal Paint - Discomfort','','','1','1','2017-08-30 17:06:40','2017-08-30 17:06:40',0,0),
 (8,'Amnesia','','','1','1','2017-08-30 17:06:57','2017-08-30 17:06:57',0,0),
 (9,'Anxiety and Stress','','','1','1','2017-08-30 17:07:09','2017-08-30 17:07:09',0,0),
 (10,'Bleeding from Gums','','','1','1','2017-08-30 17:07:36','2017-08-30 17:07:36',0,0),
 (11,'Bitter Taste','','','1','1','2017-08-30 17:07:50','2017-08-30 17:07:50',0,0),
 (12,'Bleeding P/O','','','1','1','2017-08-30 17:08:06','2017-08-30 17:08:06',0,0),
 (13,'Bleeding P/R','','','1','1','2017-08-30 17:08:16','2017-08-30 17:08:16',0,0),
 (14,'Bleeding P/V','','','1','1','2017-08-30 17:08:26','2017-08-30 17:08:26',0,0),
 (15,'Blurring of Vision','','','1','1','2017-08-30 17:08:40','2017-08-30 17:08:40',0,0);
INSERT INTO `option_complaints` (`id`,`complaint`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (16,'Body Pain','','','1','1','2017-08-30 17:09:03','2017-08-30 17:09:03',0,0),
 (17,'Burning Feets','','','1','1','2017-08-30 17:09:13','2017-08-30 17:09:13',0,0),
 (18,'Burning Sensation in Oral Cavity','','','1','1','2017-08-30 17:09:49','2017-08-30 17:09:49',0,0),
 (19,'Change in Voice','','','1','1','2017-08-30 17:09:59','2017-08-30 17:09:59',0,0),
 (20,'Changing Bowel Habits','','','1','1','2017-08-30 17:10:17','2017-08-30 17:10:17',0,0);
/*!40000 ALTER TABLE `option_complaints` ENABLE KEYS */;


--
-- Definition of table `option_diagnosis_categories`
--

DROP TABLE IF EXISTS `option_diagnosis_categories`;
CREATE TABLE `option_diagnosis_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_diagnosis_categories`
--

/*!40000 ALTER TABLE `option_diagnosis_categories` DISABLE KEYS */;
INSERT INTO `option_diagnosis_categories` (`id`,`category`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Fever','','','','','2017-08-30 09:37:14','2017-09-04 12:38:22',0,0),
 (2,'Hyperacidity','','','','','2017-08-30 09:37:18','2017-09-04 12:38:51',0,0),
 (3,'Sickness','','','','','2017-08-30 09:37:23','2017-09-04 12:38:42',0,0),
 (4,'Injury','','','','','2017-09-04 12:38:58','2017-09-04 12:38:58',0,0),
 (5,'Low Back Pain','','','','','2017-09-04 12:39:05','2017-09-04 12:39:05',0,0),
 (6,'Malaria','','','','','2017-09-04 12:39:13','2017-09-04 12:39:13',0,0),
 (7,'UTI','','','','','2017-09-04 12:39:30','2017-09-04 12:39:30',0,0);
/*!40000 ALTER TABLE `option_diagnosis_categories` ENABLE KEYS */;


--
-- Definition of table `option_diagnosis_classifications`
--

DROP TABLE IF EXISTS `option_diagnosis_classifications`;
CREATE TABLE `option_diagnosis_classifications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_diagnosis_classifications`
--

/*!40000 ALTER TABLE `option_diagnosis_classifications` DISABLE KEYS */;
INSERT INTO `option_diagnosis_classifications` (`id`,`category`,`category_id`,`classification`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (4,'b','2','Hyperacidity1','','','','','2017-08-30 09:37:43','2017-09-04 12:40:02',0,0),
 (5,'b','2','Hyperacidity2','','','','','2017-08-30 09:37:45','2017-09-04 12:40:07',0,0);
/*!40000 ALTER TABLE `option_diagnosis_classifications` ENABLE KEYS */;


--
-- Definition of table `option_diagnosis_details`
--

DROP TABLE IF EXISTS `option_diagnosis_details`;
CREATE TABLE `option_diagnosis_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `classification_id` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_diagnosis_details`
--

/*!40000 ALTER TABLE `option_diagnosis_details` DISABLE KEYS */;
INSERT INTO `option_diagnosis_details` (`id`,`category`,`category_id`,`classification`,`classification_id`,`details`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (8,'a','1','aa','3','aa1','','','','','2017-08-30 09:41:25','2017-08-30 09:41:25',0,0),
 (9,'a','1','aa','3','aa2','','','','','2017-08-30 09:41:28','2017-08-30 09:41:28',0,0),
 (10,'a','1','aaa','1','aaa3','','','','','2017-08-30 09:41:33','2017-08-30 09:41:33',0,0),
 (11,'a','1','aaa','1','aaa4','','','','','2017-08-30 09:41:37','2017-08-30 09:41:37',0,0),
 (12,'b','2','Hyperacidity1','4','Hyperacidity1 Details','','','','','2017-09-04 12:40:24','2017-09-04 12:40:24',0,0),
 (13,'b','2','Hyperacidity2','5','Hyperacidity2 Details','','','','','2017-09-04 12:40:31','2017-09-04 12:40:31',0,0);
/*!40000 ALTER TABLE `option_diagnosis_details` ENABLE KEYS */;


--
-- Definition of table `option_findings_categories`
--

DROP TABLE IF EXISTS `option_findings_categories`;
CREATE TABLE `option_findings_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_findings_categories`
--

/*!40000 ALTER TABLE `option_findings_categories` DISABLE KEYS */;
INSERT INTO `option_findings_categories` (`id`,`category`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'CNS','','','','','2017-08-30 08:38:59','2017-09-04 12:33:24',0,0),
 (2,'ECG','','','','','2017-08-30 08:39:03','2017-09-04 13:17:17',0,0),
 (4,'CVS','','','','','2017-08-30 08:39:26','2017-09-04 12:33:29',0,0),
 (5,'For Pre Operative Assessment','','','','','2017-09-04 12:34:12','2017-09-04 12:34:12',0,0),
 (6,'General Examination','','','','','2017-09-04 12:34:24','2017-09-04 12:34:24',0,0),
 (7,'GIT','','','','','2017-09-04 12:34:31','2017-09-04 12:34:31',0,0),
 (8,'Good Improvement','','','','','2017-09-04 12:34:42','2017-09-04 12:34:42',0,0),
 (9,'RS','','','','','2017-09-04 12:34:58','2017-09-04 12:34:58',0,0),
 (10,'Swelling Over','','','','','2017-09-04 12:35:05','2017-09-04 12:35:05',0,0),
 (11,'Systematic Examination','','','','','2017-09-04 12:35:17','2017-09-04 12:35:17',0,0);
/*!40000 ALTER TABLE `option_findings_categories` ENABLE KEYS */;


--
-- Definition of table `option_findings_classifications`
--

DROP TABLE IF EXISTS `option_findings_classifications`;
CREATE TABLE `option_findings_classifications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_findings_classifications`
--

/*!40000 ALTER TABLE `option_findings_classifications` DISABLE KEYS */;
INSERT INTO `option_findings_classifications` (`id`,`category`,`category_id`,`classification`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (4,'b','2','ECG1','','','','','2017-08-30 08:44:15','2017-09-04 12:35:45',0,0),
 (5,'For Pre Operative Assessment','5','Assessment1','','','','','2017-09-04 12:36:38','2017-09-04 12:36:38',0,0),
 (6,'CNS','1','CNS1','','','','','2017-09-04 13:13:30','2017-09-04 13:13:30',0,0),
 (7,'CNS','1','CNS2','','','','','2017-09-04 13:13:34','2017-09-04 13:13:34',0,0);
/*!40000 ALTER TABLE `option_findings_classifications` ENABLE KEYS */;


--
-- Definition of table `option_findings_details`
--

DROP TABLE IF EXISTS `option_findings_details`;
CREATE TABLE `option_findings_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `classification_id` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_findings_details`
--

/*!40000 ALTER TABLE `option_findings_details` DISABLE KEYS */;
INSERT INTO `option_findings_details` (`id`,`category`,`category_id`,`classification`,`classification_id`,`details`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (6,'b','2','b1','4','ECG1a','','','','','2017-08-30 08:56:38','2017-09-04 12:36:27',0,0),
 (7,'For Pre Operative Assessment','5','Assessment1','5','Assessment1a','','','','','2017-09-04 12:36:50','2017-09-04 12:36:50',0,0),
 (8,'For Pre Operative Assessment','5','Assessment1','5','Assessment1b','','','','','2017-09-04 12:36:58','2017-09-04 12:36:58',0,0),
 (10,'CNS','1','CNS1','6','CNS1a','','','','','2017-09-04 13:13:41','2017-09-04 13:13:41',0,0),
 (11,'CNS','1','CNS1','6','CNS1b','','','','','2017-09-04 13:13:46','2017-09-04 13:13:46',0,0),
 (12,'CNS','1','CNS1','6','CNS1c','','','','','2017-09-04 13:14:02','2017-09-04 13:14:02',0,0);
/*!40000 ALTER TABLE `option_findings_details` ENABLE KEYS */;


--
-- Definition of table `option_history_categories`
--

DROP TABLE IF EXISTS `option_history_categories`;
CREATE TABLE `option_history_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_history_categories`
--

/*!40000 ALTER TABLE `option_history_categories` DISABLE KEYS */;
INSERT INTO `option_history_categories` (`id`,`category`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'CAFFEINE','','','','1','2017-08-29 10:32:56','2017-08-30 17:14:37',0,0),
 (3,'DRUG','','','','1','2017-08-29 10:33:14','2017-08-30 17:14:43',0,0),
 (4,'FAMILY','','','','1','2017-08-29 10:33:16','2017-08-30 17:14:48',0,0),
 (5,'KNOWN CASE OF','','','','1','2017-08-29 10:33:19','2017-08-30 17:14:30',0,0),
 (6,'MEDICAL','','','','1','2017-08-29 10:33:21','2017-08-30 17:14:55',0,0),
 (7,'PERSONAL','','','','1','2017-08-29 10:33:24','2017-08-30 17:15:02',0,0),
 (8,'SOCIAL','','','','1','2017-08-29 10:33:28','2017-08-30 17:15:11',0,0),
 (9,'VACCINATION','','','','1','2017-08-29 10:33:33','2017-08-30 17:15:18',0,0);
/*!40000 ALTER TABLE `option_history_categories` ENABLE KEYS */;


--
-- Definition of table `option_history_classifications`
--

DROP TABLE IF EXISTS `option_history_classifications`;
CREATE TABLE `option_history_classifications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_history_classifications`
--

/*!40000 ALTER TABLE `option_history_classifications` DISABLE KEYS */;
INSERT INTO `option_history_classifications` (`id`,`category`,`category_id`,`classification`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'a','1','aa1','','','','','2017-08-29 10:50:03','2017-08-29 10:50:32',0,0),
 (2,'a','1','aa2','','','','','2017-08-29 10:50:11','2017-08-29 10:50:11',0,0),
 (3,'a','1','aa3','','','','','2017-08-29 10:50:16','2017-08-29 10:50:16',0,0),
 (5,'b','3','b1','','','','','2017-08-29 11:27:15','2017-08-29 11:27:19',0,0),
 (6,'b','3','b2','','','','','2017-08-29 11:27:25','2017-08-29 11:27:25',0,0),
 (7,'b','3','b3','','','','','2017-08-29 11:27:29','2017-08-29 11:27:29',0,0),
 (8,'b','3','b4','','','','','2017-08-29 11:29:32','2017-08-29 11:29:32',0,0),
 (9,'PERSONAL','7','Appetite','','','1','1','2017-08-30 17:20:41','2017-08-30 17:20:41',0,0),
 (10,'PERSONAL','7','Bowel','','','1','1','2017-08-30 17:20:48','2017-08-30 17:20:48',0,0),
 (11,'PERSONAL','7','Chronic use of drugs','','','1','1','2017-08-30 17:21:03','2017-08-30 17:21:03',0,0),
 (12,'PERSONAL','7','Diet','','','1','1','2017-08-30 17:21:10','2017-08-30 17:21:10',0,0);
INSERT INTO `option_history_classifications` (`id`,`category`,`category_id`,`classification`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (13,'PERSONAL','7','Habits','','','1','1','2017-08-30 17:21:16','2017-08-30 17:21:16',0,0),
 (14,'PERSONAL','7','Nutrition','','','1','1','2017-08-30 17:21:35','2017-08-30 17:21:35',0,0),
 (15,'PERSONAL','7','Occupation','','','1','1','2017-08-30 17:21:57','2017-08-30 17:21:57',0,0),
 (16,'PERSONAL','7','Personality','','','1','1','2017-08-30 17:22:06','2017-08-30 17:22:06',0,0),
 (17,'PERSONAL','7','Sexual History','','','1','1','2017-08-30 17:22:19','2017-08-30 17:22:19',0,0),
 (18,'PERSONAL','7','Siblings and Related','','','1','1','2017-08-30 17:22:30','2017-08-30 17:22:30',0,0),
 (19,'PERSONAL','7','Sleep','','','1','1','2017-08-30 17:22:37','2017-08-30 17:22:37',0,0);
/*!40000 ALTER TABLE `option_history_classifications` ENABLE KEYS */;


--
-- Definition of table `option_history_sub_classifications`
--

DROP TABLE IF EXISTS `option_history_sub_classifications`;
CREATE TABLE `option_history_sub_classifications` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `classification_id` varchar(255) DEFAULT NULL,
  `sub_classification` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_history_sub_classifications`
--

/*!40000 ALTER TABLE `option_history_sub_classifications` DISABLE KEYS */;
INSERT INTO `option_history_sub_classifications` (`id`,`category`,`category_id`,`classification`,`classification_id`,`sub_classification`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'b','3','b1','5','b11','','','','','2017-08-29 11:29:38','2017-08-29 11:29:38',0,0),
 (2,'b','3','b1','5','b22','','','','','2017-08-29 11:29:41','2017-08-29 11:29:41',0,0),
 (3,'b','3','b1','3','aa311','','','','','2017-08-29 11:29:48','2017-08-29 11:41:55',0,0),
 (4,'b','3','b1','5','b33','','','','','2017-08-29 11:31:33','2017-08-29 11:31:37',0,0),
 (5,'PERSONAL','7','Habits','13','Alcohol','','','1','1','2017-08-30 17:24:00','2017-08-30 17:24:00',0,0),
 (6,'PERSONAL','7','Habits','13','Alcohol + Smoking','','','1','1','2017-08-30 17:24:11','2017-08-30 17:24:11',0,0),
 (7,'PERSONAL','7','Habits','13','Alcohol + Tobacco','','','1','1','2017-08-30 17:25:08','2017-08-30 17:25:08',0,0),
 (8,'PERSONAL','7','Habits','13','Alcohol + Tobacco + Smoking','','','1','1','2017-08-30 17:25:22','2017-08-30 17:25:22',0,0),
 (9,'PERSONAL','7','Habits','13','Jogging','','','1','1','2017-08-30 17:25:49','2017-08-30 17:25:49',0,0);
INSERT INTO `option_history_sub_classifications` (`id`,`category`,`category_id`,`classification`,`classification_id`,`sub_classification`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (10,'PERSONAL','7','Habits','13','Walking daily','','','1','1','2017-08-30 17:25:59','2017-08-30 17:25:59',0,0),
 (11,'PERSONAL','7','Habits','13','Cigar','','','1','1','2017-08-30 17:26:06','2017-08-30 17:26:06',0,0),
 (12,'PERSONAL','7','Habits','13','Beers','','','1','1','2017-08-30 17:26:15','2017-08-30 17:26:15',0,0),
 (13,'PERSONAL','7','Nutrition','14','a','','','1','1','2017-09-27 18:53:53','2017-09-27 18:53:53',0,0);
/*!40000 ALTER TABLE `option_history_sub_classifications` ENABLE KEYS */;


--
-- Definition of table `option_investigation_categories`
--

DROP TABLE IF EXISTS `option_investigation_categories`;
CREATE TABLE `option_investigation_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_investigation_categories`
--

/*!40000 ALTER TABLE `option_investigation_categories` DISABLE KEYS */;
INSERT INTO `option_investigation_categories` (`id`,`category`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Biopsy','','','','','2017-08-30 07:55:05','2017-09-04 12:30:51',0,0),
 (2,'Cardiac','','','','','2017-08-30 07:55:08','2017-09-04 12:30:58',0,0),
 (3,'CBC','','','','','2017-09-04 12:31:04','2017-09-04 12:31:04',0,0),
 (4,'Dental','','','','','2017-09-04 12:31:11','2017-09-04 12:31:11',0,0),
 (5,'Laboratory','','','','','2017-09-04 12:31:19','2017-09-04 12:31:19',0,0),
 (6,'Respiratory','','','','','2017-09-04 12:31:32','2017-09-04 12:31:32',0,0);
/*!40000 ALTER TABLE `option_investigation_categories` ENABLE KEYS */;


--
-- Definition of table `option_investigation_details`
--

DROP TABLE IF EXISTS `option_investigation_details`;
CREATE TABLE `option_investigation_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_investigation_details`
--

/*!40000 ALTER TABLE `option_investigation_details` DISABLE KEYS */;
INSERT INTO `option_investigation_details` (`id`,`category`,`category_id`,`details`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'a','1','a1','','','','','2017-08-30 08:10:38','2017-08-30 08:10:38',0,0),
 (2,'a','1','a2','','','','','2017-08-30 08:12:17','2017-08-30 08:13:43',0,0),
 (4,'b','2','b','','','','','2017-08-30 08:14:01','2017-08-30 08:14:01',0,0),
 (5,'CBC','3','S.G.P.T','','','','','2017-09-04 12:32:15','2017-09-04 12:32:15',0,0),
 (6,'CBC','3','Urine RM','','','','','2017-09-04 12:32:35','2017-09-04 12:32:35',0,0);
/*!40000 ALTER TABLE `option_investigation_details` ENABLE KEYS */;


--
-- Definition of table `option_remarks_categories`
--

DROP TABLE IF EXISTS `option_remarks_categories`;
CREATE TABLE `option_remarks_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_remarks_categories`
--

/*!40000 ALTER TABLE `option_remarks_categories` DISABLE KEYS */;
INSERT INTO `option_remarks_categories` (`id`,`category`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'a','','','','','2017-08-30 09:56:20','2017-08-30 09:56:20',0,0),
 (2,'b','','','','','2017-08-30 09:56:25','2017-08-30 09:56:25',0,0),
 (3,'c','','','','','2017-08-30 09:56:30','2017-08-30 09:56:30',0,0);
/*!40000 ALTER TABLE `option_remarks_categories` ENABLE KEYS */;


--
-- Definition of table `option_remarks_details`
--

DROP TABLE IF EXISTS `option_remarks_details`;
CREATE TABLE `option_remarks_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_remarks_details`
--

/*!40000 ALTER TABLE `option_remarks_details` DISABLE KEYS */;
INSERT INTO `option_remarks_details` (`id`,`category`,`category_id`,`details`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'a','1','a1','','','','','2017-08-30 09:56:35','2017-08-30 09:56:35',0,0),
 (2,'a','1','a2','','','','','2017-08-30 09:56:38','2017-08-30 09:56:38',0,0),
 (3,'a','1','a3','','','','','2017-08-30 09:56:41','2017-08-30 09:56:41',0,0),
 (4,'b','2','b2','','','','','2017-08-30 09:57:01','2017-08-30 09:57:01',0,0),
 (5,'b','2','b3','','','','','2017-08-30 09:57:04','2017-08-30 09:57:08',0,0),
 (6,'b','2','b1','','','','','2017-08-30 09:57:11','2017-08-30 09:57:11',0,0);
/*!40000 ALTER TABLE `option_remarks_details` ENABLE KEYS */;


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
  `qty` double DEFAULT NULL,
  `dosage` varchar(255) DEFAULT NULL,
  `dosage_qty` double DEFAULT NULL,
  `days` int(11) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_department_prescriptions`
--

/*!40000 ALTER TABLE `out_patient_department_prescriptions` DISABLE KEYS */;
INSERT INTO `out_patient_department_prescriptions` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`item_code`,`generic_name`,`description`,`uom`,`qty`,`dosage`,`dosage_qty`,`days`,`dosage_remarks`,`remarks`,`cost`,`selling_price`,`discount_amount`,`type_of_use`,`category`,`category_id`,`classification`,`classification_id`,`sub_classification`,`sub_classification_id`,`brand`,`brand_id`,`model`,`model_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (6,'0000001','','1','Doctor Juan dela Cruz','1','Juan dela Cruz ','1','2017-08-01','07:00am','New','00001','','item 1','[Pc:25.0/1.0^1]',1,'00-00-01',3,1,'remarks','',20,25,0,'1','','','','','','','','','','','','','2017-09-04 12:41:51','2017-09-04 12:41:51',0,0),
 (7,'0000001','','1','Doctor Juan dela Cruz','1','Juan dela Cruz ','1','2017-08-01','07:00am','New','00002','','item 2','[Pc:1200.0/1.0^1]',1,'',1,0,'','',1000,1200,0,'1','','','','','','','','','','','','','2017-09-04 12:41:51','2017-09-04 12:41:51',0,0),
 (8,'0000003','Clinic2','2','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','07:00am','New','00001','','item 1','[Pc:25.0/1.0^1]',1,'00-00-01',3,1,'remarks','',20,25,0,'1','','','','','','','','','','','1','1','2017-09-27 18:56:50','2017-09-27 18:56:50',0,0);
INSERT INTO `out_patient_department_prescriptions` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`item_code`,`generic_name`,`description`,`uom`,`qty`,`dosage`,`dosage_qty`,`days`,`dosage_remarks`,`remarks`,`cost`,`selling_price`,`discount_amount`,`type_of_use`,`category`,`category_id`,`classification`,`classification_id`,`sub_classification`,`sub_classification_id`,`brand`,`brand_id`,`model`,`model_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (9,'0000003','Clinic2','2','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','07:00am','New','00002','','item 2','[Pc:1200.0/1.0^1]',1,'',1,0,'','',1000,1200,0,'1','','','','','','','','','','','1','1','2017-09-27 18:56:50','2017-09-27 18:56:50',0,0);
/*!40000 ALTER TABLE `out_patient_department_prescriptions` ENABLE KEYS */;


--
-- Definition of table `out_patient_department_receipt_items`
--

DROP TABLE IF EXISTS `out_patient_department_receipt_items`;
CREATE TABLE `out_patient_department_receipt_items` (
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
  `reference_no` varchar(255) DEFAULT NULL,
  `particular` varchar(255) DEFAULT NULL,
  `particular_id` varchar(255) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_department_receipt_items`
--

/*!40000 ALTER TABLE `out_patient_department_receipt_items` DISABLE KEYS */;
INSERT INTO `out_patient_department_receipt_items` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`receipt_no`,`receipt_date`,`reference_no`,`particular`,`particular_id`,`amount`,`discount`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (6,'0000001','','1','Doctor Juan dela Cruz','1','Juan dela Cruz ','1','2017-08-01','07:00am','New','000000000001','2017-09-04','','Item/s','0',1275,0,'','','2017-09-04 12:41:51','2017-09-04 12:41:51',0,0),
 (7,'0000001','','1','Doctor Juan dela Cruz','1','Juan dela Cruz ','1','2017-08-01','07:00am','New','000000000001','2017-09-04','','Charge1','1',50,0,'','','2017-09-04 12:41:51','2017-09-04 12:41:51',0,0),
 (8,'0000002','','1','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','08:00am','New','000000000002','2017-09-04','','Item/s','0',0,0,'','','2017-09-04 13:18:05','2017-09-04 13:18:05',0,0),
 (9,'0000002','','1','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','08:00am','New','000000000002','2017-09-04','','Charge3','4',100,0,'','','2017-09-04 13:18:05','2017-09-04 13:18:05',0,0),
 (10,'0000001','RTY Clinic','2','Doctor John  Santos','2','Diego  Silang ','3','2017-09-04','07:30am','New','000000000001','2017-09-04','','Item/s','0',0,0,'1','1','2017-09-04 16:14:11','2017-09-04 16:14:11',0,0);
INSERT INTO `out_patient_department_receipt_items` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`receipt_no`,`receipt_date`,`reference_no`,`particular`,`particular_id`,`amount`,`discount`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (11,'0000001','RTY Clinic','2','Doctor John  Santos','2','Diego  Silang ','3','2017-09-04','07:30am','New','000000000001','2017-09-04','','Charge2','3',75,0,'1','1','2017-09-04 16:14:11','2017-09-04 16:14:11',0,0),
 (12,'0000002','Clinic2','2','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','07:00pm','New','000000000002','2017-09-04','','Item/s','0',0,0,'1','1','2017-09-04 16:15:00','2017-09-04 16:15:00',0,0),
 (13,'0000003','XYZ Clinic','1','Dr. John  Cruz','2','Ronald Cadayday Pascua ','2','2017-08-15','11:00am','New','000000000003','2017-09-04','','Item/s','0',0,0,'1','1','2017-09-04 16:18:33','2017-09-04 16:18:33',0,0),
 (14,'0000003','XYZ Clinic','1','Dr. John  Cruz','2','Ronald Cadayday Pascua ','2','2017-08-15','11:00am','New','000000000003','2017-09-04','','Charge3','4',100,0,'1','1','2017-09-04 16:18:33','2017-09-04 16:18:33',0,0),
 (15,'0000003','Clinic2','2','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','07:00am','New','000000000003','2017-09-27','','Item/s','0',1275,0,'1','1','2017-09-27 18:56:50','2017-09-27 18:56:50',1,0);
INSERT INTO `out_patient_department_receipt_items` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`receipt_no`,`receipt_date`,`reference_no`,`particular`,`particular_id`,`amount`,`discount`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (16,'0000003','Clinic2','2','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','07:00am','New','000000000003','2017-09-27','','Charge2','3',75,100,'1','1','2017-09-27 18:56:50','2017-09-27 18:56:50',1,0);
/*!40000 ALTER TABLE `out_patient_department_receipt_items` ENABLE KEYS */;


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
  `reference_no` varchar(255) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_department_receipts`
--

/*!40000 ALTER TABLE `out_patient_department_receipts` DISABLE KEYS */;
INSERT INTO `out_patient_department_receipts` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`receipt_no`,`receipt_date`,`reference_no`,`amount_due`,`discount`,`cash`,`check_bank`,`check_no`,`check_holder`,`check_amount`,`check_date`,`credit_card_type`,`credit_card_holder`,`credit_card_app_code`,`credit_card_rate`,`credit_card_amount`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (3,'0000001','','1','Doctor Juan dela Cruz','1','Juan dela Cruz ','1','2017-08-01','07:00am','New','000000000001','2017-09-04','',1325,0,1325,'','','',0,NULL,'','','',0,0,'','','2017-09-04 12:41:51','2017-09-04 12:41:51',0,0),
 (4,'0000002','','1','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','08:00am','New','000000000002','2017-09-04','',100,0,100,'','','',0,NULL,'','','',0,0,'','','2017-09-04 13:18:05','2017-09-04 13:18:05',0,0),
 (5,'0000001','RTY Clinic','2','Doctor John  Santos','2','Diego  Silang ','3','2017-09-04','07:30am','New','000000000001','2017-09-04','',75,0,75,'','','',0,NULL,'','','',0,0,'1','1','2017-09-04 16:14:11','2017-09-04 16:14:11',0,0),
 (6,'0000002','Clinic2','2','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','07:00pm','New','000000000002','2017-09-04','',0,0,0,'','','',0,NULL,'','','',0,0,'1','1','2017-09-04 16:15:00','2017-09-04 16:15:00',0,0);
INSERT INTO `out_patient_department_receipts` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`receipt_no`,`receipt_date`,`reference_no`,`amount_due`,`discount`,`cash`,`check_bank`,`check_no`,`check_holder`,`check_amount`,`check_date`,`credit_card_type`,`credit_card_holder`,`credit_card_app_code`,`credit_card_rate`,`credit_card_amount`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (7,'0000003','XYZ Clinic','1','Dr. John  Cruz','2','Ronald Cadayday Pascua ','2','2017-08-15','11:00am','New','000000000003','2017-09-04','',100,0,100,'','','',0,NULL,'','','',0,0,'1','1','2017-09-04 16:18:33','2017-09-04 16:18:33',0,0),
 (8,'0000003','Clinic2','2','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15','07:00am','New','000000000003','2017-09-27','',1250,0,1250,'','','',0,NULL,'','','',0,0,'1','1','2017-09-27 18:56:50','2017-09-27 18:56:50',1,0);
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
  `patient_bday` date DEFAULT NULL,
  `patient_gender` int(11) DEFAULT NULL,
  `patient_blood_type` varchar(255) DEFAULT NULL,
  `patient_address` varchar(255) DEFAULT NULL,
  `patient_allergy_medicine` varchar(255) DEFAULT NULL,
  `patient_allergy_others` varchar(255) DEFAULT NULL,
  `patient_is_smoking` int(11) DEFAULT NULL,
  `patient_is_alcohol` int(11) DEFAULT NULL,
  `patient_is_drug_abuse` int(11) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_departments`
--

/*!40000 ALTER TABLE `out_patient_departments` DISABLE KEYS */;
INSERT INTO `out_patient_departments` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`patient_bday`,`patient_gender`,`patient_blood_type`,`patient_address`,`patient_allergy_medicine`,`patient_allergy_others`,`patient_is_smoking`,`patient_is_alcohol`,`patient_is_drug_abuse`,`opd_date`,`opd_time`,`opd_type`,`patient_height`,`patient_weight`,`patient_bmi`,`patient_pressure`,`patient_pulse`,`patient_temperature`,`patient_respiratory`,`patient_waist`,`patient_hip`,`patient_spo2`,`complaints`,`past_personal_family_history`,`investigation`,`findings`,`provisional_diagnosis`,`remarks`,`followup_days`,`followup_date`,`referred_to`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'0000001','','1','Doctor Juan dela Cruz','1','Juan dela Cruz ','1','2017-08-01',1,'O','Canlas Subdivision ,Malang Suba ,Dumaguete ,Negros Oriental ,Philippines','Alaxan, Medicol','Cats',1,0,0,'2017-08-01','07:00am','New',170,50,0,'101',102,103,104,105,106,107,'Abdominal Pain  since 1 day/s\nChange in Voice  since 2 day/s','PERSONAL - Habits - Alcohol\nPERSONAL - Habits - Alcohol + Smoking','Urine RM\nS.G.P.T','CNS - CNS1 - CNS1a\nCNS - CNS1 - CNS1b\nCNS - CNS1 - CNS1c','Hyperacidity - Hyperacidity1 - Hyperacidity1 Details\nHyperacidity - Hyperacidity2 - Hyperacidity2 Details','',20,'2017-09-06','Dr. Antonio Trillianes','','','2017-09-04 12:41:51','2017-09-04 13:14:28',0,0),
 (2,'0000002','','1','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15',1,'A','Isog ,Barangay Isugan ,Dumaguete City ,Negros Oriental ,Philippines','Medicol, Tiki-Tiki','Shrimp',2,2,0,'2017-08-15','08:00am','New',180,50,0,'80',81,82,83,84,85,86,'Abdominal Pain  since 1 minute/s\nBitter Taste  since 2 day/s\nBleeding P/R  since 1 hour/s','PERSONAL - Habits - Beers\nPERSONAL - Habits - Jogging\nPERSONAL - Habits - Walking daily','S.G.P.T\nUrine RM','ECG - ECG1 - ECG1a\nCNS - CNS1 - CNS1a\nCNS - CNS1 - CNS1b\nCNS - CNS1 - CNS1c','b - Hyperacidity1 - Hyperacidity1 Details\nb - Hyperacidity2 - Hyperacidity2 Details','',1,'2017-09-06','Dr. Lourdes Rosa Rosal','','','2017-09-04 13:18:05','2017-09-04 13:18:05',0,0);
INSERT INTO `out_patient_departments` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`patient_bday`,`patient_gender`,`patient_blood_type`,`patient_address`,`patient_allergy_medicine`,`patient_allergy_others`,`patient_is_smoking`,`patient_is_alcohol`,`patient_is_drug_abuse`,`opd_date`,`opd_time`,`opd_type`,`patient_height`,`patient_weight`,`patient_bmi`,`patient_pressure`,`patient_pulse`,`patient_temperature`,`patient_respiratory`,`patient_waist`,`patient_hip`,`patient_spo2`,`complaints`,`past_personal_family_history`,`investigation`,`findings`,`provisional_diagnosis`,`remarks`,`followup_days`,`followup_date`,`referred_to`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (3,'0000001','RTY Clinic','2','Doctor John  Santos','2','Diego  Silang ','3','2017-09-04',1,'A','','','',0,0,0,'2017-09-04','07:30am','New',1,23,0,'4',5,6,7,8,9,10,'','','','','','',0,NULL,'Dr. Ronald Crus','1','1','2017-09-04 16:14:11','2017-09-04 16:14:11',0,0),
 (4,'0000002','Clinic2','2','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15',1,'A','Isog ,Barangay Isugan ,Dumaguete City ,Negros Oriental ,Philippines','Medicol, Tiki-Tiki','Shrimp',2,2,0,'2017-08-15','07:00pm','New',0,0,0,'',0,0,0,0,0,0,'','','','','','',0,NULL,'','1','1','2017-09-04 16:15:00','2017-09-04 16:15:00',0,0);
INSERT INTO `out_patient_departments` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`patient_bday`,`patient_gender`,`patient_blood_type`,`patient_address`,`patient_allergy_medicine`,`patient_allergy_others`,`patient_is_smoking`,`patient_is_alcohol`,`patient_is_drug_abuse`,`opd_date`,`opd_time`,`opd_type`,`patient_height`,`patient_weight`,`patient_bmi`,`patient_pressure`,`patient_pulse`,`patient_temperature`,`patient_respiratory`,`patient_waist`,`patient_hip`,`patient_spo2`,`complaints`,`past_personal_family_history`,`investigation`,`findings`,`provisional_diagnosis`,`remarks`,`followup_days`,`followup_date`,`referred_to`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (5,'0000003','XYZ Clinic','1','Dr. John  Cruz','2','Ronald Cadayday Pascua ','2','2017-08-15',1,'A','Isog ,Barangay Isugan ,Dumaguete City ,Negros Oriental ,Philippines','Medicol, Tiki-Tiki','Shrimp',2,2,0,'2017-08-15','11:00am','New',0,0,0,'',0,0,0,0,0,0,'','','','','','',0,NULL,'','1','1','2017-09-04 16:18:33','2017-09-04 16:18:33',0,0),
 (6,'0000003','Clinic2','2','Doctor Juan dela Cruz','1','Ronald Cadayday Pascua ','2','2017-08-15',1,'A','Isog ,Barangay Isugan ,Dumaguete City ,Negros Oriental ,Philippines','Medicol, Tiki-Tiki','Shrimp',2,2,0,'2017-08-15','07:00am','New',1,2,0,'1',1,1,1,1,1,1,'Abdominal Pain  since 1 hour/s\nBitter Taste  since 5 day/s','PERSONAL - Nutrition - a','','','','',0,NULL,'','1','1','2017-09-27 18:56:50','2017-09-27 18:56:50',0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patients`
--

/*!40000 ALTER TABLE `patients` DISABLE KEYS */;
INSERT INTO `patients` (`id`,`fname`,`mi`,`lname`,`sname`,`bday`,`gender`,`blood_type`,`occupation`,`address`,`barangay`,`city`,`province`,`country`,`contact_no`,`email_address`,`allergy_medicine`,`allergy_others`,`is_smoking`,`is_alcohol`,`is_drug_abuse`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Juan','dela','Cruz','','2017-08-01',1,'O','Carpenter','Canlas Subdivision','Malang Suba','Dumaguete','Negros Oriental','Philippines','','','Alaxan, Medicol','Cats',1,0,0,'Clinic1','1','','','2017-08-15 22:27:51','2017-09-04 12:25:28',0,0),
 (2,'Ronald','Cadayday','Pascua','','2017-08-15',1,'A','Software Engineer','Isog','Barangay Isugan','Dumaguete City','Negros Oriental','Philippines','','','Medicol, Tiki-Tiki','Shrimp',2,2,0,'Clinic2','2','','','2017-08-15 22:28:11','2017-08-15 22:38:21',0,0),
 (3,'Diego','','Silang','','2017-09-04',1,'A','','','','','','','','','','',0,0,0,'',NULL,'1','1','2017-09-04 16:11:12','2017-09-04 16:11:12',0,0);
/*!40000 ALTER TABLE `patients` ENABLE KEYS */;


--
-- Definition of table `receipt_particulars`
--

DROP TABLE IF EXISTS `receipt_particulars`;
CREATE TABLE `receipt_particulars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `particular` varchar(255) DEFAULT NULL,
  `charge` double DEFAULT NULL,
  `clinic` varchar(255) DEFAULT NULL,
  `clinic_id` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_uploaded` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receipt_particulars`
--

/*!40000 ALTER TABLE `receipt_particulars` DISABLE KEYS */;
INSERT INTO `receipt_particulars` (`id`,`particular`,`charge`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Charge1',50,'','','','','2017-08-25 20:18:37','2017-08-25 20:18:37',0,0),
 (3,'Charge2',75,'','','','','2017-08-25 20:19:58','2017-08-25 20:19:58',0,0),
 (4,'Charge3',100,'','','','','2017-08-25 20:20:04','2017-08-25 20:20:04',0,0),
 (5,'Charge4',150,'','','','','2017-08-25 20:20:13','2017-08-25 20:20:13',0,0),
 (6,'Charge5',175,'','','','','2017-08-25 20:20:22','2017-08-25 20:20:22',0,0),
 (7,'Consultation',100,'','','','','2017-08-29 17:35:07','2017-08-29 17:35:07',0,0);
/*!40000 ALTER TABLE `receipt_particulars` ENABLE KEYS */;


--
-- Definition of table `settings`
--

DROP TABLE IF EXISTS `settings`;
CREATE TABLE `settings` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(255) DEFAULT NULL,
  `company_address` varchar(255) DEFAULT NULL,
  `company_operated_by` varchar(255) DEFAULT NULL,
  `company_slogan` varchar(255) DEFAULT NULL,
  `company_contact_no` varchar(255) DEFAULT NULL,
  `company_fax_no` varchar(255) DEFAULT NULL,
  `company_email_address` varchar(255) DEFAULT NULL,
  `bir_serial_no` varchar(255) DEFAULT NULL,
  `bir_permit_no` varchar(255) DEFAULT NULL,
  `bir_accreditation_no` varchar(255) DEFAULT NULL,
  `bir_tin` varchar(255) DEFAULT NULL,
  `bir_machine_no` varchar(255) DEFAULT NULL,
  `bir_min_no` varchar(255) DEFAULT NULL,
  `bir_business_name` varchar(255) DEFAULT NULL,
  `bir_vat_percent` varchar(255) DEFAULT NULL,
  `bir_receipt_footer` varchar(255) DEFAULT NULL,
  `receipt_print_ting_enabled` int(11) DEFAULT NULL,
  `receipt_printer_show_dialog` int(11) DEFAULT NULL,
  `kitchen_printing_enable` int(11) DEFAULT NULL,
  `allow_negative_inventory` int(11) DEFAULT NULL,
  `is_servcer` int(11) DEFAULT NULL,
  `developer` varchar(255) DEFAULT NULL,
  `developer_address` varchar(255) DEFAULT NULL,
  `developer_tin_no` varchar(255) DEFAULT NULL,
  `developer_accreditation_no` varchar(255) DEFAULT NULL,
  `developer_accreditation_date` varchar(255) DEFAULT NULL,
  `developer_contact_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `settings`
--

/*!40000 ALTER TABLE `settings` DISABLE KEYS */;
INSERT INTO `settings` (`id`,`company_name`,`company_address`,`company_operated_by`,`company_slogan`,`company_contact_no`,`company_fax_no`,`company_email_address`,`bir_serial_no`,`bir_permit_no`,`bir_accreditation_no`,`bir_tin`,`bir_machine_no`,`bir_min_no`,`bir_business_name`,`bir_vat_percent`,`bir_receipt_footer`,`receipt_print_ting_enabled`,`receipt_printer_show_dialog`,`kitchen_printing_enable`,`allow_negative_inventory`,`is_servcer`,`developer`,`developer_address`,`developer_tin_no`,`developer_accreditation_no`,`developer_accreditation_date`,`developer_contact_no`) VALUES 
 (1,'','','','','','','','','','','','','','','','',0,0,0,1,0,'Synapse Software Technologies','Daro, Dumaguete City, Negros Oriental','','','','');
/*!40000 ALTER TABLE `settings` ENABLE KEYS */;


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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_default_priveleges`
--

/*!40000 ALTER TABLE `user_default_priveleges` DISABLE KEYS */;
INSERT INTO `user_default_priveleges` (`id`,`account`,`name`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Administrator','Users','','',NULL,NULL,0,0),
 (2,'Administrator','Doctors','','',NULL,NULL,0,0),
 (3,'Administrator','Patients','','',NULL,NULL,0,0),
 (4,'Administrator','Appointments','','',NULL,NULL,0,0),
 (5,'Administrator','Out Patient Department','','',NULL,NULL,0,0),
 (6,'Administrator','Receipts','','',NULL,NULL,0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;

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
 (17,'Administrator','Users - (Edit)','2','doctor'),
 (18,'Administrator','Appointments - (View)','1','admin11'),
 (19,'Administrator','Appointments - (Add)','1','admin11'),
 (20,'Administrator','Appointments - (Edit)','1','admin11'),
 (21,'Administrator','Appointments - (Delete)','1','admin11'),
 (22,'Administrator','Appointments - (Finalize)','1','admin11');
INSERT INTO `user_priveleges` (`id`,`account`,`privelege`,`user_id`,`user_name`) VALUES 
 (23,'Administrator','Out Patient Department - (View)','1','admin11'),
 (24,'Administrator','Out Patient Department - (Add)','1','admin11'),
 (25,'Administrator','Out Patient Department - (Edit)','1','admin11'),
 (26,'Administrator','Out Patient Department - (Delete)','1','admin11'),
 (27,'Administrator','Out Patient Department - (Finalize)','1','admin11'),
 (28,'Administrator','Appointments - (Report)','1','admin11'),
 (29,'Administrator','Doctors - (Report)','1','admin11'),
 (31,'Administrator','Receipts - (Report)','1','admin11'),
 (32,'Administrator','Receipts - (View)','1','admin11'),
 (33,'Administrator','Receipts - (Add)','1','admin11'),
 (34,'Administrator','Receipts - (Edit)','1','admin11'),
 (35,'Administrator','Receipts - (Delete)','1','admin11'),
 (36,'Administrator','Receipts - (Finalize)','1','admin11');
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
