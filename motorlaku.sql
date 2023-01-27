-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 27, 2023 at 04:19 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `motorlaku`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_admin`
--

CREATE TABLE `tb_admin` (
  `id_admin` int(20) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_admin`
--

INSERT INTO `tb_admin` (`id_admin`, `username`, `password`) VALUES
(1, 'ezapratama', '123456789');

-- --------------------------------------------------------

--
-- Table structure for table `tb_cust`
--

CREATE TABLE `tb_cust` (
  `ID_Customer` int(10) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `TTL` varchar(50) NOT NULL,
  `Jenis_Kelamin` varchar(15) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Pekerjaan` varchar(15) NOT NULL,
  `No_Hp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_cust`
--

INSERT INTO `tb_cust` (`ID_Customer`, `Nama`, `TTL`, `Jenis_Kelamin`, `Alamat`, `Pekerjaan`, `No_Hp`) VALUES
(1, 'Ardy Eza Pratama', 'Banyuwangi, 20 Juli 2000', 'Laki - Laki', 'Banyuwangi', 'Pelajar', '0937282736'),
(2, 'I Gede Putu Purnaya', 'Denpasar, 30 Januari 2000', 'Laki - Laki', 'Bali', 'Pelajar', '098893489488'),
(3, 'Paulus Theodorus Rasaama W.', 'Kupang, 21 April 2000', 'Laki - Laki', 'Kupang', 'Pelajar', '083847564756');

-- --------------------------------------------------------

--
-- Table structure for table `tb_motor`
--

CREATE TABLE `tb_motor` (
  `ID_Motor` int(10) NOT NULL,
  `Tipe` varchar(30) NOT NULL,
  `Jenis_Motor` varchar(100) NOT NULL,
  `Warna` varchar(50) NOT NULL,
  `Harga` varchar(25) NOT NULL,
  `Jumlah_Unit` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_motor`
--

INSERT INTO `tb_motor` (`ID_Motor`, `Tipe`, `Jenis_Motor`, `Warna`, `Harga`, `Jumlah_Unit`) VALUES
(1, 'Matic', 'Vario CW110', 'Hijau', '50000', 3),
(2, 'CBR 250RR', 'Sport', 'Merah', '150000', 2),
(3, 'SupraX 125', 'Bebek', 'Biru', '40000', 5);

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `ID_Transaksi` int(10) NOT NULL,
  `ID_Motor` int(10) NOT NULL,
  `ID_Customer` int(10) NOT NULL,
  `Jenis_Motor` varchar(100) NOT NULL,
  `Tipe` varchar(30) NOT NULL,
  `Jumlah_UnitTrans` int(11) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `No_Hp` varchar(15) NOT NULL,
  `Total_Harga` varchar(25) NOT NULL,
  `Status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`ID_Transaksi`, `ID_Motor`, `ID_Customer`, `Jenis_Motor`, `Tipe`, `Jumlah_UnitTrans`, `Nama`, `Alamat`, `No_Hp`, `Total_Harga`, `Status`) VALUES
(1, 1, 3, 'Vario CW110', 'Matic', 2, 'Paulus Theodorus Rasaama W.', 'Kupang', '083847564756', '350000', 'Selesai'),
(2, 1, 1, 'Matic', 'Vario CW110', 2, 'Ardy Eza Pratama', 'Banyuwangi', '0937282736', '300000', 'Selesai');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `tb_cust`
--
ALTER TABLE `tb_cust`
  ADD PRIMARY KEY (`ID_Customer`);

--
-- Indexes for table `tb_motor`
--
ALTER TABLE `tb_motor`
  ADD PRIMARY KEY (`ID_Motor`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`ID_Transaksi`),
  ADD KEY `ID_Motor` (`ID_Motor`),
  ADD KEY `ID_Customer` (`ID_Customer`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_admin`
--
ALTER TABLE `tb_admin`
  MODIFY `id_admin` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_cust`
--
ALTER TABLE `tb_cust`
  MODIFY `ID_Customer` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tb_motor`
--
ALTER TABLE `tb_motor`
  MODIFY `ID_Motor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `ID_Transaksi` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD CONSTRAINT `tb_transaksi_ibfk_1` FOREIGN KEY (`ID_Motor`) REFERENCES `tb_motor` (`ID_Motor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_transaksi_ibfk_2` FOREIGN KEY (`ID_Customer`) REFERENCES `tb_cust` (`ID_Customer`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
