DROP DATABASE test;
CREATE DATABASE test;
USE test;
CREATE TABLE USERS_TABLE(id INT(8) NOT NULL AUTO_INCREMENT,
                        name VARCHAR(25) NOT NULL,
                        age INT(4) NOT NULL,
                        isAdmin BIT NOT NULL,
                        createdDate TIMESTAMP NOT NULL,
                        PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

INSERT INTO USERS_TABLE (name, age, isAdmin, createdDate) VALUES
  ('Rober Moon', 35, 1, now()),
  ('Jessica May', 29, 0,'2016-12-31 00:00:00'),
  ('Jeffry Monk', 29, 1,'2016-07-12 00:00:00'),
  ('John Cena', 45, 0,now()),
  ('Chuck Norris', 55, 1,'2017-12-31 00:00:00'),
  ('Rebecka Goodwin', 31, 1,'2005-03-14 00:00:00'),
  ('Bob Ross', 52, 1,now()),
  ('Clay Horse', 37, 0,now()),
  ('Diana Stone', 21, 0,now())
;




