package br.com.avilaconference.confratern.repository;

import br.com.avilaconference.confratern.model.Session;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepository extends ListCrudRepository<Session, Integer> {
}
