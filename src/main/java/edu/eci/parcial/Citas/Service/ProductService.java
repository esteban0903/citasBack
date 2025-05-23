package edu.eci.parcial.Factura.Service;

import edu.eci.parcial.Factura.Repository.ProductRepository;
import edu.eci.parcial.Factura.Model.Product;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
