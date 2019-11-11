SET
FOREIGN_KEY_CHECKS
=
0;

-- ----------------------------
-- Table structure for block
-- ----------------------------
DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction`
(
  `txhash`        char(64) NOT NULL,
  `confirmations` int      NOT NULL,
  `receivedtime`  int      NOT NULL,
  `status`        int      NOT NULL,
  `height`        int      NOT NULL,
  `totalinput`    double,
  `weight`        int      NOT NULL,
  `totaloutput`   char(64),
  `fees`          varchar(50),
  `feeperbyte`    int      NOT NULL,
  `feeperweight`  int      NOT NULL,
  `size`          int      NOT NULL,
  `blockhash`     char(64),
  PRIMARY KEY (`txhash`),
  index           `idx_time` (`receivedtime`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
