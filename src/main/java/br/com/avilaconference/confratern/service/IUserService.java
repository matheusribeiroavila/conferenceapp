package br.com.avilaconference.confratern.service;

import br.com.avilaconference.confratern.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IUserService {
    public User registerUser(User user);
    public List<User> getAllUsers();
    public User getUserById(Integer userId);
    public User getUserByEmail(String email);
}
