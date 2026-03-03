package org.jsp.manyToMany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manyToMany_uni.dao.CustomerProductDao;
import org.jsp.manyToMany_uni.dto.Customer;
import org.jsp.manyToMany_uni.dto.Product;

public class CustomerProductController {

	public static void main(String[] args) {
		
		List<Customer> customers=new ArrayList<Customer>();
		Customer customer1=new Customer();
		customer1.setName("Rahul");
		customer1.setAge(24);
		customer1.setAddress("Kadapa");
		
		Customer customer2=new Customer();
		customer2.setName("Rohit");
		customer2.setAge(25);
		customer2.setAddress("Atp");
		
		Customer customer3=new Customer();
		customer3.setName("Kohli");
		customer3.setAge(23);
		customer3.setAddress("Gooty");
		
		List<Product> listproducts=new ArrayList<Product>();
		Product product1=new Product();
		product1.setName("Choclate");
		product1.setCost(20);
		product1.setQuantity(15);
		
		Product product2=new Product();
		product2.setName("Powerbunk");
		product2.setCost(1200);
		product2.setQuantity(3);
		
		Product product3=new Product();
		product3.setName("Phone");
		product3.setCost(12500);
		product3.setQuantity(2);
		
		listproducts.add(product1);
		listproducts.add(product2);
		listproducts.add(product3);
		
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		
		for (Customer customer : customers) {
			customer.setProducts(listproducts);
		}
		
		
		
		CustomerProductDao dao=new CustomerProductDao();
//		dao.saveCustomer(customers);
//		dao.saveProducts(listproducts);
		
//		dao.updateCustomers(1,customer1);
//		dao.updateProducts(2, product2);
		
//		dao.findCustomer(1);
//		dao.findProduct(2);
		
//		dao.deleteCustomer(104);
		dao.deleteProduct(4);
		
//		dao.findAllCustomers();
//		dao.findAllProducts();
	}
}
