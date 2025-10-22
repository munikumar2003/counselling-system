package com.example.demo.controller;

import com.example.demo.model.PaymentRequest;
import com.example.demo.model.PaymentResponse;
import com.example.demo.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody PaymentRequest paymentRequest) {
        try {
            paymentService.validatePayment(paymentRequest);

            // Simulate payment processing
            Thread.sleep(3000);

            if (paymentService.processPayment()) {
                return ResponseEntity.ok(new PaymentResponse("success", "Payment successful! You now have unlimited access."));
            } else {
                throw new Exception("Payment failed. Please try again.");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new PaymentResponse("error", e.getMessage()));
        }
    }
}
