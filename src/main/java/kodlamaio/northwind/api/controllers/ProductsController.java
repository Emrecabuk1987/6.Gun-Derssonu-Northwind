package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")//kodlama.io/api/products bunu karşılayan ProductsController karşılayacak
public class ProductsController {

	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getall")//kodlama.io/api/products/getall isteğinde bulunursam aşağıdaki metod çalışacak demek
	public List<Product> getAll(){
		return this.productService.getAll();
		
	}
}
