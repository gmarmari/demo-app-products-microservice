package gmarmari.demo.microservices.products.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ProductNotFoundException extends ResponseStatusException{
    public ProductNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Product not found");
    }
}
