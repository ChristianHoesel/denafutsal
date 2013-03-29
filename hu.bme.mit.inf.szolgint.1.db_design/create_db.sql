SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `mydb` ;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Users` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`Users` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `username` VARCHAR(45) NULL ,
  `first_name` VARCHAR(45) NULL ,
  `last_name` VARCHAR(45) NULL ,
  `password` VARCHAR(45) NULL ,
  `birthday` DATE NULL ,
  `email` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;

CREATE UNIQUE INDEX `id_UNIQUE` ON `mydb`.`Users` (`id` ASC) ;

CREATE UNIQUE INDEX `username_UNIQUE` ON `mydb`.`Users` (`username` ASC) ;


-- -----------------------------------------------------
-- Table `mydb`.`CurriculumVitae`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`CurriculumVitae` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`CurriculumVitae` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `address` VARCHAR(255) NULL ,
  `prefered_job` VARCHAR(45) NULL ,
  `other_skills` VARCHAR(255) NULL ,
  `user_id` INT NOT NULL ,
  PRIMARY KEY (`id`, `user_id`) ,
  CONSTRAINT `fk_CurriculumVitae_Users1`
    FOREIGN KEY (`user_id` )
    REFERENCES `mydb`.`Users` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE UNIQUE INDEX `id_UNIQUE` ON `mydb`.`CurriculumVitae` (`id` ASC) ;

CREATE INDEX `fk_CurriculumVitae_Users1_idx` ON `mydb`.`CurriculumVitae` (`user_id` ASC) ;


-- -----------------------------------------------------
-- Table `mydb`.`Language`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Language` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`Language` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;

CREATE UNIQUE INDEX `idLanguage_UNIQUE` ON `mydb`.`Language` (`id` ASC) ;


-- -----------------------------------------------------
-- Table `mydb`.`CurriculumVitae_has_Language`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`CurriculumVitae_has_Language` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`CurriculumVitae_has_Language` (
  `CurriculumVitae_id` INT NOT NULL ,
  `Language_id` INT NOT NULL ,
  `type` ENUM('A1','A2','B1','B2','C1','C2') NULL ,
  PRIMARY KEY (`CurriculumVitae_id`, `Language_id`) ,
  CONSTRAINT `fk_CurriculumVitae_has_Language_CurriculumVitae1`
    FOREIGN KEY (`CurriculumVitae_id` )
    REFERENCES `mydb`.`CurriculumVitae` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CurriculumVitae_has_Language_Language1`
    FOREIGN KEY (`Language_id` )
    REFERENCES `mydb`.`Language` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_CurriculumVitae_has_Language_Language1_idx` ON `mydb`.`CurriculumVitae_has_Language` (`Language_id` ASC) ;

CREATE INDEX `fk_CurriculumVitae_has_Language_CurriculumVitae1_idx` ON `mydb`.`CurriculumVitae_has_Language` (`CurriculumVitae_id` ASC) ;


-- -----------------------------------------------------
-- Table `mydb`.`Education`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Education` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`Education` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `from` DATE NULL ,
  `to` DATE NULL ,
  `qualification` VARCHAR(45) NULL ,
  `school_name` VARCHAR(255) NULL ,
  `CurriculumVitae_id` INT NOT NULL ,
  PRIMARY KEY (`id`, `CurriculumVitae_id`) ,
  CONSTRAINT `fk_Education_CurriculumVitae1`
    FOREIGN KEY (`CurriculumVitae_id` )
    REFERENCES `mydb`.`CurriculumVitae` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE UNIQUE INDEX `id_UNIQUE` ON `mydb`.`Education` (`id` ASC) ;

CREATE INDEX `fk_Education_CurriculumVitae1_idx` ON `mydb`.`Education` (`CurriculumVitae_id` ASC) ;


-- -----------------------------------------------------
-- Table `mydb`.`WorkExperience`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`WorkExperience` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`WorkExperience` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `from` DATE NULL ,
  `to` DATE NULL ,
  `position` VARCHAR(45) NULL ,
  `employer` VARCHAR(255) NULL ,
  `WorkExperiencecol` VARCHAR(45) NULL ,
  `CurriculumVitae_id` INT NOT NULL ,
  PRIMARY KEY (`id`, `CurriculumVitae_id`) ,
  CONSTRAINT `fk_WorkExperience_CurriculumVitae1`
    FOREIGN KEY (`CurriculumVitae_id` )
    REFERENCES `mydb`.`CurriculumVitae` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE UNIQUE INDEX `id_UNIQUE` ON `mydb`.`WorkExperience` (`id` ASC) ;

CREATE INDEX `fk_WorkExperience_CurriculumVitae1_idx` ON `mydb`.`WorkExperience` (`CurriculumVitae_id` ASC) ;


-- -----------------------------------------------------
-- Table `mydb`.`Jobs`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Jobs` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`Jobs` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `title` VARCHAR(45) NULL ,
  `company` VARCHAR(45) NULL ,
  `state` VARCHAR(45) NULL ,
  `city` VARCHAR(45) NULL ,
  `country` VARCHAR(45) NULL ,
  `source` VARCHAR(45) NULL ,
  `date` DATETIME NULL ,
  `description` VARCHAR(512) NULL ,
  `expired` TINYINT(1) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;

CREATE UNIQUE INDEX `id_UNIQUE` ON `mydb`.`Jobs` (`id` ASC) ;


-- -----------------------------------------------------
-- Table `mydb`.`Users_has_Jobs`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Users_has_Jobs` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`Users_has_Jobs` (
  `Users_id` INT NOT NULL ,
  `Jobs_id` INT NOT NULL ,
  `type` ENUM('posted','liked') NULL ,
  PRIMARY KEY (`Users_id`, `Jobs_id`) ,
  CONSTRAINT `fk_Users_has_Jobs_Users1`
    FOREIGN KEY (`Users_id` )
    REFERENCES `mydb`.`Users` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Users_has_Jobs_Jobs1`
    FOREIGN KEY (`Jobs_id` )
    REFERENCES `mydb`.`Jobs` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Users_has_Jobs_Jobs1_idx` ON `mydb`.`Users_has_Jobs` (`Jobs_id` ASC) ;

CREATE INDEX `fk_Users_has_Jobs_Users1_idx` ON `mydb`.`Users_has_Jobs` (`Users_id` ASC) ;

USE `mydb` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
