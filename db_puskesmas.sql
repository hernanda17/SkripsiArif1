/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50614
Source Host           : 127.0.0.1:3306
Source Database       : db_puskesmas

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2017-05-22 10:07:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbladmin
-- ----------------------------
DROP TABLE IF EXISTS `tbladmin`;
CREATE TABLE `tbladmin` (
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(8) DEFAULT NULL,
  `password_admin` varchar(8) DEFAULT NULL,
  `nama_admin` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbladmin
-- ----------------------------
INSERT INTO `tbladmin` VALUES ('1', 'hernanda', 'f', 'hernanda');

-- ----------------------------
-- Table structure for tblantrian
-- ----------------------------
DROP TABLE IF EXISTS `tblantrian`;
CREATE TABLE `tblantrian` (
  `id_antrian` int(8) NOT NULL AUTO_INCREMENT,
  `id_pasien` int(8) DEFAULT NULL,
  `no_antrian` int(8) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `jamPanggil` time DEFAULT NULL,
  PRIMARY KEY (`id_antrian`),
  KEY `id_pasien` (`id_pasien`),
  CONSTRAINT `tblantrian_ibfk_1` FOREIGN KEY (`id_pasien`) REFERENCES `tblpasien` (`id_pasien`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tblantrian
-- ----------------------------

-- ----------------------------
-- Table structure for tbldeposit
-- ----------------------------
DROP TABLE IF EXISTS `tbldeposit`;
CREATE TABLE `tbldeposit` (
  `idDeposit` int(11) NOT NULL AUTO_INCREMENT,
  `id_pasien` int(5) DEFAULT NULL,
  `idAdmin` int(11) DEFAULT NULL,
  `deposit` int(10) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `catatan` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idDeposit`),
  KEY `id_pasien` (`id_pasien`),
  KEY `idAdmin` (`idAdmin`),
  CONSTRAINT `tbldeposit_ibfk_1` FOREIGN KEY (`id_pasien`) REFERENCES `tblpasien` (`id_pasien`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tbldeposit_ibfk_2` FOREIGN KEY (`idAdmin`) REFERENCES `tbladmin` (`id_admin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbldeposit
-- ----------------------------
INSERT INTO `tbldeposit` VALUES ('2', '3', '1', '20000', null, null);
INSERT INTO `tbldeposit` VALUES ('3', '3', '1', '25000', null, null);
INSERT INTO `tbldeposit` VALUES ('4', '3', '1', '30000', null, null);

-- ----------------------------
-- Table structure for tblpasien
-- ----------------------------
DROP TABLE IF EXISTS `tblpasien`;
CREATE TABLE `tblpasien` (
  `id_pasien` int(5) NOT NULL AUTO_INCREMENT,
  `id_RFID` int(10) DEFAULT NULL,
  `Nama_pasien` varchar(30) DEFAULT NULL,
  `Alamat_pasien` varchar(50) DEFAULT NULL,
  `identitas_pasien` int(11) DEFAULT NULL,
  `timestamp` datetime DEFAULT NULL,
  `deposit` int(5) DEFAULT '0',
  `pin` int(4) DEFAULT NULL,
  PRIMARY KEY (`id_pasien`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tblpasien
-- ----------------------------
INSERT INTO `tblpasien` VALUES ('1', '495620', 'Arif ID ', 'Dirumah', null, null, '0', null);
INSERT INTO `tblpasien` VALUES ('2', '3432432', 'arif juga', 'bagusrangin', '0', '2017-05-17 01:26:18', '0', null);
INSERT INTO `tblpasien` VALUES ('3', '21321321', 'hernanda', 'gan', '0', '2017-05-17 01:28:16', '10000', null);
INSERT INTO `tblpasien` VALUES ('4', '213213', 'hernanda', 'asdasdsa', '0', '2017-05-17 01:29:13', '0', null);

-- ----------------------------
-- Table structure for tblpembayaran
-- ----------------------------
DROP TABLE IF EXISTS `tblpembayaran`;
CREATE TABLE `tblpembayaran` (
  `id_pembayaran` int(11) NOT NULL AUTO_INCREMENT,
  `id_pasien` int(5) DEFAULT NULL,
  `id_admin` int(5) DEFAULT NULL,
  `id_tindakan` int(5) DEFAULT NULL,
  `timestamp` datetime DEFAULT NULL,
  `catatan` text,
  PRIMARY KEY (`id_pembayaran`),
  KEY `tblpembayaran_ibfk_3` (`id_tindakan`),
  KEY `tblpembayaran_ibfk_1` (`id_pasien`),
  KEY `tblpembayaran_ibfk_2` (`id_admin`),
  CONSTRAINT `tblpembayaran_ibfk_1` FOREIGN KEY (`id_pasien`) REFERENCES `tblpasien` (`id_pasien`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tblpembayaran_ibfk_2` FOREIGN KEY (`id_admin`) REFERENCES `tbladmin` (`id_admin`) ON UPDATE NO ACTION,
  CONSTRAINT `tblpembayaran_ibfk_3` FOREIGN KEY (`id_tindakan`) REFERENCES `tbltindakan` (`id_tindakan`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tblpembayaran
-- ----------------------------
INSERT INTO `tblpembayaran` VALUES ('3', '3', '1', '1', '2017-05-17 03:49:42', 'adssadsa');

-- ----------------------------
-- Table structure for tbltindakan
-- ----------------------------
DROP TABLE IF EXISTS `tbltindakan`;
CREATE TABLE `tbltindakan` (
  `id_tindakan` int(5) NOT NULL AUTO_INCREMENT,
  `nama_tindakan` varchar(25) DEFAULT NULL,
  `harga_tindakan` int(5) DEFAULT NULL,
  PRIMARY KEY (`id_tindakan`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbltindakan
-- ----------------------------
INSERT INTO `tbltindakan` VALUES ('1', 'bedah', '10000');
INSERT INTO `tbltindakan` VALUES ('2', 'cuci kaki', '5000');
