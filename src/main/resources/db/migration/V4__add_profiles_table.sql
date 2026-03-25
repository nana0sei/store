create table
    `profiles` (
                   `id` bigint not null,
                   `created_at` timestamp not null default CURRENT_TIMESTAMP,
                   `bio` text,
                   `phone_number` varchar(15),
                   `date_of_birth` date,
                   `loyalty_points` int unsigned not null default 0,
                   PRIMARY KEY (`id`),
                   FOREIGN KEY (`id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);