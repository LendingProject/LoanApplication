package com.aurionpro.loan.controller;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

import java.util.Map;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.aurionpro.loan.dto.PaymentRequest;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin(origins = "http://localhost:4200") 
public class PaymentController {

    @PostMapping("/create-payment")
    @PreAuthorize("hasRole('ROLE_CUSTOMER')")
    public String createCharge(@RequestBody PaymentRequest paymentRequest) throws Exception {
        // Set your Stripe secret key (use your secret key here)
        Stripe.apiKey = "sk_test_51QastOD8e7FPtoIfAPwNgOp6gmGNyCeus11HLiBH8FIIdjpTGUMHdauuol2EbuRrshomSAcn8gtXladr13ilhP0B00vKau1nlQ";  // Replace with your secret key

        // Calculate the amount to be charged (in cents)
        int amount = paymentRequest.getAmount();  // For example, $50 -> 5000 cents

        // Create charge using the Charge.create method
        try {
            // Create a charge object directly using parameters
            Charge charge = Charge.create(Map.of(
                "amount", amount,
                "currency", "usd",
                "source", "tok_visa"  // Replace with a real source ID (e.g., a token from Stripe.js)
            ));
            System.out.print(charge);
            // Return the charge ID as confirmation
            return charge.getId();
        } catch (StripeException e) {
            e.printStackTrace();
            throw new Exception("Error creating charge", e);
        }
    }
}
