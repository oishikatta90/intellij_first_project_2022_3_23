#DB 생성
DROP DATABASE IF EXISTS demo;
CREATE DATABASE demo;
USE demo;

#회원 테이블 생성
CREATE TABLE `user` (
id BIGINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
reg_date DATETIME NOT NULL,
update_date DATETIME NOT NULL,
email VARCHAR(100) NOT NULL,
`password` VARCHAR(150) NOT NULL,
`name` CHAR(50) NOT NULL
);

#회원 데이터 생성
INSERT INTO `user`
SET reg_date = NOW(),
    update_date = NOW(),
    email = 'user1@go.com',
    `password` = '1234',
    `name` = '유저1';
INSERT INTO `user`
SET reg_date = NOW(),
    update_date = NOW(),
    email = 'user2@go.com',
    `password` = '1234',
    `name` = '유저2';