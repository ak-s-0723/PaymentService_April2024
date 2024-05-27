package org.example.paymentservice_april.services;

import org.example.paymentservice_april.paymentgateway.PaymentGateway;
import org.example.paymentservice_april.paymentgateway.PaymentGatewayStrategyChooser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayStrategyChooser paymentGatewayStrategyChooser;

    public String initiatePayment(Long amount, String phoneNumber, String name, String email, String orderId) {
        PaymentGateway paymentGateway = paymentGatewayStrategyChooser.getBestPaymentGateway();
        return paymentGateway.generatePaymentLink(amount,phoneNumber,name,email,orderId);
    }
}
