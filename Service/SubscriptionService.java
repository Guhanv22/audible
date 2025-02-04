package com.example.audible.Service;

import com.example.audible.model.Subscription;
import com.example.audible.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Subscription saveSubscriptionDetails(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }
}


