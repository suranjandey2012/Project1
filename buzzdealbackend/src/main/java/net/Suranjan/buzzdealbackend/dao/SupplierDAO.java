package net.Suranjan.buzzdealbackend.dao;

import java.util.List;

import net.Suranjan.buzzdealbackend.model.Supplier;

public interface SupplierDAO {
	public boolean insertSupplier(Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	public Supplier getSupplier(int SupplierId);
	public List<Supplier> getSupplierlist();

}
