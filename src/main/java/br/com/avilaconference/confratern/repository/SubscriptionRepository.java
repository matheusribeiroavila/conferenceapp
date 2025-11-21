package br.com.avilaconference.confratern.repository;

import br.com.avilaconference.confratern.model.Subscription;
import br.com.avilaconference.confratern.model.SubscriptionID;
import org.springframework.data.repository.ListCrudRepository;

public interface SubscriptionRepository extends ListCrudRepository<Subscription, SubscriptionID> {
}
