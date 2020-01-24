package com.kodilla.patterns.strategy.social.network;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter";
    }
}
