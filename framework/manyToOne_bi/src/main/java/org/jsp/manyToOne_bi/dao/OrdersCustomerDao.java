package org.jsp.manyToOne_bi.dao;

import java.util.List;

import org.jsp.manyToOne_bi.dto.Customer;
import org.jsp.manyToOne_bi.dto.Orders;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class OrdersCustomerDao {

	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("sandeep");
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction=manager.getTransaction();
	
	public void saveCustomer(Customer customer)
	{
		List<Orders> listOrders=customer.getOrders();
		for (Orders orders : listOrders) {
			orders.setCustomer(customer);
		}
		transaction.begin();
		manager.persist(customer);
		transaction.commit();
	}
	
	public void saveOrders(List<Orders> orders)
	{
		for (Orders orders2 : orders) {
			transaction.begin();
			manager.persist(orders2);
			transaction.commit();
		}
	}
	
	public void updateCustomer(Customer customer)
	{
		transaction.begin();
		manager.merge(customer);
		transaction.commit();
	}
	
	public void updateOrders(List<Orders> orders)
	{
		for (Orders orders2 : orders) {
			transaction.begin();
			manager.merge(orders2);
			transaction.commit();
		}
	}
	
	public void findCustomer(int cid)
	{
		Customer customer=manager.find(Customer.class, cid);
		if(customer != null)
		{
			System.out.println(customer);
		}
		else
		{
			System.out.println("Customer is Not Found...");
		}
	}
	
	public void findOrders(int oid)
	{
		Orders orders=manager.find(Orders.class, oid);
		if(orders != null)
		{
			System.out.println(orders);
		}
		else
		{
			System.out.println("Order is Not Found...");
		}
	}
	
	public void deleteCustomer(int cid)
	{
		Customer customer=manager.find(Customer.class, cid);
		if(customer != null)
		{
			transaction.begin();
			manager.remove(customer);
			transaction.commit();
		}
		else
		{
			System.out.println("Customer is not Found And Not Deleted...");
		}
	}
	
	public void deleteOrder(int oid)
	{
		Orders orders=manager.find(Orders.class, oid);
		if(orders!= null)
		{
			transaction.begin();
			manager.remove(orders);
			transaction.commit();
		}
		else
		{
			System.out.println("Order is not Found And Not Deleted...");
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
	
	public void findAllOrders()
	{
		Query query=manager.createQuery("select o from Orders o");
		List<Orders> orders=query.getResultList();
		for (Orders orders2 : orders) {
			System.out.println(orders2);
		}
	}
	
	
	public void addOrderLater(int cid,List<Orders> listOrders)
	{
		Customer customer=manager.find(Customer.class, cid);
		if(customer != null)
		{
			for (Orders orders : listOrders) {
				orders.setCustomer(customer);
			}
			List<Orders> dbOrders=customer.getOrders();
			if(dbOrders != null)
			{
				dbOrders.addAll(listOrders);
				transaction.begin();
				manager.merge(customer);
				transaction.commit();
			}
			else
			{
				customer.setOrders(listOrders);
				transaction.begin();
				manager.merge(customer);
				transaction.commit();
			}
		}
		else
		{
			System.out.println("Customer Id is Not Found...");
		}
		
	}
	
	public void removeOrderLater(int cid,int oid)
	{
		Customer customer=manager.find(Customer.class, cid);
		Orders orders=manager.find(Orders.class, oid);
		
		if(customer != null && orders!=null)
		{
			List<Orders> dbOrders=customer.getOrders();
			if(dbOrders.contains(orders))
			{
				dbOrders.remove(orders);
				orders.setCustomer(null);
				transaction.begin();
				manager.merge(customer);
				transaction.commit();
			}
			else
			{
				System.out.println("Order does not belong to this customer");
			}
		}
		else
		{
			System.out.println("cid Oid is Not Found");
		}
		
	}
}
