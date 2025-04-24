package emsi.ma.demo.web;

import emsi.ma.demo.entities.Product;
import emsi.ma.demo.entities.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/products")
    public List<Product> products (){
        return productRepository.findAll();
    }

    @GetMapping("/products/id")
    public Product findById (@PathVariable long id){
        return productRepository.findById(id).get();
    }
}
