create table usuario (id bigint primary key auto_increment, 
password varchar(255), 
role varchar(255), 
username varchar(255));

INSERT INTO usuario (username, password, role) VALUES ('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin');