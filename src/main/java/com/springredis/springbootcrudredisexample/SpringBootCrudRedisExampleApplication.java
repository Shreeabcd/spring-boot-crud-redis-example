package com.springredis.springbootcrudredisexample;

import com.springredis.springbootcrudredisexample.entity.Product;
import com.springredis.springbootcrudredisexample.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class SpringBootCrudRedisExampleApplication {

    @Autowired
    private ProductDao dao;

    //store product object

	@PostMapping
	public Product save(@RequestBody Product product) {
		return dao.save(product);
	}

	@GetMapping
	public List<Product> getAllProducts() {
		return dao.findAll();
	}

	@GetMapping("/{id}")
	public Product findProduct(@PathVariable int id) {
		return dao.findProductById(id);
	}
	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id)   {
		return dao.deleteProduct(id);
	}

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudRedisExampleApplication.class, args);
    }

}
/*Controler layer added Here. Not proper conding STD
 * No Service Layer created either since its simple CRUD Operation
 * */