package br.com.avilaconference.confratern.repository;

import br.com.avilaconference.confratern.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepository extends ListCrudRepository<User, Integer> {
    public Optional<User> findByEmail(String email);
}
