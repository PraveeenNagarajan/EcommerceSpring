create table product(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
            name VARCHAR(255) NOT NULL,
            brand VARCHAR(255),
            price INT,
            category_id BIGINT NOT NULL,

            created_at DATETIME,
            updated_at DATETIME,

            CONSTRAINT fk_product_category
                FOREIGN KEY (category_id)
                REFERENCES category(id)
);