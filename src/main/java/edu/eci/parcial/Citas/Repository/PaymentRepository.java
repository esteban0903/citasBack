package edu.eci.parcial.Factura.Repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.eci.parcial.Factura.Model.Payment; 

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String>  {
    List<Payment> findByUserId(String userId);

}
