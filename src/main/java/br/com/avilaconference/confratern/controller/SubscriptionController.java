package br.com.avilaconference.confratern.controller;

import br.com.avilaconference.confratern.model.Session;
import br.com.avilaconference.confratern.model.Subscription;
import br.com.avilaconference.confratern.model.User;
import br.com.avilaconference.confratern.service.ISubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubscriptionController {

    ISubscriptionService subscriptionService;

    public SubscriptionController(ISubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription) {
        return ResponseEntity.status(201).body(subscriptionService.addSubscription(subscription));
    }

    @GetMapping("/subscriptions/user/{userId}")
    public ResponseEntity<List<Subscription>> getByUser(@PathVariable("userId") Integer userId) {
        User user = new User();
        user.setUserId(userId);
        return ResponseEntity.ok(subscriptionService.getAllSubscriptionByUser(user));
    }

    @GetMapping("/subscriptions/session/{sessionId}")
    public ResponseEntity<List<Subscription>> getBySession(@PathVariable("sessionId") Integer sessionId) {
        Session session = new Session();
        session.setId(sessionId);
        return ResponseEntity.ok(subscriptionService.getAllSubscriptionBySession(session));
    }
}
