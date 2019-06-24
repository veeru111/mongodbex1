package com.app.console;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductDb;

@Component
public class Console implements CommandLineRunner {
	
	@Autowired
	private ProductDb repo;
	
	public void run(String...arg) {
		repo.deleteAll();
		
		repo.save(new Product("veeru", 30.2));
		repo.save(new Product("raju", 52.20));
		repo.save(new Product("hari",42.20));
		List<Product> p=repo.findAll();
		
		for(Product s:p) {
			System.out.println(s);
		}
		
		
		
	}

}
