CREATE TABLE
    `users` (
                `id` bigint NOT NULL AUTO_INCREMENT,
                `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                `name` varchar(255) NOT NULL,
                `email` varchar(255) NOT NULL,
                `password` varchar(255) DEFAULT NULL,
                PRIMARY KEY (`id`)
);

CREATE TABLE
    `addresses` (
                    `id` bigint NOT NULL AUTO_INCREMENT,
                    `street` varchar(255) NOT NULL,
                    `city` varchar(255) NOT NULL,
                    `zip` varchar(255) NOT NULL,
                    `user_id` bigint NOT NULL,
                    PRIMARY KEY (`id`),
                    KEY `addresses_users_id_fk` (`user_id`),
                    CONSTRAINT `addresses_users_id_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
)