package com.rohit.springcoreadvanced.injecting.interfaces;

public class OrderBOImpl implements OrderBO {
	
	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBO");
		dao.createOrder();
		// TODO Auto-generated method stub

	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
