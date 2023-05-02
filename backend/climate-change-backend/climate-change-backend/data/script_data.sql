-- MySQL Workbench Synchronization
-- Generated: 2023-04-30 01:02
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: saibr

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

ALTER TABLE `data`.`de08_2` 
DROP FOREIGN KEY `fk_de08_2_visualization_datasets1`;

ALTER TABLE `data`.`global_annual` 
DROP FOREIGN KEY `fk_global_annual_visualization_datasets1`;

ALTER TABLE `data`.`global_monthly` 
DROP FOREIGN KEY `fk_global_monthly_visualization_datasets1`;

ALTER TABLE `data`.`mauna_loa_co2_annual` 
DROP FOREIGN KEY `fk_mauna_loa_co2_annual_visualization_datasets1`;

ALTER TABLE `data`.`mauna_loa_co2_monthly` 
DROP FOREIGN KEY `fk_mauna_loa_co2_monthly_visualization_datasets1`;

ALTER TABLE `data`.`northern_hemisphere_2000` 
DROP FOREIGN KEY `fk_northern_hemisphere_2000_visualization_datasets1`;

ALTER TABLE `data`.`northern_hemisphere_annual` 
DROP FOREIGN KEY `fk_northern_hemisphere_annual_visualization_datasets1`;

ALTER TABLE `data`.`northern_hemisphere_monthly` 
DROP FOREIGN KEY `fk_northern_hemisphere_monthly_visualization_datasets1`;

ALTER TABLE `data`.`southern_hemisphere_annual` 
DROP FOREIGN KEY `fk_southern_hemisphere_annual_visualization_datasets`;

ALTER TABLE `data`.`southern_hemisphere_monthly` 
DROP FOREIGN KEY `fk_southern_hemisphere_monthly_visualization_datasets1`;

ALTER TABLE `data`.`de08_2` 
DROP INDEX `fk_de08_2_visualization_datasets1_idx` ;
;

ALTER TABLE `data`.`global_annual` 
DROP INDEX `fk_global_annual_visualization_datasets1_idx` ;
;

ALTER TABLE `data`.`global_monthly` 
DROP INDEX `fk_global_monthly_visualization_datasets1_idx` ;
;

ALTER TABLE `data`.`mauna_loa_co2_annual` 
DROP INDEX `fk_mauna_loa_co2_annual_visualization_datasets1_idx` ;
;

ALTER TABLE `data`.`mauna_loa_co2_monthly` 
DROP INDEX `fk_mauna_loa_co2_monthly_visualization_datasets1_idx` ;
;

ALTER TABLE `data`.`northern_hemisphere_2000` 
DROP INDEX `fk_northern_hemisphere_2000_visualization_datasets1_idx` ;
;

ALTER TABLE `data`.`northern_hemisphere_annual` 
DROP INDEX `fk_northern_hemisphere_annual_visualization_datasets1_idx` ;
;

ALTER TABLE `data`.`northern_hemisphere_monthly` 
DROP INDEX `fk_northern_hemisphere_monthly_visualization_datasets1_idx` ;
;

ALTER TABLE `data`.`southern_hemisphere_annual` 
DROP INDEX `fk_southern_hemisphere_annual_visualization_datasets_idx` ;
;

ALTER TABLE `data`.`southern_hemisphere_monthly` 
DROP INDEX `fk_southern_hemisphere_monthly_visualization_datasets1_idx` ;
;

DROP TABLE IF EXISTS `data`.`visualization_views` ;

DROP TABLE IF EXISTS `data`.`visualization_datasets` ;

DROP TABLE IF EXISTS `data`.`datasets` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
