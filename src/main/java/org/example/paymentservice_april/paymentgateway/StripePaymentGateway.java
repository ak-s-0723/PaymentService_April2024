package org.example.paymentservice_april.paymentgateway;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements PaymentGateway {
    @Override
    public String generatePaymentLink(Long amount, String phoneNumber, String name, String email, String orderId) {
        return null;
    }
}
