
CREATE TABLE GROUP (
    ID SERIAL NOT NULL PRIMARY KEY,
    SSN VARCHAR NOT NULL,
    TYPE VARCHAR NOT NULL,
    CREATED timestamp without time zone DEFAULT now()
);
