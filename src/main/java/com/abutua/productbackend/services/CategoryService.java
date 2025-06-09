package com.abutua.productbackend.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import com.abutua.productbackend.Entities.Category;
import com.abutua.productbackend.repositories.CategoryRepository;

public class CategoryService {
    
   @Autowired
   private CategoryRepository categoryRepository;

    public Category getbyId(@PathVariable int id){ // Usar ResponseEntity é como responder com conteúdo + status + envelope explicando o que aconteceu.
        Category category = categoryRepository.findById(id) //Nesse caso, não faz sentido usar "public ReponseEntity" porque ele é geralmente usado nos controller que lidam diretamente com o http
                                         .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found")); // Nesse caso, retornaremos o category puro, sem ResponseEntity
     
        return category;                     

    }

      public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

}
