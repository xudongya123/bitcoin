SET
FOREIGN_KEY_CHECKS
=
0;

-- ----------------------------
-- Table structure for block
-- ----------------------------
DROP TABLE IF EXISTS `block`;
CREATE TABLE `block`
(
  `blockhash`     char(64) NOT NULL,
  `confirmations` int      NOT NULL,
  `timestamp`     INT      NOT NULL,
  `height`        int      NOT NULL,
  `txnumber`      int      NOT NULL,
  `difficulty`    double,
  `weight`        int      NOT NULL,
  `merkleroot`    char(64),
  `version`       varchar(50),
  `bits`          int      NOT NULL,
  `miner`         varchar(50),
  `size`          int      NOT NULL,
  `nonce`         int      NOT NULL,
  `txvolume`      double,
  `blockreward`   double,
  `feereward`     double,
  PRIMARY KEY (`blockhash`),
  index           `idx_height` (`height`),
  index           `idx_time` (`timestamp`),
  index           `idx_blockhash` (`blockhash`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
