package net.Suranjan.buzzdealbackend.dao;

import net.Suranjan.buzzdealbackend.model.OrderDetail;

public interface OrderDAO {

	public boolean paymentProcess(OrderDetail orderDetail);
	
}
