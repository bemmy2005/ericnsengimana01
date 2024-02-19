-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 11:59 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nsengimana_eric_pdas`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `deleteproduct_order` (IN `orID` INT(5))   BEGIN delete from product_order where orID=product_orderID;END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `deletevendor` (IN `vID` INT(5))   BEGIN delete from vendor where vID=vendorID;END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getcustomerByID` (IN `pid` INT(5))   BEGIN select * from product where productID=pID;END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getpayimentByID` (IN `payid` INT(5))   BEGIN select * from payment where paymentID=payID;END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getproductByID` (IN `pid` INT(5))   BEGIN select * from product where productID=pID;END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getproduct_orderByID` (IN `orid` INT(5))   BEGIN select * from product_order where product_orderID=orID;END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getsellByID` (IN `sid` INT(5))   BEGIN select * from sell where sellID=sID;END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getvendorByID` (IN `vid` INT(5))   BEGIN select * from vondor where vendorID=vID;END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertcustomer` (IN `cid` INT(5), `fname` VARCHAR(15), `lname` VARCHAR(15), `phone` BIGINT(12), `email` VARCHAR(15), `district` VARCHAR(15), `sector` VARCHAR(15), `cell` VARCHAR(15), `village` VARCHAR(15))   BEGIN insert into customer values (cid,fname,lname,phone,email,district,sector,cell,village ); END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertpayment` (IN `payid` INT(5), `paydate` DATE, `pamount` FLOAT(5), `pmethod` VARCHAR(15), `orid` INT(5), `paystatus` VARCHAR(15))   BEGIN insert into customer values (payid,paydate,pamount,pmethod,orid,paystatus ); END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertproduct` (IN `pid` INT(5), `pname` VARCHAR(15), `pgrade` VARCHAR(5), `price_per_unit` VARCHAR(8), `mfg_date` DATE, `expdate` DATE, `pimage` BLOB)   BEGIN insert into customer values (pid,pname,pgrade,price_per_unit,mfg_date,expdate,pimage ); END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertproduct_order` (IN `orid` INT(5), `ordate` DATE, `pid` INT(5), `pquantity` INT(5), `orprice` FLOAT(5), `cid` INT(5), `order_status` VARCHAR(15))   BEGIN insert into customer values (orid,ordate,pid,pquantity,orprice,cid,order_status ); END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertsell` (IN `sid` INT(5), `sdate` DATE, `vid` INT(5), `orid` INT(5))   BEGIN insert into customer values (sid,sdate,vid,orid ); END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertvendor` (IN `vid` INT(5), `vfname` VARCHAR(15), `vlname` VARCHAR(15), `phone` BIGINT(15), `email` VARCHAR(15), `district` VARCHAR(15), `sector` VARCHAR(15), `cell` VARCHAR(15), `village` VARCHAR(15))   BEGIN insert into customer values (vid,vfname,vlname,phone,email,district,sector,cell,village ); END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `updatecustomer` (IN `Cid` INT(5))   BEGIN    update customer set nsengimana=nsengimana where CID=CID; END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `updatepayment` (IN `payid` INT(5))   BEGIN update payment set account=account where payid=payid; END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admid` int(5) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(35) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admid`, `fname`, `lname`, `phone`, `email`, `username`, `password`) VALUES
(10, 'YVAN', 'NGENDANZI', '0789945673', 'NGENDANZIYVAN@GMAIL.COM', 'YVAN', 'YVAN234'),
(11, 'HAGENIMANA', 'ERIC', '', 'HAGENIMANAERIC@GMAIL.COM', '', ''),
(19, 'yuymk', 'hhh', '098765', 'wsdf', '4', 'uy7'),
(20, '', '', '', '', '', ''),
(21, 'ishimwe', 'emanuel', '0788456324', 'ishimweemanuel@gmail.com', 'emmanuel', 'ishimwe'),
(22, 'ALES', 'emanuel', '0788456324', 'ishimweemanuel@gmail.com', 'emmanuel', 'ishimwe'),
(23, 'NDAYAMBAJE', 'MAURICE', '078333627', 'NDAYAMBAJEEMAURICE@01GMAIL.COM', '222', 'HOOD1'),
(24, 'fdgf', 'hdghsx', '0789899899', 'ertywtsgdf', 'rwtefstd', '45454'),
(25, 'nelly', 'tumukunde', '073334343434', 'tumukunde@gmail.com', 'emima', '78787'),
(30, 'MBARUSHIMANA', 'FREDERICK', '0788811104', 'MBARUSHIMANAFREDERICK@GMAIL.CO', 'FREDERICK123', '123'),
(31, 'DFGH', 'ZXFGH', '4567', 'IUY', 'SDTY', 'UYTRDF'),
(32, '', '', '', '', '', ''),
(33, '', '', '', '', '', ''),
(34, 'ERIC', 'NSENGIMANA', '0783433224', 'ericnsegimana01@gmail.com', 'eric1', 'Eric123@4');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cid` int(5) NOT NULL,
  `fname` varchar(15) NOT NULL,
  `lname` varchar(15) NOT NULL,
  `phone` bigint(15) NOT NULL,
  `cemail` varchar(35) NOT NULL,
  `district` varchar(15) NOT NULL,
  `sector` varchar(15) NOT NULL,
  `cell` varchar(225) NOT NULL,
  `village` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cid`, `fname`, `lname`, `phone`, `cemail`, `district`, `sector`, `cell`, `village`, `username`, `password`) VALUES
(26, 'YVAN', 'NGENDANZI', 783443926, 'NGENDANZIYVAN', 'RUKOMO', 'RUHINGA', 'MUTETE', 'GATYATA', 'W2', '17G'),
(27, 'YVAN', 'NGENDANZI', 783443926, 'NGENDANZIYVAN', 'RUKOMO', 'RUHINGA', 'MUTETE', 'GATYATA', 'W2', '17G'),
(34, 'MANIRAKIZA', 'SIFA', 783443926, 'MANIRAKIZASIFA@GMAIL.COM', 'HUYE', 'MUMENA', '', 'HUYE', 'SI2', '66667'),
(35, 'MANIRAKIZA', 'SIFA', 783443926, 'MANIRAKIZASIFA@GMAIL.COM', 'HUYE', 'MUMENA', '', 'HUYE', 'SI2', '66667');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `payid` int(5) NOT NULL,
  `paydate` date NOT NULL,
  `pamount` float NOT NULL,
  `pmethod` varchar(15) NOT NULL,
  `orid` int(5) NOT NULL,
  `pay_status` varchar(10) NOT NULL DEFAULT 'Received',
  `cid` int(5) NOT NULL,
  `phone` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pid` int(5) NOT NULL,
  `pname` varchar(15) NOT NULL,
  `pgrade` varchar(7) NOT NULL,
  `price_per_unit` varchar(15) NOT NULL,
  `mfd_date` varchar(15) NOT NULL,
  `exp_date` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pid`, `pname`, `pgrade`, `price_per_unit`, `mfd_date`, `exp_date`) VALUES
(1, 'rice', '2', '2024-02-09', '1350', '2024-02-01'),
(2, 'maize', '3', '1234', '2024-02-07', '2024-02-14'),
(4, 'gas', '2', '2024-02-4', '2560', '2024-02-10'),
(127, 'suger', '1', '1200', '2024-02-22', '2024-02-28'),
(128, 'shoes', '1', '15000', '2024-02-27', '2024-02-11'),
(129, 'pantaro', 'shirt', '15000', '2024-01-02', '2024-04-05'),
(130, 'rice', '2', '2024-02-08', '2024-02-10', '1200'),
(133, 'rice', '2', '2024-02-09', '1350', '2024-02-01');

-- --------------------------------------------------------

--
-- Table structure for table `product_order`
--

CREATE TABLE `product_order` (
  `orid` int(7) NOT NULL,
  `ordate` varchar(15) NOT NULL,
  `pid` int(20) NOT NULL,
  `pquantity` varchar(15) NOT NULL,
  `orprice` varchar(15) NOT NULL,
  `cid` int(10) NOT NULL,
  `order_status` varchar(10) NOT NULL DEFAULT 'Received'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `product_order`
--

INSERT INTO `product_order` (`orid`, `ordate`, `pid`, `pquantity`, `orprice`, `cid`, `order_status`) VALUES
(61, '1300', 2, '40', '', 35, 'Received'),
(62, '2024-02-17', 4, '19', '700', 35, 'Received'),
(63, '11', 4, '16', '3500', 34, 'offered'),
(64, '3500', 4, '52', '20000', 26, 'offered'),
(68, '3600', 1, '56', '7900', 26, 'offered'),
(71, '23', 1, '21', '1340', 26, 'delivered');

-- --------------------------------------------------------

--
-- Table structure for table `sell`
--

CREATE TABLE `sell` (
  `sid` int(5) NOT NULL,
  `sdate` varchar(20) NOT NULL,
  `vid` int(5) NOT NULL,
  `orid` int(5) NOT NULL,
  `product_name` varchar(10) NOT NULL,
  `admid` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE `vendor` (
  `vid` int(5) NOT NULL,
  `vfname` varchar(20) NOT NULL,
  `vlname` varchar(20) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `vemail` varchar(35) NOT NULL,
  `district` varchar(15) NOT NULL,
  `sector` varchar(20) NOT NULL,
  `cell` varchar(20) NOT NULL,
  `village` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`vid`, `vfname`, `vlname`, `phone`, `vemail`, `district`, `sector`, `cell`, `village`, `username`, `password`) VALUES
(2, 'mukahagena', 'karori', '0788834562', 'mukeshagena', 'Ruhango', 'Ruvune', 'Ryacyong', 'Rutwe', 'Rarori2', '77777'),
(4, 'VCHV', 'VHJV', '09809999', 'VVNJNN@FG.COM', 'FRTG', 'VFG', 'TRE', 'QWERTTR', 'GFDR', 'W3QE34R43Q'),
(5, 'ishimwe ', 'aloys', '0793456218', 'ishimwe aloys077gmail.com', 'rulindo', 'mukura', 'rubona', 'rubona', 'Ishi244', '4000'),
(6, 'manirakiza', 'sifa', '0788811103', 'manirakizasifa@gmail.com', 'rusizi', 'ruliba', 'miyove', 'umutekano', 'sifa12', '12000'),
(7, 'uuunfbfeh', 'eeerr', '534405483833', '2343224vcfghjl', 'rebero', 'rukomo', 'kiunyami', 'dimba', 'byumba21', ''),
(8, 'NSABIMANA', 'DANIEL', '0783245673', 'HABIYAREMYEDANIEL@GMAIL.COM', 'GICUMBI', 'BUSHOKE', 'MUKOTO', 'MAREBA', 'DANI2', '4444'),
(11, 'ghjkfl', 'sfghj', 'wert', 'w345', 'sdfgh', 'xcvb', 'ghj', '67890', '234567', '3'),
(15, 'mukahagena', 'karori', '0788834562', 'mukeshagena', 'ruhango', 'ruvune', 'nyacyong', 'rutwe', 'karori2', '22222'),
(16, 'mukahagena', 'karori', '0788834562', 'mukeshagena', 'Ruhango', 'Ruvune', 'Ryacyong', 'Rutwe', 'Rarori2', '234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admid`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`payid`),
  ADD KEY `cid` (`cid`),
  ADD KEY `orid` (`orid`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `product_order`
--
ALTER TABLE `product_order`
  ADD PRIMARY KEY (`orid`),
  ADD KEY `cid` (`cid`),
  ADD KEY `pid` (`pid`),
  ADD KEY `cid_2` (`cid`);

--
-- Indexes for table `sell`
--
ALTER TABLE `sell`
  ADD PRIMARY KEY (`sid`),
  ADD KEY `orid` (`orid`),
  ADD KEY `vid` (`vid`),
  ADD KEY `admid` (`admid`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`vid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `cid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `payid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `pid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=134;

--
-- AUTO_INCREMENT for table `product_order`
--
ALTER TABLE `product_order`
  MODIFY `orid` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=72;

--
-- AUTO_INCREMENT for table `sell`
--
ALTER TABLE `sell`
  MODIFY `sid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `vendor`
--
ALTER TABLE `vendor`
  MODIFY `vid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`orid`) REFERENCES `product_order` (`orid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`cid`) REFERENCES `customer` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `product_order`
--
ALTER TABLE `product_order`
  ADD CONSTRAINT `product_order_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `product_order_ibfk_2` FOREIGN KEY (`cid`) REFERENCES `customer` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sell`
--
ALTER TABLE `sell`
  ADD CONSTRAINT `sell_ibfk_1` FOREIGN KEY (`vid`) REFERENCES `vendor` (`vid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sell_ibfk_2` FOREIGN KEY (`orid`) REFERENCES `product_order` (`orid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sell_ibfk_3` FOREIGN KEY (`admid`) REFERENCES `admin` (`admid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
