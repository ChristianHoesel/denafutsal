SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `szolgint` ;
CREATE SCHEMA IF NOT EXISTS `szolgint` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `szolgint` ;

-- -----------------------------------------------------
-- Table `szolgint`.`Users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `szolgint`.`Users` ;

CREATE  TABLE IF NOT EXISTS `szolgint`.`Users` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `username` VARCHAR(45) NOT NULL ,
  `firstname` VARCHAR(45) NOT NULL ,
  `lastname` VARCHAR(45) NOT NULL ,
  `thirdname` VARCHAR(45) NOT NULL ,
  `email` VARCHAR(45) NOT NULL ,
  `password` VARCHAR(45) NOT NULL ,
  `pref_max` VARCHAR(45) NOT NULL ,
  `pref_company` VARCHAR(45) NOT NULL ,
  `pref_position` VARCHAR(45) NOT NULL ,
  `pref_jobtype` VARCHAR(45) NOT NULL ,
  `pref_country` VARCHAR(45) NOT NULL ,
  `pref_state` VARCHAR(45) NOT NULL ,
  `pref_city` VARCHAR(45) NOT NULL ,
  `pref_salary` VARCHAR(45) NOT NULL ,
  `pref_query` VARCHAR(45) NOT NULL ,
  `gcal_email` VARCHAR(45) NOT NULL ,
  `gcal_pw` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `szolgint`.`Vacancies`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `szolgint`.`Vacancies` ;

CREATE  TABLE IF NOT EXISTS `szolgint`.`Vacancies` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `title` VARCHAR(45) NOT NULL ,
  `descr` VARCHAR(45) NOT NULL ,
  `company` VARCHAR(45) NOT NULL ,
  `country` VARCHAR(45) NOT NULL ,
  `city` VARCHAR(45) NOT NULL ,
  `expired` VARCHAR(45) NOT NULL ,
  `jobtype` VARCHAR(45) NOT NULL ,
  `state` VARCHAR(45) NOT NULL ,
  `lang1` VARCHAR(45) NOT NULL ,
  `lang1type` VARCHAR(45) NOT NULL ,
  `lang2` VARCHAR(45) NOT NULL ,
  `lang2type` VARCHAR(45) NOT NULL ,
  `Users_id` INT NOT NULL ,
  `salary` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  UNIQUE INDEX `title_UNIQUE` (`title` ASC) ,
  INDEX `fk_Vacancies_Users1_idx` (`Users_id` ASC) ,
  CONSTRAINT `fk_Vacancies_Users1`
    FOREIGN KEY (`Users_id` )
    REFERENCES `szolgint`.`Users` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `szolgint`.`CVs`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `szolgint`.`CVs` ;

CREATE  TABLE IF NOT EXISTS `szolgint`.`CVs` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `country` VARCHAR(45) NOT NULL ,
  `state` VARCHAR(45) NOT NULL ,
  `city` VARCHAR(45) NOT NULL ,
  `work_from` VARCHAR(45) NOT NULL ,
  `work_to` VARCHAR(45) NOT NULL ,
  `work_position` VARCHAR(45) NOT NULL ,
  `work_employer` VARCHAR(45) NOT NULL ,
  `education_from` VARCHAR(45) NOT NULL ,
  `education_to` VARCHAR(45) NOT NULL ,
  `education_qualification` VARCHAR(45) NOT NULL ,
  `education_school` VARCHAR(45) NOT NULL ,
  `lang` VARCHAR(45) NOT NULL ,
  `langtype` VARCHAR(45) NOT NULL ,
  `Users_id` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_CVs_Users1_idx` (`Users_id` ASC) ,
  CONSTRAINT `fk_CVs_Users1`
    FOREIGN KEY (`Users_id` )
    REFERENCES `szolgint`.`Users` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `szolgint` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
