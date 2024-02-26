DROP TABLE IF EXISTS usersweb;  
CREATE TABLE usersweb (  
user_name VARCHAR(20)  PRIMARY KEY,  
income INT NOT NULL,  
grocery INT NOT NULL,
electronics INT, 
bills INT,
cloths INT,
medicine INT,
others INT
);  