package org.jsp.manyToOne_bi.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.manyToOne_bi.dao.OrdersCustomerDao;
import org.jsp.manyToOne_bi.dto.Customer;
import org.jsp.manyToOne_bi.dto.Orders;

public class OrdersCustomerController {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCid(103);
		customer.setName("Virat");
		customer.setAge(39);
		customer.setAddress("Dhone");
		
		List<Orders> listOrders= new ArrayList<Orders>();
		
		Orders order1=new Orders();
		order1.setOid(1008);
		order1.setStatus("Delivered");
		order1.setAmount(150);
		
		
		Orders order2=new Orders();
		order2.setOid(1009);
		order2.setStatus(" Pending");
		order2.setAmount(912);
		
		
		listOrders.add(order1);
		listOrders.add(order2);
		
		customer.setOrders(listOrders);
		
		for (Orders orders : listOrders) {
			orders.setCustomer(customer);
		}
		
		OrdersCustomerDao dao=new OrdersCustomerDao();
//		1.Insert
//		Case 1:Customer Has Orders And Orders has Customer
//		dao.saveCustomer(customer);
//		Case 2:Orders Has Customer And Customer Has Orders
//		dao.saveOrders(listOrders);
//		Case 3:Customer Has Orders but Orders does not Have Customer
//		dao.saveCustomer(customer);
//		Case 4:Orders Has Customer but Customer does not have Orders
//		dao.saveOrders(listOrders);
		
//		2.Update
//		dao.updateCustomer(customer);
//		dao.updateOrders(listOrders);
		
//		dao.findCustomer(100);
//		dao.findOrders(1004);
		
//		dao.deleteCustomer(103);
//		dao.deleteOrder(1004);
		
//		dao.findAllCustomers();
//		dao.findAllOrders();
		
//		dao.addOrderLater(103, listOrders);
//		dao.removeOrderLater(103, 1008);
	}
}
