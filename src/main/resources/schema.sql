CREATE TABLE transaction (
id SERIAL PRIMARY KEY,
transId VARCHAR(255),
origin VARCHAR(255),
isVerified BOOLEAN(255)
);