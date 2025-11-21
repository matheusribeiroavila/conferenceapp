package br.com.avilaconference.confratern.repository;

import br.com.avilaconference.confratern.model.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Integer> {
}
