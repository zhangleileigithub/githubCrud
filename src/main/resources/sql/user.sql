/*
MySQL Data Transfer
Source Host: localhost
Source Database: curd
Target Host: localhost
Target Database: curd
Date: 2022/10/5 0:12:36
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for user
-- ----------------------------
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '男', '15');
INSERT INTO `user` VALUES ('3', 'lisi', 'nan', '12');
INSERT INTO `user` VALUES ('4', '王五', '男', '22');
INSERT INTO `user` VALUES ('5', '陈六', '女', '21');
INSERT INTO `user` VALUES ('6', '朱七7', '女', '100');
INSERT INTO `user` VALUES ('7', '阿萨德', '男', '15');
INSERT INTO `user` VALUES ('8', '阿萨德', '男', '15');
INSERT INTO `user` VALUES ('9', '阿萨德', '男', '15');
INSERT INTO `user` VALUES ('10', '阿萨德', '男', '16');
INSERT INTO `user` VALUES ('11', '阿萨德', '男', '16');
INSERT INTO `user` VALUES ('12', '阿萨德', '男', '16');
INSERT INTO `user` VALUES ('13', '阿萨德', '男', '16');
INSERT INTO `user` VALUES ('14', '阿萨德', '男', '16');
INSERT INTO `user` VALUES ('15', '阿萨德', '男', '16');
INSERT INTO `user` VALUES ('16', '阿萨德', '男', '16');
