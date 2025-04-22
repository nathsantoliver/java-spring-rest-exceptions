package study.santolilver.services;

import org.springframework.stereotype.Service;
import study.santolilver.exceptions.NotEnoughMoneyException;
import study.santolilver.model.PaymentDetails;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }

}
