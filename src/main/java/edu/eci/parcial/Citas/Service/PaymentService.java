package edu.eci.parcial.Factura.Service;
import org.springframework.stereotype.Service;

import edu.eci.parcial.Factura.Model.Payment;
import edu.eci.parcial.Factura.Model.Product;
import edu.eci.parcial.Factura.Repository.PaymentRepository;
import edu.eci.parcial.Factura.Repository.UserRepository;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final UserRepository userRepository;

    public PaymentService(PaymentRepository paymentRepository, UserRepository userRepository) {
        this.paymentRepository = paymentRepository;
        this.userRepository = userRepository;
    }

    public Payment processPayment(Payment payment) {
        double calculatedTotal = 0;
        for (Product item : payment.getProducts()) {
            calculatedTotal += item.getUnitPrice() * item.getQuantity();
        }
        if (calculatedTotal != payment.getTotalAmount()) {
            payment.setStatus("Rechazado");
            payment.setResponseMessage("El monto no es correcto");
        } else {
            payment.setStatus("Aprobado");
            payment.setResponseMessage("Factura aprobado");
            paymentRepository.save(payment);
        }
        return payment;
    }

    public List<Payment> getUserPayments(String userId) {
        return paymentRepository.findByUserId(userId);
    }
}
