package miszewski.jipang.service;

import miszewski.jipang.model.User;

import java.util.Set;

public interface UserService {

    void create(String name);
    Set<User> findAllBy();
    Set<User> findById(Long id);
}
