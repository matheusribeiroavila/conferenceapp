package br.com.avilaconference.confratern.repository;

import br.com.avilaconference.confratern.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepository extends ListCrudRepository<Conference, Integer> {
}
