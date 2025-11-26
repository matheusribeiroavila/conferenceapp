package br.com.avilaconference.confratern.service;

import br.com.avilaconference.confratern.model.Session;
import br.com.avilaconference.confratern.model.Subscription;
import br.com.avilaconference.confratern.model.User;
import br.com.avilaconference.confratern.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SubscriptionServiceImplemantation implements ISubscriptionService {

    SubscriptionRepository  subscriptionRepository;

    SubscriptionServiceImplemantation(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public Subscription addSubscription(Subscription subscription) {
        subscription.setCreatedAt(LocalDateTime.now());
        return subscriptionRepository.save(subscription);
    }

    @Override
    public List<Subscription> getAllSubscriptionByUser(User user) {
        return subscriptionRepository.findByIdUser(user);
    }

    @Override
    public List<Subscription> getAllSubscriptionBySession(Session session) {
        return subscriptionRepository.findByIdSession(session);
    }
}
