CREATE TABLE MEMBERS
(
userid       VARCHAR(50) PRIMARY KEY,
password  VARCHAR(50)     NULL,
username      VARCHAR(50)     NULL,
birth     VARCHAR(100)    NULL,
mail      VARCHAR(100)    NULL,
phone     VARCHAR(80)     NULL,
profilephoto VARCHAR(100) NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;