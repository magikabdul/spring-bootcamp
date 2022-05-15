package com.chrosciu.shop.payments;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

@Slf4j
public class PaymentStatusChangeListener {

    @EventListener
    @Async
    public void onPaymentStatusChange(PaymentStatusChangeEvent statusChangedEvent) {
        log.info("Payment changed status: {}", statusChangedEvent.getPayment());
    }

}