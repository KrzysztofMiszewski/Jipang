package miszewski.jipang.service.impl;

import miszewski.jipang.model.User;
import miszewski.jipang.repository.UserRepository;
import miszewski.jipang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(String name) {
        User user = new User();
        user.setName(name);
    }

    @Override
    public Set<User> findAllBy() {
        return userRepository.findAllBy();
    }

    @Override
    public Set<User> findById(Long id) {
        return userRepository.findById(id);
    }
}
