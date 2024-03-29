CREATE TABLE AUTHORITIES
(
    LOGIN VARCHAR(250) NOT NULL,
    AUTHORITY VARCHAR(32) NOT NULL,
    FOREIGN KEY (LOGIN) REFERENCES USERS (LOGIN)
);

INSERT INTO AUTHORITIES
VALUES ('ADMIN', 'ROLE_USER');
INSERT INTO AUTHORITIES
VALUES ('ADMIN', 'ROLE_ADMIN');
INSERT INTO AUTHORITIES
VALUES ('MANAGER', 'ROLE_MANAGER');
INSERT INTO AUTHORITIES
VALUES ('MANAGER', 'ROLE_USER');
