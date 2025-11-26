package br.com.avilaconference.confratern.repository;

import br.com.avilaconference.confratern.model.Session;
import br.com.avilaconference.confratern.model.Subscription;
import br.com.avilaconference.confratern.model.SubscriptionID;
import br.com.avilaconference.confratern.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepository extends ListCrudRepository<Subscription, SubscriptionID> {
    public List<Subscription> findByIdUser(User user);
    public List<Subscription> findByIdSession(Session session);
}
