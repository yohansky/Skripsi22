-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 28, 2022 at 07:19 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `protonema`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('', ''),
('root', 'root'),
('Admin', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `buktiambil`
--

CREATE TABLE `buktiambil` (
  `no_bp` varchar(20) NOT NULL,
  `tgl` date NOT NULL,
  `nip` varchar(20) NOT NULL,
  `nm_peg` varchar(30) NOT NULL,
  `divisi` varchar(30) NOT NULL,
  `kd_tgs` varchar(20) NOT NULL,
  `nm_tgs` varchar(30) NOT NULL,
  `ket_tgs` varchar(30) NOT NULL,
  `prior` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buktiambil`
--

INSERT INTO `buktiambil` (`no_bp`, `tgl`, `nip`, `nm_peg`, `divisi`, `kd_tgs`, `nm_tgs`, `ket_tgs`, `prior`) VALUES
('B1', '2022-08-01', '1', 'Yohanes Hubert', 'Infrastructure', 'T1', 'Recharging', 'Pengisian Ulang', 'Tinggi'),
('B2', '2022-08-02', '3', 'Jerry Susanto', 'Operating system', 'T2', 'Activating', 'Pengaktifan Nomor', 'Tinggi'),
('B3', '2022-08-03', '5', 'Gersom Masengi', 'Database', 'T3', 'Deactivating', 'Penonaktifan Nomor', 'Tinggi');

-- --------------------------------------------------------

--
-- Table structure for table `formambil`
--

CREATE TABLE `formambil` (
  `no_form` varchar(20) NOT NULL,
  `kd_tgs` varchar(20) NOT NULL,
  `nm_tgs` varchar(30) NOT NULL,
  `ket_tgs` varchar(30) NOT NULL,
  `prior` varchar(30) NOT NULL,
  `nip` varchar(20) NOT NULL,
  `nm_peg` varchar(30) NOT NULL,
  `divisi` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `formambil`
--

INSERT INTO `formambil` (`no_form`, `kd_tgs`, `nm_tgs`, `ket_tgs`, `prior`, `nip`, `nm_peg`, `divisi`) VALUES
('P1', 'T1', 'Recharging', 'Pengisian Ulang', 'Tinggi', '1', 'Yohanes Hubert', 'Infrastructure'),
('P2', 'T2', 'Activating', 'Pengaktifan Nomor', 'Tinggi', '3', 'Jerry Susanto', 'Operating system'),
('P3', 'T3', 'Deactivating', 'Penonaktifan Nomor', 'Tinggi', '5', 'Gersom Masengi', 'Database');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `nip` varchar(20) NOT NULL,
  `nm_peg` varchar(30) NOT NULL,
  `tgl` date NOT NULL,
  `jk` varchar(30) NOT NULL,
  `no_hp` varchar(30) NOT NULL,
  `divisi` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`nip`, `nm_peg`, `tgl`, `jk`, `no_hp`, `divisi`, `alamat`) VALUES
('1', 'Yohanes Hubert', '2000-08-27', 'Laki-Laki', '08121915676', 'Infrastructure', 'Depok'),
('2', 'Elaine Cesilia', '1994-03-23', 'Perempuan', '08129205580', 'Infrastructure', 'Jakarta'),
('3', 'Jerry Susanto', '1996-02-08', 'Laki-Laki', '08125915031', 'Operating system', 'Tanggerang'),
('4', 'Zhulian Budiantoro', '1995-07-17', 'Laki-Laki', '08122767813', 'Operating system', 'Bekasi'),
('5', 'Gersom Masengi', '1994-09-24', 'Laki-Laki', '08123829026', 'Database', 'Bogor');

-- --------------------------------------------------------

--
-- Table structure for table `sk`
--

CREATE TABLE `sk` (
  `no_sk` varchar(20) NOT NULL,
  `no_bp` varchar(20) NOT NULL,
  `nip` varchar(20) NOT NULL,
  `nm_peg` varchar(30) NOT NULL,
  `kd_tgs` varchar(20) NOT NULL,
  `nm_tgs` varchar(30) NOT NULL,
  `tenggat` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sk`
--

INSERT INTO `sk` (`no_sk`, `no_bp`, `nip`, `nm_peg`, `kd_tgs`, `nm_tgs`, `tenggat`) VALUES
('SK1', 'B1', '1', 'Yohanes Hubert', 'T1', 'Recharging', '2022-09-01'),
('SK2', 'B2', '3', 'Jerry Susanto', 'T2', 'Activating', '2022-09-02'),
('SK3', 'B3', '5', 'Gersom Masengi', 'T3', 'Deactivating', '2022-09-03');

-- --------------------------------------------------------

--
-- Table structure for table `tugas`
--

CREATE TABLE `tugas` (
  `kd_tgs` varchar(20) NOT NULL,
  `nm_tgs` varchar(30) NOT NULL,
  `ket_tgs` varchar(30) NOT NULL,
  `prior` varchar(30) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tugas`
--

INSERT INTO `tugas` (`kd_tgs`, `nm_tgs`, `ket_tgs`, `prior`, `status`) VALUES
('T1', 'Recharging', 'Pengisian Ulang', 'Tinggi', 'Belum Selesai'),
('T2', 'Activating', 'Pengaktifan Nomor', 'Tinggi', 'Belum Selesai'),
('T3', 'Deactivating', 'Penonaktifan Nomor', 'Tinggi', 'Belum Selesai');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
