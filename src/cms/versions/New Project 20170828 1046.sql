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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

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
 (6,'Clinic2','2','Doctor Juan dela Cruz','1','2','Ronald','Cadayday','Pascua','','2017-08-15','Male','A','2017-08-25','10:00am','','','2017-08-25 22:57:56','2017-08-25 22:57:56',0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=158 DEFAULT CHARSET=latin1;

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
 (157,'Saturday','07:30pm','Clinic2','2','Doctor Juan dela Cruz','1','','','2017-08-16 15:11:17','2017-08-16 15:11:17',0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventory_prescriptions`
--

/*!40000 ALTER TABLE `inventory_prescriptions` DISABLE KEYS */;
INSERT INTO `inventory_prescriptions` (`id`,`item_code`,`generic_name`,`description`,`uom`,`dosage`,`days`,`dosage_qty`,`dosage_remarks`,`remarks`,`type_of_use`,`product_qty`,`cost`,`selling_price`,`reorder_level`,`category`,`category_id`,`classification`,`classification_id`,`sub_classification`,`sub_classification_id`,`brand`,`brand_id`,`model`,`model_id`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'00001','','item 1','[Pc:25.0/1.0^1]','00-00-01',1,3,'remarks','','1',0,20,25,0,'','','','','','','','','','','','','','','2017-08-23 16:28:35','2017-08-25 21:36:58',0,0),
 (2,'00001','','item 1','[Pc:25.0/1.0^1]','023',2,2,'r2','r1','1',0,20,25,0,'','','','','','','','','','','','','','','2017-08-23 16:28:35','2017-08-25 21:36:58',0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_department_prescriptions`
--

/*!40000 ALTER TABLE `out_patient_department_prescriptions` DISABLE KEYS */;
INSERT INTO `out_patient_department_prescriptions` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`item_code`,`generic_name`,`description`,`uom`,`qty`,`dosage`,`dosage_qty`,`days`,`dosage_remarks`,`remarks`,`cost`,`selling_price`,`discount_amount`,`type_of_use`,`category`,`category_id`,`classification`,`classification_id`,`sub_classification`,`sub_classification_id`,`brand`,`brand_id`,`model`,`model_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'0000001','','','Doctor Juan dela Cruz','1','Ronald','2','2017-08-05','07:30am','Regular','00001','','item 1','[Pc:25.0/1.0^1]',1,'',1,1,'','',20,25,0,'1','','','','','','','','','','','','','2017-08-26 21:42:49','2017-08-26 21:42:49',0,0),
 (2,'0000001','','','Doctor Juan dela Cruz','1','Ronald','2','2017-08-05','07:30am','Regular','00002','','item 2','[Pc:1200.0/1.0^1]',1,'',1,0,'','',1000,1200,0,'1','','','','','','','','','','','','','2017-08-26 21:42:49','2017-08-26 21:42:49',0,0),
 (3,'0000001','','','Doctor Juan dela Cruz','1','Ronald','2','2017-08-05','07:30am','Regular','00003','','item 3','[box:7.5/1.0^1],[case:100.0/10.0^0]',1,'',1,0,'','',6,7.5,0,'1','','','','','','','','','','','','','2017-08-26 21:42:49','2017-08-26 21:42:49',0,0);
INSERT INTO `out_patient_department_prescriptions` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`item_code`,`generic_name`,`description`,`uom`,`qty`,`dosage`,`dosage_qty`,`days`,`dosage_remarks`,`remarks`,`cost`,`selling_price`,`discount_amount`,`type_of_use`,`category`,`category_id`,`classification`,`classification_id`,`sub_classification`,`sub_classification_id`,`brand`,`brand_id`,`model`,`model_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (4,'0000001','','','Doctor Juan dela Cruz','1','Ronald','2','2017-08-05','07:30am','Regular','00004','','Item 4','[Pc:150.0/1.0^1]',1,'',1,0,'','',100,150,0,'1','',NULL,'',NULL,'',NULL,'',NULL,'',NULL,'','','2017-08-26 21:42:49','2017-08-26 21:42:49',0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_department_receipt_items`
--

/*!40000 ALTER TABLE `out_patient_department_receipt_items` DISABLE KEYS */;
INSERT INTO `out_patient_department_receipt_items` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`receipt_no`,`receipt_date`,`reference_no`,`particular`,`particular_id`,`amount`,`discount`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'0000001','','','Doctor Juan dela Cruz','1','Ronald','2','2017-08-05','07:30am','Regular','000000000001','2017-08-26','','Item/s','0',1382.5,0,'','','2017-08-26 21:42:49','2017-08-26 21:42:49',1,0),
 (2,'0000001','','','Doctor Juan dela Cruz','1','Ronald','2','2017-08-05','07:30am','Regular','000000000001','2017-08-26','','Charge1','1',50,0,'','','2017-08-26 21:42:49','2017-08-26 21:42:49',1,0),
 (3,'0000001','','','Doctor Juan dela Cruz','1','Ronald','2','2017-08-05','07:30am','Regular','000000000001','2017-08-26','','Charge3','4',100,10,'','','2017-08-26 21:42:49','2017-08-26 21:42:49',1,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_department_receipts`
--

/*!40000 ALTER TABLE `out_patient_department_receipts` DISABLE KEYS */;
INSERT INTO `out_patient_department_receipts` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`receipt_no`,`receipt_date`,`reference_no`,`amount_due`,`discount`,`cash`,`check_bank`,`check_no`,`check_holder`,`check_amount`,`check_date`,`credit_card_type`,`credit_card_holder`,`credit_card_app_code`,`credit_card_rate`,`credit_card_amount`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'0000001','','','Doctor Juan dela Cruz','1','Ronald','2','2017-08-05','07:30am','Regular','000000000001','2017-08-26','',1522.5,50,1472.5,'','','',0,NULL,'','','',0,0,'','','2017-08-26 21:42:49','2017-08-26 21:42:49',1,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `out_patient_departments`
--

/*!40000 ALTER TABLE `out_patient_departments` DISABLE KEYS */;
INSERT INTO `out_patient_departments` (`id`,`opd_no`,`clinic`,`clinic_id`,`doctor`,`doctor_id`,`patient`,`patient_id`,`opd_date`,`opd_time`,`opd_type`,`patient_height`,`patient_weight`,`patient_bmi`,`patient_pressure`,`patient_pulse`,`patient_temperature`,`patient_respiratory`,`patient_waist`,`patient_hip`,`patient_spo2`,`complaints`,`past_personal_family_history`,`investigation`,`findings`,`provisional_diagnosis`,`remarks`,`followup_days`,`followup_date`,`referred_to`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'0000001','','','Doctor Juan dela Cruz','1','Ronald','2','2017-08-05','07:30am','Regular',1,2,0,'3',4,5,6,7,8,9,'a','b','c','d','e','f',1,NULL,'2','','','2017-08-26 21:42:49','2017-08-26 21:42:49',0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patients`
--

/*!40000 ALTER TABLE `patients` DISABLE KEYS */;
INSERT INTO `patients` (`id`,`fname`,`mi`,`lname`,`sname`,`bday`,`gender`,`blood_type`,`occupation`,`address`,`barangay`,`city`,`province`,`country`,`contact_no`,`email_address`,`allergy_medicine`,`allergy_others`,`is_smoking`,`is_alcohol`,`is_drug_abuse`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Juan','dela','Cruz','','2017-08-01',1,'O','Carpenter','Canlas Subdivision','Malang Suba','Dumaguete','Negros Oriental','Philippines','','','Alaxan, Medicol','Cats',0,1,0,'Clinic1','1','','','2017-08-15 22:27:51','2017-08-15 22:38:29',0,0),
 (2,'Ronald','Cadayday','Pascua','','2017-08-15',1,'A','Software Engineer','Isog','Barangay Isugan','Dumaguete City','Negros Oriental','Philippines','','','Medicol, Tiki-Tiki','Shrimp',2,2,0,'Clinic2','2','','','2017-08-15 22:28:11','2017-08-15 22:38:21',0,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receipt_particulars`
--

/*!40000 ALTER TABLE `receipt_particulars` DISABLE KEYS */;
INSERT INTO `receipt_particulars` (`id`,`particular`,`charge`,`clinic`,`clinic_id`,`created_by`,`updated_by`,`created_at`,`updated_at`,`status`,`is_uploaded`) VALUES 
 (1,'Charge1',50,'','','','','2017-08-25 20:18:37','2017-08-25 20:18:37',0,0),
 (3,'Charge2',75,'','','','','2017-08-25 20:19:58','2017-08-25 20:19:58',0,0),
 (4,'Charge3',100,'','','','','2017-08-25 20:20:04','2017-08-25 20:20:04',0,0),
 (5,'Charge4',150,'','','','','2017-08-25 20:20:13','2017-08-25 20:20:13',0,0),
 (6,'Charge5',175,'','','','','2017-08-25 20:20:22','2017-08-25 20:20:22',0,0);
/*!40000 ALTER TABLE `receipt_particulars` ENABLE KEYS */;


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
