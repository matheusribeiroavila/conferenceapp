package br.com.avilaconference.confratern.service;

import br.com.avilaconference.confratern.model.Session;
import br.com.avilaconference.confratern.model.Subscription;
import br.com.avilaconference.confratern.model.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllSubscriptionByUser(User user);
    public List<Subscription> getAllSubscriptionBySession(Session session);
}
