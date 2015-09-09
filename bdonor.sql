-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 09, 2015 at 04:16 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bdonor`
--

-- --------------------------------------------------------

--
-- Table structure for table `dblood`
--

CREATE TABLE IF NOT EXISTS `dblood` (
  `uname` varchar(50) NOT NULL,
  `ldate` varchar(10) NOT NULL,
  `pname` varchar(25) NOT NULL,
  `location` varchar(25) NOT NULL,
  `hospital` varchar(50) NOT NULL,
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dblood`
--

INSERT INTO `dblood` (`uname`, `ldate`, `pname`, `location`, `hospital`) VALUES
('', '05/05/2014', 'Ritesh', 'Dehradun', 'Doon Hospital'),
('ankit', '05/05/2014', 'ankit', 'Dehradun', 'synergy'),
('diwash', '05/05/2014', 'Ritesh k', 'rishikesh', 'd');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE IF NOT EXISTS `feedback` (
  `name` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `location` varchar(30) NOT NULL,
  `feedback` text,
  `suggest` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`name`, `email`, `phone`, `location`, `feedback`, `suggest`) VALUES
('Ankit', 'ankit@hotmail.com', '8488945552', 'ankit', 'aihdhidd', 'iojojdjias'),
('meghma', 'mehgmahira@gmail.com', '1234567890', 'hoogly', 'bahut h', 'koio ni'),
('director sir', 'director@tulas.com', '8126481111', 'dhoolkot', 'bahut hi acha', 'database');

-- --------------------------------------------------------

--
-- Table structure for table `profile`
--

CREATE TABLE IF NOT EXISTS `profile` (
  `uname` varchar(20) NOT NULL,
  `photo` blob,
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE IF NOT EXISTS `register` (
  `uname` varchar(50) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `bldgrp` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `dob` varchar(10) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `state` varchar(25) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `locality` varchar(25) DEFAULT NULL,
  `avail` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`uname`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`uname`, `password`, `email`, `name`, `bldgrp`, `gender`, `dob`, `phone`, `state`, `city`, `locality`, `avail`) VALUES
('', '', '', '', 'Select', 'Select', '', NULL, 'select', 'Select', 'Select', 'Select'),
('14s', '1234', '32@fff.bb', 'a', 'A+', 'Female', '05/05/1990', '9798555555', 'Uttarakhand', 'Chandigarh', 'tilasd', 'Available'),
('ankit', '1234', 'ankitkumarpics@gmail.com', 'Ankit', 'B+', 'Male', '09/05/1994', '8126491179', 'Uttarakhand', 'Dehradun', 'Raipur', 'Available'),
('ankitkushwaha', '1234', 'ankit@hotmail.com', 'kushwaha', 'B-', 'Male', '04/06/1996', NULL, 'Uttarakhand', 'Dehradun', 'Vikasnagar', 'Available'),
('direct', 'direct', 'director@tulas1.com', 'Director', 'O+', 'Male', '17-04-1994', NULL, 'Uttarakhand', 'New Delhi', 'Raipur', 'Available'),
('diwash', '12345', 'diwashr@rocketmail.com', 'diwash rai', 'B+', 'other', '08/07/1994', '1212121212', 'Uttarakhand', 'Dehradun', 'Raipur', 'Available'),
('prafulgoyal', 'praful123', 'prafulgoyal2009@gmail.com', 'hello', 'B+', 'Male', '1994-05-02', '8952980654', 'Karnataka', 'Bengaluru', 'ndfjbjdfj', 'Available'),
('RITESHKO', 'RITESH', 'riteshkFGHotiyal@live.in', 'riteshKO', 'A-', 'Male', '17-04-1994', NULL, 'Uttarakhand', 'Dehradun', 'Raipur', 'Available'),
('xyz', 'xyz', 'xyz@gmai.com', 'xyz', 'A-', 'Male', '28/09/1994', NULL, 'Uttarakhand', 'Dehradun', 'Rajpur', 'Available');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
