-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2017 a las 18:19:44
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `soilproperties`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chequeos`
--

CREATE TABLE `chequeos` (
  `Id_Chequeo` varchar(20) NOT NULL,
  `Responsable` varchar(20) NOT NULL,
  `Localizacion` text NOT NULL,
  `Tipo_Observacion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `chequeos`
--

INSERT INTO `chequeos` (`Id_Chequeo`, `Responsable`, `Localizacion`, `Tipo_Observacion`) VALUES
('Lb4', 'jaime', 'Bolívar', 'Cajuela');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `generalidades`
--

CREATE TABLE `generalidades` (
  `Id_Generalidades` varchar(60) NOT NULL,
  `Id_Chequeo` varchar(20) NOT NULL,
  `Paisaje` varchar(30) NOT NULL,
  `Tipo_Relieve` varchar(30) NOT NULL,
  `Forma_Terreno` varchar(30) NOT NULL,
  `Material_Parental` varchar(30) NOT NULL,
  `Microrelieve` varchar(30) NOT NULL,
  `Gradiente_Pendiente` varchar(30) NOT NULL,
  `Longitud_Pendiente` varchar(30) NOT NULL,
  `Forma_Pendiente` varchar(30) NOT NULL,
  `Piso_Termico` varchar(30) NOT NULL,
  `Provincia_Humedad` varchar(30) NOT NULL,
  `Regimen_Temperatura` varchar(30) NOT NULL,
  `Regimen_Humedad` varchar(30) NOT NULL,
  `Clase_Tipo_Erosion` varchar(30) DEFAULT NULL,
  `Frecuencia_Erosion` varchar(30) DEFAULT NULL,
  `Porcentaje_Afloramiento_Rocoso` varchar(30) DEFAULT NULL,
  `Tipo_Pedregosidad_Superficial` varchar(30) DEFAULT NULL,
  `Clase_Pedregosidad_Superficial` varchar(30) DEFAULT NULL,
  `Porcentaje_Pedregosidad_Superficial` varchar(30) DEFAULT NULL,
  `Drenaje_Interno` varchar(30) NOT NULL,
  `Drenaje_Externo` varchar(30) NOT NULL,
  `Drenaje_Natural` varchar(30) NOT NULL,
  `Frecuencia_Inundacion` varchar(30) DEFAULT NULL,
  `Duracion_Inundacion` varchar(30) DEFAULT NULL,
  `Frecuencia_Encharcamiento` varchar(30) DEFAULT NULL,
  `Duracion_Encharcamiento` varchar(30) DEFAULT NULL,
  `Naturaleza_Nivel_Freatico` varchar(30) DEFAULT NULL,
  `Profundidad_Nivel_Fratico` varchar(30) DEFAULT NULL,
  `Clase_Limitacion` varchar(30) DEFAULT NULL,
  `Profundidad_Limitacion` varchar(30) DEFAULT NULL,
  `Ancho_Grietas` varchar(30) DEFAULT NULL,
  `Profundidad_Grietas` varchar(30) DEFAULT NULL,
  `Volumen_Plintita` varchar(30) DEFAULT NULL,
  `Fase_Plintita` varchar(30) DEFAULT NULL,
  `Evidencia_Sales` varchar(30) DEFAULT NULL,
  `Vegetacion_Natural` varchar(30) NOT NULL,
  `Uso_Actual` varchar(30) NOT NULL,
  `Limitacion_Uso` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `IdUsuario` int(10) NOT NULL,
  `Usuario` varchar(20) NOT NULL,
  `Contraseña` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`IdUsuario`, `Usuario`, `Contraseña`) VALUES
(1, 'Jaime', '12345'),
(2, 'Catalina', '67890'),
(3, 'UnUsuario', 'UnaContraseña'),
(7, 'Luna', 'China');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `chequeos`
--
ALTER TABLE `chequeos`
  ADD PRIMARY KEY (`Id_Chequeo`);

--
-- Indices de la tabla `generalidades`
--
ALTER TABLE `generalidades`
  ADD PRIMARY KEY (`Id_Generalidades`),
  ADD KEY `Id_Chequeo` (`Id_Chequeo`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`IdUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `IdUsuario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `generalidades`
--
ALTER TABLE `generalidades`
  ADD CONSTRAINT `generalidades_ibfk_1` FOREIGN KEY (`Id_Chequeo`) REFERENCES `chequeos` (`Id_Chequeo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
