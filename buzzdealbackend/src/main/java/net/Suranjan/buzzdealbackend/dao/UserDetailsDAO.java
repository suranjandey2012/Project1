package net.Suranjan.buzzdealbackend.dao;

import net.Suranjan.buzzdealbackend.model.UserDetails;

public interface UserDetailsDAO {

	public boolean RegisterUser(UserDetails User);

	public boolean UpdateUser(UserDetails User);

	public UserDetails getUser(String username);

	public boolean ApproveUser(UserDetails user);

}
