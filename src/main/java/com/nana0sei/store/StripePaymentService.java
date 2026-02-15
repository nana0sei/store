package com.nana0sei.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;


    @Override
    public void processPayment(double amount){
        System.out.println("API URL: " + apiUrl);
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount );
    }
}
