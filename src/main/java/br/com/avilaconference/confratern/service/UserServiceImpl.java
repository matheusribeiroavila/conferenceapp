package br.com.avilaconference.confratern.service;

import br.com.avilaconference.confratern.exception.NotFoundException;
import br.com.avilaconference.confratern.model.User;
import br.com.avilaconference.confratern.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> new NotFoundException("User not found."));

    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new NotFoundException("User email not found."));
    }

}
