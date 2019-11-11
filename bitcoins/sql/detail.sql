SET
FOREIGN_KEY_CHECKS
=
0;

-- ----------------------------
-- Table structure for block
-- ----------------------------
DROP TABLE IF EXISTS `detail`;
CREATE TABLE `detail`
(
  `detailId`  char(64) NOT NULL,
  `index`     int      NOT NULL,
  `address`   char(64) NOT NULL,
  `pkscript`  char(64) NOT NULL,
  `sigscript` char(64) NOT NULL,
  `witness`   varchar(255),
  `details`   varchar(255),
  `value`     double,
  `txhash`    char(64) NOT NULL,
  PRIMARY KEY (`detailId`),
  index       `idx_address` (`address`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
