package com.H2Joins.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customers {

	@Id
	private int id;
	private String name;
	
	@OneToMany(targetEntity = Product.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "id")
	private List<Product> product;
	
	
}
