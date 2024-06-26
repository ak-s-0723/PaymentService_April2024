package org.example.paymentservice_april.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDto {
    private Long amount;

    private String phoneNumber;

    private String email;

    private String name;

    private String orderId;
}

