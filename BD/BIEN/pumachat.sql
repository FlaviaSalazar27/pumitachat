-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-11-2019 a las 23:50:32
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pumachat`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bus`
--

CREATE TABLE `bus` (
  `id_bus` int(11) NOT NULL,
  `placa` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `conductor` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `anfitrion` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `bus`
--

INSERT INTO `bus` (`id_bus`, `placa`, `conductor`, `anfitrion`) VALUES
(1, '1236-ghf', 'Jose Perez', 'Maria Pimentel'),
(2, '659-lpo', 'Martin Nogales', 'Marta Valdez'),
(3, '5489-poi', 'Pablo Cruz', 'Patricia Paz'),
(4, '5489-dop', 'Hernan Claure', 'Raquel Rodriguez'),
(5, '235-plñ', 'Mario Ruiz', 'Luciana Martinez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bus_parada`
--

CREATE TABLE `bus_parada` (
  `id_buspar` int(11) NOT NULL,
  `id_bus` int(11) NOT NULL,
  `id_parada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informacion`
--

CREATE TABLE `informacion` (
  `id_informacion` int(11) NOT NULL,
  `informacion` varchar(3500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `imagen` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_tipoi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `informacion`
--

INSERT INTO `informacion` (`id_informacion`, `informacion`, `fecha`, `imagen`, `id_tipoi`) VALUES
(1, 'El Servicio de Transporte Municipal comunica a los usuarios de la ruta Chasquipampa que debido al cierre de vías, por trabajo de poda de árboles para evitar accidentes en la Avenida José María Aguirre Achá, entre las calles 3 y 7 de Los Pinos desde el lunes 18 hasta el viernes 22 de junio, de 8:30 a 17:00 , los buses en ese horario circularán la siguienteruta alterna:\r\nPUC – Chasquipampa \r\nRuta normal hasta la calle 15 de Calacoto para luego iniciar ruta alterna por la Avenida Costanera hasta la calle 28 de Cota Cota y ruta normal hasta la calle 63 de Chasquipampa.\r\nParadas Provisionales: Sobre la Avenida costanera esquina calle 21 de Calacoto pasando el semáforo, sobre la Avenida Costanera antes de ingresar al puente hacia Auquisamana .\r\nChasquipampa – PUC\r\nRuta normal hasta la parada calle 28 de Cota Cota para iniciar tuta alterna por la Avenida Costera hasta la calle 15 de Calacoto y ruta normal.\r\nParadas provisionales: Sobre la Avenida Costanera altura Hipermax y sobre la Avenida Costanera esquina calle 21 de Calacoto.\r\nAgradecemos su comprensión.', '2018-06-18', NULL, 1),
(2, 'El Servicio de Transporte Municipal comunica a los usuarios de las rutas  Chasquipampa, Irpavi II, Inca Llojeta y Villa Salomé que debido a la afluencia de fieles a la visita de iglesias este Jueves Santo, a partir de las 18:00, los buses van a girar alrededor del Teatro al Aire Libre e ingresarán a la Estación de Transferencia de La Paz BUS por la calle Wenceslao Argandoña.\r\n\r\nCaja Ferroviaria en caso de afluencia de persona en la Avenida  América y cercanías de Plaza Alonso de Mendoza, los buses tomarán como última parada La Estación de Teleférico Rojo.\r\nAgradecemos su comprensión.', '2018-03-29', NULL, 1),
(3, 'Los Pinos se convierte en la primera zona de tráfico calmado\r\nLa Alcaldía ha implementado medidas para la protección peatonal en la avenida José Aguirre Achá', '2018-12-29', 'http://www.lapazbus.bo/fileman/Uploads/files/11(2).jpg', 2),
(4, 'Impacto de un tráiler deja severos daños a la infraestructura del patio Inca Llojeta del PumaKatari\r\nAfortunadamente no se registraron heridos ni pérdidas de vidas.', '2018-10-24', 'http://www.lapazbus.bo/fileman/Uploads/files/1(17).jpg', 2),
(5, 'flash negro con plateado', '0000-00-00', 'http://www.lapazbus.bo/fileman/Uploads/files/objetos/37812929_1321859467950412_4664459600148299776_n.jpg', 3),
(6, 'camara fotografica cannon', '0000-00-00', 'http://www.lapazbus.bo/fileman/Uploads/files/objetos/37756428_1321859227950436_2130010771852099584_n.jpg', 3),
(7, 'Tarifario', '0000-00-00', 'http://www.lapazbus.bo/fileman/Uploads/files/slide/tarifario_nuevo1.png', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parada`
--

CREATE TABLE `parada` (
  `id_parada` int(11) NOT NULL,
  `viaj_suben` int(11) DEFAULT NULL,
  `viaj_bajan` int(11) DEFAULT NULL,
  `latitud` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `longitud` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `calle` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_ruta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `parada`
--

INSERT INTO `parada` (`id_parada`, `viaj_suben`, `viaj_bajan`, `latitud`, `longitud`, `calle`, `id_ruta`) VALUES
(1, 5, 0, '-16.530228', '-68.144927', 'AV. Max Fernandez', 1),
(2, 0, 2, '-16.526488', ' -68.126501', 'Av. Mario Mercado', 1),
(3, 15, 5, '-16.489627', '-68.090347', 'Av. Ciudad del niño', 2),
(4, 5, 10, '-16.499669', '-68.120972', 'Av. Busch', 2),
(5, 6, 1, '-68.120972', '-68.036896', 'Calle 63 - Chasquipampa', 3),
(6, 2, 5, '-16.523723', ' -68.112835', 'Av. Hernando Siles', 3),
(7, 4, 7, '-16.482703', '-68.149002', 'Av. Ismael Vasquez', 4),
(8, 5, 4, '-16.492941,', '-68.138416', 'Plaza Alonzo de Mendoza', 4),
(9, 5, 10, '-16.493165', '-68.138559', 'Plaza Alonzo de Mendoza', 5),
(10, 5, 3, '-16.502359,', '-68.126076', 'Av. del Ejercito', 5),
(11, 5, 6, '-16.514629', ' -68.090962', 'Plaza Bolognia', 6),
(12, 19, 5, '-16.517473', '-68.090060', 'Calle 1 - Irpavi II', 6),
(13, 5, 2, '-16.526385', '-68.072108', 'calle 22 - Achumani', 7),
(14, 10, 15, '-16.523700', ' -68.112822', 'calle 2 - Obrajes', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `id_ruta` int(11) NOT NULL,
  `inicio` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fin` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_pdf` int(10) NOT NULL,
  `id_video` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `ruta`
--

INSERT INTO `ruta` (`id_ruta`, `inicio`, `fin`, `id_pdf`, `id_video`) VALUES
(1, 'Incallojeta', 'PUC', 1, 8),
(2, 'Villa Salome', 'PUC', 2, 9),
(3, 'Chasquipampa', 'Plaza Camacho', 3, 10),
(4, 'Caja Ferroviaria', 'Plaza Alonzo de Mendoza', 4, 11),
(5, 'Plaza Alonzo de Mendoza', 'Plaza Alonzo de Mendoza', 5, 12),
(6, 'Irpavi II', 'PUC', 6, 13),
(7, 'Achumani', 'Plaza San Pedro', 7, 14);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarifa`
--

CREATE TABLE `tarifa` (
  `id_tarifa` int(11) NOT NULL,
  `tarifa` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `precio_diurno` decimal(5,2) DEFAULT NULL,
  `precio_nocturno` decimal(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tarifa`
--

INSERT INTO `tarifa` (`id_tarifa`, `tarifa`, `precio_diurno`, `precio_nocturno`) VALUES
(1, 'Tarifa Con TI', '2.00', '3.00'),
(2, 'En Efectivo', '2.30', '3.00'),
(3, 'Tarifa Preferencial	', '1.50', '3.00'),
(4, 'Personas con Discapacidad', '1.50', '3.00'),
(5, 'Tarifa Universitaria', '1.80', '3.00'),
(6, 'Menores de 6 Años', '0.00', '0.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_informacion`
--

CREATE TABLE `tipo_informacion` (
  `id_tipoi` int(10) NOT NULL,
  `informacion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipo_informacion`
--

INSERT INTO `tipo_informacion` (`id_tipoi`, `informacion`) VALUES
(1, 'Comunicados'),
(2, 'Noticias'),
(3, 'Objetos Perdidos'),
(4, 'Tarifa'),
(5, 'Horario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ubicacion`
--

CREATE TABLE `ubicacion` (
  `id_ubicacion` int(10) NOT NULL,
  `latitud` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `longitud` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `calle` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `url`
--

CREATE TABLE `url` (
  `id_url` int(10) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `url` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `url`
--

INSERT INTO `url` (`id_url`, `nombre`, `url`) VALUES
(1, 'incallojeta', 'http://www.lapazbus.bo/fileman/Uploads/files/pdf/mapa_rutaincallojeta.pdf'),
(2, 'villaSalome', 'http://www.lapazbus.bo/fileman/Uploads/files/pdf/mapa_rutavillasalome.pdf'),
(3, 'chasquipampa', 'http://www.lapazbus.bo/fileman/Uploads/files/pdf/mapa_rutachasquipampa.pdf'),
(4, 'cajaFerroviaria', 'http://www.lapazbus.bo/fileman/Uploads/files/rutas/%20CAJA%20FERROVIARIA-02-02-02.jpg'),
(5, 'integradora', 'http://www.lapazbus.bo/fileman/Uploads/files/Mapa%20Final%20Integradora%20Web-01.png'),
(6, 'irpaviII', 'http://www.lapazbus.bo/fileman/Uploads/files/rutas/IRPAVI%20MAPA%20SOLO-02.pdf'),
(7, 'achumani', 'http://www.lapazbus.bo/fileman/Uploads/files/pdf/Mapa%20Oficial%20Achumani.pdf'),
(8, 'vidIncallojeta', 'https://www.youtube.com/watch?time_continue=1&v=Im5LgKuckYM&feature=emb_title'),
(9, 'vidVillaSalome', 'https://www.youtube.com/watch?v=EcyeqawKP8Y&feature=emb_title'),
(10, 'vidChasquipampa', 'https://www.youtube.com/watch?v=gNhC_uRW1yk&feature=emb_title'),
(11, 'vidCajaFerroviaria', 'http://www.lapazbus.bo/fileman/Uploads/files/rutas/%20CAJA%20FERROVIARIA-02-02-02.jpg'),
(12, 'vidIntegradora', 'https://www.youtube.com/watch?v=7gqRKeOQyH8&feature=emb_title'),
(13, 'vidIrpaviII', 'https://www.youtube.com/watch?v=_aIGx409WnQ&feature=emb_title'),
(14, 'vidAchumani', 'https://www.youtube.com/watch?v=Z1Mk_c85wGo&feature=emb_title');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellido` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `telefono` int(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`id_bus`);

--
-- Indices de la tabla `bus_parada`
--
ALTER TABLE `bus_parada`
  ADD PRIMARY KEY (`id_buspar`,`id_bus`,`id_parada`),
  ADD KEY `id_bus` (`id_bus`),
  ADD KEY `id_parada` (`id_parada`);

--
-- Indices de la tabla `informacion`
--
ALTER TABLE `informacion`
  ADD PRIMARY KEY (`id_informacion`,`id_tipoi`),
  ADD KEY `id_tipoi` (`id_tipoi`);

--
-- Indices de la tabla `parada`
--
ALTER TABLE `parada`
  ADD PRIMARY KEY (`id_parada`,`id_ruta`),
  ADD KEY `id_ruta` (`id_ruta`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`id_ruta`,`id_pdf`,`id_video`),
  ADD KEY `id_pdf` (`id_pdf`),
  ADD KEY `id_video` (`id_video`);

--
-- Indices de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  ADD PRIMARY KEY (`id_tarifa`);

--
-- Indices de la tabla `tipo_informacion`
--
ALTER TABLE `tipo_informacion`
  ADD PRIMARY KEY (`id_tipoi`);

--
-- Indices de la tabla `ubicacion`
--
ALTER TABLE `ubicacion`
  ADD PRIMARY KEY (`id_ubicacion`,`id_usuario`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `url`
--
ALTER TABLE `url`
  ADD PRIMARY KEY (`id_url`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bus_parada`
--
ALTER TABLE `bus_parada`
  ADD CONSTRAINT `bus_parada_ibfk_1` FOREIGN KEY (`id_bus`) REFERENCES `bus` (`id_bus`),
  ADD CONSTRAINT `bus_parada_ibfk_2` FOREIGN KEY (`id_parada`) REFERENCES `parada` (`id_parada`);

--
-- Filtros para la tabla `informacion`
--
ALTER TABLE `informacion`
  ADD CONSTRAINT `informacion_ibfk_1` FOREIGN KEY (`id_tipoi`) REFERENCES `tipo_informacion` (`id_tipoi`);

--
-- Filtros para la tabla `parada`
--
ALTER TABLE `parada`
  ADD CONSTRAINT `parada_ibfk_1` FOREIGN KEY (`id_ruta`) REFERENCES `ruta` (`id_ruta`);

--
-- Filtros para la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD CONSTRAINT `ruta_ibfk_1` FOREIGN KEY (`id_pdf`) REFERENCES `url` (`id_url`),
  ADD CONSTRAINT `ruta_ibfk_2` FOREIGN KEY (`id_video`) REFERENCES `url` (`id_url`);

--
-- Filtros para la tabla `ubicacion`
--
ALTER TABLE `ubicacion`
  ADD CONSTRAINT `ubicacion_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
