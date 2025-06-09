package com.abutua.productbackend.Controllers;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.abutua.productbackend.Entities.Product;
import com.abutua.productbackend.services.ProductService;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    // POST /products - Salva um novo produto
    @PostMapping("products")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        Product savedProduct = productService.save(product);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedProduct.getId())
                .toUri();

        return ResponseEntity.created(location).body(savedProduct);
    }

    // GET /products - Retorna todos os produtos
    @GetMapping("products")
    public List<Product> getProducts() {
        return productService.getAll();
    }

    // GET /products/{id} - Retorna um produto por ID
    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        Product product = productService.getbyId(id);
        return ResponseEntity.ok(product);
    }

    // DELETE /products/{id} - Remove um produto por ID
    @DeleteMapping("products/{id}")
    public ResponseEntity<Void> removeProduct(@PathVariable int id) {
        productService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // PUT /products/{id} - Atualiza um produto
    @PutMapping("products/{id}")
    public ResponseEntity<Void> updateProduct(@PathVariable int id, @RequestBody Product productUpdate) {
        productService.update(id, productUpdate);
        return ResponseEntity.ok().build();
    }
}
