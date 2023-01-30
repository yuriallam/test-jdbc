CREATE SCHEMA IF NOT EXISTS `test-jdbc`;

CREATE TABLE IF NOT EXISTS `test-jdbc`.`personnes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `note` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);

TRUNCATE TABLE `test-jdbc`.`personnes`;

INSERT INTO `test-jdbc`.`personnes` (`nom`, `age`)
VALUES ('Youry','Allam', 20), ('Alain','Nseir', 18), ('Valere','Germain', 19);