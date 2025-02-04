package com.example.audible.controller;

import com.example.audible.Service.SubscriptionService;
import com.example.audible.model.Subscription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SubscriptionController {
    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping("/addSubscriptionDetails")
    public Subscription postSubscriptionDetails(@RequestBody Subscription subscription) {
        return subscriptionService.saveSubscriptionDetails(subscription);
    }
}
