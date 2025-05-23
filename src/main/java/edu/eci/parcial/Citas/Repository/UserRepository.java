package edu.eci.parcial.Factura.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.eci.parcial.Factura.Model.User; 

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
