package org.jsp.manyToMany_uni.dao;


import java.util.List;

import org.jsp.manyToMany_uni.dto.Customer;
import org.jsp.manyToMany_uni.dto.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CustomerProductDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public  void saveCustomer(List<Customer> customers)
	{
		for (Customer customer : customers) {
			transaction.begin();
			manager.persist(customer);
			transaction.commit();
		}
	}
	
	public void saveProducts(List<Product> products)
	{
		for (Product product : products) {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
		}
	}
	
	public void updateCustomers(int cid,Customer customer)
	{
		Customer customer1=manager.find(Customer.class, cid);
		if(customer1 != null)
		{
			customer1.setName(customer.getName());
			customer1.setAge(customer.getAge());
			customer1.setAddress(customer.getAddress());
			
			transaction.begin();
			manager.merge(customer1);
			transaction.commit();
		}
	}
	
	public void updateProducts(int pid,Product product)
	{
		Product product1=manager.find(Product.class, pid);
		if(product1 != null)
		{
			product1.setName(product.getName());
			product1.setCost(product.getCost());
			product1.setQuantity(product.getQuantity());
			
			transaction.begin();
			manager.merge(product1);
			transaction.commit();
		}
		
	}
	
	public void findCustomer(int cid)
	{
		Customer customer=manager.find(Customer.class, cid);
		if(customer!= null)
		{
			System.out.println(customer);
		}
		else
		{
			System.out.println("Customer is not found");
		}
	}
	
	public void findProduct(int pid)
	{
		Product product=manager.find(Product.class, pid);
		if(product != null)
		{
			System.out.println(product);
		}
		else
		{
			System.out.println("Product is not found");
		}
	}
	
	public void deleteCustomer(int cid)
	{
		Customer customer=manager.find(Customer.class, cid);
		customer.setProducts(null);
		if(customer != null)
		{
			transaction.begin();
			manager.remove(customer);
			transaction.commit();
		}
		
	}
	
	public void deleteProduct(int pid)
	{
		Product product=manager.find(Product.class, pid);
		
		if(product != null)
		{
			transaction.begin();
			manager.remove(product);
			transaction.commit();
		}
		
	}
	
	public void findAllCustomers()
	{
		Query query=manager.createQuery("select c from Customer c");
		List<Customer> customers=query.getResultList();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	
	public void findAllProducts()
	{
		Query query=manager.createQuery("select p from Product p");
		List<Product> products=query.getResultList();
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
