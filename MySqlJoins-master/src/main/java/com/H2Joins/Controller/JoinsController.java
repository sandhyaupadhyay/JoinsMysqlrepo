package com.H2Joins.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.H2Joins.Repositry.CustomerRepo;
import com.H2Joins.Repositry.ProductRepo;
import com.H2Joins.model.Customers;
import com.H2Joins.model.Product;

@RestController
public class JoinsController {
	@Autowired
	private CustomerRepo cr;

	@Autowired
	private ProductRepo pr;

	@PostMapping("/CustomerDetails")
	public Customers addCustomer(@RequestBody Customers c) {
		return cr.save(c);
	}

	@GetMapping("/Customer")
	public List<Customers> getCustomerJoins() {
		return cr.findAll();
	}

	@DeleteMapping("/DeleteCustomer/{id}")
	public String deleteCustomerById(@PathVariable int id) {
		cr.deleteById(id);
		return "deleted";
	}

	@PutMapping("/UpdateCustomer/{id}")
	public String putCustomer(@PathVariable int id, @RequestBody Customers customer) {
		customer.setId(id);
		cr.save(customer);
		return "updated";
	}

	@GetMapping("/Customer/{id}")
	public Optional<Customers> getCustomerID(@PathVariable int id) {
		System.out.print(id);
		return cr.findById(id);
	}

}
