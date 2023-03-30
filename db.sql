-- MySQL dump 10.13  Distrib 8.0.14, for Win64 (x86_64)
--
-- Host: localhost    Database: rms
-- ------------------------------------------------------
-- Server version	8.0.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `adminlogin` (
  `id` char(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminlogin`
--

LOCK TABLES `adminlogin` WRITE;
/*!40000 ALTER TABLE `adminlogin` DISABLE KEYS */;
INSERT INTO `adminlogin` VALUES ('123','213');
/*!40000 ALTER TABLE `adminlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeelogin`
--

DROP TABLE IF EXISTS `employeelogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `employeelogin` (
  `No` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `fathername` char(50) DEFAULT NULL,
  `aadhar` varchar(256) DEFAULT NULL,
  `phone` varchar(256) DEFAULT NULL,
  `gender` char(30) DEFAULT NULL,
  `dob` varchar(256) DEFAULT NULL,
  `ID` int(50) DEFAULT NULL,
  `password` varchar(256) DEFAULT '0000',
  PRIMARY KEY (`No`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeelogin`
--

LOCK TABLES `employeelogin` WRITE;
/*!40000 ALTER TABLE `employeelogin` DISABLE KEYS */;
INSERT INTO `employeelogin` VALUES (1,'Default','Default','Default','Default','Default','Default',11111,'Default'),(12,'Sandeep Kumar','Anil kumar','577066367468','7088161298','Male','20/03/2000',11112,'Sa3@'),(13,'vinay','nand lal kashyap','123456789012','701737-195','Male','24 07 1998',11113,'Vinay@13'),(14,'dhruv','ravi','533361931416','7906393665','Male','08/04/2002',11114,'Dhruv123@'),(15,'prajwal pathak','manoj sharma','234516293284','8006424999','Male','16/09/2000',11115,'0000Aa#'),(16,'suhel','aaaaaaa','123456789044','1234567890','Male','18/07/1999',11116,'0000');
/*!40000 ALTER TABLE `employeelogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product` (
  `No` int(30) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` int(30) DEFAULT NULL,
  `category` char(30) DEFAULT NULL,
  `id` int(100) DEFAULT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Default',0,'Default',9),(7,'Chicken',120,'Non Vegetarian',13),(8,'Tomato Soup',80,'Vegetarian',14),(9,'Saahi panir',210,'Vegetarian',15),(10,'fish curry',100,'Non Vegetarian',16),(11,'Chicken panir',150,'Non Vegetarian',17),(12,'egg',6,'Non Vegetarian',18),(15,'Palak paneer',100,'Vegetarian',21),(16,'Sahi Panner',70,'Vegetarian',22);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales_record`
--

DROP TABLE IF EXISTS `sales_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sales_record` (
  `category` char(30) DEFAULT NULL,
  `fname` char(30) DEFAULT NULL,
  `quantity` int(30) DEFAULT NULL,
  `price` int(200) DEFAULT NULL,
  `total` int(200) DEFAULT NULL,
  `day` char(30) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `sold_by` char(200) DEFAULT NULL,
  `sold_by_person_id` char(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales_record`
--

LOCK TABLES `sales_record` WRITE;
/*!40000 ALTER TABLE `sales_record` DISABLE KEYS */;
INSERT INTO `sales_record` VALUES ('Vegetarian','magi',1,10,10,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Vegetarian','Tomato Soup',1,89,89,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Vegetarian','magi',1,10,10,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken',1,120,120,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Vegetarian','magi',1,10,10,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken',1,120,120,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Vegetarian','magi',1,10,10,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Vegetarian','Coffee',1,30,30,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken',1,120,120,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Vegetarian','magi',1,10,10,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken',1,120,120,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken panir',1,150,150,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Vegetarian','magi',1,10,10,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken',1,120,120,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','fish curry',1,100,100,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken panir',1,150,150,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken',1,120,120,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Vegetarian','Tomato Soup',1,89,89,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken panir',3,150,450,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Vegetarian','Coffee',1,30,30,'Saturday','14-12-2019','vinay','11113'),('Non Vegetarian','Chicken',1,120,120,'Saturday','14-12-2019','vinay','11113'),('Non Vegetarian','Chicken',3,120,360,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken panir',2,150,300,'Saturday','14-12-2019','vinay','11113'),('Non Vegetarian','Chicken',1,120,120,'Saturday','14-12-2019','vinay','11113'),('Vegetarian','Coffee',3,30,90,'Saturday','14-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken panir',1,150,150,'Sunday','15-12-2019','Sandeep Kumar','11112'),('Vegetarian','Coffee',1,30,30,'Sunday','15-12-2019','Sandeep Kumar','11112'),('Non Vegetarian','Chicken',1,120,120,'Sunday','15-12-2019','vinay','11113'),('Vegetarian','Saahi panir',5,210,1050,'Tuesday','17-12-2019','vinay','11113'),('Non Vegetarian','egg',4,6,24,'Tuesday','17-12-2019','vinay','11113'),('Non Vegetarian','Chicken',4,120,480,'Tuesday','17-12-2019','vinay','11113'),('Vegetarian','BARFI',5,10,50,'Tuesday','17-12-2019','vinay','11113'),('Vegetarian','Malai Kofta',1,100,100,'Tuesday','17-12-2019','Sandeep Kumar','11112'),('Vegetarian','Tomato Soup',4,89,356,'Wednesday','25-12-2019','Sandeep Kumar','11112'),('Vegetarian','Tomato Soup',5,89,445,'Tuesday','07-01-2020','dhruv','11114'),('Non Vegetarian','egg',7,6,42,'Tuesday','07-01-2020','dhruv','11114'),('Vegetarian','Coffee',1,30,30,'Thursday','09-01-2020','dhruv','11114'),('Non Vegetarian','egg',5,6,30,'Thursday','09-01-2020','dhruv','11114'),('Vegetarian','Malai Kofta',2,100,200,'Monday','13-01-2020','prajwal pathak','11115'),('Non Vegetarian','Chicken',1,120,120,'Monday','13-01-2020','prajwal pathak','11115'),('Non Vegetarian','Chicken panir',1,150,150,'Monday','13-01-2020','suhel','11116'),('Vegetarian','Tomato Soup',3,89,267,'Monday','13-01-2020','suhel','11116'),('Non Vegetarian','Chicken',4,120,480,'Monday','20-01-2020','Sandeep Kumar','11112'),('Vegetarian','Coffee',1,30,30,'Monday','20-01-2020','Sandeep Kumar','11112'),('Vegetarian','Tomato Soup',7,89,623,'Thursday','23-01-2020','Sandeep Kumar','11112');
/*!40000 ALTER TABLE `sales_record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-02 12:55:52
