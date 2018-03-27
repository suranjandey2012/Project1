package net.Suranjan.buzzdealbackend.dao;

import java.util.List;

import net.Suranjan.buzzdealbackend.model.Cart;

public interface CartDAO {
	
	public boolean addToCart(Cart cart);
	public boolean deleteItemFromCart(Cart cart);
	public boolean updateItemFromCart(Cart cart);
	public Cart getCartItem(int cartItemId);
	public List<Cart> listCartItems(String username);

}
