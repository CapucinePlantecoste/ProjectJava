-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: ptest
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `apartment`
--

DROP TABLE IF EXISTS `apartment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apartment` (
  `id` int NOT NULL,
  `price` double NOT NULL,
  `location` text NOT NULL,
  `numberrooms` int NOT NULL,
  `numberbedrooms` int NOT NULL,
  `timevisited` int NOT NULL,
  `numberfloors` int NOT NULL,
  `surface` double NOT NULL,
  `elevator` tinyint(1) NOT NULL,
  `floornumber` int NOT NULL,
  `parking` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apartment`
--

LOCK TABLES `apartment` WRITE;
/*!40000 ALTER TABLE `apartment` DISABLE KEYS */;
INSERT INTO `apartment` VALUES (100,245000,'Paris 15',3,2,3,1,50,0,3,0),(101,1000000,'Paris 1',5,3,10,1,75,0,2,0),(102,1300000,'Paris 2',6,3,32,2,95,1,3,1),(103,250000,'Paris 6',3,2,7,1,35,0,1,0),(104,6000000,'Paris 3',6,4,5,2,120,1,5,1),(105,900000,'Paris 4',4,2,17,1,102,1,4,0);
/*!40000 ALTER TABLE `apartment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buyer`
--

DROP TABLE IF EXISTS `buyer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buyer` (
  `idbuyer` int NOT NULL,
  `name` text NOT NULL,
  `familyname` text NOT NULL,
  `username` text NOT NULL,
  `password` text NOT NULL,
  PRIMARY KEY (`idbuyer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buyer`
--

LOCK TABLES `buyer` WRITE;
/*!40000 ALTER TABLE `buyer` DISABLE KEYS */;
INSERT INTO `buyer` VALUES (1,'Thomas','Poulain','thomaspln@gmail.com','password'),(2,'Capucine','Plantecoste','capuplt@outlook.fr','thisismypassword'),(3,'Emmanuel','Macron','manu@europe.com','president'),(4,'Franck','Poulain','franckpln@gmail.com','microsoft123'),(5,'Laurence','Godnair','laurencegdr@lol.fr','melann!'),(6,'Killian','Poulain','killianpln@ri.fr','123456'),(7,'Jean-Pierre','Segado','jpsegado@ece.fr','info'),(8,'Inès','Lambert','ineslambert@live.fr','lilalila'),(9,'Annick','Fontaine','annick.fontaine@ri.fr','bretagne'),(10,'Michel','Ferrand','michelferrand@orange.fr','bretagne');
/*!40000 ALTER TABLE `buyer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `idemployee` int NOT NULL,
  `name` text NOT NULL,
  `familyname` text NOT NULL,
  `username` text NOT NULL,
  `password` text NOT NULL,
  PRIMARY KEY (`idemployee`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1001,'Pauline','Durand','paulinedrd','12345'),(1002,'Cathleen','West','cathwest','heyhey'),(1003,'John','Dalton','joedltn','ineedapassword'),(1004,'Marie','Lebourg','marielbg','secret'),(1005,'Therese','Marcoux','thmarcoux','changeme'),(1006,'Joe','Biden','joebdn','usapresident');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `house`
--

DROP TABLE IF EXISTS `house`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `house` (
  `id` int NOT NULL,
  `price` double NOT NULL,
  `location` text NOT NULL,
  `numberrooms` int NOT NULL,
  `numberbedrooms` int NOT NULL,
  `timevisited` int NOT NULL,
  `numberfloors` int NOT NULL,
  `surface` double NOT NULL,
  `gardensurface` double NOT NULL,
  `swimmingpool` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `house`
--

LOCK TABLES `house` WRITE;
/*!40000 ALTER TABLE `house` DISABLE KEYS */;
INSERT INTO `house` VALUES (1,170000,'Paris 12',4,2,3,2,120,40,0),(2,1000000,'Baden',8,5,10,3,1000,200,0),(3,1300000,'Nice',6,3,5,3,1200,500,1),(4,230000,'Trouville',5,3,7,5,40,5,0),(5,6000000,'Saint-Tropez',6,4,35,2,500,200,1),(6,900000,'Le Pecq',6,3,17,3,1000,700,0);
/*!40000 ALTER TABLE `house` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `offer`
--

DROP TABLE IF EXISTS `offer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `offer` (
  `idoffer` int NOT NULL,
  `idbuyer` int DEFAULT NULL,
  `idproperty` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  `accepted` tinyint(1) DEFAULT NULL,
  `declined` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idoffer`),
  KEY `idproperty` (`idproperty`),
  KEY `idbuyer` (`idbuyer`),
  CONSTRAINT `offer_ibfk_1` FOREIGN KEY (`idproperty`) REFERENCES `property` (`id`),
  CONSTRAINT `offer_ibfk_2` FOREIGN KEY (`idbuyer`) REFERENCES `buyer` (`idbuyer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offer`
--

LOCK TABLES `offer` WRITE;
/*!40000 ALTER TABLE `offer` DISABLE KEYS */;
INSERT INTO `offer` VALUES (1,1,1,150000,0,0),(2,2,2,900000,0,0),(3,3,3,1200000,0,0),(4,4,4,200000,0,0),(5,5,5,5500000,0,0),(6,6,6,800000,0,0),(7,7,7,230000,0,0),(8,8,8,900000,0,0),(9,9,9,1200000,0,0),(10,10,10,230000,0,0),(11,1,11,5500000,0,0),(12,2,12,850000,0,0),(13,3,1,155000,0,0),(14,4,2,950000,0,0),(15,5,3,1250000,0,0);
/*!40000 ALTER TABLE `offer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `property` (
  `id` int NOT NULL,
  `type` text,
  `description` text,
  `price` double NOT NULL,
  `location` text NOT NULL,
  `numberrooms` int NOT NULL,
  `numberbedrooms` int NOT NULL,
  `timevisited` int NOT NULL,
  `numberfloors` int NOT NULL,
  `surface` double NOT NULL,
  `gardensurface` double DEFAULT NULL,
  `swimmingpool` tinyint(1) DEFAULT NULL,
  `elevator` tinyint(1) DEFAULT NULL,
  `floornumber` int DEFAULT NULL,
  `parking` tinyint(1) DEFAULT NULL,
  `idseller` int DEFAULT NULL,
  `sold` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idseller` (`idseller`),
  CONSTRAINT `property_ibfk_1` FOREIGN KEY (`idseller`) REFERENCES `seller` (`idseller`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
INSERT INTO `property` VALUES (1,'House','House in Paris with a small garden',170000,'Paris',4,2,3,2,120,40,0,NULL,NULL,NULL,10002,0),(2,'House',' House near the sea in Baden',1000000,'Baden',8,5,10,3,1000,200,0,NULL,NULL,NULL,10001,0),(3,'House','Big House with swimming pool in Nice',1300000,'Nice',6,3,5,3,1200,500,1,NULL,NULL,NULL,10003,0),(4,'House',' Tiny house in Trouville',230000,'Trouville',5,3,7,5,40,5,0,NULL,NULL,NULL,10004,0),(5,'House','Large house in Saint-Tropez',6000000,'Saint-Tropez',6,4,35,2,500,200,1,NULL,NULL,NULL,10005,0),(6,'House','Big house in a quiet place in Le Pecq',900000,'Le Pecq',6,3,17,3,1000,700,0,NULL,NULL,NULL,10006,0),(7,'Apartment','Small appartment in Paris ',245000,'Paris',3,2,3,1,50,NULL,NULL,0,3,0,10002,0),(8,'Apartment','Beautiful apartment in Nantes',1000000,'Nantes',5,3,10,1,75,NULL,NULL,1,2,0,10006,0),(9,'Apartment','Big apartment in Lyon',1300000,'Lyon',6,3,32,2,95,NULL,NULL,1,3,1,10001,0),(10,'Apartment','Small appartment near the sea',250000,'Marseille',3,2,7,1,35,NULL,NULL,0,1,0,10003,0),(11,'Apartment','Very large apartment in Bordeaux',6000000,'Bordeaux',6,4,5,2,120,NULL,NULL,1,5,1,10005,0),(12,'Apartment','Nice apartment in Lille',900000,'Lille',4,2,17,1,102,NULL,NULL,1,4,0,10004,0);
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seller`
--

DROP TABLE IF EXISTS `seller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seller` (
  `idseller` int NOT NULL,
  `name` text,
  `familyname` text,
  `username` text,
  `password` text,
  PRIMARY KEY (`idseller`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seller`
--

LOCK TABLES `seller` WRITE;
/*!40000 ALTER TABLE `seller` DISABLE KEYS */;
INSERT INTO `seller` VALUES (10001,'Apolline','Cherrey','apocherrey@ece.fr','lili123'),(10002,'Lilian','Biscarrat','lilibisc@live.com','thais'),(10003,'Henri','Petrelli','henriptl@gmail.fr','corsica'),(10004,'Thierry','Cancelier','thierryplt@titi.fr','trouville'),(10005,'Delphine','Fontaine','delphineplt@dedel.com','jetmonchat'),(10006,'Cassandre','Ferrand','cassandreplt@cass.fr','123456'),(10007,'Thomas','Dieu','thomasdieu@gmail.com','design'),(10008,'Franck','Sinatra','francks@orange.com','music'),(10009,'Catherine','Daklia','cathda@ece.fr','yes'),(10010,'Zoe','Ceverin','zozo@ceverin@ece.fr','zozozo');
/*!40000 ALTER TABLE `seller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shape`
--

DROP TABLE IF EXISTS `shape`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shape` (
  `shapename` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shape`
--

LOCK TABLES `shape` WRITE;
/*!40000 ALTER TABLE `shape` DISABLE KEYS */;
INSERT INTO `shape` VALUES ('Circle'),('Square'),('Triangle');
/*!40000 ALTER TABLE `shape` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visit`
--

DROP TABLE IF EXISTS `visit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visit` (
  `idvisit` int NOT NULL,
  `schedule` datetime DEFAULT NULL,
  `idemployee` int DEFAULT NULL,
  `idbuyer` int DEFAULT NULL,
  `idproperty` int DEFAULT NULL,
  `duration` int DEFAULT NULL,
  PRIMARY KEY (`idvisit`),
  KEY `idproperty` (`idproperty`),
  KEY `idemployee` (`idemployee`),
  KEY `idbuyer` (`idbuyer`),
  CONSTRAINT `visit_ibfk_1` FOREIGN KEY (`idproperty`) REFERENCES `property` (`id`),
  CONSTRAINT `visit_ibfk_2` FOREIGN KEY (`idemployee`) REFERENCES `employee` (`idemployee`),
  CONSTRAINT `visit_ibfk_3` FOREIGN KEY (`idbuyer`) REFERENCES `buyer` (`idbuyer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visit`
--

LOCK TABLES `visit` WRITE;
/*!40000 ALTER TABLE `visit` DISABLE KEYS */;
INSERT INTO `visit` VALUES (1,'2020-12-30 10:00:00',1001,1,1,30),(2,'2020-12-30 11:00:00',1002,NULL,2,30),(3,'2021-01-02 12:00:00',1003,3,3,30),(4,'2021-01-03 13:00:00',1004,NULL,4,30),(5,'2021-01-04 14:00:00',1005,5,5,30),(6,'2021-01-05 15:00:00',1006,NULL,6,30),(7,'2021-01-06 16:00:00',1001,7,7,30),(8,'2021-01-07 17:00:00',1002,NULL,8,30),(9,'2020-12-20 18:00:00',1003,9,9,30),(10,'2020-12-21 10:00:00',1004,NULL,10,30),(11,'2020-12-22 11:00:00',1005,1,11,30),(12,'2020-12-23 12:00:00',1006,NULL,12,30),(13,'2020-12-26 13:00:00',1001,3,1,30),(14,'2020-12-27 14:00:00',1002,NULL,2,30),(15,'2020-12-28 15:00:00',1003,5,3,30);
/*!40000 ALTER TABLE `visit` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-15  0:35:29
