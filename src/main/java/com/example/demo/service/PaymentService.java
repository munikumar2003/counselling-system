package com.example.demo.service;

import com.example.demo.model.PaymentRequest;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void validatePayment(PaymentRequest paymentRequest) throws Exception {
        switch (paymentRequest.getSelectedMethod()) {
            case "card":
                if (paymentRequest.getCardNumber() == null || paymentRequest.getCardNumber().replace(" ", "").length() != 16) {
                    throw new Exception("Please enter a valid 16-digit card number");
                }
                if (paymentRequest.getExpiryDate() == null || paymentRequest.getExpiryDate().length() != 5) {
                    throw new Exception("Please enter a valid expiry date (MM/YY)");
                }
                if (paymentRequest.getCvv() == null || paymentRequest.getCvv().length() != 3) {
                    throw new Exception("Please enter a valid 3-digit CVV");
                }
                if (paymentRequest.getCardName() == null || paymentRequest.getCardName().trim().isEmpty()) {
                    throw new Exception("Please enter the cardholder name");
                }
                break;
            case "upi":
                if (paymentRequest.getUpiId() == null || !paymentRequest.getUpiId().contains("@")) {
                    throw new Exception("Please enter a valid UPI ID");
                }
                break;
            case "netbanking":
                if (paymentRequest.getBankName() == null || paymentRequest.getBankName().isEmpty()) {
                    throw new Exception("Please select your bank");
                }
                break;
            default:
                throw new Exception("Invalid payment method");
        }
    }

    public boolean processPayment() {
        // Simulate payment success (90% success rate)
        return Math.random() > 0.1;
    }
}
