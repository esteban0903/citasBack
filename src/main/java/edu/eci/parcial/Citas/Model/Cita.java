package edu.eci.parcial.Citas.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "payments")
public class Payment {
    @Id
    private String id;
    private String userId;
    private List<Product> products;
    private double totalAmount;
    private String purchaseDate; 
    private String status; 
    private String responseMessage;
}
