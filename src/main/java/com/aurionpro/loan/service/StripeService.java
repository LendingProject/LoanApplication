//package com.aurionpro.loan.service;
//
//
//import com.stripe.Stripe;
//import com.stripe.exception.StripeException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StripeService {
//
//    @Value("${stripe.secret.key}")
//    private String secretKey;
//
//    public StripeService() {
//        Stripe.apiKey = secretKey;
//    }
//
//    // Create Payment Intent
//    public PaymentIntent createPaymentIntent(long amount) throws StripeException {
//        PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
//            .setAmount(amount) // Amount in cents
//            .setCurrency("usd")
//            .build();
//
//        return PaymentIntent.create(params);
//    }
//}
//
