CREATE TABLE PRODUCT (
                         ID UUID PRIMARY KEY,
                         NAME VARCHAR(100) NOT NULL,
                         SKU VARCHAR(50) NOT NULL UNIQUE,
                         PRICE DECIMAL(10, 2) NOT NULL,
                         DESCRIPTION TEXT,
                         CREATED_AT TIMESTAMP NOT NULL,
                         UPDATED_AT TIMESTAMP
);

CREATE INDEX IDX_PRODUCT_SKU ON PRODUCT (SKU);