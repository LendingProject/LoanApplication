package com.aurionpro.loan.config;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
public class StripeConfig {

	 @Value("${stripe.secret.key}")
	    private String secretKey;

	    public void init() {
	        Stripe.apiKey = secretKey;
	    }
}
