package gmarmari.demo.microservices.products.services;

import gmarmari.demo.microservices.products.api.ProductDto;
import gmarmari.demo.microservices.products.entities.ProductDao;
import gmarmari.demo.microservices.products.entities.ProductDetailsDao;
import gmarmari.demo.microservices.products.entities.ProductDao;
import gmarmari.demo.microservices.products.entities.ProductDetailsDao;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductDao> getProducts();

    List<ProductDao> getProductsFromIds(List<Long> productIds);

    List<ProductDao> findProductsByName(String name);

    Optional<ProductDao> getProduct(long productId);


    Optional<ProductDetailsDao> getProductDetails(long productId);

    void delete(long productId);

    void save(ProductDetailsDao productDetails);

}
