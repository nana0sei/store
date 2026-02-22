package com.nana0sei.store;

public interface UserRepository {
    void save (User user);
    User findByEmail (String email);
}
