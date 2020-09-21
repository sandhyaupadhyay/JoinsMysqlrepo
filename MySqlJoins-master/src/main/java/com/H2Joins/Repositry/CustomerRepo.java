package com.H2Joins.Repositry;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.H2Joins.model.Customers;
import com.H2Joins.model.Product;

public interface CustomerRepo extends JpaRepository<Customers, Integer>{
//	@Query("Select p.id,p.productName,p.productPrice,c.name,c.id FROM Product p join Customers c on c.id=p.cp_fk")
//	Optional<Customers> findBySearch(int id);
	
	
}
