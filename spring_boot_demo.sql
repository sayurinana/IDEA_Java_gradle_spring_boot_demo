/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50740 (5.7.40)
 Source Host           : localhost:3306
 Source Schema         : spring_boot_demo

 Target Server Type    : MySQL
 Target Server Version : 50740 (5.7.40)
 File Encoding         : 65001

 Date: 25/12/2023 11:21:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for simple_log
-- ----------------------------
DROP TABLE IF EXISTS `simple_log`;
CREATE TABLE `simple_log`  (
  `id` int(1) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '标题字段，是最大长度为20的字符串，默认值为空字符串',
  `description` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '描述字段，内容可以很长很长很长',
  `create_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建记录时的时间戳',
  `update_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '被修改时的时间戳',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of simple_log
-- ----------------------------
INSERT INTO `simple_log` VALUES (1, 'hello', 'hello world!', '', '');

SET FOREIGN_KEY_CHECKS = 1;
