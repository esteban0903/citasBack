package edu.eci.parcial.Factura.Controller;

import edu.eci.parcial.Factura.Service.PaymentService;
import edu.eci.parcial.Factura.Model.Payment;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public Payment processPayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }

    @GetMapping("/user/{userId}")
    public List<Payment> getUserPayments(@PathVariable String userId) {
        return paymentService.getUserPayments(userId);
    }
}
